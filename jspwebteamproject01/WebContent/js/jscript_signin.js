$(document).ready(function(){
   
   // sub 메뉴 숨기기
   $("ul.sub").hide();
   
   // menu li 에 마우스 올라간 경우
   $("ul.menu li, ul.sub li").hover(
         function(){ // over
            $("ul.sub", this).show();
         },
         
         function(){ // out
            $("ul.sub", this).hide();
    
   });
});

function join() {
	id=document.getElementById("id").value;
	if(id=="") {
		alert("아이디를 입력하시오");
		return;
	}
	pw=document.getElementById("pw").value;
	if(pw=="") {
		alert("비밀번호를 입력하시오");
		return;
	}
	email=document.getElementById("email").value;
	if(email=="") {
		alert("이메일을 입력하시오");
		return;
	}
	pw=document.getElementById("pwch").value;
	if(pw !=pwch) {
		alert("비밀번호가 맞지 않습니다.");
	}else{
		alert("회원가입성공");
	}
}