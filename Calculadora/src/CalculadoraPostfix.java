import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CalculadoraPostfix {

    public static void main(String[] args) {
        try {
            String rutaArchivo = "datos.txt";
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String expresion = br.readLine();
            br.close();

            POSFIXCalc calculadora = new POSFIXCalc();
            int resultadoFinal = calculadora.calcularExpresion(expresion);

            System.out.println("Resultado: " + resultadoFinal);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}