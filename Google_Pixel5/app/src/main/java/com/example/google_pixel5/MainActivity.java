package com.example.google_pixel5;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Bai_Tap1.Common;

public class MainActivity extends AppCompatActivity {

    EditText hsa, hsb, hsc;
    Button btngiai, btnlamlai;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        hsa = findViewById(R.id.txta);
        hsb = findViewById(R.id.txtb);
        hsc = findViewById(R.id.txtx);
        btngiai = findViewById(R.id.btngiai);
        btnlamlai = findViewById(R.id.btnlamlai);
        btngiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(hsa.getText().toString());
                float b = Float.parseFloat(hsb.getText().toString());
                String x = Common.giaiB1(a, b);
                hsc.setText(x);
                Log.d("x=", x);

            }
        });

    }
}