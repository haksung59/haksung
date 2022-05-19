function check(){
	p_no = document.getElementById("p_no").value;
	p_name = document.getElementById("p_name").value;
	kind = document.getElementById("kind").value;
	price1 = document.getElementById("price1").value;
	price2 = document.getElementById("price2").value;
	explanation = document.getElementById("explanation").value;
	
	if(p_no==""){
		alert("상품번호를 입력하시오.");
		history.back();
	}else if(p_name==""){
		alert("상품이름을 입력하시오.");
		history.back();
	}else if(kind==""){
		alert("분류번호를 입력하시오.");
		history.back();
	}else if(price1==""){
		alert("판매가를 입력하시오.");
		history.back();
	}else if(price2==""){
		alert("원가가를 입력하시오.");
		history.back();
	}else if(explanation==""){
		alert("상품 설명을 입력하시오.");
		history.back();
	}else {
		frm = document.getElementById("regproduct_form");
		frm.submit();
	}
}