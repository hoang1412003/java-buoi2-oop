package baiTap_donGia;

import java.util.Scanner;

public class DonGiaNguoiLon extends DonGia{
    private String soCCCD;

    public DonGiaNguoiLon() {
        this.setGia(10000);
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số can cước công dân: ");
        this.soCCCD = sc.nextLine();
        super.nhap();
    }

    public void xuat() {
        System.out.println("Số cccd: "+ this.soCCCD);
        super.xuat();
    }
    @Override
    long tinhTien() {
        return getGia() * getSoThang();
    }
}
