/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friend;

/**
 *
 * @author Arif Miad
 */
public class friend {
String name,gender;
int age,phone;

  
friend (String n,String g,int a, int p)
{
    name = n;
    gender = g;
    age = a;
    phone = p;
 
}
void friend()
{
    System.out.println("name " +name);
    System.out.println("gender "+gender);
    System.out.println("age "+age);
    System.out.println("phone "+phone);
}
}
