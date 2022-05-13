package com.example.recyclerview;

import android.os.RecoverySystem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
 private RecyclerView recyclerView;
 private List<Filme>listaFilmes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        //Listagem de filmes
        this.criarFilmes();

        //Configurar Adapter
       //passo 5
        Adapter adapter = new Adapter(listaFilmes);

        //Configurar Recyclerview
       RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
       recyclerView.setLayoutManager(layoutManager);
       // esse método otimiza o recyclerview (tamanho fixo)
       recyclerView.setHasFixedSize(true);
       recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
    public  void  criarFilmes(){
        Filme filme = new Filme("O Rei das Fugas","Ação,Crime","2022");
        this.listaFilmes.add(filme);

        filme  = new Filme("Doutor Estranho no Multiverso da Loucura","Ação/Aventura/Fantasia","2022");
        this.listaFilmes.add(filme);

        filme = new Filme("Animais Fantásticos","Aventura/Fantasia","2022");
        this.listaFilmes.add(filme);

         filme = new Filme("Passageiro 666","Terror/Suspense","2022");
        this.listaFilmes.add(filme);
    }
}