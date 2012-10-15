//Understand the chance of something happens
public class Probability {

    private double value;
    private static final int MAX_PROBABILITY = 1;

    public Probability(double value) {
        this.value = value;
    }

    public double getProbability() {
        return value;
    }

    @Override
    public boolean equals(Object anotherProbability) {
        if(anotherProbability == null)
            return false;

        if(this.getClass() != anotherProbability.getClass())
            return false;

        return this.value == ((Probability)anotherProbability).value;

    }

    @Override
    public int hashCode() {
        return Double.valueOf(value).hashCode();
    }

    public Probability not() {
        return new Probability(MAX_PROBABILITY - value);
    }

    public Probability and(Probability anotherProbability) {
        return new Probability(value * anotherProbability.getProbability());
    }

    public Probability or(Probability anotherProbability) {
        Probability firstProbability = new Probability(not().value);
        Probability secondProbability = new Probability(anotherProbability.not().value);

        Probability finalProbability = firstProbability.and(secondProbability);
        return finalProbability.not();
    }
}




