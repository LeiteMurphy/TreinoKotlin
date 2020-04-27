package fundamentos.controle

fun main(args: Array<String>) {
    val num1: Int = 9
    val num2: Int = 3

    val maiorValor = if (num1 > num2) {
        println("processando ...")
        num1
    }
    else{
        println("processando ...")
        num2
    }
    println("O maior valor é $maiorValor.")
}