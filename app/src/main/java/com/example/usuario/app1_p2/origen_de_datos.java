package com.example.usuario.app1_p2;

import java.util.ArrayList;


public class origen_de_datos
{

    public ArrayList<Tarjeta> showAll()
    {
        ArrayList<Tarjeta> resultado = new ArrayList<Tarjeta>();

            Tarjeta uno = new Tarjeta();
            uno.texto1.setText("Juan");
            uno.texto2.setText("15");
            uno.texto3.setText("Es homosexual");
            uno.ID=1;
            resultado.add(uno);

            Tarjeta dos = new Tarjeta();
            dos.texto1.setText("Pedro");
            dos.texto2.setText("18");
            dos.texto3.setText("No es homosexual");
            dos.ID=2;
            resultado.add(dos);

            Tarjeta tres = new Tarjeta();
            tres.texto1.setText("Emmanuel");
            tres.texto2.setText("18");
            tres.texto3.setText("Es hermoso");
            tres.ID=3;
            resultado.add(tres);

            Tarjeta cuatro = new Tarjeta();
            cuatro.texto1.setText("Alan");
            cuatro.texto2.setText("15");
            cuatro.texto3.setText("Es homosexual");
            cuatro.ID=4;
            resultado.add(cuatro);

            Tarjeta cinco = new Tarjeta();
            cinco.texto1.setText("Juan");
            cinco.texto2.setText("15");
            cinco.texto3.setText("Es homosexual");
            cuatro.ID=5;
            resultado.add(cinco);

            Tarjeta seis = new Tarjeta();
            seis.texto1.setText("Juan");
            seis.texto1.setText("15");
            seis.texto1.setText("Es homosexual");
            seis.ID=4;
            resultado.add(seis);

            Tarjeta siete = new Tarjeta();
            siete.texto1.setText("Juan");
            siete.texto2.setText("15");
            siete.texto3.setText("Es homosexual");
            siete.ID=7;
            resultado.add(siete);

            Tarjeta ocho = new Tarjeta();
            ocho.texto1.setText("Darío");
            ocho.texto2.setText("15");
            ocho.texto3.setText("Es homosexual");
            ocho.ID=8;
            resultado.add(ocho);

            Tarjeta nueve = new Tarjeta();
            nueve.texto1.setText("Jessica");
            nueve.texto2.setText("18");
            nueve.texto3.setText("Es hermosa");
            nueve.ID=9;
            resultado.add(nueve);

            Tarjeta diez = new Tarjeta();
            diez.texto1.setText("Anita");
            diez.texto2.setText("21");
            diez.texto3.setText("Es alta");
            diez.ID=10;
            resultado.add(diez);
            return resultado;

    }
}
