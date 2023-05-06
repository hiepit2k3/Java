package assignment1;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        DanhSachNhanVien ds = new DanhSachNhanVien();
        Scanner s = new Scanner(System.in);

        while (true) {
            int chon = 0;
            System.out.println("+---------------------------------------------------------+");
            System.out.println("+ 1.Nhập danh sách nhân viên từ bàn phím.                 +");
            System.out.println("+ 2.Xuất danh sách nhân viên ra màn hình.                 +");
            System.out.println("+ 3.Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.   +");
            System.out.println("+ 4.Xóa nhân viên theo mã nhập từ bàn phím.               +");
            System.out.println("+ 5.Cập nhật thông tin nhân viên theo mã nhập từ bàn phím +");
            System.out.println("+ 6.Tìm các nhân viên theo khoảng lương nhập từ bàn phím  +");
            System.out.println("+ 7.Sắp xếp nhân viên theo họ và tên.                     +");
            System.out.println("+ 8.Sắp xếp nhân viên theo thu nhập.                      +");
            System.out.println("+ 9.Xuất 5 nhân viên có thu nhập cao nhất.                +");
            System.out.println("+ 0.thoát chương trình                                    +");
            System.out.println("+---------------------------------------------------------+");
            System.out.println("Xin moi chon: ");
            chon = s.nextInt();
            s.nextLine();

            if (chon == 0) {
                System.exit(0);
            }
            switch (chon) {
                case 1:
                    System.out.println("Ban dang thuc hien chuc nang 1");
                    ds.nhap();
                    break;
                case 2:
                     System.out.println("Ban dang thuc hien chuc nang 2");
                    ds.xuat();
                    break;
                case 3:
                     System.out.println("Ban dang thuc hien chuc nang 3");
                    ds.timVaHienThiTheoMa(s);
                    break;
                case 4:
                     System.out.println("Ban dang thuc hien chuc nang 4");
                    ds.xoaNhanVienTheoMa(s);
                    break;
                case 5:
                     System.out.println("Ban dang thuc hien chuc nang 5");
                    ds.capNhatTheoMa(s);
                    break;
                case 6:
                     System.out.println("Ban dang thuc hien chuc nang 6");
                    ds.timTheoKhoangLuong(s);
                    break;
                case 7:
                     System.out.println("Ban dang thuc hien chuc nang 7");
                    ds.sapXepTheoTen(s);
                    ds.xuat();
                    break;
                case 8:
                     System.out.println("Ban dang thuc hien chuc nang 8");
                    ds.sapXepTheoThuNhap(s);
                    ds.xuat();
                    break;
                case 9:
                    System.out.println("Ban dang thuc hien chuc nang 9");
                    ds.hienThiTop5(s);
                    ds.xuat(); 
            }
            System.out.println("\nNhap phim ENTER de tiep tuc !");
            s.nextLine();
            try {
                Runtime.getRuntime().exec("cls");
            } catch (IOException ex) {
            }
        }
    }
}
