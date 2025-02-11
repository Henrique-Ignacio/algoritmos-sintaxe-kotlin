
fun main() {
    var x: int
    var y: int
    var z: int
   
    
    println("Digite o valor para x")
    
    x = readLine()?.toIntOrNull()
    
    println("Digite o valor para y")
    
    y = readLine()?.toIntOrNull()
    
    if (x != null && y != null)
    {
        z = x + y
        println("O valor da soma foi: $z")
       
    }
    else {
        
        println("Número invalido")
    }
}