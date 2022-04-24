
val numbers = intArrayOf(5,10,15)

for (number in numbers){
    println(number)
}
println("--------------------")
for ((index,value) in numbers.withIndex()){
    println(index)
    println(value)
}
println("--------------------")
for (index in 0..numbers.size){
    println(index)
}

println("-------------------")
for(index in numbers.indices){
    println(index)
}

println("-------------------")
//본문에서 사용될 변수이름을 기본 제공으로 사용
numbers.forEachIndexed { index, i ->
    println("index = " + index)
    println(i)
}
println("---------------------")
//본문에서 사용될 변수이름을 변경해서 사용
numbers.forEachIndexed {index, value ->
    println(index)
    println(value)
}