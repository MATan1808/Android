package com.example.appcustomlistview_final;//
//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.google.android.material.snackbar.Snackbar;
//
//import java.util.ArrayList;
//
//import Model.SinhVien;
//
//public class CustomAdapter extends ArrayAdapter<SinhVien> implements View.OnClickListener {
//
//    private ArrayList<SinhVien> dataSet;
//    private Context mContext;
//
//    // View lookup cache
//    private static class ViewHolder {
//        TextView txtmsv;
//        TextView txtten;
//        TextView txtgt;
//        ImageView imganhsv;
//    }
//
//    public CustomAdapter(ArrayList<SinhVien> data, Context context) {
//        super(context, R.layout.row_item, data);
//        this.dataSet = data;
//        this.mContext = context;
//    }
//
//    @SuppressLint("NonConstantResourceId")
//    @Override
//    public void onClick(View v) {
//        int position = (Integer) v.getTag();
//        SinhVien sinhVien = getItem(position);
//
//        switch (v.getId()) {
//            case R.id.imganhsv:
//                Snackbar.make(v, "Ảnh sinh viên: " + sinhVien.getAnhsv(), Snackbar.LENGTH_LONG)
//                        .setAction("No action", null).show();
//                break;
//        }
//    }
//
//    private int lastPosition = -1;
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        SinhVien sinhVien = getItem(position);
//        ViewHolder viewHolder;
//
//        final View result;
//
//        if (convertView == null) {
//            viewHolder = new ViewHolder();
//            LayoutInflater inflater = LayoutInflater.from(getContext());
//            convertView = inflater.inflate(R.layout.row_item, parent, false);
//            viewHolder.txtmsv = convertView.findViewById(R.id.txtmasv);
//            viewHolder.txtten = convertView.findViewById(R.id.txttensv);
//            viewHolder.txtgt = convertView.findViewById(R.id.txtgt);
//            viewHolder.imganhsv = convertView.findViewById(R.id.imganhsv);
//
//            result = convertView;
//            convertView.setTag(viewHolder);
//        } else {
//            viewHolder = (ViewHolder) convertView.getTag();
//            result = convertView;
//        }
//
//        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
//        result.startAnimation(animation);
//        lastPosition = position;
//
//        viewHolder.txtmsv.setText(sinhVien.getMasv());
//        viewHolder.txtten.setText(sinhVien.getTensv());
//        viewHolder.txtgt.setText(sinhVien.getGt());
//        viewHolder.imganhsv.setOnClickListener(this);
//        viewHolder.imganhsv.setTag(position);
//
//        return convertView;
//    }
//}

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appcustomlistview_final.R;

import java.util.ArrayList;

import Model.SinhVien;


public class CustomAdapter extends ArrayAdapter<SinhVien> {
    private ArrayList<SinhVien> arrsv;
    private final Activity context;
    public CustomAdapter(Activity context, ArrayList<SinhVien> arrsv) {
        super(context, R.layout.row_item,arrsv);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.arrsv=arrsv;

    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.row_item, null,true);
        SinhVien sv= arrsv.get(position);
        Log.d("masv",sv.getMasv());
        TextView txtmasv =  rowView.findViewById(R.id.txtmasv);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView txttensv = (TextView) rowView.findViewById(R.id.txttensv);
        TextView txtgt = (TextView) rowView.findViewById(R.id.txtgt);
        txtmasv.setText(arrsv.get(position).getMasv());
        txttensv.setText(arrsv.get(position).getTensv());
        txtgt.setText(arrsv.get(position).getGt());
//        imageView.setImageResource(imgid[position]);
//        subtitleText.setText(subtitle[position]);

        return rowView;

    };

}
