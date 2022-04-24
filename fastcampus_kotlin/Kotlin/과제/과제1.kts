//1. 변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않은 경우 false가 되는 변수 c를 선언.
//   단 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안됨.
var A : Int = 50
var B : Int = 50
var C : Boolean = if(A==B) true else false

println("1번 : " + C)

//2. 정수형 변수 A를 선언하고, 변수 B를 선언한다. 이때 변수 B는 A의 두배가 되어야 한다.
var A_2 : Int = 10
var B_2 : Int = A_2 * 2

println("2번 : " + B_2)

//3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오.
//   (90점 이상 A학점, 80~89점은 B학점, 70~79점은 C학점, 그렇지 않으면 F학점)

val score1 : Int = 95
println("3번 : " + score_check(score1))

fun score_check(score1:Int):String{
    when(score1){
        in 90..100-> return "A"
        in 80..89-> return "B"
        in 70..79-> return "C"
        else-> return "F"
    }
}

//4. 학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수점(정수)를 반환하는 함수를 만드시오.
//   (시험 문제는 총 20문제이고 만점은 100점)
fun score_check2(check_o:Int):Int{
    return check_o*5
}
var check_o : Int = 17
println("4번 : " + score_check2(check_o))

//5. nullable 정수형 두개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다.
//   이때 인수중에 null이 있으면 0으로 취급하여 합을 구한다.

fun nullable_plus(n1:Int?, n2:Int?):Int {
    val firstnum: Int = if(n1 == null) 0 else n1
    val secondnum: Int = if(n2 == null) 0 else n2

    return firstnum + secondnum
}

println("5번 : " + nullable_plus(null,5))

