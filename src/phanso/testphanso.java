package phanso;

public class testphanso {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		  PhanSo ps1=new PhanSo(12,3);    // tạo phân số có tử = 16 và mẫu = 4
	        PhanSo ps2=new PhanSo(4,8); // tạo phân số có tử = 4 và mẫu = 8
	        ps1.add(ps2);
	        ps1.subtract(ps2);
	        ps1.multiphy(ps2);
	        ps1.didive(ps2);
	}

}
