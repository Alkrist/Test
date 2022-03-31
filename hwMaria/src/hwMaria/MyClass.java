package hwMaria;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MyClass {

    
    public static void f() throws FileNotFoundException {
        try {
            g();
        }catch(IOException e) {
            throw new FileNotFoundException();
        }
    }
    
    public static void g() throws IOException {
        throw new IOException();
    }
}
