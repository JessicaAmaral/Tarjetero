package com.example.usuario.app1_p2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = (ListView) findViewById(R.id.listview);
        origen_de_datos origen = new origen_de_datos();
        adaptador_lista_de_datos adapatador = new adaptador_lista_de_datos();
        adapatador.arreglo= origen.showAll();
        adapatador.contexto=this;
        listview.setAdapter(adapatador);

    }
}
