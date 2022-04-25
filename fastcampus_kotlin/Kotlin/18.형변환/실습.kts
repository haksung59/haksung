//기본자료형의 타입 캐스팅
val number : Int = 10
val numberString: String = number.toString()
val stringToNumber:Int = numberString.toInt()
println(stringToNumber)

val numberF :Double = 10.5
val numberFString :String = numberF.toString()
val numberFInt:Int = numberF.toInt()

println(numberFInt)
// -> to타입이 오는 함수를 이용해서 형변환을 한다.

open class Warrior1(var name:String, var power:Int, var type:String) { // 부모클래스, 슈퍼클래스
    open fun attack() {
        println("복잡한 코드 + 공격")
    }
}

//주 생성자가 슈퍼클래스 생성을 하는 경우
class DefenseWarrior1(name:String, power:Int) : Warrior1(name,power,"고블린") {
    fun defense() {
        println("방어")
    }
}

//is
// - 타입 체크
// - true, false가 리턴된다.
// - 스마트 캐스팅을 해준다.
// - var은 불가능 -> val을 사용해야 한다.
val warrior : Warrior1 = DefenseWarrior1("방어형 검사", 100)
// warrior.defense() -> 불가능, defense기능을 포기하고 warrior타입이 되었기 때문.
if(warrior is DefenseWarrior1){
    //스마트캐스팅
    //-> 내가 만든 warrior를 if 블럭 안에서는 defenseWarrior로 사용하게 해준다.
    warrior.defense()
}

//as
// - 지정한 타입으로 캐스팅을 시도하고, 불가능한 경우에는 예외 발생
val warrior2 : DefenseWarrior1 = warrior as DefenseWarrior1
warrior2.defense()