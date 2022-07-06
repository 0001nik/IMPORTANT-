
public class amstrong {

	public static void main(String[] args) {
		int num=153;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter num : ");
		num=sc.nextInt();*/
		int a=num;
		int rev=0;
		int rem;
		
		while(num>0) {
			rem=num%10;
			rev=rev + (int)Math.pow(rem, 3);
			num=num/10;
		}
		
		if(rev==a) 
			System.out.println(a+"  is amst no");
		else
			System.out.println(a+"is not amst no");

	}

}
