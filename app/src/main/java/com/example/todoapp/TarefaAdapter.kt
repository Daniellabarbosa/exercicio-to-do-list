package com.example.todoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>(){

    private var list = emptyList<Tarefa>()

    class TarefaViewHolder (view: View) : RecyclerView.ViewHolder(view){

        val textNome = view.findViewById<TextView>(R.id.textNome)
        val textDescricao = view.findViewById<TextView>(R.id.textDescricao)
        val textResponsavel = view.findViewById<TextView>(R.id.textResponsavel)
        val textData = view.findViewById<TextView>(R.id.textData)
        val switchCardAtivo = view.findViewById<Switch>(R.id.switchCardAtivo)
        val textCategoria = view.findViewById<TextView>(R.id.textCategoria)
        val buttonDeletar = view.findViewById<Button>(R.id.buttonDeletar)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {

        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_main, parent, false)

        return TarefaViewHolder(layout)
    }


    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {

        val tarefa = list[position]

        holder.textNome.text = tarefa.nome
        holder.textDescricao.text = tarefa.detalhes
        holder.textResponsavel.text = tarefa.responsavel
        holder.textData.text = tarefa.data
        holder.switchCardAtivo.isChecked = tarefa.check
        holder.textCategoria.text = tarefa.categoria

    }



    override fun getItemCount(): Int {
        return list.size
    }

    fun setList(lista: List<Tarefa>){
        list = lista
        notifyDataSetChanged()
    }

}