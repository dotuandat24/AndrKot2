package com.example.andrkot1



fun main() {
    var a: String = "initial"

    val b = "testforString"

    var neverNull : String? = "this is can not null"
    //neverNull = null

    fun strLength(notnull: String?) : Int{
        if (notnull != null) {return notnull.length}
        else{return 0}
    }

    println(strLength("123"))
    //println(b)


    fun testForString(message : String, message2 : String = "giatrimacdinh"){
        println("ket qua la: $message ")
        println("gia tri mac dinh la : $message2")
    }

    fun testArray(vararg input:String){
        for(m in input) println(m)
    }

    fun main(args: Array<String>){
        println(args.contentToString())
    }

    testArray("input1","input2")

    println("tong cua a va b : ${sum(5,7)}")

    testForString(a)
    doSomethings(1)
    println(hasPrefix("123"))

    //var listNhanvien = mutableListOf<NhanVien>()

    //var nhanvien1 = NhanVien("tendat",1991)
    var i = 0
    do{
        i+=1
        var nhanVienI = NhanVien("NVNo${i}",199+i)
        println("Ten nhan vien thu${i}: ${nhanVienI.Ten}, Nam sinh: ${nhanVienI.NamSinh}")
    }while (i < 10)
    //println(nhanvien1.toString())
    //println("ten nhan vien: ${nhanvien1.Ten}, ; Nam sinh:${nhanvien1.NamSinh}")

    println(funMemoNewBranch())
}

fun sum(a : Int, b: Int):Int{
    return a + b
}

fun hasPrefix(x: Any) = when(x){
    is String -> x.startsWith("prefix")
    else -> false
}

fun doSomethings(input: Any){
    when(input){
        in 1..10 -> { println("kieu so trong day 1 den 10")}
        !in 10..20 -> {println("khong nam trong khoang 10-20")}
        else ->{ println("day la else")}
    }
}

//class data
data class NhanVien(val Ten:String ,val NamSinh:Int)

fun funMemoNewBranch(){
    println("new branch with name : 20220709")
}
