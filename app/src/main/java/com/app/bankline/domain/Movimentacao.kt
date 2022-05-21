package com.app.bankline.domain

import com.google.gson.annotations.SerializedName

data class Movimentacao(
    val id: Int,
    val dataHora: String,
    val descricao: String,
    val tipo: TipoMovimentacao,
    @SerializedName("idConta")
    val idCorrentista: Int,
    val valor: Double
)
