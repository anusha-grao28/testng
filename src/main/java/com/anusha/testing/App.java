package com.anusha.testing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Person p1 = new Person("anusha", "rao", 26);
       Person p2 = new Person("anusha2", "rao2", 26);
       
       
       System.out.println(p1.getFullName());
       
       System.out.println(p2.getFullName());

    }
}
