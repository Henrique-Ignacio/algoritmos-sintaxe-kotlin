fun main {

    var raio: int
    var area: int

    println("Qual o tamanho do raio do circulo?")

    raio = readline()?.toIntOrNull()

    if (raio != null){

    area = Math.pow(raio,2.0) * 3,14
    println("O valor a área é $area")

    }else{
        println("Número invalido")
    }
}