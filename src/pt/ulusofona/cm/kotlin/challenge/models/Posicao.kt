package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Posicao {
    val x:Int
    val y:Int
    constructor(x:Int,y:Int){
        this.x=x
        this.y=y
    }
    fun Posicao(x:Int,y:Int){

    }
    fun alterarPosicaoPara(x:Int,y:Int){

    }
    fun toString(x:Int, y:Int): String? {
        return "Posicao | $x | $y"
    }


}
