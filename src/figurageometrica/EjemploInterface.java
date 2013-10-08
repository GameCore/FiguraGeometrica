
package figurageometrica;

public class EjemploInterface {
   
    static void dibujarArea( FiguraGeometrica f )
            {
            f.area();
            }
    
    public static void main(String [] args)
    {
    FiguraGeometrica cuadrado = new Cuadrado( 5 );
    FiguraGeometrica circulo = new Circulo( 4 );
    FiguraGeometrica triangulo = new Triangulo( 16, 5 );
    
    dibujarArea( cuadrado );
    dibujarArea( circulo );
    dibujarArea( triangulo );
    
    }
    
}
