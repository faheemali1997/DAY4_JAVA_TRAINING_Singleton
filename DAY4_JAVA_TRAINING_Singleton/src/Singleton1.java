
public class Singleton1 {

private static Singleton1 s; // Refernce pointing to NULL

private Singleton1(){
	
}

public static Singleton1 getInstance(){
	return s;
	}
}
