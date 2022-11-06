public class Carro {
    private String matricula;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula (String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void SetVelocidadeAtual (int velocidadeAtual) {
            this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima (int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    void ligar() {
        System.out.println(“VRUUUUMmmmmmmmmm”);
    }
    void desligar() {
        System.out.println(“MMMmmmmm”);
    }
    void acelerar() {
        velocidadeAtual += 10;
        if (velocidadeAtual > velocidadeMaxima)
            velocidadeAtual = velocidadeMaxima;
    }
    void travar (int intensidadeTravagem) {
        if (intensidadeTravagem > velocidadeMaxima)
            intensidadeTravagem = velocidadeMaxima;
        else if (intensidadeTravagem < 0)
            intensidadeTravagem = 0;
        velocidadeAtual -= intensidadeTravagem;
        if (velocidadeAtual > velocidadeMaxima)
            velocidadeAtual = velocidadeMaxima;
        else if (velocidadeAtual < 0)
            velocidadeAtual = 0;
    }
}
