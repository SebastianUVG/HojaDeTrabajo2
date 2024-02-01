import java.util.Stack;

public class POSFIXCalc {

    public int calcularExpresion(String expresion) {
        Stack<Integer> UVG_Stack = new Stack<>();
        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (esNumero(token)) {
                UVG_Stack.push(Integer.parseInt(token));
            } else {
                int operand2 = UVG_Stack.pop();
                int operand1 = UVG_Stack.pop();

                switch (token) {
                    case "+":
                        UVG_Stack.push(operand1 + operand2);
                        break;
                    case "-":
                        UVG_Stack.push(operand1 - operand2);
                        break;
                    case "*":
                        UVG_Stack.push(operand1 * operand2);
                        break;
                    case "/":
                        UVG_Stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return UVG_Stack.pop();
    }

    private boolean esNumero(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
