import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Manny Mammoth",
                "MM338833M",
                75_000.00,
                "IT",
                500_000);
    }

    @Test
    public void hasName(){
        assertEquals("Manny Mammoth", director.getName());
    }

    @Test
    public void canChangeName(){
        director.setName("Sid Mammoth");
        assertEquals("Sid Mammoth", director.getName());
    }

    @Test
    public void canChangeName_false_empty(){
        director.setName("");
        assertEquals("Manny Mammoth", director.getName());
    }

    @Test
    public void canChangeName_false_null(){
        director.setName(null);
        assertEquals("Manny Mammoth", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("MM338833M", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(75_000.00, director.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("IT", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10_000.00);
        assertEquals(85_000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary_false(){
        director.raiseSalary(-10_000.00);
        assertEquals(75000, director.getSalary(), 0.0);
    }

    // Old method that gave director a bonus of 1%
//    @Test
//    public void canPayBonus(){
//        assertEquals(750.00, director.payBonus(), 0.0);
//    }

    // New method that gives Director a bonus of 2%.
    @Test
    public void canPayBonus(){
        assertEquals(1500.00, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(500_000.00, director.getBudget(), 0.0);
    }

}
