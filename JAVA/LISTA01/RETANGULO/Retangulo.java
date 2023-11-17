/*1. Escreva um programa para ler as dimensões de um retângulo (base e altura), calcular e
escrever a área do retângulo.
*/

package LISTA01.RETANGULO;

public class Retangulo {
    int base;
    int altura;
    
    public Retangulo(int base,int altura){
        this.base = base;
        this.altura = altura;
    }

    public void calculaArea(int base,int altura){
        int area = base*altura;
        System.out.println("A area do retangulo e:"+area);

    }
}
