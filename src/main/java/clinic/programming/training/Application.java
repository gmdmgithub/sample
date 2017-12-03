package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
	public int countWords(String str){
		String[] separateWord = StringUtils.split(str,' ');
		return (separateWord == null)? 0 : separateWord.length;
	}
	
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
		int count = app.countWords("Hi please tell me how many words?");
		System.out.println("Sentence with number of words: "+count);
    }
}