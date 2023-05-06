package assignment1;

import java.util.Scanner;

public class TruongPhong extends NhanVien {

    private double trachNhiem;

    public TruongPhong() {
    }
    

    public TruongPhong(String ma, String hoTen,double luong,double trachNhiem) {
        super(ma, hoTen, luong);
        this.trachNhiem = trachNhiem;  
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    public void nhap(Scanner s) {
        super.nhap(s);
        System.out.println("Luong Trach Nhiem: ");
        this.trachNhiem = s.nextDouble();
        s.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" | Loai:Truong Phong | Luong trach nhiem: %.2f", trachNhiem);
    }


    @Override
    public double getThuNhap() {
        return luong + trachNhiem - thue;
    }

}
