package athap;

class Triangulo extends Forma {
    private double base;
    private double altura;



    @Override
    public double obterArea() {
        return (base*altura)/2;
    }

    
    /*Método Construtor*/
    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.setBase(base);
        this.setAltura(altura);
    }


    /*Métodos Getters e Setters*/
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /*Método toString*/
    @Override
    public String toString() {
        return "Triangulo " + this.getCor() + " base " + this.getBase() + " e altura " + this.getAltura() + " tem área = " + this.obterArea();
    }
    
}
