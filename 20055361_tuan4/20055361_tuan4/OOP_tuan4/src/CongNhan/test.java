package CongNhan;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
   DanhSachCongNhan danhSach = new DanhSachCongNhan(20);
      System.out.println("nhap so luong cong nhan:");
      int soluong = sc.nextInt();
      for(int i =0; i< soluong ;i++) {
    	 System.out.println("Nhap thong tin cong nhan" +(i+1));
    	 
    	 System.out.println("Ma Cong Nhan:");
    	 int maCN = sc.nextInt();
    	 System.out.println(" Ho Cong Nhan:");
    	 String mHo = sc.nextLine();
    	 System.out.println(" Ten Cong Nhan:");
    	 String mTen = sc.nextLine();
    	 System.out.println(" So San Pham:");
          int soSP = sc.nextInt();
    	 sc.nextLine();
    	 CongNhan cn = new CongNhan(soSP,mHo,mTen,maCN );
    	 danhSach.themCongNhan(cn);
      } 
      danhSach.xuatDanhSachCongNhan();
    
	}

}
