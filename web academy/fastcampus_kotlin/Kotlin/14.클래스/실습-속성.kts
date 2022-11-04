//getter //setter
class Book() {
    var title :String = "모름"
        get(){
            println("getter")
            return field
        }
        set(value){
            println("setter")
            field = value
        }

}
val book = Book()
println(book.title)
book.title = "제목 변경"
println(book.title)

println("--------------------------------")

//lateinit
class MasterBook() {
    lateinit var title: String

    fun nextPage() {
        if(::title.isInitialized) {
            println("페이지가 넘어간다.")
        } else {
            println("초기화 필요")
        }
    }
}
val book2 = MasterBook()
book2.title = "책이름"
println(book2.nextPage())

val book3 = MasterBook()
println(book3.nextPage())

println("-----------lazy---------------")

//Lazy
// - 호출시점에 by lazy 정의에 의해서 추기화 수행한다.
// - val 에서만 사용 가능.
class Book2{
    val title:String by lazy {
        //본문 -> 다른 작업도 할 수 있지만 반드시 프로퍼티를 초기화 시켜주는 작업을 해야한다.
        println("lazy 초기화")
        "책 제목"
    }
}
val book4 = Book2()
println(book4.title)