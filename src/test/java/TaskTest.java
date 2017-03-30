/**
 * Created by Margonari on 28/03/2017.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

    @Test
    public void Task_instantiatesCorrectly_true() {
        Task myTask = new Task("a Task");
        assertEquals(true,myTask instanceof Task);
    }

    @Test
    public void Task_DescriptionInstantiatesCorrectly() {
        Task myTask = new Task("description");
        assertEquals("description",myTask.getDescription());
    }

}
