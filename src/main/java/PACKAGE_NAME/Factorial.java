package PACKAGE_NAME;

public class Factorial {
    public static int factorial(int num){
        int number=1;
        for(int i=1 ;i <= num ;i++){
            number*=i;
        }
        return number;
    }
}
