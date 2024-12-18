$("#submitBtn").on("click",function(){
	if($("#num").val().replace(/\s/g,"")==""){
		alert("숫자를 입력해주세요");
		$("#num").val("");
		$("#num").focus();
		return;
	}
	else if($("#num2").val().replace(/\s/g,"")==""){
		alert("숫자를 입력해주세요");
		$("#num2").val("");
		$("#num2").focus();
		return;
	}
		
	$("#frm").attr({
		"method":"post",
		"action":"/servletExample/calc"
	});
	$("#frm").submit();
});  