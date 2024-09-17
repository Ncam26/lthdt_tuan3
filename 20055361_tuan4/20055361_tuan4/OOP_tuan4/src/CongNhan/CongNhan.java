package CongNhan;

public class CongNhan {
 private int maCN;
 private String mHo;
 private String mTen;
 private int SoSP;
public int getMaCN() {
	return maCN;
}
public void setMaCN(int maCN) {
	this.maCN = maCN;
}
public String getmHo() {
	return mHo;
}
public void setmHo(String mHo) {
	this.mHo = mHo;
}
public String getmTen() {
	return mTen;
}
public void setmTen(String mTen) {
	this.mTen = mTen;
}
public int getSoSP() {
	return SoSP;
}
public void setSoSP(int soSP) {
	SoSP = soSP;
}
public CongNhan() {
	super();
}
public CongNhan(int maCN, String mHo, String mTen, int soSP) {
	super();
	this.maCN = maCN;
	this.mHo = mHo;
	this.mTen = mTen;
	SoSP = soSP;
}
  
public double Luong() {
	double DonGia = 0;
	if( SoSP <=199) {
		DonGia =0.5;
	} else {
		if( SoSP <=399 ) {
		DonGia = 0.55;
		} else {
			if( SoSP <= 599 ) {
				DonGia = 0.6;
			} else {
				if( SoSP > 600) {
					DonGia =0.66;
				}
			}
		}
	}
	return SoSP * DonGia;
	
}
@Override
public String toString() {
	return "CongNhan [maCN=" + maCN + ", mHo=" + mHo + ", mTen=" + mTen + ", SoSP=" + SoSP + "]";
}
 
}
