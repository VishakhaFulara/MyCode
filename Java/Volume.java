package Vishakha;

class Box{
    private	float length,breadth,height,v;
    
    void get_dimension(float l,float b,float h){
        length=l;
        breadth=b;
        height=h;
    }
    void Volume(){
        v=length*breadth*height;
    }
    void display(){
        System.out.println("Lenght="+length);
        System.out.println("Breadth="+breadth);
        System.out.println("Height="+height);
        System.out.println("Volume of the box="+v);
    }

}

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj=new Box();             //Dynamically object created
        obj.get_dimension(5,7,9);
        obj.Volume();
        obj.display();
       //obj=new Box();              //now reference variable is pointing to new object

	}

}
