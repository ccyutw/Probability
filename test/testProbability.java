import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class testProbability {
    @Test
    public void shouldReturnTheValueOfProbability() throws Exception
    {
        Probability probability = new Probability(0.4);
        assertThat(probability.getProbability(), is(0.4));
    }
    @Test
    public void shouldReturnTrueWhenTwoValuesAreEqual() throws Exception
    {
        Probability probability = new Probability(0.4);
        Probability anotherProbability = new Probability(0.4);
        assertThat(probability,is(anotherProbability));
    }
}
