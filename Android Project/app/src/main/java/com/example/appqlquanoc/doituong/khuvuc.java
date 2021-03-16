package com.example.appqlquanoc.doituong;

public class khuvuc {
    private int idkv;
    private String tenKhuVuc;

    public khuvuc() {
        super();
    }

    public khuvuc(int idkv, String tenKhuVuc) {
        super();
        this.idkv = idkv;
        this.tenKhuVuc = tenKhuVuc;
    }

    public int getIdkv() {
        return idkv;
    }

    public void setIdkv(int idkv) {
        this.idkv = idkv;
    }

    public String getTenKhuVuc() {
        return tenKhuVuc;
    }

    public void setTenKhuVuc(String tenKhuVuc) {
        this.tenKhuVuc = tenKhuVuc;
    }
}
