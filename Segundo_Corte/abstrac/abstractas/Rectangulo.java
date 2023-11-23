package abstractas;

public class Rectangulo extends FigurasGeometricas{
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un:" + this.getClass().getSimpleName());
    }
}