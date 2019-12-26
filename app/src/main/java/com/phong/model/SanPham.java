package com.phong.model;

public class SanPham {
    private String ten;
    private String moTa;
    private int gia;
    private int hinh;
    private boolean mua;

    public SanPham() {
    }

    public SanPham(String ten, String moTa, int gia, int hinh, boolean mua) {
        this.ten = ten;
        this.moTa = moTa;
        this.gia = gia;
        this.hinh = hinh;
        this.mua = mua;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public boolean isMua() {
        return mua;
    }

    public void setMua(boolean mua) {
        this.mua = mua;
    }
}
