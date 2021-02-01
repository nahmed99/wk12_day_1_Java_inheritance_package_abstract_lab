import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Siberian Diego",
                "TD224313S",
                35000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Siberian Diego", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("TD224313S", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2500.00);
        assertEquals(37500.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350.00, databaseAdmin.payBonus(), 0.0);
    }

}
