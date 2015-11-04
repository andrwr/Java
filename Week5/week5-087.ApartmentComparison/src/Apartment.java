
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment other) {
        return this.squareMeters>other.squareMeters;
    }
    
    public int priceDifference(Apartment other) {
        int a = this.squareMeters * this.pricePerSquareMeter;
        int b = other.squareMeters * other.pricePerSquareMeter;
        if (a < b) {
            return b-a;
        } else {
            return a-b;
        }
    }
    
    public boolean moreExpensiveThan(Apartment other) {
        int a = this.squareMeters * this.pricePerSquareMeter;
        int b = other.squareMeters * other.pricePerSquareMeter;
        
        if (a > b) {
            return true;
        } else return false;
    }
    
}
