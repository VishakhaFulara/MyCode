
public class exc1 {

	public static void main(String[] args) {
		int a,d;
		d=0;
		try {
			a=10/d;
			System.out.println("Never execute");
		}
		catch(Exception e){
			System.out.println("Infinite "+e);
		}
		System.out.println("After Catch Statement");

	}

}
