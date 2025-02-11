fun main{

var metros: int
var centimetros: int
println("Qual a medida em metros?")
    
    metros = readLine()?.toIntOrNull()

    if (metros != null){
        centimetros = metros*100
        println("A medida em centimetros é $centimetros")
    } else {

    println("Número invalido")

    }

}