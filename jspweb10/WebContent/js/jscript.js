function slideshow(n) {
	slide = document.getElementsByClassName("myslides");
	//여러개 배열로 저장
	for(i=0; i<slide.length; i++){
		slide[i].style.display = "none";
	}
	if(n>slide.length) slideIndex=1;
	if(n<1) slideIndex = slide.length;
	slide[slideIndex-1].style.display = "block";
}
slideIndex = 1; // 1번부터 시작 - 배열은 0번부터
slideshow(slideIndex);

function plusSlide(n) {
	slideIndex += n; // 1, -1 증감
	slideshow(slideIndex);
}
function currentSlide(n){
	slideIndex = n;
	slideshow(slideIndex);
}

function autoSlide(){
	plusSlide(1);
}

var id;

function play() {
	id = setInterval("autoSlide()", 3000) ;
}
function stop() {
	clearInterval(id);
}