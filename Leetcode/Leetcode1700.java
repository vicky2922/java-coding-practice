package Leetcode;

public class Leetcode1700 {

	public static void main(String[] args) {
		int[] students = {1,1,1,0,0,1};
		int[] sandwiches = {1,0,0,0,1,1};
		Leetcode1700 obj = new Leetcode1700();
		System.out.println(obj.countStudents(students, sandwiches));
	}
	
	public int countStudents(int[] students, int[] sandwiches) {
		int studentWith0=0;
		int studentWith1;
		for(int s : students) {
			if(s==0)
				studentWith0++;
		}
		studentWith1 = students.length-studentWith0;
		for(int s : sandwiches) {
			if(studentWith0 == 0 && s==0)
				return studentWith1;
			else if(studentWith1 == 0 && s==1)
				return studentWith0;
			if(s == 0)
				studentWith0--;
			else
				studentWith1--;
		}
        return 0;
    }

}
