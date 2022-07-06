
public class Reverseno {

	public static void main(String[] args) {
		int num=12345;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter num : ");
		num=sc.nextInt();*/
		//int a=num;
		int rev=0;
		int rem;
		
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		/*if(rev==a) 
			System.out.println(a+"  is pal no");
		else
			System.out.println(a+"is not pal no");*/
		
		System.out.println(rev);

	}

}
