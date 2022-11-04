//List
val numbers = listOf<Int>(1,2,3)
val numbers2 = mutableListOf<Int>(1,2,3)
numbers2[0] = 3
println("numbers2 : " + numbers2)

//Set
val numbers3 = setOf<Int>(1,1,1,2,3,4,4,4,4,3,2,1,2,12,312,3,12,3)
println("numbers3 : " + numbers3)
val numbers4 = mutableListOf<Int>(1,1,1,3,3,4)

//Map
val numbers5 = mapOf<Int,String>(1 to "one", 2 to "two")
val numbers6 = mapOf<Int, String>(Pair(1,"one"), Pair(2,"three"))
println("numbers5 : " + numbers5)
println("numbers6 : " + numbers6)

println(numbers2.component1())
numbers2.addAll(2, listOf<Int>(100,100,300))
println("numbers2 : " + numbers2)

println("numbers3.contains(100) : " + numbers3.contains(100))
println("numbers3.containsAll(setOf<Int>(312,1)) : " + numbers3.containsAll(setOf<Int>(312,1)))

println("numbers5.keys : " + numbers5.keys)
println("numbers5.values : " + numbers5.values)
println("numbers5.size : "+ numbers5.size)
println("numbers5.get(1) : " + numbers5.get(1) + "얘는 index 1부터")
println("numbers5[1] : " + numbers5[1])
println("numbers5.getOrDefault(1,'default') : " + numbers5.getOrDefault(1,"default"))
