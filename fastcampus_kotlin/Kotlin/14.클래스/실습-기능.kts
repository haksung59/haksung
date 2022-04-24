class FootballPlayer constructor(uniform:String, ball:String){
    val uniform:String
    val ball:String
    init{
        this.uniform = uniform
        this.ball = ball
    }

    fun kick() {
        println("공을 찼다.")
    }

    fun pass() {
        println("패스!")
    }
}

val footballPlayer = FootballPlayer("빨강", "초록공")
footballPlayer.kick()

val footballPlayer2 = FootballPlayer("초록", "초록공")
footballPlayer2.pass()