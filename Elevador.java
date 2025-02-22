public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    // Construtor sem parâmetros
    public Elevador() {
        this.andarAtual = 0; // Térreo
        this.pessoasPresentes = 0; // Vazio
    }

    // Construtor com parâmetros
    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // Térreo
        this.pessoasPresentes = 0; // Vazio
    }

    // Métodos get
    public int getAndarAtual() { return andarAtual; }
    public int getTotalAndares() { return totalAndares; }
    public int getCapacidade() { return capacidade; }
    public int getPessoasPresentes() { return pessoasPresentes; }

    // Métodos
    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
        } else {
            System.out.println("Elevador cheio!");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
        } else {
            System.out.println("Elevador vazio!");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Já está no térreo!");
        }
    }
}
