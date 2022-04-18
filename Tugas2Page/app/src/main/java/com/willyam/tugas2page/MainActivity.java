package com.willyam.tugas2page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nama, nomor, email;
    Button btnKirim;

    private String key_nama = "username";
    private String key_nomor = "nohp";
    private String key_email = "email";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.edt_username);
        nomor = (EditText) findViewById(R.id.edt_nomorhp);
        email = (EditText) findViewById(R.id.edt_email);
        btnKirim = (Button) findViewById(R.id.btn_kirim);
        btnKirim.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    String nama2 = nama.getText().toString();
                    String nomor2 = nomor.getText().toString();
                    String email2 = email.getText().toString();

                    if(nama2 != null && nama2 != ""){
                        Intent i = new Intent(MainActivity.this, Dashboard.class);
                        i.putExtra(key_nama, nama2);
                        i.putExtra(key_nomor, nomor2);
                        i.putExtra(key_email, email2);

                        startActivity(i);
                    }else{
                        Toast.makeText(getApplication(), "Mohon diisi yang lengkap", Toast.LENGTH_SHORT);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Error, mohon dicoba lagi", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}
