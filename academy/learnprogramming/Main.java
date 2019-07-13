package academy.learnprogramming;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        for(int i =0; i<args.length; i++)
        System.out.println("args[ " +i +"]=" +args[i]);

        int a = sum(2, 3);

        System.out.println("The sum of two integers " +a);



    }


    /**
     * Calculates the sum of two integers
     * @param a user defined
     * @param b user defined
     * @return the sum of two integers
     */
    public static int sum(int a, int b){
                return a+b;
    }
}
