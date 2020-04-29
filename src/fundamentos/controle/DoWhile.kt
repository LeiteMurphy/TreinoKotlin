package fundamentos.controle

import javax.sound.sampled.Line

fun main(args: Array<String>) {
    var opcao: Int = 0

    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Voce escolheu a opção $opcao")
     } while (opcao != -1)

    println("Até a próxima!")
}