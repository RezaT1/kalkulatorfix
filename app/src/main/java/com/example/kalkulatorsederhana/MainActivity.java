package com.example.kalkulatorsederhana;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nilai1 = (EditText) findViewById(R.id.textNilai1);
        final EditText nilai2 = (EditText) findViewById(R.id.textNilai2);
        final TextView viewHasil = (TextView) findViewById(R.id.viewHasil);


        //tambah
        Button tambah = (Button) findViewById(R.id.buttonTambah);
        tambah.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                int n1 = Integer.parseInt(nilai1.getText().toString());
                int n2 = Integer.parseInt(nilai2.getText().toString());
                int hasil = n1 + n2;
                viewHasil.setText(String.valueOf(hasil));
            }
        });

    }
}