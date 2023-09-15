public class Bicicleta extends Vehiculo implements Ivehiculo{
    public  String tipoBicicleta;

    public String material;



    public Bicicleta(String color, String marca, String anio, int precioPorHora, String tipoBicicleta, String material ) {
        super(color, marca, anio, precioPorHora);
        this.tipoBicicleta = tipoBicicleta;
        this.material = material;

    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }



    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }



    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    @Override
    public void girar() {
        System.out.println("La Bicicleta esta girando");
    }

    @Override
    public void acelerar() {
        System.out.println("La Bicicleta esta acelerando ");

    }

    @Override
    public void frenar() {
        System.out.println("La Bicicleta esta frenando");

    }
    public void hacerCambio(){
        System.out.println("La bicicleta esta haciendo un cambio");
    }
}
