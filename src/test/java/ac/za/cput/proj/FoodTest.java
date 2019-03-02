package ac.za.cput.proj;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class FoodTest {

    Food myfood;
    @Before
    public void setUp() throws Exception {
        myfood = new Food();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSet() {
        Set set = myfood.getSet();
        Assert.assertEquals(myfood.getSet(),set);
    }

    @Test
    public void getList() {

        List list = myfood.getList();
        Assert.assertEquals(myfood.getList(),list);

    }

    @Test
    public void getMap() {

        Map map = myfood.getMap();
        Assert.assertEquals(myfood.getMap(),map);
    }

    @Test
    public void getCollection() {
        Collection collect = myfood.getCollection();
        Assert.assertEquals(myfood.getCollection(),collect);
    }
}