public class Quadrado implements IQuadrilatero{
    private int lado;
    //Construtor: um bloco de código que serve para inicializar os objetos da classe
    public Quadrado(int l){
        this.lado = l;
    }    
    
    public double calcularArea(){
        return this.lado * this.lado;
    }
}
