package day1202��ϣ��������Ӧѧ���ɼ�;

import day1202��ϣ���������Ӧ���۶�.Point;

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
			int p=31;//�̶�������ֵ
			int r=1;//r����ʼֵ�����Լ�����
			r = r*p + id;
			r = r*p + scord;
			r = r*p + name.hashCode();//���Եõ��ַ�������Ĺ�ϣֵ
			r = r*p + gender.hashCode();
			return r;
		}
		@Override
		public boolean equals(Object obj) {
			//���жϲ���obj�Ƿ���Pinot
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
