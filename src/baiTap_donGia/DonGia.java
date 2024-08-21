package baiTap_donGia;

import java.util.Scanner;

public abstract class DonGia {
    private int soThang;
    private long gia;

    public DonGia() {
    }

    public int getSoThang() {
        return soThang;
    }

    public void setSoThang(int soThang) {
        this.soThang = soThang;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thang: ");
        this.soThang = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Số tháng: "+this.soThang+"-- Giá: "+ this.gia);
    }

    abstract long tinhTien();
}
