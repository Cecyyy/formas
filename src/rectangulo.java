public class rectangulo extends figura{
    private double ancho;
    private double alto;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public rectangulo(String color, boolean esRelleno, double ancho, double alto) {
        super(color, esRelleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double obtenerArea() {
        return Math.pow(ancho * alto, 2);
    }

    @Override
    public double obtenerPerimetro() {
        return 0;
    }
}
