import java.io.BufferedReader;
import java.io.InputStreamReader;

//Try with Resources 
public class exc1 {

	public static void main(String[] args) throws Exception {
		//try work to close the resources(br) once it finished
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter a string");
			String str="";
			str=br.readLine();
		}


	}

}
