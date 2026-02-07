import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    Person p1, p2, p3;

    @BeforeEach
    void setUp() {
        p1 = new Person("00000A","Moss","LaFountain","Mx.",2003);
        p2 = new Person("00000B", "Frances", "Pepper", "Ms.", 2011);
        p3 = new Person("00000C", "Andrew", "LaFountain", "Mr.", 2005);
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p1.setLastName("Smith");
        assertEquals("Smith",p1.getLastName());

    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p2.setTitle("Mrs.");
        assertEquals("Mrs.", p2.getTitle());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        String expectedPerson = "Person{" +
            "ID='" + p1.getID() + '\'' +
            ", firstName='" + p1.getFirstName() + '\'' +
            ", lastName='" + p1.getLastName() + '\'' +
            ", title='" + p1.getTitle() + '\'' +
            ", YOB=" + p1.getYOB() +
            '}';
        assertEquals(expectedPerson, p1.toString());
    }

    @Test
    void setFirstName() {
        p3.setFirstName("Andrea");
        assertEquals("Andrea",p3.getFirstName());
    }
}
