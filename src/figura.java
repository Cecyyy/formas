public  abstract class figura {
    protected String color;
    protected boolean esRelleno;

    public figura(String color, boolean esRelleno) {
        this.color = color;
        this.esRelleno = esRelleno;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsRelleno() {
        return esRelleno;
    }

    public void setEsRelleno(boolean esRelleno) {
        this.esRelleno = esRelleno;
    }
    public abstract void obtenerArea ();

    public abstract boolean obtenerPerimetro();
}
