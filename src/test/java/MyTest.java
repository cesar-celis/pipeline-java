import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
    }

    @Test
    public void test_method_3() {
        Demo d = new Demo();
        d.DoSomething(false);
    }

}
