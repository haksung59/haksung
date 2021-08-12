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
   busswitch=1;
   apswitch=0;
   $("#busbttn").click(function(){
	   buson();
	   apoff();
   });
   $("#apbttn").click(function(){
	   busoff();
	   apon();
   });
});
buson();
apoff();
function buson(){
	$("#busbttn").css("background-color","#689f38")
	$("#busbttn").css("color","white")
	$("#busrute").show();
}
function busoff(){
	$("#busbttn").css("background-color","#c5e1a5")
	$("#busbttn").css("color","black")
    $("#busrute").hide();
}
function apon(){
	$("#apbttn").css("background-color","#689f38")
	$("#apbttn").css("color","white")
	$("#aprute").show();
}
function apoff(){
	$("#apbttn").css("background-color","#c5e1a5")
	$("#apbttn").css("color","black")
	$("#aprute").hide();
}




