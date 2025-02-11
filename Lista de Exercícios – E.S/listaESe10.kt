fun main {
    var temp_fahrenheit: int
    var temp_celcius: int 

    println("Qual a temperatura em celcius?")

    temp_celcius = readline()?.toIntOrNull()

    if(temp_celcius != null){

C x 1,8 + 32.
        temp_fahrenheit = temp_celcius * 1,8 + 32
        println("A temperatura em fahrenheit é $temp_fahrenheit")
    }else {
        println("Número invalido")
    }

}