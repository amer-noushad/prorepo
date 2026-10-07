class greetings { 
    public void wish() { 
        System.out.println("thanks for accepting our request"); 
    } 
} 

public class thankyou { 
    public static void main(String a[]) { 
        // 1. Create an object of the greetings class
        greetings obj = new greetings(); 
        
        // 2. Call the wish() method using that object
        obj.wish(); 
    } 
}
