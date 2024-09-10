package phanso;

public class PhanSo {

private int tu;
  private int mau;

  // tối giản phân số
public PhanSo(int tu, int mau) throws Exception {
	if(mau == 0) {
		throw new IllegalArgumentException("mau khong bang 0"); 

	}
	this.tu = tu;
	this.mau = mau;
	reduce();
}

// tối giản phân số
private void reduce() {
	// TODO Auto-generated method stub
	// ràng buộc phân số
	int ucln = gcd(tu , mau);
	tu /= ucln;
	mau /= ucln;
	if(mau <0) {
		tu = -tu;
		mau = -mau;
	}
}


private int gcd(int tu2, int mau2) {
	// TODO Auto-generated method stub
	if(mau2 == 0) {
		return tu2;
	}
		return gcd(mau2, tu2 % mau2);
}

//ngich dao phan so
public PhanSo reciprocal() throws Exception {
	// TODO Auto-generated method stub
	//rang buộc
	if(tu == 0) {
		throw new Exception("phan so co tu bang 0 , khong the tinh nghich dao");
	}
	return new PhanSo(tu, mau);

}
//cong phan so
  public PhanSo add(PhanSo other) throws Exception {
	  int newTu = this.tu*other.mau+other.tu*this.mau;
	  int newMau = this.mau*other.mau;
	  PhanSo pst = new PhanSo( newTu, newMau);
	  System.out.println("Tổng 2 phân số = " + pst.tu + "/" + pst.mau);
	return new PhanSo(tu, mau);
}
  //trừ phân số 
  public PhanSo subtract(PhanSo other) throws Exception {
	  int newTu = this.tu*other.mau-other.tu*this.mau;
	  int newMau = this.mau*other.mau;
	  PhanSo pst = new PhanSo( newTu, newMau);
	  System.out.println("Trừ 2 phân số = " + pst.tu + "/" + pst.mau);
	return new PhanSo(tu, mau);
}
  // nhân phân số
  public PhanSo multiphy(PhanSo other) throws Exception {
	  int newTu = this.tu*other.tu;
	  int newMau = this.mau*other.mau;
	  PhanSo pst = new PhanSo( newTu, newMau);
	  System.out.println("Tích 2 phân số = " + pst.tu + "/" + pst.mau);
	return new PhanSo(tu, mau);
}
  public PhanSo didive(PhanSo other) throws Exception {
	  int newTu = this.tu*other.tu;
	  int newMau = this.mau*other.mau;
	  PhanSo pst = new PhanSo( newTu, newMau);
	  System.out.println("Thương 2 phân số = " + pst.tu + "/" + pst.mau);
	return new PhanSo(tu, mau);  
  }
  
}
  

