package pt.ulusofona.cm.kotlin.challenge.models

class Carro {
    val identificador:String
    val motor:Motor

    constructor(identificador:String,motor: Motor){
        this.identificador=identificador;
        this.motor=motor
    }

    fun Carro(identificador: String,motor: Motor){

    }
}