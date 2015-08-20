import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void Task_instantiatesCorrectly_True(){
    Task myTask = new Task("Mow the Lawn");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
  public void task_instantiatesWithDescriiption_true(){
    Task myTask = new Task ("Mow the Lawn");
    assertEquals("Mow the Lawn", myTask.getDescription());
  }
}
