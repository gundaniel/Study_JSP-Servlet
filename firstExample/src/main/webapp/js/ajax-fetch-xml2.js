document.querySelector('.btn-primary').addEventListener("click", function() {
	fetch('ajax-xml.xml')
	.then(response => response.text())
	.then(result => {
		if(result.indexOf("404") > 0){
			throw new Error("404 또는 500 에러 발생");
		}
		const parser = new DOMParser();
		const doc = parser.parseFromString(result, 'application/xml');
			
		const lists = doc.querySelectorAll('list');
		let listGroup = [];
			
		for(let list of lists) {
			let title = list.childNodes[0].nodeValue;
			listGroup.push(`<li class="list-group-item">${title}</li>`);
		}
			
		let newUI = `<ul class="list-group">${listGroup.join('')}</ul>`;
		document.querySelector('#pocket').innerHTML = newUI;
	})
	.catch(error => {
		console.error('[실패]', error);
	});
});