public class Factorial {
   static int calculateFactorial(int peremennay){
        int factorial = 1;
        for (int i = 1; i <=peremennay; i ++){
            factorial = factorial*i;
        }
        return factorial;
    }

    public static void main(String[] args){
        System.out.println(calculateFactorial(19));
    }
}