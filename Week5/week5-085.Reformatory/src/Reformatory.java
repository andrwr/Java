public class Reformatory {

    private int nrOfCalls = 0;
    
    public int weight(Person person) {
        // return the weight of the person
        nrOfCalls ++;
        return person.getWeight();
        
    }
    
    public void feed(Person person) {
        int x = person.getWeight();
        x++;
        person.setWeight(x);
    }

    public int totalWeightsMeasured() {
        return nrOfCalls;
    }
}
