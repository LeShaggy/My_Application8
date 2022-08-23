package com.example.myapplication8;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MiAdaptador extends BaseAdapter{
    // variables
    private Context c;
    private int diseno;
    private ArrayList<String> nombres;
    private ArrayList<String> EstadosContactos;
    private ArrayList<String> fotos;

    // Constructor
    public MiAdaptador(Context c, int diseno, ArrayList<String> nombres,ArrayList<String> EstadosContactos, ArrayList<String> fotos){
        this.c = c;
        this.diseno=diseno;
        this.nombres=nombres;
        this.EstadosContactos = EstadosContactos;
        this.fotos = fotos;
    }

    // Métodos
    @Override
    public int getCount() {
        return nombres.size();
    }
    public int getCount2() { return EstadosContactos.size(); }
    public int getCount3() {return fotos.size(); }

    @Override
    public Object getItem(int position) {
        return nombres.get(position);
    }
    public Object getItem2(int position) {return EstadosContactos.get(position); }
    public Object getItem3(int position) {return fotos.get(position); }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vistaDiseno = convertView;

        if (vistaDiseno == null){
            // Hay crea la vista = diseño
            LayoutInflater layoutInflater = LayoutInflater.from(c);
            vistaDiseno = layoutInflater.inflate(diseno,null);
        }

        TextView tvNombres = vistaDiseno.findViewById(R.id.tvDespliegaNombres);
        TextView tvEstados = vistaDiseno.findViewById(R.id.tvEstadoContacto);
        ImageView tvFotos = vistaDiseno.findViewById(R.id.tvFotosContacto);
        tvNombres.setText(nombres.get(position));
        tvEstados.setText(EstadosContactos.get(position));
        tvFotos.setImageResource(this.c.getResources().getIdentifier(fotos.get(position), "drawable", c.getPackageName()));

        return vistaDiseno;
    }
} // End class
