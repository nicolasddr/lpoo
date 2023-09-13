package athap;

abstract class Forma {
    private String cor;

    abstract double obterArea();


    /*Método Construtor*/
    public Forma(String cor) {
        this.setCor(cor);
    }

    /*Métodos Getters e Setters*/
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
