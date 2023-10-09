package atinterfaceanimal;

public class Papagaio implements Animal{
    private String nome;
    private int nPatas;

    public Papagaio(String nome, int nPatas) {
        this.nome = nome;
        this.nPatas = nPatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnPatas() {
        return nPatas;
    }



    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    @Override
    public String fazerBarulho() {
        return "loro";
    }

    @Override
    public int numeroDePatas() {
        return this.getnPatas();
    }

    @Override
    public String toString() {
        return String.format("O papagaio %s com %d patas fez %s\n", this.getNome(), this.numeroDePatas(), this.fazerBarulho());
    }

    
}
