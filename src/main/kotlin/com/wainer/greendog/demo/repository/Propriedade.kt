package com.wainer.greendog.demo.repository

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "propriedade")
data class Propriedade (
    @Id
    private var nome: String = "",
    private var valor: String = "",
    private var descricao: String = "",
    private var categoria: String = ""
)