package DesingPattern;

import java.util.ArrayList;

import java.util.Collections;

public class TestComaparable {

	public static void main(String[] args) {
		
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student("Rahul",54,123));
		ar.add(new Student("Ravi",17,223));
		ar.add(new Student("Rahil",45,623));
		
		Collections.sort(ar);
		for(Student st :ar){
			System.out.println(st.name+""+st.age+""+st.rollno);
		}
		
		
		
	}

}
