public class Scooter extends Vehiculo implements Ivehiculo{
    public double potenciaMotor;
    public int autonomia;
    public int velocidadMaxima;

    public Scooter (){}

    public Scooter(String color, String marca, String anio, int precioPorHora, double potenciaMotor, int autonomia, int velocidadMaxima) {
        super(color, marca, anio, precioPorHora);
        this.potenciaMotor = potenciaMotor;
        this.autonomia = autonomia;
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void girar() {
        System.out.println("La scooter esta girando");
    }

    @Override
    public void acelerar() {
        System.out.println("La scooter esta acelerando");

    }

    @Override
    public void frenar() {
        System.out.println("La scooter esta frenando");

    }

    public void prender(){
        System.out.println("La Scooter esta encendida y lista para ser conducida");
    }
    public void apagar(){
        System.out.println("La Scooter esta apagada");
    }
}
