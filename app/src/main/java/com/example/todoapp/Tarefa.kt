package com.example.todoapp


data class Tarefa (
    var nome: String,
    var data: String,
    var categoria: String,
    var detalhes: String,
    var responsavel: String,
    var check: Boolean,

){
}