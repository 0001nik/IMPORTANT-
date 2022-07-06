
public class stringrev {

	public static void main(String[] args) {
		   String string = "Fuckyou";
		   
		    String output = new String();
		    for (int i = (string.length()-1); i >= 0; i--) {
		          output += (string.charAt(i));
		          System.out.println(output);
		     }

	}

}
