import java.lang.reflect.Constructor

fun main(){
    var s1 = student(1,"hhh")
    println(s1.no)
    println(s1.name)
}
class student(val no:Int){
    init {
        println("hello all")
    }
    var name:String=""

    constructor(n:Int,s:String):this(n){
        name=s

    }
    init {
        println("hello all")
    }
}


