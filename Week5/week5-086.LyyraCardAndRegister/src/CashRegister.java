
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        
        double economical = 2.5;
        if (economical <= cashGiven){
            cashInRegister += economical;
            economicalSold ++;
            return cashGiven - economical;
        }else {
            return cashGiven;
        }
        
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        
        double gourmet = 4.0;
        if (gourmet <= cashGiven) {
            cashInRegister += gourmet;
            gourmetSold ++;
            return cashGiven - gourmet;
        }else {
            return cashGiven;
        }
    }
    
    public boolean payEconomical(LyyraCard card) {
        double economical = 2.5;
        if (card.balance() >= economical){
            economicalSold++;
            card.pay(economical);
            return true;
        } else {
            return false;
        }
    }
    
    public boolean payGourmet(LyyraCard card) {
        double gourmet = 4.0;
        if (card.balance() >= gourmet) {
            gourmetSold++;
            card.pay(gourmet);
            return true;
        } else {
            return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard card, double amount) {
        
        if(amount > 0) {
            card.loadMoney(amount);
            cashInRegister += amount;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}