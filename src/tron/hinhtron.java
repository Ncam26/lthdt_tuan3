package tron;

public class hinhtron {
 private double bankinh;
 private static final double PI = 3.14;
 private tam t;
public tam getT() {
	return t;
}
public void setT(tam t) throws Exception {
	if (t != null) {
		this.t=t;
	} else {
		throw new Exception("Loi hinh");
	}
	this.t = t;
}
public double getBankinh() {
	return bankinh;
}
public void setBankinh(double bk) throws Exception {
	if (bk>0) {
		this.bankinh=bk;
	} else {
		throw new Exception("Loi hinh");
	}
	this.bankinh = bk ;
}
public static double getPi() {
	return PI;
}
public hinhtron() {
	
}
public hinhtron(double bankinh, tam t) throws Exception {
	this.bankinh = bankinh;
	this.t = t;
}
public double getDienTich() {
	return getBankinh()*getBankinh()*PI;
}
public double getChuVi() {
	return getBankinh()*2*PI;
}
@Override
public String toString() {
	String m="";
	m+=m.format("%-3s,%10s,%10s", getBankinh(),getChuVi(),getDienTich());
	return m;
}
   public static void main(String[] args) throws Exception {
	hinhtron h1 = new hinhtron(10, new tam("N", 10, 10));
	System.out.println(h1);
}
}

