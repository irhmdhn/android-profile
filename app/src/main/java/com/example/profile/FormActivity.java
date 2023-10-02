package com.example.profile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class FormActivity extends AppCompatActivity {

    Button btnSimpan, btnHapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        btnSimpan = findViewById(R.id.btnSimpan);
        btnHapus = findViewById(R.id.btnHapus);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FormActivity.this, "Data Disimpan", Toast.LENGTH_SHORT).show();
            }
        });

        btnHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(FormActivity.this);
                alertDialogBuilder.setTitle("Peringatan");
                alertDialogBuilder.setMessage("Apakah anda yakin untuk menghapus data")
                        .setIcon(R.drawable.ic_avatar)
                        .setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(),"Data berhasil dihapus",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });

                // DIALOG
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

            }
        });


    }
}