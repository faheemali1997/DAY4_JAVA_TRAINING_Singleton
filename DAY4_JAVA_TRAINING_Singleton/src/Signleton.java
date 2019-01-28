
public class Signleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Singleton{
	
	private static Singleton s; // Refernce pointing to NULL
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(s==null){
			s = new Singleton();
		}
		return s;
	}

}

