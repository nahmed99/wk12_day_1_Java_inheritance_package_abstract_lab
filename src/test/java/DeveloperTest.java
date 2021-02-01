import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Sid Sloth",
                "SS117711T",
                37500.00);
    }

    @Test
    public void developerHasName(){
        assertEquals("Sid Sloth", developer.getName());
    }

    @Test
    public void canChangeName(){
        developer.setName("Sid Mammoth");
        assertEquals("Sid Mammoth", developer.getName());
    }

    @Test
    public void canChangeName_false_empty(){
        developer.setName("");
        assertEquals("Sid Sloth", developer.getName());
    }

    @Test
    public void canChangeName_false_null(){
        developer.setName(null);
        assertEquals("Sid Sloth", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("SS117711T", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(37500.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2500.00);
        assertEquals(40000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary_false(){
        developer.raiseSalary(-2500.00);
        assertEquals(37500, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(375.00, developer.payBonus(), 0.0);
    }

}
