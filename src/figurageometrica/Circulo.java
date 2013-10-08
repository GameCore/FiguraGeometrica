
package figurageometrica;

class Circulo implements FiguraGeometrica
{
    int radio;
    
    public Circulo ( int radio )    
    {
    this.radio = radio;
    }
    
    public void area()
    {
    System.out.println( "El area del círculo es :" + ( 2 * Math.PI * ( radio*radio ) ) );
    }
    
}
