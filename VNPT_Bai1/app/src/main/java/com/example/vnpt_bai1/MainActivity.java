package com.example.vnpt_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView LvHinhAnh;
    ArrayList<HoaHau> mangHoaHau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LvHinhAnh=(ListView)findViewById(R.id.LvHoaHau);
        mangHoaHau=new ArrayList<HoaHau>();
        mangHoaHau.add(new HoaHau("Ky Duyen",1995,R.drawable.kd,R.drawable.vn));
        mangHoaHau.add(new HoaHau("My Linh",1992,R.drawable.ml,R.drawable.vn));
        mangHoaHau.add(new HoaHau("Thuy Linh",1997,R.drawable.tl,R.drawable.vn));
        mangHoaHau.add(new HoaHau("Tieu Vy",1995,R.drawable.tv,R.drawable.vn));
        mangHoaHau.add(new HoaHau("H'Hen Nie",1995,R.drawable.hen,R.drawable.vn));

        HoaHauAdapter hhadapter=new HoaHauAdapter(
                MainActivity.this,
                R.layout.dong_hoa_hau,
                mangHoaHau
        );
        LvHinhAnh.setAdapter(hhadapter);
    }
}
