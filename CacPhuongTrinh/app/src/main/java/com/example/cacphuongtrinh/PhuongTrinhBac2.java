package com.example.cacphuongtrinh;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import CacPhuongTrinh.Common;

public class PhuongTrinhBac2 extends AppCompatActivity {
    EditText hsa, hsb, hsc, txtx;
    Button btngui, btnlamlai, btnthoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_phuong_trinh_bac2);

        // Ánh xạ các thành phần trong layout
        hsa = findViewById(R.id.txta);
        hsb = findViewById(R.id.txtb);
        hsc = findViewById(R.id.txtc);
        txtx = findViewById(R.id.txtx);

        //Làm mờ ô nhập liệu
        txtx.setEnabled(false);

        btngui = findViewById(R.id.btngui);
        btnlamlai = findViewById(R.id.btnlamlai);
        btnthoat = findViewById(R.id.btnthoat);

        // Xử lý khi người dùng nhấn nút "Gửi"
        btngui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Kiểm tra xem người dùng đã nhập đầy đủ thông tin hay chưa
                if (TextUtils.isEmpty(hsa.getText().toString()) || TextUtils.isEmpty(hsb.getText().toString()) || TextUtils.isEmpty(hsc.getText().toString())) {
                    // Nếu một trong các trường đầu vào còn trống, hiển thị thông báo yêu cầu nhập đầy đủ dữ liệu
                    Toast.makeText(PhuongTrinhBac2.this, "Xin vui lòng nhập đầy đủ thông tin.", Toast.LENGTH_SHORT).show();
                } else {
                    float a = Float.parseFloat(hsa.getText().toString());
                    float b = Float.parseFloat(hsb.getText().toString());
                    float c = Float.parseFloat(hsc.getText().toString());
                    String x = Common.giaiB2(a, b, c);
                    txtx.setText(x);
                    Log.d("x=", x);
                }
            }
        });

        // Xử lý khi người dùng nhấn nút "Làm lại"
        btnlamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Xóa nội dung trong các ô nhập liệu và kết quả
                hsa.setText("");
                hsb.setText("");
                hsc.setText("");
                txtx.setText("");
            }
        });

        // Xử lý khi người dùng nhấn nút "Thoát"
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Hiển thị hộp thoại xác nhận trước khi kết thúc activity
                showConfirmationDialog();
            }
        });
    }

    // Phương thức để hiển thị hộp thoại xác nhận
    private void showConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Xác nhận");
        builder.setMessage("Bạn có chắc chắn muốn thoát?");
        builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Kết thúc activity
                finish();
            }
        });
        builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Không làm gì cả, đóng hộp thoại
                dialogInterface.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
