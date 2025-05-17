package com.ex02

fun main(){
    val a:Int = 0
    val b = 10
    val c:Int = 20
    val d:Int? = null

    callFunction(a)
    callFunction(b)
    callFunction(c)
    callFunction(d)
    callFunction()
}

// 변수:타입? = 엘비스 연산자 -> 해당 변수가 null일 수 있어!
fun callFunction(i:Int? = 100){

    //변수? << 변수가 null이니?
    // 변수?. << 변수가 null이 아닐때
    // 변수?: << 변수가 null일때

    // 삼항연산자 대신 if-else
    val temp = if(i == null) "null값입니다" else i
    println(temp)
    val temp2 = i ?: "null값입니다"
    println(temp2)
    val temp3 = i?.let { i * 20} ?:"null값입니다"
    println(temp3)

    // 변수가 null이 아닐때
    i?.let{
        println(it)
    } ?: run{ // 변수가 null일때
        println("null 값입니다.")
    }

    println(i)
}