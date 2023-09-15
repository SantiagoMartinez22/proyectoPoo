public class Vehiculo {
    public String color;
    public String marca;
    public String anio;
    public boolean disponible = true;

    public int precioPorHora;
    public Vehiculo( ) {

    }

    public Vehiculo(String color, String marca, String anio, int precioPorHora) {
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.precioPorHora=precioPorHora;

    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", anio='" + anio + '\'' +
                '}';
    }

}
