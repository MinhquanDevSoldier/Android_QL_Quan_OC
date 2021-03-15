package com.example.appqlquanoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainLayout extends AppCompatActivity {
    ImageButton imorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        Anhxa();
        imorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderpage = new Intent(getApplication(),OrderLayout.class);
                startActivity(orderpage);
            }
        });
    }
    void Anhxa()
    {
        imorder = (ImageButton) findViewById(R.id.iborder);
    }

}