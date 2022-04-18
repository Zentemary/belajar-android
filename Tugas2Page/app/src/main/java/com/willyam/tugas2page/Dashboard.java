package com.willyam.tugas2page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Dashboard extends AppCompatActivity {
    TextView b,c,d;
    private String nama,nomor,email;
    private String key_nama = "username";
    private String key_nomor = "nohp";
    private String key_email = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        b = (TextView) findViewById(R.id.txtUsername_2);
        c = (TextView) findViewById(R.id.txtNomor_2) ;
        d = (TextView) findViewById(R.id.txtEmail_2);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(key_nama);
        nomor = extras.getString(key_nomor);
        email = extras.getString(key_email);

        b.setText(nama);
        c.setText(nomor);
        d.setText(email);
    }
}
