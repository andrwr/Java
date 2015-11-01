/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class LyyraCard {
    
    private double balance;
    
    public LyyraCard(double balanceAtStart){
        
        this.balance = balanceAtStart;
    }
    
    public String toString() {
       return    "The card has " + balance + " euros";        
    }
    
    public void payEconomical(){
        if (balance >= 2.5) {
            balance -= 2.5;
        }
    }
            
    public void payGourmet() {
        if (balance >= 4.0) {
            balance -= 4;
        }
    }
    
    public void loadMoney(double amount){
            if(amount < 0){
                return;
            }
          
            this.balance += amount;
            if (this.balance > 150){
                this.balance = 150;
            }
        
        }
    
    
}
