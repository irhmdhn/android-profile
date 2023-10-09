package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BiodataActivity extends AppCompatActivity {

    TextView tvNamaMhs, tvNimMhs;
    EditText etProdiMhs;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        tvNamaMhs= findViewById(R.id.tvNamaMhs);
        tvNimMhs= findViewById(R.id.tvNimMhs);
        etProdiMhs= findViewById(R.id.etProdiMhs);
        btnSubmit= findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = tvNamaMhs.getText().toString();
                    String nim = tvNimMhs.getText().toString();
                    String prodi = etProdiMhs.getText().toString();

                    if(prodi.isEmpty()){
                        Toast.makeText(getApplication(),"Prodi harus di isi", Toast.LENGTH_SHORT).show();
                    }else {
                        // by data
//                        Intent i = new Intent(BiodataActivity.this, DataActivity.class);
//                        i.putExtra("nama", nama);
//                        i.putExtra("nim", nim);
//                        i.putExtra("prodi", prodi);
//                        startActivity(i);

                        // by extras
                        Bundle bundle = new Bundle();
                        bundle.putString("nama",nama);
                        bundle.putString("nim",nim);
                        bundle.putString("prodi",prodi);
                        Intent i = new Intent(BiodataActivity.this, DataActivity.class);
                        i.putExtras(bundle);
                        startActivity(i);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(),"ERROR, TRY AGAIN", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}