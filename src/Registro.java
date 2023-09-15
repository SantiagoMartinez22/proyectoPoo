import java.util.Scanner;

class Registro {
    public int diasRentados;
    public double precioAPagar;
    public Vehiculo vehiculoRentado;
    public Cliente cliente;

    public Registro(Cliente cliente, Vehiculo vehiculoRentado, int diasRentados) {
        this.cliente = cliente;
        this.vehiculoRentado = vehiculoRentado;
        this.diasRentados = diasRentados;
        this.calcularPrecio();
    }

    public double getPrecioAPagar() {
        return precioAPagar;
    }

    private double calcularPrecio() {
        double precio= (vehiculoRentado.getPrecioPorHora()*diasRentados);
       return precio;
    }
}