public class UVG_Stack {

    private int[] elementos;
    private int tamaño;
    private int capacidad;

    public UVG_Stack(int capacidadInicial) {
        capacidad = capacidadInicial;
        elementos = new int[capacidad];
        tamaño = 0;
    }

    public void push(int elemento) {
        elementos[tamaño] = elemento;
        tamaño++;
    }

    public int pop() {
        tamaño--;
        return elementos[tamaño];
    }

    public int size() {
        return tamaño;
    }

    public boolean isEmpty() {
        return tamaño == 0;
    }
}
