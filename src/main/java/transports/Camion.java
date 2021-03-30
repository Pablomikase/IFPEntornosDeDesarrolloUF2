package transports;


public class Camion {

    private String modelo, color, capacidad;
    private int potencia, ejes, anyo, id;

    public Camion(String modelo, String color, String capacidad, int potencia, int ejes, int anyo, int id) {
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

    public String getColor() {
        return color;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getEjes() {
        return ejes;
    }

    public int getAnyo() {
        return anyo;
    }

    public int getId() {
        return id;
    }

    public void resitrarNuevaEntrega(){
        System.out.println("Proceso de nueva entrega registrado para el camión: " + id);
    }

    public void darDeBaja(){
        System.out.println("Camión con id "+ id + " dado de baja");
    }

    public void darDeAlta(){
        System.out.println("Camión con id "+ id + " dado de alta");
    }

    public void entregarPedido(){
        System.out.println("Camión entregando Pedido");
    }

    public void cargarGasolina(){
        System.out.println("Cargando gasolina en el camión");
    }

    public void darManetenimiento(){
        System.out.println("Camión en mantenimiento");
    }

}
