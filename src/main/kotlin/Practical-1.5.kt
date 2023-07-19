fun main(){
    println("Switch Case statment")
    println("Enter a Number")
    var a= readLine()!!.toInt()
    when(a){
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("Augst")
        9 -> println("Sept")
        10 -> println("Oct")
        11 -> println("Novmber")
        12 -> println("December")
    }
}