package tron;

public class tam {
   private String ten;
   private double x;
   private double y;
public String getTen() {
	return ten;
}
public void setTen(String tron) throws Exception {
	if (tron !=null) {
		this.ten = ten;
	} else {
       throw new Exception("Loi hinh");
       }
	
	this.ten = ten;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}

public tam(String ten, double x, double y) throws Exception {
	if (ten !=null) {
		this.ten = ten;
	} else {
       throw new Exception("Loi hinh");
       }
	this.ten = ten;
	this.ten = ten;
	this.x = x;
	this.y = y;
}
@Override
public String toString() {
	return "tam [ten=" + ten + ", x=" + x + ", y=" + y + "]";
}
 
}
