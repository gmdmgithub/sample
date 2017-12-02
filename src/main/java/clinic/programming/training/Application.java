package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		greetings.add("Hi!");
		
		for(String str: greetings){
			System.out.println("Greetings: "+str);
		}
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
    }
}