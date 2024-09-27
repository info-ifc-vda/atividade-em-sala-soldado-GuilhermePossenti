package batalhao;

public class soldado {
    private String nome;
    private int posX;
    private int posY;

    public soldado(String nome) {
        this.nome = nome;
        this.posX = 0;
        this.posY = 0;
    }

    public void moverParaCima() {
        setPosY(getPosY() + 1); 

    public void moverParaBaixo() {
        setPosY(getPosY() - 1); 
    }

    public void moverParaDireita() {
        setPosX(getPosX() + 1); 
    }

    public void moverParaEsquerda() {
        setPosX(getPosX() - 1); 
    }

    public void exibirPosicao() {
        System.out.println("Posição do soldado: (" + getPosX() + ", " + getPosY() + ")");
    }

    public void atacar(Inimigo inimigo, int dano) { 
        if (inimigo != null) {
            inimigo.receberDano(dano);
            System.out.println("voce atacou o inimigo " + dano + " dano!");
        } else {
            System.out.println("não atacou o inimigo!");
        }
    }

    // Gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
