package com.aplikasiku.miftah.foodrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Miftah on 11/10/2017.
 */

public class DetailIsiResep extends AppCompatActivity {
    TextView tv_deatil;
    ImageView img_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_isi_resep);

        img_detail = (ImageView)findViewById(R.id.gambar_resep);
        tv_deatil = (TextView)findViewById(R.id.isi_resep);
        Intent i = getIntent();

        int Gambar = i.getIntExtra("gambar",0);
        img_detail.setImageResource(Gambar);

        String IsiResep = i.getStringExtra("DetailIsiResep");
        tv_deatil.setText(IsiResep);

        String judul = i.getStringExtra("member");
        getSupportActionBar().setTitle(judul);
    }
}
