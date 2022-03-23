package baseball;

public class ValidationUtils {
    public static boolean validNo(int number) {
        if(1 <= number && number <=9){
            return true;
        }

        return false;
    }
}
