package DesingPattern;

public class SingletonClass {
	//Singleton class is the special class that can  have only and only one objects.
	//Single instance at a time and we can create only one object at a time.
	//If u trying to create another object is will point to same object always.
	//In OOps , a singleton class is a class that have only one object (Instance of the class) at a time.
	//How to Design Singleton Class:---
	//1.make Constructor as a Private.
	//2.Write a  public static method(getInstance) that has return type of the object of this Singleton Class(Lazy Initialization).
	
	//Define a variable as a private static var.Var Reference of the particular class.
	//Single reference i have created of the particular class.	
	
	private static SingletonClass singleton_instance = null;//pointing to nothing
	public String str;
	
	private SingletonClass(){
		str ="Hey this is SingletonClass";
		
	}
	public static SingletonClass getInstance(){
		
		//This method will return the object of this class(SingletonClass)
		if(singleton_instance == null)
			singleton_instance = new SingletonClass();
		
			return singleton_instance;	
		}

	public static void main(String[] args) {
		SingletonClass x= SingletonClass.getInstance();
		SingletonClass y= SingletonClass.getInstance();
		SingletonClass z= SingletonClass.getInstance();
		x.str=(x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);

	}

}

//Example in Selenium:-------> if driver equals to null then create the objects...otherwise don't do that...
