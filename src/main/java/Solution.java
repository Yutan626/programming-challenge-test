public class Solution {

    //return the sum of a and b.
    public int add(int a, int b) {
        return (a + b); 
    }

    //return the difference of a and b.
    public int subtract(int a, int b) {
        return (a - b);
    }

    //return the product of a and b.
    public int multiply (int a, int b){
        return (a * b);
    }

    //return the quotient of a and b.
    public double divide (double a, double b){
        return (a / b);
    }

    public String concatenateEmpty(String letters) { 
        if (letters.isEmpty()) {
            return "abc";
        }
        return letters; 
    }

    public String concatenate(String word1, String word2) { 
        return word1 + word2; 
    }


    /*
    Start with a variable x equal to a. Then, IN THIS ORDER:
    1. add 4 to x
    2. multiply x by 3
    3. subtract the ORIGINAL a value from x
    Return x.
    */
    public int transform(int a) {
        return (((a + 4) * 3) - a);
    }

    public static void main(String[] args) {
        //this main method is for manually debugging
        Solution solution = new Solution();
        //change "solution" method to any of the methods you would like to test
        System.out.println(solution.add(1, 2));

    }
}
