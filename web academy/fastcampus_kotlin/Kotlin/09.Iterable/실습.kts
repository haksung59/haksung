// Range
val range1 = 1..10
println("range1 : " +range1)

val range2 = 1 until 10
println("range2 : " + range2)

val range3 = 'A'..'Z'
println("range3 : " + range3)

val range4 = 'ㄱ'..'ㅎ'
println("range4 : " + range4)

println("-----Progression-----")
// Progression
val range5 = 1..10 step 2
println("range5 : " + range5)

val range6 = 10 downTo 1 step 2
println("range6 : " + range6)

//STEP
//- 특징 : step의 값과 상관없이 첫번째는 무조건 index 0부터 시작한다.

// Collection
val collection1 = listOf<Int>(1,2,3,4,5)
println("collection1 : " + collection1)