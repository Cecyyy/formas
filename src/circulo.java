public class circulo extends  figura{
    protected double radio;

    public circulo(String color, boolean esRelleno, double radio) {
        super(color, esRelleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public  boolean obtenerPerimetro(){

        return false;
    };

    @Override
    public void obtenerArea() {

    }
}
