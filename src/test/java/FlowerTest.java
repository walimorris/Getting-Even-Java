import com.morris.repeat.Flower;
import org.junit.Assert;
import org.junit.Test;

public class FlowerTest {
    Flower flower = new Flower("Rose", 10, 5.99f);

    @Test
    public void testGetFlower() {
        Assert.assertEquals(flower.getName(), "Rose");
    }

    @Test
    public void testGetPetals() {
        Assert.assertEquals(flower.getPetals(), 10);
    }

    @Test
    public void testGetPrice() {
        final double delta = 1e-15;
        Assert.assertEquals(flower.getPrice(), 5.99f, delta);
    }

    @Test
    public void testSetName() {
        flower.setName("Tulip");
        Assert.assertEquals(flower.getName(), "Tulip");
    }

    @Test
    public void testSetPetals() {
        flower.setPetals(5);
        Assert.assertEquals(flower.getPetals(), 5);
    }

    @Test
    public void testSetPrice() {
        flower.setPrice(6.00f);
        final double delta = 1e-15;
        Assert.assertEquals(flower.getPrice(), 6.00f, delta);
    }
}
