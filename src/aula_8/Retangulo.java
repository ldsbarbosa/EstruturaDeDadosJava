/**
 * @author Lucas da Silva Barbosa
 * Matr�cula: 202120194
 * 
 */
package aula_8;

public class Retangulo {
    public double base;
    public double altura;
    public double area;
    
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void  calcularArea() {
        area = base * altura;
    }

    public void  imprimirArea() {
        System.out.println("�rea do ret�ngulo: " + area);
    }

}

