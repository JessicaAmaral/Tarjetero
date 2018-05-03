package com.example.usuario.app1_p2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class adaptador_lista_de_datos extends BaseAdapter

{
    public ArrayList<Tarjeta> arreglo;
    public Context contexto;


        @Override
        public int getCount ()
        {
            return arreglo.size();
        }

        @Override
        public Object getItem ( int i)
        {
            return arreglo.get(i);
        }

        @Override
        public long getItemId ( int i)
        {
            return arreglo.get(i).ID;
        }

        @Override
        public View getView ( int i, View view, ViewGroup viewGroup)
        {
            LayoutInflater inflate;
            inflate=LayoutInflater.from(contexto);
            View v = inflate.inflate(R.layout.tarjetero, null);
            TextView nombre = (TextView) v.findViewById(R.id.texto1);
            nombre.setText( arreglo.get (i).texto1.getText());
            return v;
        }
}
