public class Dog {
    private String nombre;
    private String raza;
    private byte edad;

    public Dog(){}

    public Dog(String nombre){
        this.nombre = nombre;
    }

    public Dog(String nombre, String raza, byte edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + "\nraza =  " + raza + "\nedad= " + edad ;
    }

    
}
