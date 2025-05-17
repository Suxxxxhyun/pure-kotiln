package com.ex01

fun main(){
    // 코틀린 변수 선언 방법에는 2가지가 있다. var or val
    // var : 변할 수 있는 객체(가변객체)
    // val : final변수, 불변객체

    // 변수명:[타입], 타입추론가능
    val name: String = "홍길동"
    var _name: String = "홍길동"
    val n = "홍길동"

    println(name)
    val result = "사용자의 이름은 : ${name}"
    println(result)

    // 세미콜론 안찍어도 가능,
    // 코틀린에는 primitive type이 없음. 모두 reference type임
    var i = 10
    var _i: Int = 10

    var d: Double = 20.0
    var _d: Double

    var f:Float = 10f
    var b:Boolean = true


}