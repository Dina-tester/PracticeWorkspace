package ja.in;

public class palindrom {

	public static void main(String[] args) {
		
		int num= 121;
		int res=0;
		int n=num;
		
	
		while (num>0) {
			int remainder=num%10;
			 res=(res*10)+remainder;
			 num=num/10;
			
		}
		System.out.println("the reverse of given number " +res);
		
		if (n==res)
		{
			System.out.println("the given number " + n +  " and reverse \"number\" is equal" +res);
		}
		
	}
}
