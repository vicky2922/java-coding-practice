package JavaConcepts;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ModelClassCompany{
	private String name;
	public ModelClassCompany(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	private void displayName() {
		System.out.println("COMPANY NAME - "+name);
	}
}

public class JavaReflection {

	public static void main(String[] args) throws Exception {
		ModelClassCompany company = new ModelClassCompany("Facebook");
		System.out.println("Company name - "+company.getName());
		
		//change the name from facebook to meta by reflection
		//set private variable
		Field name = ModelClassCompany.class.getDeclaredField("name");
		name.setAccessible(true);
		name.set(company,"Meta");
		
		System.out.println("Company name - "+company.getName());
		
		//invoke private method
		Method method =ModelClassCompany.class.getDeclaredMethod("displayName");
		method.setAccessible(true);
		method.invoke(company);
	}

}
