package com.ex05

import java.util.function.Predicate

fun main(){
    var numberList = listOf<Int>(1, 2, 3, 4, 5)
    val pred = Predicate<Int> { t -> t % 2 == 0 }
    numberList.stream().filter(pred)

    val add = {x: Int, y:Int -> x + y}
    val _add = fun(x : Int, y:Int): Int{
        return x + y
    }
    println(add.invoke(2,3))
    println(_add(3,4))
    lamda(4, 5, _add)
}

fun lamda(x: Int, y:Int, method:(Int, Int) -> Int){
    println(method(x,y))
}