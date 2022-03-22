package calculate;

public class Calculator {

    private String[] operationType = {"+", "-", "*", "/"};

    public int calculate(String input){
        String[] splitInput = input.split(" ");
        int result = Integer.parseInt(splitInput[0]);
        String operator = null;

        for(int i=1; i<splitInput.length; i++){

            if(isPermittedOperator(splitInput[i])){
                operator = splitInput[i];
            }else{
                result = partCalculate(result, operator, splitInput[i]);
            }
        }

        return result;
    }

    public int partCalculate(int result, String operator, String input){

        if(input == null || input.equals("")) {
            throw new IllegalArgumentException("값 오류");
        }

        if(operator.equals("+")){
            return plus(result, input);
        }else if(operator.equals("-")){
            return minus(result, input);
        }else if(operator.equals("*")){
            return multiply(result, input);
        }else if(operator.equals("/")){
            return division(result, input);
        }else{
            throw new IllegalArgumentException("계산 오류");
        }
    }

    private boolean isPermittedOperator(String input){

        for(String operator : operationType){
            if(input.equals(operator)){
                return true;
            }
        }

        return false;
    }

    public int plus(int result, String input){
        return result + Integer.parseInt(input);
    }

    public int minus(int result, String input){
        return result - Integer.parseInt(input);
    }

    public int multiply(int result, String input){
        return result * Integer.parseInt(input);
    }

    public int division(int result, String input){
        return result / Integer.parseInt(input);
    }

}
