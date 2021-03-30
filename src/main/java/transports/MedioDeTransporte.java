package transports;

public abstract class MedioDeTransporte {

    private String modelo, color, capacidad;
    private int potencia, ejes, anyo, id;

    public MedioDeTransporte(String modelo, String color, String capacidad, int potencia, int ejes, int anyo, int id) {
        this.modelo = modelo;
        this.color = color;
        this.capacidad = capacidad;
        this.potencia = potencia;
        this.ejes = ejes;
        this.anyo = anyo;
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void darDeAlta();
    public abstract void darDeBaja();
    public abstract void entregarPedido();
    public abstract void darMantenimiento();
    public abstract void registrarNuevaEntrega();

}
