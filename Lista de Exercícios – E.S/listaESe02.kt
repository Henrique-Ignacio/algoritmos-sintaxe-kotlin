
fun main() {
    var x: int
    
    println("Digite o valor para x")
    
    x = readLine()?.toIntOrNull()
    
    if (x != null)
    {
        
        println("O valor informado foi: $x")
       
    }
    else {
        
        println("Número invalido")
    }
}