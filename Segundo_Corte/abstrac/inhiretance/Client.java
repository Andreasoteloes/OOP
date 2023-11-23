package inhiretance;

import java.util.Date;

public class Client extends Person{
    private int idClient;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Client(Date fechaRegistri, boolean vip, String nombre, char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.idClient = ++Client.contadorCliente;
        this.fechaRegistro = fechaRegistri;
        this.vip = vip;
    }

    public int getIdClient() {
        return idClient;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistri) {
        this.fechaRegistro = fechaRegistri;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    @Override 
    public String obtenerDetalle(){
        return super.obtenerDetalle() + "Es VIP: " + this.vip;
    }

    @Override
    public String toString() {
        return "Client{idClient=" + idClient + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
}