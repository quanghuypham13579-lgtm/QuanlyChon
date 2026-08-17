package com.example.myapplication4.model;

public class DienVien {
    private String tenDienVien;
    private String quocGia;
    private int hinhanh;

    public DienVien() {
    }

    public DienVien(String tenDienVien, String quocGia, int hinhanh) {
        this.tenDienVien = tenDienVien;
        this.quocGia = quocGia;
        this.hinhanh = hinhanh;
    }

    public String getTenDienVien() {
        return tenDienVien;
    }

    public void setTenDienVien(String tenDienVien) {
        this.tenDienVien = tenDienVien;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
}
