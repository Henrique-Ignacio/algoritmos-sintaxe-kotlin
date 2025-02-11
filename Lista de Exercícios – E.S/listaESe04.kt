fun main() {
    val nota1: int
    val nota2: int
    val nota3: int
    val nota4: int
    var media: int
    var cont: int = 0
    
   
    for (cont in 1..4) {

    println("Qual foi a nota?")
    
    nota += readLine()?.toIntOrNull()

    cont =+ 1
        
    }
    
    if (nota != null)
    {
       media = nota/cont
        println("O valor da media foi: $media")
       
    }
    else {
        
        println("Número invalido")
    }
}