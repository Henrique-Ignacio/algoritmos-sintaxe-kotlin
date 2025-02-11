fun main {
    var temp_fahrenheit: int
    var temp_celcius: int 

    println("Qual a temperatura em fahrenheit?")

    temp_fahrenheit = readline()?.toIntOrNull()

    if(temp_fahrenheit != null){

        temp_celcius = 5 * ((temp_fahrenheit-32) / 9 )
        println("A temperatura em celcius é $temp_celcius")
    }else {
        println("Número invalido")
    }

}