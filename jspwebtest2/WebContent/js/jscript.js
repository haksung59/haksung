var lastDate ="";
var today = new Date();
var TM = 0;


function thismonth(TM){
	var date = new Date();
	var year = date.getFullYear();
	var month = date.getMonth()+1+TM;
	
	document. getElementById("YM").innerText= year+"년 "+month+"월";
}
thismonth(TM);
function addRow(TM) {
	
	var lastDate = new Date(today.getFullYear(), today.getMonth()+1+TM, 0);
	var startDate = new Date(today.getFullYear(), today.getMonth()+TM, 1);
	
	var startDay = startDate.getDate();
	var lastDay = lastDate.getDate();
	
	var weekStartDay = startDate.getDay();
	var weekLastDay = lastDate.getDay();
	
	var tbl = document.getElementById("calendar2");
	
	var newRow = tbl.insertRow();
	
	
	var cnt = 0;
	var newCell = null;
	for(n=0; n<weekStartDay; n++) {
		newCell = newRow.insertCell();
		cnt++;
	}
	
	for(d=1; d<=lastDay; d++){
		newCell = newRow.insertCell();
		newCell.innerText = d;
		
		cnt++;
		
		if(cnt%7==0){
			newRow = tbl.insertRow();
			newCell.innerText = d;
		}
	}
	if(d>=lastDay){
		for(n=6; n>weekLastDay; n--) {
			newCell = newRow.insertCell();
			cnt++;
		}
	}
}
addRow(TM);

function plus(n){
	TM += n;
	addRow(TM);
	thismonth(TM);
	slideshow(TM);
}

function slideshow(TM) {
	slide = document.getElementsByClassName("wt");
	var M = today.getMonth()+1+TM;
	
	for(i=0; i<4; i++){
		slide[i].style.display = "none";
	}
	
	if(M<4){
		slide[0].style.display="block";
	}else if(M<7){
		slide[1].style.display="block";
	}else if(M<10){
		slide[2].style.display="block";
	}else{
		slide[3].style.display="block";
	}
}
slideshow(TM);



