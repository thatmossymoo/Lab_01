import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

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

    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p2.setTitle("Mrs.");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}
