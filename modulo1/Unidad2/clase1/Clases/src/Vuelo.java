import java.sql.Date;

public class Vuelo {
    String origen;
    String destino;
    Date fecha;

    

    public Vuelo(String origen, String destino, Date fecha, int pasajeros) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
    }

    
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    int pasajeros;
}
