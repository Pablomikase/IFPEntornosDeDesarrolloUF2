package transports;

public class Coche extends MedioDeTransporte{

    public Coche(String modelo, String color, String capacidad, int potencia, int ejes, int anyo, int id) {
        super(modelo, color, capacidad, potencia, ejes, anyo, id);
    }

    @Override
    public void darDeAlta() {
        System.out.println("Dando de alta el coche: " + getId());
    }

    @Override
    public void darDeBaja() {
        System.out.println("Dando de baja el coche: "+ getId());
    }

    @Override
    public void entregarPedido() {
        System.out.println("Entregando Pedido con coche");
    }

    @Override
    public void darMantenimiento() {
        System.out.println("Dando mantenimiento al coche: "+ getId());
    }

    @Override
    public void registrarNuevaEntrega() {
        System.out.println("Registrando nueva entrega con el coche");
    }
}
