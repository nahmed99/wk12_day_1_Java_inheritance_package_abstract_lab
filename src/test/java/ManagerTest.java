import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Stuart Little",
                            "OP112233T",
                                57500.00,
                            "IT");
    }

    @Test
    public void managerHasName(){
        assertEquals("Stuart Little", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Stuart Large");
        assertEquals("Stuart Large", manager.getName());
    }

    @Test
    public void canChangeName_false_empty(){
        manager.setName("");
        assertEquals("Stuart Little", manager.getName());
    }

    @Test
    public void canChangeName_false_null(){
        manager.setName(null);
        assertEquals("Stuart Little", manager.getName());
    }

    @Test
    public void managerHasNINumber(){
        assertEquals("OP112233T", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(57500.00, manager.getSalary(), 0.0);
    }

    @Test
    public void managerHasDeptName(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseManagerSalary(){
        manager.raiseSalary(5000.00);
        assertEquals(62500.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canRaiseManagerSalary_false(){
        manager.raiseSalary(-5000.00);
        assertEquals(57500, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(575.00, manager.payBonus(), 0.0);
    }

}
