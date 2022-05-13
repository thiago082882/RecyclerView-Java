package com.example.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.Filme;

import java.util.List;

//Passo 2: Criar o Adapter
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Filme> listaFilme;
    public Adapter(List<Filme>lista) {
        this.listaFilme=lista;

    }

    @Override
    //visualizações
    public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista,parent,false);
        return new MyViewHolder(itemLista);
    }
  //passo 4
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
      Filme filme =listaFilme.get(position);
      holder.titulo.setText(filme.getTituloFilme());
      holder.genero.setText(filme.getGenero());
      holder.ano.setText(filme.getAno());
    }

    @Override
    public int getItemCount() {
        return listaFilme.size();
    }
    //Passo 3
    public class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView titulo;
        TextView ano;
        TextView genero;
        public MyViewHolder(View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            ano = itemView.findViewById(R.id.ano);
            genero =itemView.findViewById(R.id.genero);
        }
    }
}
