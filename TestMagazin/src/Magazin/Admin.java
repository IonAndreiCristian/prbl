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
public class Admin {
    EmployeeIonfo angazat=new EmployeeIonfo("Andrei","07868766","algv");
    StockItem test=new StockItem(10,100);
    void AdaugainStock()
    {
        test.getStock();
        
    }
    void DupaEliminare()
    {
        test.getStock2();
    }
    void VerificareStock()
    {
      test.checkStock();
    }
}
