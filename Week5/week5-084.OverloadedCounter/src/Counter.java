/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Counter {
     int counter = 0;
     boolean check;
        
     public Counter(int startingValue, boolean check) {
        this.counter = startingValue;
        if (check) {
            this.check = check;
        }
    }
        
    public Counter(int startingValue) {
        this.counter = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check) {
        this.counter = 0;
        if(check) {
            this.check = check;
        }
    }
    
    public Counter() {
        this.counter = 0;
        this.check = false;
    }
    
    public int value() {
        return counter;
    }
    
    public void increase() {
        this.counter++;
    }
    
    public void decrease() {
        if(check) {
            this.counter--;
            if(this.counter < 0) {
                this.counter = 0;
            }
        } else {
            this.counter--;
        }
    }
    
    public void increase(int increaseValue) {
        if(increaseValue > 0) {
            this.counter += increaseValue;
        }
    }
    
    public void decrease(int decreaseValue) {
        if(decreaseValue > 0) {
            if(check) {
                this.counter -= decreaseValue;
                if(this.counter < 0) {
                    this.counter = 0;
                }
            } else {
            this.counter -= decreaseValue;
            }
        } 
    }
}
