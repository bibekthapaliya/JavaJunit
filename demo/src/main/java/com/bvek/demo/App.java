package com.bvek.demo;

/**
 * Hello world!
 */
public class App {
   
    //private int x,y;

   
    public int  product(int x,int y)
    {
        if(x>999)
        throw new IllegalArgumentException("X should be less than 1000");
        return x*y;


    }

    public int divide(int x, int y){
        if(x ==0)
         throw new IllegalArgumentException("X should be greater than zero");
         return x/y;
    }
    public String Compare(String a,String b){
        
       
        return a+b;

    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
            App a = new App();
            System.out.println(a.product(1000,5));
            System.out.println(a.divide(10,5));
            
    }
}
