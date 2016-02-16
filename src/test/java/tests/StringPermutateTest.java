import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringPermutateTest {

    StringPermutate stringPermutate;

    @Before
    public void setUp() throws Exception {
        stringPermutate = new StringPermutate();
    }

    @Test
    public void sizeOfPermutations() throws Exception {
        assertEquals(stringPermutate.permutationsFor("foo").size(),6);
        assertEquals(stringPermutate.permutationsFor("").size(),1);
    }

    @Test
    public void valuesOfPermutations() throws Exception {
        ArrayList<String> expectedPermutations = new ArrayList<String>();
        expectedPermutations.add("ma");
        expectedPermutations.add("am");
        assertTrue(stringPermutate.permutationsFor("ma").containsAll(expectedPermutations));
    }
}
