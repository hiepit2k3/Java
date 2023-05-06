package assignment1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachNhanVien {

    private ArrayList<NhanVien> ds = new ArrayList<>();

    public void nhap() {
        Scanner s = new Scanner(System.in);
        ds.clear();
        
        do {
            
            System.out.println("Nhap loai nhan vien 1.Hanh Chinh   2.Tiep Thi    3.Truong Phong");
            String loai = s.nextLine();

            if (loai == null || loai.equals("")) {
                break;
            }

            int iloai = Integer.parseInt(loai);

            switch (iloai) {
                case 1:
                    nhanVienHanhChinh nvhc = new nhanVienHanhChinh();
                    nvhc.nhap(s);
                    ds.add(nvhc);
                    break;
                case 3:
                    TruongPhong tp = new TruongPhong();
                    tp.nhap(s);
                    ds.add(tp);
                    break;
                case 2:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.nhap(s);
                    ds.add(nvtt);
                    break;
            }
        } while (true);
    }

    public void xuat() {
        System.out.println("Danh Sach Nhan vien: ");
        for (NhanVien nv : ds) {
            if (nv instanceof nhanVienHanhChinh) {
                ((nhanVienHanhChinh) nv).xuat();
            } else if (nv instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi) nv).xuat();
            } else if (nv instanceof TruongPhong) {
                ((TruongPhong) nv).xuat();
            }
            System.out.println("\n-----------------------\n");
        }
    }

    public void timVaHienThiTheoMa(Scanner s) {
        System.out.println("Nhap ma can tim: ");
        String ma = s.nextLine();
        NhanVien nvFound = null;
        for (NhanVien nv : ds) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
                nvFound = nv;
                break;
            }
        }
        if (nvFound != null) {
            System.out.println("Thong tin nhan vien tim thay theo ma: ");
            nvFound.xuat();
        } else {
            System.err.println("Khong tim thay nhan vien co ma tren");
        }
    }
    
    public void xoaNhanVienTheoMa(Scanner s){
        System.out.println("Xoa Thong Tin Sinh Vien Theo Ma");
        System.out.println("Nhap ma nhan vien can xoa: ");
        String maNV = s.nextLine();
        NhanVien nvFound = null;
        for ( NhanVien nv : ds){
            if (nv.getMa().equalsIgnoreCase(maNV)){
                nvFound = nv;
                break;
            }
        }
        if (nvFound != null){
            ds.remove(nvFound);
            System.out.println("Nhan vien da duoc xoa !");
        }else{
            System.err.println("Ma nhan vien khong tim thay trong danh sach");
        }
    }
    
    public void capNhatTheoMa(Scanner s){
        System.out.println("Cap nhat thong tin nhan vien theo ma");
        System.out.println("Nhap ma nhan vien:");
        String maNV = s.nextLine();
        NhanVien nvFound = null;
        
        for (NhanVien item : ds){
            if (item.getMa().equalsIgnoreCase(maNV)){
                nvFound = item;
                break;
            }
        }
        if (nvFound !=null){
            if (nvFound instanceof nhanVienHanhChinh){
                ((nhanVienHanhChinh) nvFound).nhap(s);
            }else if (nvFound instanceof TruongPhong){
                ((TruongPhong) nvFound).nhap(s);
            }else if (nvFound instanceof NhanVienTiepThi){
                ((NhanVienTiepThi) nvFound).nhap(s);
            }
        }
        else{
            System.out.println("Khong tim thay ma nhan vien !");
        }
    }
    
    public void timTheoKhoangLuong(Scanner s){
        System.out.println("Tim nhan vien theo khoan luong");
        System.out.println("Nhap khoang thap nhat:");
        double min = s.nextDouble();
        
        System.out.println("Nhap khoang cao nhat:");
        double max = s.nextDouble();
        s.nextLine();
        boolean found = false;
        
        for (NhanVien nhanVien : ds){
            if( min <= nhanVien.getThuNhap() && nhanVien.getThuNhap() <= max){
                nhanVien.xuat();
                System.out.println();
                found = true;
            }
        }
        if (found == false ){
            System.err.println("Khong co nhan vien nao co khoang luong nhu vay");
        }
    }
    
    public void sapXepTheoTen(Scanner s){
        Collections.sort(ds, (a,b) ->a.getHoTen().compareTo(b.getHoTen()));
    }
    public void sapXepTheoThuNhap(Scanner s){
        Collections.sort(ds, (a,b) -> (int) ( a.getLuong()-b.getLuong()));
    }
    
    public void hienThiTop5(Scanner s){
        System.out.println("Danh sach nhan vien co thu nhap cao nhat: ");
        Collections.sort(ds, (a,b) -> (int) ( a.getThuNhap()-b.getThuNhap()));
        for (int i = 0; i < 5 && i > ds.size(); i++){
           ds.get(i).xuat();
           System.out.println("\n-----------------------\n");
        }
    }
}
