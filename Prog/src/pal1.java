
public class pal1 {

	public static void main(String[] args) {
		int num=121;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter num : ");
		num=sc.nextInt();*/
        int a=num;
        int rev=0;
        int rem;
        
        while(num>0) {
        	rem=num%10;
        	rev=rev*10+rem;
        	num=num/10;
        }
        
        if(rev==a)
        	System.out.println("yes");
        else
        	System.out.println("no");
	}

}
