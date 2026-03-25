public class Usuario {
    private String nombre;
    private double saldo;
    private String numeroCuenta;
    private String contraseña;

    public Usuario(String nombre, double saldo, String numeroCuenta, String contraseña) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.contraseña = contraseña;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("monto invalido");
        } else {
            this.saldo += monto;
            System.out.println("deposito exitoso");
        }
    }

    public void retirar(double monto) {
        if (monto > this.saldo) {
            System.out.println("saldo insuficiente");
        } else {
            this.saldo -= monto;
            System.out.println("retiro Exitoso");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public String getContraseña() {
        return this.contraseña;
    }

}
