package com.example.appqlquanoc.doituong;

public class MonAn {
    int idMon;
    private String tenMon;
    int maDM;
    private float giaMon;

    public MonAn() {
        super();
    }

    public MonAn(int idMon,String tenMon, int maDM, float giaMon) {
        super();
        this.idMon = idMon;
        this.tenMon = tenMon;
        this.maDM = maDM;
        this.giaMon = giaMon;

    }


    public int getIdMon() {
        return idMon;
    }

    public void setIdMon(int idMon) {
        this.idMon = idMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getMaDM() {
        return maDM;
    }

    public void setMaDM(int maDM) {
        this.maDM = maDM;
    }

    public float getGiaMon() {
        return giaMon;
    }

    public void setGiaMon(float giaMon) {
        this.giaMon = giaMon;
    }
}
