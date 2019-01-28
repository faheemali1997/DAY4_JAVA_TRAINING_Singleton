public class Reflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class emp = Class.forName("Employee").getClass().newInstance();
		try {
			System.out.println(Class.forName("Employee").getClass().getDeclaredFields().length);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
