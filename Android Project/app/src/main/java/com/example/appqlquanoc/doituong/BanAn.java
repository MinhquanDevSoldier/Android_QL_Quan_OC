package com.example.appqlquanoc.doituong;

public class BanAn {
    int idBan;
    String tenBan;
    boolean trangthai;

    public BanAn() {
        super();
    }

    public BanAn(int idBan, String tenBan, boolean trangthai) {
        super();
        this.idBan = idBan;
        this.tenBan = tenBan;
        this.trangthai = trangthai;
    }

    public int getIdBan() {
        return idBan;
    }

    public void setIdBan(int idBan) {
        this.idBan = idBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
}
