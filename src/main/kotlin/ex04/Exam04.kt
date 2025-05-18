package com.ex04

fun main(){
    // java의 Object는 kotiln에서는 Any로 표현됨.
    // 코틀린에서는 **of로, 기본이 val(불변임)ㄷ

    // pair = 값을 2가지 가짐
    val map = mapOf<String,Any>(
        Pair("",""), //방법 1
        "key" to "value" //방법 2
    )

    val mutableMap = mutableMapOf<String,Any>(
        "key" to "value"
    )

    mutableMap["key"] = "value"
    val value = mutableMap["key"]

    val hashMap = hashMapOf<String, Any>()

    // 값을 3가지 가짐
    var triple = Triple<String, String, String>(
        first = "",
        second = "",
        third = ""
    )


}