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
public class Store {
    public static void main(String[] args) {
      Admin andrei=new Admin();
      andrei.AdaugainStock();
      andrei.DupaEliminare();
      andrei.VerificareStock();
      StockItem test =new StockItem();
      test.VindePorduse(2);
    }
    
}
