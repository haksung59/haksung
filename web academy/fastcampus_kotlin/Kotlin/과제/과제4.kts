//1. Warrior, Knight, Monster는 체력, 공격력, 방어력이 존재하며 생존 여부를 알 수 있어야 한다.
open class Unit(var name:String, var energy:Int, var power:Int, var defense:Int, var life:Boolean){

    fun die(enemy:Unit){
        enemy.life = false
        println(""+enemy.name+"이 죽었습니다.")
    }
    open fun attack(enemy:Unit){
        println(""+enemy.name+"을 공격합니다.")
        if(enemy.energy < power){
            enemy.energy = 0
        }else {
            enemy.energy -= power
        }
        println(enemy.name+"의 체력 : " + enemy.energy)
        if(enemy.energy <= 0){
            die(enemy)
        }
    }
}
class Warrior:Unit{
    constructor(name:String):super(name,100,10,10,true){
        this.name=name
    }

    init{
        var exp = 3
    }

    override fun attack(enemy: Unit) {
        super.attack(enemy)
        if(enemy.life==false){
            exp -= 1
        }
    }
}

class Knight : Unit{
    constructor(name:String):super(name,200,20,15,true){
        this.name=name
    }

    fun hardAttack(enemy:Unit){
        println(""+enemy.name + "에게 hardAttack")
        energy -=3
        println(name+"의 체력 : $energy")
        if(enemy.energy < power*2){
            enemy.energy = 0
        }else {
            enemy.energy -= power*2
        }
        println(enemy.name+"의 체력 : " + enemy.energy)
        if(enemy.energy <= 0){
            die(enemy)
        }
    }

}

class Monster:Unit{
    constructor(name:String):super(name, 50,2,0,true){
        this.name=name
    }
}

var hs:Warrior = Warrior("학성")
var dy:Knight = Knight("다영")
dy.attack(hs)
dy.hardAttack(hs)
dy.hardAttack(hs)


//2. Knight는 hardAttack 기능이 있고, 이 기능을 사용하기 위해서는 energy가 3 필요하다.
//3. Warrior는 monster를 특정 마리수 이상 처치하면 knight로 레벨 업이 가능하다.


//프로그램 동작 예시
//monster 생성
//monster 아직 살아있습니다. 체력 :50
//Warrior가 공격합니다.
//Monster 아직 살아 있습니다. 체력:41
//Monster 공격합니다.
//Warrior는 죽었습니다.

//4. Warrior가 레벨업 하는 반복문 작성