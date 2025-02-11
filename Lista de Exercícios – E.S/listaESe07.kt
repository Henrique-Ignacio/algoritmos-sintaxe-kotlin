fun main {

    var lado1: int 
    var lado2: int
    var area: int
    var resultado: int

    println("Qual o valor do primeiro lado do quadrado")

    lado1 = readline()?.toIntOrNull()

    println("Qual o valor do segundo lado do quadrado")

    lado2 = readline()?.toIntOrNull()

    if(lado1 != null && lado2 != null){
        area  = lado1 * lado2

    resultado = area*2

    println("A área do quadrado vezes 2 é: $resultado")
        
    }else{
        println("Número invalido")
    }

}