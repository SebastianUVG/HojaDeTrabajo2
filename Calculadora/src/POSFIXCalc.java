public class POSFIXCalc {

    public int calcularExpresion(String expresion) {
        int capacidadInicial = contarElementos(expresion);
        UVG_Stack UVG_Stack = new UVG_Stack(capacidadInicial);

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

    private int contarElementos(String expresion) {
        String[] tokens = expresion.split(" ");
        return tokens.length;
    }
}
