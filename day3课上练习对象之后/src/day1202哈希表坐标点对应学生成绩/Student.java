package day1202哈希表坐标点对应学生成绩;

import day1202哈希表的坐标点对应销售额.Point;

public class Student {
		
	    private String name;
		private int id;
		private String gender;
		private int scord;
		public Student(String name, int id, String gender, int scord) {
			super();
			this.name = name;
			this.id = id;
			this.gender = gender;
			this.scord = scord;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getScord() {
			return scord;
		}
		public void setScord(int scord) {
			this.scord = scord;
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			int p=31;//固定的神奇值
			int r=1;//r的起始值可以自己定义
			r = r*p + id;
			r = r*p + scord;
			r = r*p + name.hashCode();//可以得到字符串自身的哈希值
			r = r*p + gender.hashCode();
			return r;
		}
		@Override
		public boolean equals(Object obj) {
			//先判断参数obj是否是Pinot
			if (obj instanceof Student) {
				Student p=(Student) obj;
				return name==p.name&&
						id==p.id&&gender==p.gender&&
						scord==p.scord;
			}
			return false;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + ", gender=" + gender + ", scord=" + scord + "]";
		}
		
		
		
}
