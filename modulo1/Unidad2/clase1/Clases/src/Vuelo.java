import java.time.LocalDate;

public class Vuelo {
    String origen;
    String destino;
    LocalDate fecha;
    int pasajeros;

    

    public Vuelo(String origen, String destino, LocalDate fecha, int pasajeros) {
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
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }


    @Override
    public String toString() {
        return "Vuelo [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", pasajeros=" + pasajeros
                + "]";
    }
    
    
}
