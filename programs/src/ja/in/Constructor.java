package ja.in;

public class Constructor {
	static int reg;
	static String name;
	
	Constructor(int a,String B) {
		reg=a;
		name=B;
		
	}
	public void Constructor(){
		reg=123;
		name= "Rahul";
		
	}
	
	
	public static void main(String[] args) {
		Constructor c = new Constructor(2,"dinesh");
		System.out.println(name);
		
		/*
		 * Constructor c1= new Constructor(); System.out.println(reg);
		 */
		
		
		
	}

}
