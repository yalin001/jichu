package day1202哈希表的坐标点对应销售额;

public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y +  "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int p=31;//固定的神奇值
		int r=1;//r的起始值可以自己定义
		r=r*p+x;
		r=r*p+y;
		return r;
	}
	@Override
	public boolean equals(Object obj) {
		//先判断参数obj是否是Pinot
		if (obj instanceof Point) {
			Point p=(Point) obj;
			return x==p.x&&y==p.y;
		}
		return false;
	}
}
