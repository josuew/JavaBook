package com.softlied.chapter10.ExceptionHandling.example7;

//An example
public class NestTry {
    public static void main(String[] args) {
        try{
            int a = args.length;
            /*
                If no command-line args are present
                the following statement will generate a divide by zero exception
             */
            int b = 42/a;
            System.out.println("a = " + a);
            try{
                /*
                    If one command-line is used then a divide-by-zero exceotion will be generated by the following code
                 */
                if (a==1) a = a /(a-a);

                if(a==2){
                    int c[] = {1};
                    c[42] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Array index out-of bounds");
            }
            System.out.println("Executed");
        }catch (ArithmeticException ex){
            System.out.println("Divide by zero: " + ex);
        }
    }
}
