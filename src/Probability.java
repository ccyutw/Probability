public class Probability {

    private double value; 

    public Probability(double value) {
        this.value = value;
    }

    public double getProbability() {
        return value;
    }

    @Override
    public boolean equals(Object anotherProbability) {
        if(anotherProbability == null) return false;
        if(this.getClass() != anotherProbability.getClass())
            return false;
        return this.value == ((Probability)anotherProbability).value;

    }

    @Override
    public int hashCode() {
        return Double.valueOf(value).hashCode();
    }
}
