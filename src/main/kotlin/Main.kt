fun main(){
    (nameStude(12, 2, 43))
    sentence("karen")
    studentRecord("karen", 12, "0709898765", 23.00, true)
    nameString("akirachix")
    temperature(12.0)

}

fun nameStude(num1:Int, num2:Int, num3:Int){
    var a = num1
    var b= num2
    var c= num3
    var sum= a +b +c
    println (sum)
}

fun sentence(name:String){
    var name = "karen"
    if (name=="karen"){
        println("That's me!")
    }else{
        println("I don't know who that is")
    }
}
fun studentRecord(fullName:String, age:Int, phoneNumber:String, weight:Double, citizen:Boolean){
    println(fullName)
    println(age)
    println(phoneNumber)
    println(weight)
    println(citizen)
}

fun nameString(name:String):String{
    var a= name[2]
    var b= name [3]
    var c= name[4]
    var d= name[5]
    var fullname= a+" "+b+" "+c+" "+d
    return fullname
}


fun temperature(num:Double){
    var sentence= "The temperature is $num degrees Celcious"
    println(sentence)
}