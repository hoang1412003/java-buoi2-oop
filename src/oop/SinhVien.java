package oop;

public class SinhVien {
    private String ten;
    private float toan;
    private  float van;

    public SinhVien() {
    }

    public SinhVien( String ten, float toan, float van) {
        this.van = van;
        this.ten = ten;
        this.toan = toan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public void xuat() {
        System.out.println("Họ tên: "+ this.ten + "-- Toán: "+ this.toan+"-- van: "+ this.van);
    }

    // overloading
    public float dtb() {
        return (this.van + this.toan) / 2;
    }
     // điểm trung bình 2 học viên
    public float dtb(SinhVien a) {
        return (this.dtb() + a.dtb()) / 2;
    }
    // điểm trung bình 3 học viên
    public float dtb(SinhVien a, SinhVien b) {
        return (this.dtb() + a.dtb() + b.dtb()) / 3;
    }
}
