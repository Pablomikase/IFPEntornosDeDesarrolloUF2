package transports;

public class Moto extends MedioDeTransporte{

    public Moto(String modelo, String color, String capacidad, int potencia, int ejes, int anyo, int id) {
        super(modelo, color, capacidad, potencia, ejes, anyo, id);
    }

    @Override
    public void darDeAlta() {
        System.out.println("Dando de alta a la moto:" + getId());
    }

    @Override
    public void darDeBaja() {
        System.out.println("Dando de baja a la moto:" + getId());
    }

    @Override
    public void entregarPedido() {
        System.out.println("Entregando Pedido");
    }

    @Override
    public void darMantenimiento() {
        System.out.println("Dando mantenimiento a la moto:" + getId());
    }

    @Override
    public void registrarNuevaEntrega() {
        System.out.println("Registrando nueva entrega");
    }


}
