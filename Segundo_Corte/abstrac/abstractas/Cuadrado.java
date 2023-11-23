package abstractas;

public class Cuadrado extends FigurasGeometricas{
    public Cuadrado(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un: " + this.getClass().getSimpleName());
    }
}