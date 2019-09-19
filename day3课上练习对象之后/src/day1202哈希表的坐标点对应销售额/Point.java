package day1202��ϣ���������Ӧ���۶�;

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
		int p=31;//�̶�������ֵ
		int r=1;//r����ʼֵ�����Լ�����
		r=r*p+x;
		r=r*p+y;
		return r;
	}
	@Override
	public boolean equals(Object obj) {
		//���жϲ���obj�Ƿ���Pinot
		if (obj instanceof Point) {
			Point p=(Point) obj;
			return x==p.x&&y==p.y;
		}
		return false;
	}
}
