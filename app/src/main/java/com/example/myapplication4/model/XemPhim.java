package com.example.myapplication4.model;

public class XemPhim {
    private String tenPhim;
    private String theLoai;
    private int hinhanh;

    public XemPhim() {
    }

    public XemPhim(String tenPhim, String theLoai, int hinhanh) {
        this.tenPhim = tenPhim;
        this.theLoai = theLoai;
        this.hinhanh = hinhanh;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
}
