package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

abstract class Pessoa {
    val nome :String
    val veiculos:List<Veiculo>
    val dataDeNascimento: Date
    val carta:Carta
    val posicao:Posicao
    constructor(nome: String, veiculos: List<Veiculo>,dataDeNascimento:Date,carta:Carta,posicao:Posicao) {
        this.nome = nome
        this.veiculos=veiculos
        this.dataDeNascimento=dataDeNascimento
        this.carta=carta
        this.posicao=posicao
    }

    fun Pessoa(nome:String,dataDeNascimento: Date){

    }
    fun comprarVeiculo(veiculo: Veiculo){

    }
    fun pesquisarVeiculo(identificador:String): Veiculo? {
        return null
    }
    fun venderVeiculo(identificador: String,comprador:Pessoa){

    }
    fun moverVeiculoPara(identificador: String,x:Int,y:Int){

    }
    fun temCarta():Boolean{
        return false
    }
    fun tirarCarta(){

    }

     fun toString(nome: String,dataDeNascimento:Date,posicao: Posicao,x:Int,y:Int): String? {
        return "Pessoa | $nome | $dataDeNascimento | $posicao | $x | $y"
    }
}