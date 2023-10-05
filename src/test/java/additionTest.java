import static org.junit.Assert.*;

public class additionTest {

    @org.junit.Test
    public void add() {
        int result= addition.add(3,3);
        int correct=6;
        assertEquals( 6,result);
    }
}