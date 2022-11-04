//1. 주어진 문자를 N번 반복해서 출력하는 함수를 만들어 보자.
fun question1(q1text:String, q1number:Int){
    for(i in 1..q1number){
        println("1번 답 : " + q1text)
    }
}
question1("1번 호출", 3)

//2. 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자.
fun question2(q2Input:Int):Int{
    var q2Result:Int = 0
    for(i in 1..q2Input){
        q2Result += i
    }
    return q2Result
}

println("2번 1~5까지의 합 = "+ question2(5))

//3. 1부터 100까지의 수중에서 7의 배수의 합을 구하는 함수를 만드시오.
fun question3SumMod7():Int{
    var result:Int = 0
    for(i:Int in 1..100){
        if(i%7==0){
            result +=i
        }
    }
    return result
}
println("3번 1~100까지 7의 배수의 합 : "+ question3SumMod7())

//4. 100보다 작은 숫자를 넣어주면, 1씩 증가를 시키고 100이 되면 종료되는 함수를 만드시오.
fun make100(input:Int):Unit {
    var startNumber:Int = input
    var result:Int = input
    var numbering:Int = 0
    while(result<100){
        result++
        numbering++
    }
    print(startNumber)
    print("을(를) 100까지 만드는 데 ")
    print(numbering)
    println("번 실행.")
}
make100(80)

//5. 시험 성적 리스트 [70,71,72,77,78,79,80,82,90,99]와
//   동일한 크기의 배열을 만들고, 합격이면 true, 불합격이면 false를 담는 함수를 만드시오.(80점이상 합격) 답 ex) (False,False,True..)
var q5ScoreArr = arrayOf<Int>(70,71,72,77,78,79,80,82,90,99)
fun q5Result(input:Array<Int>):BooleanArray{
    var result = BooleanArray(input.size)
    for(i in 0 until input.size){
        if(input[i]>=80){
            result[i] = true
        }
    }
    return result
}

var q5answer = q5Result(q5ScoreArr)
for((index,value) in q5answer.withIndex()){
    if(index==0){
        print("(" + value)
    }else if(index==q5answer.size-1){
        print(", "+ value + ")")
    }else {
        print(", "+value)
    }
}
println()
//5번 선생님 풀이.
println("5번 선생님 풀이")
fun checkPassOrNot(examScores: List<Int>):BooleanArray {
    val resultArray = BooleanArray(examScores.size, {false})
    examScores.forEachIndexed { index, score ->
        if(score >= 80) resultArray[index] = true
    }
    return resultArray
}
var result = checkPassOrNot(listOf<Int>(70,71,72,77,78,79,80,82,90,99))
result.forEachIndexed {index, value ->
    if(index == 0){
        print("(" + value)
    }else
    print(value)
}

//6. 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오.
//   ->[ [3,3], [1,5], ...]
println()
fun throw2dice():ArrayList<ArrayList<Int>>{
    val result = ArrayList<ArrayList<Int>>()
    for(i:Int in 1..6){
        val dicelist = ArrayList<Int>()
        for(j:Int in 1..6){
            if(i+j==6){
                dicelist.add(i)
                dicelist.add(j)
                result.add(dicelist)
            }
        }
    }
    return result
}
println(throw2dice())

//7. 배부르기 위해서 남은 밥먹기 횟수, 현재 밥 먹은 횟수, 두개를 받는 함수를 만드시오.
//   함수는 "밥을 먹었다" 출력 1회마다 밥 1회 먹은것으로 간주.
//   배가 부를때까지 밥을 먹여야 하는데, 배가 부를 경우 "배가 부르다" 출력.
//   배가 아무리 불러도 최소 1번은 무조건 먹는다.
//   fun eat(3,2):{} ->"밥을 먹었다." ->"배가 부르다."
fun eat(total:Int, present:Int){
    var presentEat:Int = present
    do{
        println("밥을 먹었다.")
        presentEat++
    }while(total>presentEat)
    println("배가 부르다.")
}
eat(5,1)

//8. 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두개의 병사 그룹을 합쳐주는 함수를 만드시오.
//   fun abc( ["A", "B", "C", "D", "E"], ["A", "B", "C"], 2)
//   -> [ ["A", "B", "D", "E"], ["A", "B"] ]
//   (함수 실행이 어려운 조건을 만나면 null을 리턴)
//   fun abc( ["A", "B", "C", "D", "E"], ["A", "B", "C"], 100)
//   -> null
fun q8function(group1:ArrayList<String>, group2:ArrayList<String>, number:Int):ArrayList<ArrayList<String>>? {
    var gr1:ArrayList<String> = group1
    var gr2:ArrayList<String> = group2
    if(number>gr1.size-1 || number > gr2.size-1){
        return null
    }else {
        gr1.removeAt(number)
        gr2.removeAt(number)
    }
    var result = ArrayList<ArrayList<String>>()
    result.add(gr1)
    result.add(gr2)
    return result
}
val a = arrayListOf<String>("A","B","C","D")
val b = arrayListOf<String>("A","B","D")
println(q8function(a,b,2))


//9. 구구단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오.
//   fun abc(3)
//   ->[3,6,9,12,15,18,21,24,27]
fun gugudan(dan:Int):ArrayList<Int>{
    var result = ArrayList<Int>()
    for(i in 1..9){
        result.add(dan*i)
    }
    return result
}
gugudan(9)

//10. 숫자 리스트 두개를 넣어주면 짝수와 홀수로 분리된 Map을 만드는 함수를 만드시오.
//    (Map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수")
fun q10makeMap(input:List<Int>):Map<String,Int>{
    var one:Int = 0
    var two:Int = 0
    for(i in input){
        if(i%2==0){
            two = i
        }else one = i
    }
    var result = mapOf<String,Int>("짝수" to two, "홀수" to one)
    return result
}
val q10arr = listOf<Int>(3,2)
println(q10makeMap(q10arr))

//10번 선생님 풀이
fun splitNumbers(firstIntList:List<Int>, secondIntList:List<Int>):Map<String, List<Int>>{
    val result = mutableMapOf<String, List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondIntList)

    val evenNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()

    totalIntList.forEach {number ->
        if(number%2 == 0) evenNumber.add(number)
        else oddNumber.add(number)
    }

    result.put("짝수", evenNumber)
    result.put("홀수", oddNumber)
    return result

}

println(
    splitNumbers(listOf<Int>(1,2,3,4,5), listOf<Int>(6,7,8,9,10))
)