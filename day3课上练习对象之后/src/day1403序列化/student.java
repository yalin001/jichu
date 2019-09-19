package day1403序列化;

import java.io.Serializable;

public class student implements Serializable{
		/**
	 * //Serializable是空接口，也是标示接口，标示student实例使其被允许序列化
	 */
	    private static final long serialVersionUID = -1078067685652445573L;
		private int id;
		private String name;
		private static String gender;
		private transient int age;
		
		public student() {
			super();
		}
		public student(int id, String name, String gender, int age) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.age = age;
		}
		@Override
		public String toString() {
			return "student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

}
