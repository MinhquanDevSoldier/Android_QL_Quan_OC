package com.example.appqlquanoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainLayout extends AppCompatActivity {
    ImageButton imb_order,imb_monan,imb_nhanvien,imb_hoadon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        Anhxa();
        //kt_QuyenSD();

        imb_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderintent = new Intent(getApplication(),TableLayout.class);
                startActivity(orderintent);
            }
        });
    }

//    private void kt_QuyenSD() {
////        Intent intent = getIntent();
////        String loaitk =  intent.getStringExtra("loaitk");
////        if(loaitk.equals("0"))
////        {
////            imb_nhanvien.setEnabled(false);
////            imb_hoadon.setEnabled(false);
////            imb_monan.setEnabled(false);
////        }
//    }
//
    public void Anhxa()
    {
        imb_order = (ImageButton) findViewById(R.id.imageButton_Order);
        imb_monan = findViewById(R.id.imageButton_MonAn);
        imb_hoadon = findViewById(R.id.imageButton_HoaDon);
        imb_nhanvien = findViewById(R.id.imageButton_Staff);
    }

}