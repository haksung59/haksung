interface Tiger {

    fun bite()
    fun goToBox()

}

class BaekDooSanTiger :Tiger{
    override fun bite() {

    }

    override fun goToBox() {

    }
}

val backdoosanTiger:BaekDooSanTiger = BaekDooSanTiger()
backdoosanTiger.bite()

interface Person {
    //멤버들의 구현부가 없다.
    var dress : String

    fun eat()
    fun sleep(){
        println("잠을 잔다.")
    }
}

class Student : Person{
    override var dress: String
        get() = "옷"
        set(value){}

    final override fun eat() {
        //final -> 이 클래스를 상속하는 클래스에서 override를 못하게 한다.
        println("밥을 먹는다.")
    }

    fun study() {
        println("공부를 한다.")
    }

}
//class GoodStudent :Student {
//
//}

class Teacher :Person{
    override var dress: String
        get() = "정장"
        set(value){}

    override fun eat() {
        println("비싼 밥을 먹는다.")
    }
}