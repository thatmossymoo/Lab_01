import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    Product p1, p2, p3;

    @BeforeEach
    void setUp() {
        p1 = new Product(0.99, "000001", "chocolate candy bar", "Candy");
        p2 = new Product(200.56, "000002", "wide screen television", "Television");
        p3 = new Product(20.99, "000003", "pretty dress", "Dress");
    }

    @Test
    void setName() {
        p1.setName("Chocolate");
        assertEquals("Chocolate", p1.getName());
    }

    @Test
    void setDescription() {
        p2.setDescription("small screen television");
        assertEquals("small screen television", p2.getDescription());
    }

    @Test
    void setCost() {
        p3.setCost(3.99);
        assertEquals(3.99, p3.getCost());
    }

    @Test
    void testToString() {
        String expectedProduct = "Product{" +
                "name='" + p1.getName() + '\'' +
                ", description='" + p1.getDescription() + '\'' +
                ", ID='" + p1.getID() + '\'' +
                ", cost=" + p1.getCost() +
                '}';
        assertEquals(expectedProduct, p1.toString());
    }
}
