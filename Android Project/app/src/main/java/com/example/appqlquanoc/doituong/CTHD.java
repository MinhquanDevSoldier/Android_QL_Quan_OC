package com.example.appqlquanoc.doituong;

public class CTHD {
    private int idctthd;
    private int ihhd;
    private String tenMon;
    private int soluong;
    private float thanhTien;


    public CTHD() {
        super();
    }


    public CTHD(int idctthd, int ihhd, String tenMon, int soluong, float thanhTien) {
        super();
        this.idctthd = idctthd;
        this.ihhd = ihhd;
        this.tenMon = tenMon;
        this.soluong = soluong;
        this.thanhTien = thanhTien;
    }


    public int getIdctthd() {
        return idctthd;
    }


    public void setIdctthd(int idctthd) {
        this.idctthd = idctthd;
    }


    public int getIhhd() {
        return ihhd;
    }


    public void setIhhd(int ihhd) {
        this.ihhd = ihhd;
    }


    public String getTenMon() {
        return tenMon;
    }


    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }


    public int getSoluong() {
        return soluong;
    }


    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }


    public float getThanhTien() {
        return thanhTien;
    }


    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

}
