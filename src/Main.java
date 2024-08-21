import baiTap_donGia.DanhSachDocGia;
import oop.Nguoi;
import oop.SinhVien;
import oop.SinhVienNN;
import oop.SinhVienVN;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SinhVien a = new SinhVien();
        a.setTen("hoang");
        a.xuat();

        SinhVien b = new SinhVien("lê hoang", 3, 2);
        b.xuat();
        System.out.println("DTB: "+ b.dtb());
        System.out.println("DTB 2 hv: "+ a.dtb(b));
        System.out.println("DTB 3 hv: "+ a.dtb(b, a));

        SinhVienVN vn = new SinhVienVN();
        vn.xuat();

        Nguoi svNN = new SinhVienNN();
        svNN.noiNhieu();

        DanhSachDocGia arr=new DanhSachDocGia();
        arr.nhap();
        arr.xuat();
        System.out.println("Tổng tiền = "+arr.tongTien());

    }
}