
package assignment1;
public class nhanVienHanhChinh extends NhanVien{

    public nhanVienHanhChinh() {
    }
    
    public nhanVienHanhChinh(String maNV,String hoTenSV,double  luong){
        super(maNV,hoTenSV,luong);
    }
    public void xuat() {
        super.xuat();
        System.out.printf(" | Loai:Nhan Vien Hanh Chinh");
    }
    @Override
    public double getLuong() {
       return getThuNhap();
    }
}
