package com.example.cacphuongtrinh;



import static androidx.constraintlayout.widget.Constraints.TAG;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainListViewActivity extends AppCompatActivity {
    ListView lvm;
    List<String> data;
    ArrayAdapter<String> adapter;
    int i=1;
    /**
     * The view is not scrolling. Note navigating the list using the trackball counts as
     * being in the idle state since these transitions are not animated.
     */
    public static int SCROLL_STATE_IDLE = 0;

    /**
     * The user is scrolling using touch, and their finger is still on the screen
     */
    public static int SCROLL_STATE_TOUCH_SCROLL = 1;

    /**
     * The user had previously been scrolling using touch and had performed a fling. The
     * animation is now coasting to a stop
     */
    public static int SCROLL_STATE_FLING = 2;
    private void showDialogconfirm(String s, int p){
        //Tạo đối tượng
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        //Thiết lập tiêu đề
        b.setTitle("Xác nhận");
        b.setMessage("Bạn có đồng ý xóa mục  "+s+" này không ?");
        // Nút Ok
        b.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                data.remove(p);
                adapter.notifyDataSetChanged();

                //finish();
            }
        });
        //Nút Cancel
        b.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        //Tạo dialog
        AlertDialog al = b.create();
        //Hiển thị
        al.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_list_view);
        lvm=findViewById(R.id.lvmain);
        data = new ArrayList<>();
        data.add("ax+b=0");
        data.add("ax^2+bx+c=0");
        data.add("Phép Toán");
        data.add("X^n");
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        data.add("6");
        data.add("7");
        data.add("8");
        data.add("9");
        data.add("10");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        // 3. Set Adapter for ListView
        lvm.setAdapter(adapter);
        lvm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent in = new Intent(getApplicationContext(), PhuongTrinhBac2.class);
                    startActivity(in);
                }
                if(position==1)
                {
                    Intent in = new Intent(getApplicationContext(), PhuongTrinhBac2.class);
                    startActivity(in);
                }
                if(position==2)
                {
                    Intent in = new Intent(getApplicationContext(), PhepToan.class);
                    startActivity(in);
                }
            }
        });

        lvm.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                showDialogconfirm(data.get(position),position);
                return false;
            }
        });
        lvm.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                Log.e(TAG, "onScrollStateChanged: " + scrollState);
                if (scrollState == 1){

                    data.add(""+i);
                    i++;
                    adapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                Log.e(TAG, "onScroll: " + "firstVisibleItem: " + firstVisibleItem + ", visibleItemCount: " + visibleItemCount + ", totalCount: " + totalItemCount);

            }
        });
    }
}