//Paulo Diaz

public class HelloWorld {

	public HelloWorld(){
		System.out.println("Constructor Vacio");	
	}
	
	public HelloWorld (int a){
		System.out.println("Segundo Constructor");
	}
	
	public HelloWorld (String cad){
		System.out.println("Tercer Constructor");
	}
	
	public static void main(String[] args) {	
		HelloWorld h = new HelloWorld("Paulo");
		//System.out.println(args[1]);
	}
}
