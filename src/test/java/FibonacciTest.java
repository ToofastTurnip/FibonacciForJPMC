import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void fibonacciOneInputTest() {
        Fibonacci f = new Fibonacci();
        String expected = "0";
        String actual = f.start(1);
        Assert.assertEquals("Incorrect output", expected, actual);
    }

    @Test
    public void fibonacciSmallInputTest() {
        Fibonacci f = new Fibonacci();
        String expected = "0 1";
        String actual = f.start(2);
        Assert.assertEquals("Incorrect output", expected, actual);
    }

    @Test
    public void fibonacciMediumInputTest() {
        Fibonacci f = new Fibonacci();
        String expected = "0 1 1 2 3 5 8 13 21 34";
        String actual = f.start(10);
        Assert.assertEquals("Incorrect output", expected, actual);
    }

    @Test
    public void fibonacciLargeInputTest() {
        Fibonacci f = new Fibonacci();
        String expected = "0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229";
        String actual = f.start(30);
        Assert.assertEquals("Incorrect output", expected, actual);
    }

    @Test
    public void fibonacciZeroInputTest() {
        Fibonacci f = new Fibonacci();
        String expected = "It can't run zero times, invalid input!";
        String actual = f.start(0);
        Assert.assertEquals("Incorrect output", expected, actual);
    }

    @Test
    public void fibonacciNegativeInputTest() {
        Fibonacci f = new Fibonacci();
        String expected = "It can't run zero times, invalid input!";
        String actual = f.start(-3);
        Assert.assertEquals("Incorrect output", expected, actual);
    }

    @Test
    public void fibonacciTooLargeInputTest() {
        Fibonacci f = new Fibonacci();
        String expected = "Input too large!";
        String actual = f.start(48);
        Assert.assertEquals("Incorrect output", expected, actual);
    }

}
