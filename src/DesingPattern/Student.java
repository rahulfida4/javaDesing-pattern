package DesingPattern;

public class Student implements Comparable<Student> {
	
	String name;
	int age;
	int rollno;
	
	Student(String name,int age,int rollno) {
		this.name= name;
		this.age=age;
		this.rollno=rollno;
		
	}
	
	public int compareTo(Student st){
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
		
		
	}

}
