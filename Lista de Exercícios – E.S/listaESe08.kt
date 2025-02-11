fun main {
     var salario_hora: int
     var salario: int
     var hora: int

     println("Qual o seu salario por hora?")

     salario_hora = readline()?.toIntOrNull()

     println("Quantas horas você trabalha por mês?")

     hora = readline()?.toIntOrNull()

     if(salario_hora != null && hora != null){

        salario = salario_hora*hora
        println("O seu salario por mês é $salario")

     } else{
        println("Número invalido")
     }

}