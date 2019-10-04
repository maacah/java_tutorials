
public class Numbers {
	
	public static void main(String[] args) {
		
		if (args.length == 2) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		
		System.out.println(x + y);
		if (x > y) {
			System.out.println(x - y);
		}
		else {
			System.out.println(y - x);
			
		}
		System.out.println(x*y);	
		System.out.println(x / y);
		System.out.println(x % y);
	}

}
}