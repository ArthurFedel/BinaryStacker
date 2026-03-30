public class PilhaInt {
    int N = 100;
    int [] dados = new int[N];
    int topo;

    // Inicia a pilha
    public void init() {
        topo = 0;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return (topo != 0);
    }

    // Verifica se a pilha está cheia
    public boolean isFull() {
        return (topo == N);
    }

    // Insere no topo com verificação de overflow
    public void push(int elem) {
        if (!isFull()) {
            dados[topo] = elem;
            topo++;
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    // Remove e retorna o topo com underflow
    public int pop() {
        if (isEmpty()) {
            topo--;
            return dados[topo];
        } else {
            System.out.println("Stack Underflow!");
            return -1;
        }
    }
}