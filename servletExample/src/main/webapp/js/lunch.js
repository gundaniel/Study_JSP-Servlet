$("#submitBtn").on("click", function() {
           
if($("select[name='lunch'] > option:selected").index() < 0){
	alert("점심메뉴를 선택해주세요");
	return;
}else{
       if($("select[name='lunch'] > option:selected").length < 2) {
		 alert("2개 이상의 메뉴를 선택해 주세요!");
			return;            
		}
		
	/*$("#form").attr({
		"method": "post", //방식이 무엇인가?
		"action": "/servletExample/todaymenu" //서버의 어디로 보낼것인지?
	});
	 $("#form").submit();
*/
 	}


// ajax로 서버 요청 코드 작성
	// data 속성은 요청 url에 전달할 값을 설정.
	// 폼전체 데이터 전송
	// data : $("#frm").serialize(), 
	// 함수를 사용하지 않을 경우
	// data : "num1="+$("#num1").val()+"&operator="+$("#operator").val()+"&num2="+$("#num2").val(), 
	// data : "num1=1&operator=+&num2=3" 
	// 서버측에 전달 (입력양식의 name으로 입력한 값이 전달된다 name=value)
	
	$.ajax({
		url:"/servletExample/calcServlet2",
		method: "post",
		data:{
			"num1":$("#num1").val(),
			"operator":$("#operator").val(),
			"num2":$("#num2").val()
			},
			dataType:"text"
			}).done(function(data){
				$("#result").val(data);
			}).fail(function(xhr,staus){
				alert(status + "발생.\n상태:" + xhr.status);
			});
});  