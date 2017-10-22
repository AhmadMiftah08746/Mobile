package com.aplikasiku.miftah.foodrecipe;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Miftah on 05/10/2017.
 */

public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {

    String data1[];
    int img[];
    Context ctx;
    private Context context;
    private ArrayList<Resep> Resep;

    public MyOwnAdapter(Context ct,String s1[],int i1[]){
        ctx = ct;
        data1 = s1;
        img = i1;
        this.context = context;
        this. Resep = Resep;
    }
    @Override
    public MyOwnAdapter.MyOwnHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
        View myOwnView = myInflator.inflate(R.layout.my_row,parent,false);
        return new MyOwnHolder(myOwnView);
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder {
        TextView t1;
        ImageView myImage;
        public MyOwnHolder (View itemView) {
            super(itemView);
            t1=(TextView)itemView.findViewById(R.id.text1);
            myImage = (ImageView)itemView.findViewById(R.id.myImage);
        }
    }
    @Override
    public void onBindViewHolder(MyOwnAdapter.MyOwnHolder holder, final int position) {
        holder.t1.setText(data1[position]);
        holder.myImage.setImageResource(img[position]);

        holder.t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailIsiResep.class);
                i.putExtra("gambar", Resep.get(position).getGambar());
                i.putExtra("detailresep", Resep.get(position).getIsiResep());
                i.putExtra("menuBar",Resep.get(position).getMenuBar());
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return Resep.size();
    }


}