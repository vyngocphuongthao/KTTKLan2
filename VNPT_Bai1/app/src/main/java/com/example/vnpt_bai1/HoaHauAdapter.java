package com.example.vnpt_bai1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HoaHauAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<HoaHau> arrayHoaHau;
    public HoaHauAdapter(Context context, int layout,List<HoaHau>hoahauList){
        myContext=context;
        myLayout=layout;
        arrayHoaHau=hoahauList;
    }

    @Override
    public int getCount() {
        return arrayHoaHau.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater)myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(myLayout,null);
        TextView txtTen=(TextView)view.findViewById(R.id.tvTen);
        txtTen.setText(arrayHoaHau.get(i).Ten);
        TextView txtNamSinh=(TextView)view.findViewById(R.id.tvNam);
        txtNamSinh.setText(arrayHoaHau.get(i).NamSinh+"");
        ImageView imgHinh=(ImageView)view.findViewById(R.id.imHoaHau);
        imgHinh.setImageResource(arrayHoaHau.get(i).Hinh);
        ImageView imgNuoc=(ImageView)view.findViewById(R.id.imNuoc);
        imgNuoc.setImageResource(arrayHoaHau.get(i).Nuoc);

        return null;
    }

}
