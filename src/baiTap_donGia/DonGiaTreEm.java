package baiTap_donGia;

import java.util.Scanner;

public class DonGiaTreEm extends DonGia{
    private String tenNBH;

    public DonGiaTreEm() {
        this.setGia(5000);
    }

    public String getTenNBH() {
        return tenNBH;
    }

    public void setTenNBH(String tenNBH) {
        this.tenNBH = tenNBH;
    }
    @Override
    public void nhap () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên người bảo hộ: ");
        this.tenNBH = sc.nextLine();
        super.nhap();
    }

    public void xuat() {
        System.out.println("Tên người bảo hộ: "+this.tenNBH);
        super.xuat();
    }
    @Override
    long tinhTien() {
        return getGia() * getSoThang();
    }
}
