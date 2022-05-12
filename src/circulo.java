public class circulo extends  figura implements AccionesFiguraInterface {
    private double radio;

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

    public  double obtenerPerimetro(){


    return Math.PI*radio*2; };

    @Override
    public double obtenerArea() {

    return  Math.PI*Math.pow (radio,2);}

    @Override
    public void rellenar() {
        System.out.println("relleando figuara");
    }

    @Override
    public void duplicar() {
        System.out.println("se ha duplicado la figura ");

    }

    @Override
    public figura hacerPequenia() {

        return null;
    }
}
