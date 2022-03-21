package com.example.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class List : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main, container, false)


        val list = mutableListOf(
            Tarefa(
                "Passear com o cachorro",
                "---",
                "Dia a Dia",
                "De preferência a tarde",
                "Pessoal",
                true,

            ),
            Tarefa(
                "Aula Generation",
                "---",
                "Estudo",
                "Manhã e tarde",
                "Pessoal",
                true,

            ),
            Tarefa(
                "Gravar podcast",
                "2022-23-03",
                "Trabalho",
                "Entrar no Skype",
                "João",
                false,

            )
        )


        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)


        val adapter = TarefaAdapter()


        recyclerTarefa.layoutManager = LinearLayoutManager(context)


        recyclerTarefa.adapter = adapter


        recyclerTarefa.setHasFixedSize(true)


        adapter.setList(List())

        return view
    }

}