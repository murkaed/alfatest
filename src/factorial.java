public class factorial {




    static long calculateFactorial(int n){
        long result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(20));
    }

}
