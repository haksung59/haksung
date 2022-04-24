import java.lang.Exception

//계산기1
//- 사칙연산에 대응하는 4개의 함수 구현
//- 연산이 한번 이루어 질 때마다 출력을 해야 한다.
//  (사칙 연산에 대응하는 4개의 함수에서 출력을 하면 안된다.)
class Calculater{
    var number:Int
    constructor(){
        this.number = 0
    }

    constructor(number:Int){
        this.number = number
    }

    fun calculate(operation:String, number2:Int):Int{
        when(operation){
            "+" -> number = plus(number,number2)
            "-" -> number = minus(number, number2)
            "*" -> number = multiply(number, number2)
            "/" -> try{
                    number = division(number, number2)
                    }catch(exception:Exception){
                        println("잘못된 연산입니다.")
                    }
            else -> println("사칙연산을 제대로 입력하시오.")
        }
        return number
    }

    fun plus(number1:Int, number2:Int):Int{
        return number1+number2
    }
    fun minus(number1:Int, number2:Int):Int{
        return number1-number2
    }
    fun multiply(number1:Int, number2:Int):Int{
        return number1*number2
    }
    fun division(number1:Int, number2:Int):Int{
        return number1/number2
    }

}
var haksung = Calculater()
haksung.calculate("/",0)
println(haksung.number)


//계산기2
//- 사칙연산을 할 수 있는 1개의 함수 구현
//ex) calculater.calculate('+', 10)
//ex) calculater.calculate('-', 50)
//- 초기값을 할당 할 수 있어야 하며 초기 값을 할당하지 않은 경우에는 0을 기본값으로 사용한다.
//- 불가능한 연산을 요청한 경우 "잘못된 연산 입니다."를 출력한다.

//계산기3
//- 사칙연산을 할 수 있는 1개의 함수 구현
//- 한번에 여러개의 연산을 입력 받을 수 있어야 한다.
//ex) 더하기3 더하기5 나누기10 곱하기2
//ex) calculater.calculate(더하기3, 더하기5, 빼기2, 나누기5)