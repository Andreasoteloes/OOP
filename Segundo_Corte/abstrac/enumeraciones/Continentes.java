package enumeraciones;

public enum Continentes {
    Africa(54),
    Europa(50),
    Asia(48),
    America(35),
    Oceania(14);
    
    private final int paises;
    
    private Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return paises;
    }
}