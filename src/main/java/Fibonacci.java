public class Fibonacci {

    public String start(int limit) {
        String ret = "";
        int numOne = 0;
        int numTwo = 1;
        int numThree;
        ret += numOne + " " + numTwo;
        for (int i = 2; i < limit; i++) {
            numThree = numOne + numTwo;
            ret += " " + numThree;
            numOne = numTwo;
            numTwo = numThree;
        }
        return ret;
    }

}
