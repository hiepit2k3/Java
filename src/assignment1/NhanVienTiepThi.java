
package assignment1;

import java.util.Scanner;
public class NhanVienTiepThi extends NhanVien{
    private double doanhSo;
    private double hoaHong;

    public NhanVienTiepThi() {
    }
    
    public NhanVienTiepThi(String ma, String hoTen,double luong){
        super(ma, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = doanhSo * 0.2;
    }
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong = doanhSo * 0.2;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    @Override
    public double getThuNhap() {
        return luong +(luong * 0.5) + getHoaHong() ;
    }
    @Override
    public void nhap(Scanner s){
        super.nhap(s);
        System.out.println("Doanh So:");
        doanhSo = s.nextInt();
        s.nextLine();
    }
    public void xuat(){
        super.xuat();
        System.out.printf(" | Loai:Nhan Vien Tiep Thi | Doanh So Ban Hang: %.0f | Hoa Hong:%.0f\n",doanhSo,getHoaHong());
    }
}
