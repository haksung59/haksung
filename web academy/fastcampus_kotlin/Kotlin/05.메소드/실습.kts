var number100 = 200

fun plusNumbers(first_num:Int, second_num:Int): Int {
    val result : Int = first_num + second_num
    return result
}

plusNumbers(first_num=10,second_num=20)
plusNumbers(10,20)

val result: Int = plusNumbers(5,7)
println(result)

//기본값이 있는 함수를 선언하는 방법
fun plusNumbersWithDefault(firstNum:Int, secondNum:Int=10):Int {
    return firstNum+secondNum
}

val result2 : Int = plusNumbersWithDefault(firstNum=10)
println(result2)
val result3 : Int =plusNumbersWithDefault(firstNum=10, secondNum=20)
println(result3)

//반환값이 없는 함수를 선언하는 방법
fun plusNumberWithNoReturn(firstNum:Int, secondNum:Int):Unit{
    val result : Int = firstNum + secondNum
    println(result)
}

fun plusNumberWithNoReturn2(firstNum:Int, secondNum:Int){
    val result : Int = firstNum + secondNum
    println(result)
}
plusNumberWithNoReturn2(100,200)

fun plusNumberWithNoReturn3(firstNum:Int, secondNum:Int){
    val result : Int = firstNum + secondNum
    println(result)
    return
}
plusNumberWithNoReturn3(200,300)

//함수선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum:Int, secondNum:Int) = firstNum + secondNum
val result10:Int = shortPlusNumbers(10,100)
println(result10)

//가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int):Unit {
    for(number in numbers){
        println(number)
    }   // numbers에 들어온 값들을 하나하나 돌면서 println을 한다.
}
plusMultipleNumbers(1,2,3,4,5)

println("number100 = "+ number100)