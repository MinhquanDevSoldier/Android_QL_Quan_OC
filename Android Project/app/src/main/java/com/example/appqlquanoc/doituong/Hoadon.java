package com.example.appqlquanoc.doituong;

public class Hoadon {
    private int idhd;
    private String idnv;
    private int idban;
    private float tongTien;
    private boolean trangThai;
    public Hoadon() {
        super();
    }
    public Hoadon(int idhd, String idnv, int idban, float tongTien, boolean trangThai) {
        super();
        this.idhd = idhd;
        this.idnv = idnv;
        this.idban = idban;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }
    public int getIdhd() {
        return idhd;
    }
    public void setIdhd(int idhd) {
        this.idhd = idhd;
    }
    public String getIdnv() {
        return idnv;
    }
    public void setIdnv(String idnv) {
        this.idnv = idnv;
    }
    public int getIdban() {
        return idban;
    }
    public void setIdban(int idban) {
        this.idban = idban;
    }
    public float getTongTien() {
        return tongTien;
    }
    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
    public boolean isTrangThai() {
        return trangThai;
    }
    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
