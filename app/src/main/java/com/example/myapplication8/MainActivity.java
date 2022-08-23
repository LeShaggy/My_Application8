package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    ArrayList<String> nombres;
    ArrayList<String> EstadosContactos;
    ArrayList<String> fotos;
    //< >

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv =findViewById(R.id.listado);

        generarNombres();
        generarEstados();
        fotosC();

        // Adaptador propio
        MiAdaptador miAdaptador = new MiAdaptador(getApplication(),R.layout.diseno_item,nombres,EstadosContactos,fotos);

        lv.setAdapter(miAdaptador);
        lv.setOnItemClickListener(this);
    }

    private void generarNombres(){
        nombres = new ArrayList<String>();
        nombres.add("Pasita <3");
        nombres.add("Fonsi");
        nombres.add("Alan");
        nombres.add("Jovanny");
        nombres.add("Chato lml");
        nombres.add("Josefa uwu");
        nombres.add("Melina");
        nombres.add("Many Manito");
        nombres.add("Perla Sharky");
        nombres.add("Señor Pana uwu");
        nombres.add("Caro <3");
        nombres.add("Señor Ayola");
        nombres.add("Polycornia");
        nombres.add("Issy");

    }

    private void generarEstados(){
        EstadosContactos = new ArrayList<String>();
        EstadosContactos.add("Un Quijote para vosotros");
        EstadosContactos.add("Every day in night I am dreaming...");
        EstadosContactos.add("Hey there! I am using WhatsApp");
        EstadosContactos.add("¿Crees que eres el único al que atormentan los sacrificios que hizo para llegar hasta aquí?");
        EstadosContactos.add("Carpe Diem");
        EstadosContactos.add("¿Quieres un shieto?");
        EstadosContactos.add("Me encanta Fonsi <3");
        EstadosContactos.add("I am just snacking");
        EstadosContactos.add("Froggs no bullets");
        EstadosContactos.add(".");
        EstadosContactos.add("Do u wanna play a game?");
        EstadosContactos.add("Siuuuuuuuuu");
        EstadosContactos.add("Siempre supe de lealtadad y no me importa quién me crea");
        EstadosContactos.add("Hey there! I am using WhatsApp");
    }

    private void fotosC(){
        fotos = new ArrayList<String>();
        fotos.add("foto1");
        fotos.add("foto2");
        fotos.add("foto3");
        fotos.add("foto4");
        fotos.add("foto5");
        fotos.add("foto6");
        fotos.add("foto7");
        fotos.add("foto8");
        fotos.add("foto9");
        fotos.add("foto10");
        fotos.add("foto11");
        fotos.add("foto12");
        fotos.add("foto13");
        fotos.add("foto14");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Click"+position+"Con un ID: "+id, Toast.LENGTH_SHORT).show();
    }
} // End class