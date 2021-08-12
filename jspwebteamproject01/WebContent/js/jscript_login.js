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
function checkLogin() {
	id = document.getElementById("id").value;
	pw = document.getElementById("pw").value;
	if(id=="java") {
		if(pw=="123") {
			alert("로그인 성공");
		}else{
			alert("비밀번호를 확인하세요.");
		}
	}else{
		alert("아이디를 확인하세요.");
	}
}