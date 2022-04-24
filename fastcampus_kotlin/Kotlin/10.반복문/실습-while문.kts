// While문 실습

var i = 0
while(i < 5){
    if(i%2 == 0) {
        println("짝수")
    }else {
        println("홀수")
    }
    i++ // 이부분을 제거하면 무한루프에 빠진다.
}

//do-while문

var z = 10
do{
    println("시작")
}while(z>20)