package com.example.appcustomlistview_final;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import Model.SinhVien;

public class MainActivity extends AppCompatActivity {

    ListView lvsv;
    ArrayList<SinhVien> arrsv;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        lvsv=findViewById(R.id.lvsv);
        arrsv=new ArrayList<>();
        arrsv.add(new SinhVien("0001","Tan","Nam","anh1"));
        arrsv.add(new SinhVien("0002","Tho","Nam","anh2"));
        arrsv.add(new SinhVien("0003","Huy","Nam","anh3"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));
        arrsv.add(new SinhVien("0004","Hy","Nam","anh4"));

        Log.d("lenghhhh",""+arrsv.size());
        adapter=new CustomAdapter(this,arrsv);
        lvsv.setAdapter(adapter);
    }
}