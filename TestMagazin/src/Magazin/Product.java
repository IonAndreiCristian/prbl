/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magazin;

/**
 *
 * @author A&A
 */
public class Product {
    public String name;
    public String Description;
    public int price;
    public Product(){}
    public Product(String _name,String _des,int _price)
    {
        name=_name;
        Description=_des;
        price=_price;
    }
    void getName()
    {
       System.out.println("Nume"+" "+name);
       System.out.println("Descriere"+" "+Description);
       System.out.println("Pret"+" "+ price);
    }
    void getName2()
    {
        System.out.println("Dupa stergere");
       System.out.println("Nume"+" "+name);
       System.out.println("Descriere"+" "+Description);
       System.out.println("Pret"+" "+ price);
    }
    int getPrice()
    {
        return price;
    }
}
