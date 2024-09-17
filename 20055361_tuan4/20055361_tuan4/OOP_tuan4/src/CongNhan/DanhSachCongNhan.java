package CongNhan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DanhSachCongNhan {
   private List<CongNhan> Danhsach;
    public DanhSachCongNhan(int n) {
    	 Danhsach = new ArrayList<>(n);
    	System.out.println("kich thuoc ban dau them cong nhan la :" +Danhsach.size());
    }
     public void themCongNhan(CongNhan congnhan) {
              	Danhsach.add(congnhan);	
              System.out.println("danh sach sau khi them cong nhan:" +Danhsach.size());
	}
     public void xuatDanhSachCongNhan() {
    	 for ( CongNhan cn: Danhsach) {
    		 System.out.println(cn);
    	 }
     }
     public int tinhSoLuongCongNhan() {
		return Danhsach.size();
     }
     public void xuatDanhSachCongNhantren200SP() {
    	 for(CongNhan cn : Danhsach) {
    		 if(cn.getSoSP()>200) {
    			 System.out.println(cn);
    		 }
    	 }
     }
    	 public void Danhsachgiamdan() {
    		 Danhsach.sort(Comparator.comparing(CongNhan:: getSoSP).reversed());
    	 }
     
}
