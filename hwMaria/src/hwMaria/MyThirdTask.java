package hwMaria;

import java.util.Random;

public class MyThirdTask {

    
    
    public static void foo() throws MyExceptionOne, MyExceptionTwo, MyExceptionThree{
        Random rand = new Random();
        int chance = rand.nextInt(4);
        
        if(chance == 1) {
            throw new MyExceptionOne();
        }
        
        if(chance == 2) {
            throw new MyExceptionTwo();
        }
        
        if(chance == 3) {
            throw new MyExceptionThree();
        }
        
        throw new MyExceptionThree();
    }
    
    public static class MyExceptionOne extends Exception{
        
        @Override
        public String getMessage() {
            return "this is my exception 1";
        }
    }
    
    public static class MyExceptionTwo extends Exception{
        
        @Override
        public String getMessage() {
            return "this is my exception 2";
        }
    }
    
    public static class MyExceptionThree extends Exception{

        
        private static final long serialVersionUID = 1L;

        @Override
        public String getMessage() {
            return "this is my exception 3";
        }
    }
}
