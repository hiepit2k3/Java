 package assignment1;

import java.io.PrintStream;
import java.util.Scanner;
public class NhanVien{
        String ma , hoTen;
        double luong,thue;

    public NhanVien() {
    }
        

    public NhanVien(String ma, String hoTen,double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }
    
    public void setLuong(double luong) {
        this.luong = luong;
    }
        
    public double getThuNhap(){
        
         return luong - thue; 
    }
    
    public double  getThueThuNhap(){
        if (getThuNhap() < 9000000){
            thue = 0;
        }else if (getThuNhap() > 9000000 && getThuNhap() <= 15000000 ){
            thue = ((getThuNhap() - 9000000) * 0.1);
        }else if (getThuNhap() > 15000000){
            thue = ((getThuNhap() - 15000000) * 0.12);
        }      
            return thue;      
    }
    public void nhap(Scanner s){
        System.out.println("Ma Nhan Vien:");
        this.ma = s.nextLine();
        System.out.println("Ho Ten Nhan Vien:");
        this.hoTen = s.nextLine();
        System.out.println("Luong Nhan Vien:");
        this.luong = s.nextDouble();
        s.nextLine(); 
    }
    
    public void xuat(){
        System.out.printf("Ma NV: %s | Ho Ten: %s | Luong NV: %.0f | Thue : %.0f | Tong Thu Nhap: %.2f",ma,hoTen,getLuong(),getThueThuNhap(),getThuNhap());
        
    }
}
