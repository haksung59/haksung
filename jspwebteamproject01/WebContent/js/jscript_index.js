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
   
   //logo
   $("#logo").click(function(){
	   
   });
   slideindex = 1;
   showslide(slideindex);
});


function showslide(n){
   
   slide = $("div.myslide");
   for(i=0; i<slide.length; i++) {
      slide.eq(i).css("display","none");
   }
   if(n>slide.length) slideindex = 1;
   if(n<1) slideindex = slide.length;
   slide.eq(slideindex-1).css("display","block");
}



function plusSlide(n) {
   slideindex += n;
   showslide(slideindex);
}

function currentSlide(n) {
   slideindex = n;
   showslide(slideindex);
}

function autoSlide() {
   plusSlide(1);
}

var id;
play();

function play() {
   id = setInterval("autoSlide()", 3000);
}

function stop() {
   clearInterval(id);
}