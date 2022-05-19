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

today();
	
function today(){
	var date = new Date();
		
	var year = date.getFullYear();
	var month = date.getMonth()+1;
	var day = date.getDate();
		
	document.getElementById("today").innerText= year+"."+month+"."+day+".";
}