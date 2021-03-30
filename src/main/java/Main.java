import transports.Camion;

public class Main {

    public static void main(String[] args) {

        Camion camionDePrueba = new Camion("Chevrolet", "Verde", "200", 150, 4, 2015, 1);

        camionDePrueba.darDeAlta();
        camionDePrueba.cargarGasolina();
        camionDePrueba.darManetenimiento();
        camionDePrueba.entregarPedido();
        camionDePrueba.darDeBaja();

    }

}
