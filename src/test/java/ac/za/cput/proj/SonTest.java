package ac.za.cput.proj;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SonTest {

    Father son;
    @Before
    public void setUp() throws Exception {
        son = new Son();
    }

    @Test
    public void character() {
        String charact = son.character();
        Assert.assertEquals(charact,"talkactive");
    }

    @Test
    public void complection() {
         String comp = son.complection();
        Assert.assertEquals(comp,"dark");
    }
}