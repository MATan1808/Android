package com.example.cacphuongtrinh;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import CacPhuongTrinh.Common;

public class PhepToan extends AppCompatActivity {
        Button btncong,btntru,btnnhan,btnchia,btnchiadu;
        EditText sothunhat,sothuhai,ketqua;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_phep_toan);
            btncong = findViewById(R.id.btncong);
            btntru = findViewById(R.id.btntru);
            btnnhan = findViewById(R.id.btnnhan);
            btnchia = findViewById(R.id.btnchia);
            btnchiadu = findViewById(R.id.btndu);
            sothunhat = findViewById(R.id.txta1);
            sothuhai = findViewById(R.id.txtb1);
            ketqua = findViewById(R.id.txtx1);
            //Làm mờ ô nhập liệu
            ketqua.setEnabled(false);
            btncong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String a = sothunhat.getText().toString();
                    String b = sothuhai.getText().toString();
                    Log.d("a+b", (a + b));
                    String kq = Common.cong(Integer.parseInt(a),Integer.parseInt(b));
                    ketqua.setText(kq);
                }
            });
        }
        //    public void pheptru(View view) {
        //        String a=sothunhat.getText().toString();
        //        String b=sothuhai.getText().toString();
        //        String kq= Common.tru(Integer.parseInt(a),Integer.parseInt(b));
        //        ketqua.setText(kq);
        //    }
        public void pheptru(View v){
            try {
                String a=sothunhat.getText().toString();
                String b=sothuhai.getText().toString();
                String kq = Common.tru(Integer.parseInt(a), Integer.parseInt(b));
                ketqua.setText(kq);
                //Log.d("a-b: ", a + b);
            } catch (Exception e){
                Toast.makeText(getApplicationContext(), "Lỗi nhập liệu", Toast.LENGTH_LONG).show();
            }
        }
        public void phepnhan(View v){
            try {
                String a=sothunhat.getText().toString();
                String b=sothuhai.getText().toString();
                String kq = Common.nhan(Integer.parseInt(a), Integer.parseInt(b));
                ketqua.setText(kq);
                //Log.d("a-b: ", a + b);
            } catch (Exception e){
                Toast.makeText(getApplicationContext(), "Lỗi nhập liệu", Toast.LENGTH_LONG).show();
            }
        }

        public void phepchia(View v){
            try {
                String a=sothunhat.getText().toString();
                String b=sothuhai.getText().toString();
                String kq = Common.chia(Integer.parseInt(a), Integer.parseInt(b));
                ketqua.setText(kq);
                //Log.d("a-b: ", a + b);
            } catch (Exception e){
                Toast.makeText(getApplicationContext(), "Lỗi nhập liệu", Toast.LENGTH_LONG).show();
            }
        }

        public void phepdu(View v){
            try {
                String a=sothunhat.getText().toString();
                String b=sothuhai.getText().toString();
                String kq = Common.du(Integer.parseInt(a), Integer.parseInt(b));
                ketqua.setText(kq);
                //Log.d("a-b: ", a + b);
            } catch (Exception e){
                Toast.makeText(getApplicationContext(), "Lỗi nhập liệu", Toast.LENGTH_LONG).show();
            }
        }
    }
