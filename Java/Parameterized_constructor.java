package Vishakha;

public class Constructor {
	int id;
	String name;
	Constructor(int id,String name){         //parameterized constructor
		this.id=id;
		this.name=name;
	}
	Constructor(Constructor s){
		id=s.id;
		name=s.name;
	}
	void display() {
		System.out.println("id="+id+" "+"name="+name);
	}

	public static void main(String[] args) {
		Constructor s1=new Constructor(123,"vishakha");
		Constructor s2=new Constructor(s1);
		s1.display();
		s2.display();
	}

}
