package athap;

class Retangulo extends Forma{
    private double altura;
    private double largura;


    @Override
    public double obterArea() {
        return altura*largura;
    }

    /*Método Construtor*/
    public Retangulo(String cor, double altura, double largura) {
        super(cor);
        this.setAltura(altura);
        this.setLargura(largura);
    }

    /*Métodos Getters e Setters*/
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    /*Método toString*/
    @Override
    public String toString() {
        return "Retângulo " + this.getCor() + " altura " + this.getAltura() + " e largura " + this.getLargura() + " tem área = " + this.obterArea();
    }

}
