package com.example.rezafd.iak_epi1.adapter;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rezafd.iak_epi1.model.Cuaca;
import com.example.rezafd.iak_epi1.R;

/**
 * Created by REZAFD on 20/01/2018.
 */

public class CuacaAdapter extends ArrayAdapter<Cuaca>{
    private final AppCompatActivity context;
    private final Cuaca[] cuaca;

    public CuacaAdapter(AppCompatActivity context, Cuaca[] cuaca){
        super(context, R.layout.items,cuaca);
        this.context=context;
        this.cuaca=cuaca;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.items,null,true);

//        manggil data
        TextView text = (TextView) rowView.findViewById(R.id.text);
        ImageView image = (ImageView) rowView.findViewById(R.id.image);

//        nampilin data
        text.setText(cuaca[position].getTitle());
        image.setBackgroundResource(cuaca[position].getImage());
        return rowView;
    }
}
