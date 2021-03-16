package com.example.appqlquanoc.doituong;

public class Taikhoan {
    private int IDTK;
    private String TenTK,Matkhau;
    boolean loai;


    public Taikhoan() {
        super();
    }

    public Taikhoan(int iDTK, String tenTK, String matkhau, boolean loai) {
        super();
        IDTK = iDTK;
        TenTK = tenTK;
        Matkhau = matkhau;
        this.loai = loai;
    }

    public int getIDTK() {
        return IDTK;
    }

    public void setIDTK(int iDTK) {
        IDTK = iDTK;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String tenTK) {
        TenTK = tenTK;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String matkhau) {
        Matkhau = matkhau;
    }

    public boolean isAdmin() {
        return loai;
    }

    public void setLoai(boolean loai) {
        this.loai = loai;
    }

}
