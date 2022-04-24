// 배열을 선언하는 방법(1)
var array1 = arrayOf(true, "HI", 10, 2.2, null)
var array2 = arrayOf<Int?>(1,2,3,4,5, null)
var array3 = intArrayOf(1,2,3,4,5)

//배열을 선언하는 방법(2)
var array4 = Array(5,{1})
println(array4.get(1))
println(array4.get(3))

//배열을 선언하는 방법(3)
var array5 = Array<Int>(10, {0})
var array6 = Array<String>(10,{"메롱"})
println(array6.get(3))

var array7 = arrayOf<Int>(10,20,30,40)
array7.set(0, 200)
println(array7[0])

//배열의 인자로 변수를 넣는 방법 / 배열의 값을 변수의 값으로 할당하는 방법
val examScore1 : Int = 100
val examScore2 : Int = 90
val examScore3 : Int = 80
var examScores = arrayOf<Int>(examScore1,examScore2,examScore3)

val examScore4 = examScores[0]
println(examScore4)