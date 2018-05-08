public class Fibonacci {

    public String start(int limit) {

        // If statements to cover bad inputs (and '1' because the code returns two values for everything)
        if (limit <= 0) return "It can't run zero times, invalid input!";
        if (limit == 1) return "0";
        if (limit > 47) return "Input too large!";

        // The rest of the code for valid inputs
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
