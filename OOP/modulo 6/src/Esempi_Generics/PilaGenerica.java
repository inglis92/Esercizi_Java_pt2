// Classe Stack<T> che contiene i metodi per manipolare la pila
class Stack<T> {
    // Attributi della classe: dimensione massima, array e indice dell'elemento in cima alla pila
    private int maxSize;
    private T[] array;
    private int top;

    // Costruttore della classe
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        // Creo un array generico usando la riflessione
        this.array = (T[]) Array.newInstance(Stack.class, maxSize);
        this.top = -1;
    }

    // Metodo per aggiungere un valore in cima alla pila
    public void push(T value) {
        // Controllo se la pila è piena, in tal caso lancio un'eccezione
        if (top == maxSize - 1) {
            throw new RuntimeException("La pila è piena");
        }
        // Incremento l'indice dell'elemento in cima alla pila
        top++;
        // Assegno il valore passato come parametro all'elemento in cima alla pila
        array[top] = value;
    }

    // Metodo per rimuovere e restituire l'elemento in cima alla lista
    public T pop() {
    // Controllo se la lista è vuota, in tal caso lancio un'eccezione
    if (top == -1) {
        throw new RuntimeException("La lista è vuota");
    }
    // Memorizzo l'elemento in cima alla lista in una variabile temporanea
    T temp = array[top];
    // Decremento l'indice dell'elemento in cima alla lista
    top--;
    // Restituisco la variabile temporanea
    return temp;
    }

    public T peek() {
        // Controllo se la lista è vuota, in tal caso lancio un'eccezione
        if (top == -1) {
            throw new RuntimeException("La lista è vuota");
        }
        // Restituisco l'elemento in cima alla lista
        return array[top];
    }
}