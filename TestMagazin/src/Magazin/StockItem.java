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
public class StockItem {
Product Lapte=new Product("Lapte","Exp",100);
public int cantite;
public int cantitate_elim;
public int pret;
public int cantitate2;
public int pret2;
private int cant;
public int cantitate_finala;
public StockItem(){}
public StockItem(int _cantite,int _pret)
{
    cantite=_cantite;
    pret=_pret;
}
void Cant()
{
    System.out.println("Cantitate"+" " +cantite);
    System.out.println("Pret"+" "+pret);
}
void getStock()
{
    Lapte.getName();
    Cant();
}
void removeCant(int cantitate_elim)
{
    cantitate_finala=cantite-cantitate_elim;
    System.out.println("Cantitate"+" "+cantitate_finala);
}
void getStock2()
{
    Lapte.getName2();
    removeCant(2);
}
int returnCant()
{
    return cantitate_finala;
}
int VindePorduse(int nr_produse)
{
    pret2= Lapte.getPrice()*nr_produse;
    getStock2();
    System.out.println("Dupa Vanzare");
    System.out.println("Nr bucati vandute"+":"+nr_produse);
    System.out.println("Bani obtinuti"+" "+pret2);

    
}
void checkStock()
{
    if(cantitate_finala!=0)
        System.out.println("Produsul este disponibil");
}
}
