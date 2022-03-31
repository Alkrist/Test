package hwMaria;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public void f(Exception e) {
        g(e);
    }
    
    public void g(Exception e) {
        
    }
    
    
    public static void main(String[] args) throws FileNotFoundException {
        
        try {
            
            throw new IOException("blablabla ");
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally used");
        }
        
        try {
            MyClass.f();
        }catch(Exception e) {
            System.out.println('\n');
        }
        
        try {
            MyThirdTask.foo();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
