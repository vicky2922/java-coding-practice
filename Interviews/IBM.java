package Interviews;

public class IBM {
	
	static int digSum(int n) {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
	
	static void fib(int n) {
		int a = 0;
		int b = 1;
		if (n == 1) {
			System.out.println(1);
			return;
		}
		for (int i = 1; i < n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		int n = 1234;
        System.out.println(digSum(n));
        fib(7);
        
     //  System.out=null;
	 //  System.out.println(1);
	}

}
/*
Finding sum of digits of a number until sum becomes single digit
*/

/* singleton class */

class Singleton {
	private static Singleton obj;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (obj == null) {
			return obj;
		}
		obj = new Singleton();
		return obj;
	}
}


/* SQL

select e.name, d.dname, e.salary 
from employee e 
inner join 
department d on d.id=e.d_id where e.salary>10000;

select count(*), d.name 
from employee e 
inner join 
department d on d.id = e.d_id
group by d.d_id;

select e.salary, e.ename 
from employee e 
where 1 = (select count(distinct(e2.salary)) from employee e2 where e2.salary > e.salary)

class -> id, teacher_id
Student -> id, name, class_id
Teacher -> id , name

select s.name, t.name from student s 
inner join class c on s.class_id=c.id
inner join Teacher t on t.id=c.teacher_id;

*/