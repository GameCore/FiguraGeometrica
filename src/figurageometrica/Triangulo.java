
package figurageometrica;

public class Triangulo implements FiguraGeometrica{
    
    int base,altura;
    
    public Triangulo( int base, int altura )
    {
    this.base = base;
    this.altura = altura;
    }
    
    public void area()
    {
    System.out.print("El area del triangulo es: " + ( base * altura) / 2 );
    }
        
}
