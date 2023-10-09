package atinterfaceanimal;

public class Gato implements Animal{
    private String nome;
    private int nPatas;
    public Gato(String nome, int nPatas) {
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
        return "miau";
    }

    @Override
    public int numeroDePatas() {
        return this.getnPatas();
    }

    @Override
    public String toString() {
        return String.format("O gato %s com %d patas fez %s\n", this.getNome(), this.numeroDePatas(), this.fazerBarulho());
    }

}
