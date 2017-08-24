package com.javaex.ex07;

public class Student extends Person {			//상속 
	
	private String school;
		public Student(){
		}
	public Student(String name, int age, String school) {
		//this.name//private로 막혀있어서 못씀
		/*super(name,age)*///부모쪽 생성자 이용
		
		super();		//부모쪽에 생성을 해놓고.생략가능 부모쪽 생성자들을 뜻함
		                //public Person() {} 
		this.setNmae(name);
		this.setage(age);
		this.setSchool(school);
	}
	
	
	public Student(String school) {
		this.school=school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void showInfo() {
		System.out.println("[name:" +super.getName() 
							+ "age:" +super.getage()
							+"school"+school+"]");
	}
	
	@Override
	public String toString() {
		return "Student [school=" + school + "]";
	}
}
