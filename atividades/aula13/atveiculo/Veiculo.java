package aula13.atveiculo;

public abstract class Veiculo {
    private String cor;
    private int numPassageiros;
    
    public Veiculo(String cor, int numPassageiros) {
        this.cor = cor;
        this.numPassageiros = numPassageiros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public abstract void acelerar();

    public abstract void frear();

    @Override
    public String toString() {
        return cor + "numPassageiros " + numPassageiros;
    }

    

}
