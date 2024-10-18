import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleJavaProgramTest {
    @Test
    public void TestNormalNumbers(){

        SimpleJavaProgram fb = new SimpleJavaProgram();
        Assertions.assertEquals("1",fb.convert(1));
        Assertions.assertEquals("2",fb.convert(2));
    }

    @Test
    public void TestThreeNumbers(){

        SimpleJavaProgram fb = new SimpleJavaProgram();
        Assertions.assertEquals("AGGELOS",fb.convert(3));
    }

    @Test
    public void TestFiveNumbers(){

        SimpleJavaProgram fb = new SimpleJavaProgram();
        Assertions.assertEquals("LIAMIS",fb.convert(5));

    }

    @Test
    public void TestThirteenNumbers(){

        SimpleJavaProgram fb = new SimpleJavaProgram();
        Assertions.assertEquals("19100",fb.convert(13));
    }

    /*
    @Test //Fail to be exepected
    public void TestTwentyNumbers(){

        SimpleJavaProgram fb = new SimpleJavaProgram();
        Assertions.assertEquals("Fail",fb.convert(200));
    }*/
}
