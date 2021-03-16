package com.example.appqlquanoc;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appqlquanoc.doituong.Taikhoan;

import java.util.ArrayList;

public class activity_login_layout extends AppCompatActivity {
    //Initialize variable
    Button btn_DangNhap;
    Switch switch_HienMatKhau;
    EditText edt_TenTK,edt_MatKhau;
    ArrayList<Taikhoan> listTK = new ArrayList<>();
    //Initialize variabl to get info login
    String tenTK,matKhau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_layout);
        //Assign variable
        Anhxa();
        edt_MatKhau.setTransformationMethod(PasswordTransformationMethod.getInstance());
        //hide or show password
        switch_HienMatKhau.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {

                    edt_MatKhau.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else
                {
                    edt_MatKhau.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
        //Initialize array list of Taikhoan
        khoi_Tao_TaiKhoan();
        //Check type of Taikhoan
        btn_DangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tenTK = edt_TenTK.getText().toString();
                matKhau = edt_MatKhau.getText().toString();
                if(tenTK.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Chưa nhập tên Tài khoản",Toast.LENGTH_SHORT).show();
                }
                else
                if(matKhau.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Chưa nhập mật khẩu",Toast.LENGTH_SHORT).show();
                }
                else
                if(kt_TaiKhoan(tenTK,matKhau))
                {
                    if(kt_Loai_TaiKhoan(tenTK,matKhau)==1)
                    {
                        Intent mainintent;
                        mainintent = new Intent(getApplication(),MainLayout.class);
                        startActivity(mainintent);
                        Toast.makeText(getApplicationContext(),"Đăng nhập thành công\nQuyền : Quản lý",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent mainIntent = new Intent(getApplication(),MainLayout.class);
                        mainIntent.putExtra("loaitk","0");
                        startActivity(mainIntent);
                        Toast.makeText(getApplicationContext(),"Đăng nhập thành công\nQuyền : Nhân viên",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Sai tên tài khoản hoặc mật khẩu",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    public void Anhxa()
    {
        switch_HienMatKhau = findViewById(R.id.Switch_Hienthi_MatKhau);
        btn_DangNhap = findViewById(R.id.button_DangNhap);
        edt_TenTK = (EditText) findViewById(R.id.EditText_TenTK);
        edt_MatKhau = findViewById(R.id.EditText_MatKhau);
    }
    public void khoi_Tao_TaiKhoan()
    {
        listTK.add( new Taikhoan(140320,"Admin123","0000",true));
        listTK.add( new Taikhoan(150320,"staff321","1111",false));
    }
    public boolean kt_TaiKhoan(String tentk,String matKhau)
    {
        for(int i = 0;i<listTK.size();i++)
        {
            if(tenTK.equals(listTK.get(i).getTenTK()))
            {
                if(matKhau.equals(listTK.get(i).getMatkhau()))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public int kt_Loai_TaiKhoan(String tentk,String matKhau)
    {
        for(int i = 0;i<listTK.size();i++)
        {
            if(tenTK.equals(listTK.get(i).getTenTK().toString()))
            {
                if(matKhau.equals(listTK.get(i).getMatkhau().toString()))
                {
                    if(listTK.get(i).isAdmin())
                    {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}