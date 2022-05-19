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
function slideshow(n) {
	slide = document.getElementsByClassName("slides");
	for(i=0; i<slide.length; i++){
		slide[i].style.display = "none";
	}
	if(n>slide.length-1) slideIndex=0;
	slide[slideIndex].style.display = "block";
}
slideIndex = 0;
slideshow(slideIndex);

function plusSlide(n) {
	slideIndex += n;
	slideshow(slideIndex);
}
function autoSlide(){
	plusSlide(1);
}

var id;
play();

function play(){
	id = setInterval("autoSlide()", 2500) ;
}
function stop() {
	clearInterval(id);
}