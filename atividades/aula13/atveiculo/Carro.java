package aula13.atveiculo;

import javax.sound.sampled.SourceDataLine;

public class Carro extends Veiculo{
    private String marca;
    private String modelo;

    public Carro(String cor, int numPassageiros, String marca, String modelo) {
        super(cor, numPassageiros);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void acelerar(){
        System.out.printf("O %s %s acelerou\n", this.getMarca(), this.getModelo());
    }

    public void frear(){
        System.out.printf("O %s %s freou\n", this.getMarca(), this.getModelo());
    }

    @Override
    public String toString() {
        return "Carro " + this.getMarca() + " " + this.getModelo() + " " + this.getCor() + " numPassageiros " + this.getNumPassageiros();
    }
    

}
