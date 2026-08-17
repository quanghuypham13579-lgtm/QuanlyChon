package com.example.myapplication4.model;

public class ChonMon {
    private String tenmon;
    private double gia;
    private int hinhanh;

    public ChonMon() {
    }

    public ChonMon(String tenmon, double gia, int hinhanh) {
        this.tenmon = tenmon;
        this.gia = gia;
        this.hinhanh = hinhanh;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
}
