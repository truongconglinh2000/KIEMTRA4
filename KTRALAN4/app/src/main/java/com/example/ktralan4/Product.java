package com.example.ktralan4;

public class Product {
    private String Ten;
    private String gia;
    private int hinh;

    public Product(String ten, String gia, int hinh) {
        Ten = ten;
        this.gia = gia;
        this.hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}