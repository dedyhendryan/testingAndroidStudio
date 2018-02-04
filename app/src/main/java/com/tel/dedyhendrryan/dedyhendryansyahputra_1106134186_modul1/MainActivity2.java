package com.tel.dedyhendrryan.dedyhendryansyahputra_1106134186_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class MainActivity2 extends AppCompatActivity{
    TextView namamakanan, porsi, nmarumahmakan, totalhrga;

    @Override
    protected void onCreate (Bundle savedInstanceStats){
        super.onCreate(savedInstanceStats);
        setContentView(R.layout.eatbus);
        nmamakanan =(TextView) findViewById(R.id.nasiuduk);
        porsi =(TextView) findViewById(R.id.porsi2);
        nmarumahmakan=(TextView) findViewById(R.id.eatbus1);
        totalhrga=(TextView) findViewById(R.id.harga1);

        Intent olala = getIntent();
        String rumahmakan = olala.getStringExtra("nama_rumahmakan");
        String makanan = olala.getStringExtra("nama_makanan");
        String porsimakanan =olala.getStringExtra("porsi");
        int z = olala.getIntExtra("total_harga");
        String totalharga = String.valueOf(z);



            namamakanan.setText(makanan);
            porsi.setText(porsimakanan);
            nmarumahmakan.setText(rumahmakan);
            totalhrga.setText(totalharga);


    }
}
