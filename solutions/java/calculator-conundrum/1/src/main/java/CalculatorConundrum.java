class CalculatorConundrum {
    // necessário throws
    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException, IllegalArgumentException {
          if (operation == null){
                    throw new IllegalArgumentException("Operation cannot be null");
                } else if(operation.isEmpty()) {
                    throw new IllegalArgumentException("Operation cannot be empty");
                }

        
            switch(operation) {
                case "+":
                    return operand1 + " + " + operand2 + " = " + (operand1+operand2);
                case "-":
                    return operand1 + " - " + operand2 + " - " + (operand1-operand2);
                case "/":
                    if (operand2 == 0) {
                        throw new IllegalOperationException ("Division by zero is not allowed",  new ArithmeticException());
                    }
                    return operand1 + " / " + operand2 + " = " + (operand1/operand2);
                case "*":
                    return operand1 + " * " + operand2 + " = " + (operand1*operand2);
                default:
                    throw new IllegalOperationException ("Operation '" + operation + "' does not exist");  
            }
              
        }                            
}