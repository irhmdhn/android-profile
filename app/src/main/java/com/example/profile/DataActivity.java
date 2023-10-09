package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView tvNamaVal,tvNimVal,tvProdiVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tvNamaVal = findViewById(R.id.tvNamaVal);
        tvNimVal = findViewById(R.id.tvNimVal);
        tvProdiVal = findViewById(R.id.tvProdiVal);

        // get by data
//        Intent data = getIntent();
//        String nama = data.getStringExtra("nama");
//        String nim = data.getStringExtra("nim");
//        String prodi = data.getStringExtra("prodi");
//        tvNamaVal.setText(nama);
//        tvNimVal.setText(nim);
//        tvProdiVal.setText(prodi);

        //get by extras
        Bundle bundle = getIntent().getExtras();
        tvNamaVal.setText(bundle.getString("nama"));
        tvNimVal.setText(bundle.getString("nim"));
        tvProdiVal.setText(bundle.getString("prodi"));
    }
}