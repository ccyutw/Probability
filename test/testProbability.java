import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
//Ensures the  chance of something happens
public class testProbability {
    @Test
    public void shouldReturnTheValueOfProbability0dot4() throws Exception
    {
        Probability probability = new Probability(0.4);
        assertThat(probability.getProbability(), is(0.4));
    }
    @Test
    public void shouldReturnTheValueOfProbability0dot3() throws Exception
    {
        Probability probability = new Probability(0.3);
        assertThat(probability.getProbability(), is(0.3));
    }
    @Test
    public void shouldReturnFalseWhenTryCompareWithANullObject() throws Exception
    {
        Probability probability = new Probability(0.4);
        assertFalse(probability.equals(null));
    }
    @Test
    public void shouldReturnFalseWhenTryCompareWithADifferentKindOfObject() throws Exception
    {
        Probability probability = new Probability(0.4);
        assertFalse(probability.equals(0.4));
    }
    @Test
    public void shouldReturnTrueWhenTwoValuesAreEqual() throws Exception
    {
        Probability probability = new Probability(0.4);
        Probability anotherProbability = new Probability(0.4);
        assertTrue(probability.equals(anotherProbability));
    }
    @Test
    public void shouldReturnFalseWhenTwoValuesAreDifferent() throws Exception
    {
        Probability probability = new Probability(0.4);
        Probability anotherProbability = new Probability(0.5);
        assertFalse(probability.equals(anotherProbability));

    }
    @Test
    public void shouldReturnChanceOfOccurrenceNotHappenWhenChanceIs0dot1(){
        Probability probability = new Probability(0.1);
        Probability anotherProbability = probability.not();
        assertTrue(anotherProbability.equals(new Probability(0.9)));
    }
    @Test
    public void shouldReturnChanceOfOccurrenceNotHappenWhenChanceIs0dot2(){
        Probability probability = new Probability(0.2);
        Probability anotherProbability = probability.not();
        assertTrue(anotherProbability.equals(new Probability(0.8)));
    }
    @Test
    public void shouldReturnChanceOf0dot2And0dot5HappenAtSameTime(){
        Probability probability = new Probability(0.2);
        Probability anotherProbability = new Probability(0.5);

        Probability expectedProbability = new Probability(0.1);
        Probability bothProbability = probability.and(anotherProbability);

        assertTrue(bothProbability.equals(expectedProbability));
    }
    @Test
    public void shouldReturnChanceOf0dot4And0dot5HappenAtSameTime(){
        Probability probability = new Probability(0.4);
        Probability anotherProbability = new Probability(0.5);

        Probability expectedProbability = new Probability(0.2);
        Probability bothProbability = probability.and(anotherProbability);

        assertTrue(bothProbability.equals(expectedProbability));
    }

    @Test
    public void shouldReturnChanceOf0dot4or0dot5HappenAtSameTime(){
        Probability probability = new Probability(0.4);
        Probability anotherProbability = new Probability(0.5);

        Probability expectedProbability = new Probability(0.7);
        Probability bothProbability = probability.or(anotherProbability);

        assertTrue(bothProbability.equals(expectedProbability));
    }
    @Test
    public void shouldReturnChanceOf0dot2or0dot5HappenAtSameTime(){
        Probability probability = new Probability(0.2);
        Probability anotherProbability = new Probability(0.5);

        Probability expectedProbability = new Probability(0.6);
        Probability bothProbability = probability.or(anotherProbability);

        assertTrue(bothProbability.equals(expectedProbability));
    }



}
