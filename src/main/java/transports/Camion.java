package transports;


public class Camion extends MedioDeTransporte{

    public Camion(String modelo, String color, String capacidad, int potencia, int ejes, int anyo, int id) {
        super(modelo, color, capacidad, potencia, ejes, anyo, id);
    }

    public void resitrarNuevaEntrega(){
        System.out.println("Proceso de nueva entrega registrado para el camión: " + getId());
    }

    public void darDeBaja(){
        System.out.println("Camión con id "+ getId() + " dado de baja");
    }

    public void darDeAlta(){
        System.out.println("Camión con id "+ getId() + " dado de alta");
    }

    public void entregarPedido(){
        System.out.println("Camión entregando Pedido");
    }

    @Override
    public void darMantenimiento() {
        System.out.println("Dando mantenimiento");
    }

    @Override
    public void registrarNuevaEntrega() {
        System.out.println("Registrando nueva entrega");
    }

    public void cargarGasolina(){
        System.out.println("Cargando gasolina en el camión");
    }

    public void darManetenimiento(){
        System.out.println("Camión en mantenimiento");
    }

}
