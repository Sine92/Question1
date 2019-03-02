package ac.za.cput.proj;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DaughterTest {

    Father daught;
    @Before
    public void setUp() throws Exception {
        daught = new Daughter();
    }

    @Test
    public void character() {

        String charact  = daught.character();
        Assert.assertEquals(charact,"Leader");
    }

    @Test
    public void complection() {

        String comp = daught.complection();
        Assert.assertEquals(comp,"light from mother");
    }
}