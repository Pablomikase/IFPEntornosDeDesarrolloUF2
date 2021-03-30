package transports;

public class Bicicleta extends MedioDeTransporte{

    public Bicicleta(String modelo, String color, String capacidad, int potencia, int ejes, int anyo, int id) {
        super(modelo, color, capacidad, potencia, ejes, anyo, id);
    }

    @Override
    public void darDeAlta() {
        System.out.println("Dando de alta a la bicicleta:" +getId());
    }

    @Override
    public void darDeBaja() {
        System.out.println("Dando de Baja a la bicicleta: " + getId());
    }

    @Override
    public void entregarPedido() {
        System.out.println("Entregando Pedido");
    }

    @Override
    public void darMantenimiento() {
        System.out.println("Dando mantenimeinto a la bicicleta" + getId());
    }

    @Override
    public void registrarNuevaEntrega() {
        System.out.println("Registrar nueva entrega");
    }

}
