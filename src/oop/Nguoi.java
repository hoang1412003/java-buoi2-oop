package oop;

public interface Nguoi {
    void noiNhieu();
    default void dungDienThoaiTrongLop() {
        System.out.println("1 vài banj dùng điện thoại trong lớp");
    }
}
