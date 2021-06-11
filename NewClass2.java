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
public class NewClass2 {
    String name,gender;
    int age,phone;
    NewClass2()
    {
        System.out.println("no value here");
    }
    NewClass2(String n,String m)
    {
        name = n;
        gender = m;
}
    NewClass2(String n , String m, int a,int p)
    {
        name = n;
        gender = m;
        age = a;
        phone = p;
    }
    void Disply()
    {
        System.out.println("name "+name);
        System.out.println("gender "+gender);
        System.out.println("age "+age);
        System.out.println("phone "+phone);
    }
}