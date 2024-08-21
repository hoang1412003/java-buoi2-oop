package baiTap_donGia;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachDocGia {
    private List<DonGia> arr;

    public DanhSachDocGia() {
        this.arr = new ArrayList<>();
    }
    public void nhap() {

        int flag = 1;
        System.out.println("1: Nhập trẻ em");
        System.out.println("2: nhập người lớn");
        System.out.println("3: Đếm trẻ em");
        System.out.println("0: Exist");
        System.out.println("################################################");
        while (true) {
            System.out.println("Mời bạn nhập lựa chọn");
            Scanner sc = new Scanner(System.in);
            flag =sc.nextInt();
            DonGia a;
            if(flag == 1) {
                a = new DonGiaTreEm();
                a.nhap();
                arr.add(a);
            }
            else if(flag == 2) {
                a = new DonGiaNguoiLon();
                a.nhap();
                arr.add(a);
            }
            else if(flag == 3) {
                System.out.println("có "+ countTreEm()+ "trẻ em");
            }
            else {
                break;
            }
        }
    }
    public void xuat() {
        for(DonGia d:this.arr) {
            d.xuat();
        }

    }

    public long tongTien() {
        long tong =0;
        for(DonGia d:this.arr) {
            tong+=d.tinhTien();
        }
        return tong;
    }

    public int countTreEm() {
        int count = 0;
        for(DonGia d:this.arr) {
            if(d instanceof DonGiaTreEm) {
                count++;
            }
        }
        return count;
    }
}
