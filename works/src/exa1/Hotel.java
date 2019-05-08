package exa1;

public class Hotel {
    public static void main(String[] args) {
        int habitacion, desayuno, personaExtra = 0, formaDePago;
        ServiciosClientes servicios = new ServiciosClientes();

        System.out.println("CLIENTE 1\n----------------------");
        habitacion = servicios.habitacionPorNoche();
        if(habitacion != 4) {
            personaExtra = servicios.personaExtra();
        }
        desayuno = servicios.desayuno();
        formaDePago = servicios.formaDePago();

        Cliente cliente1 = new Cliente(habitacion, desayuno, personaExtra, formaDePago);
        cliente1.imprimirTicket();

        System.out.println("\nCLIENTE 2\n----------------------");
        habitacion = servicios.habitacionPorNoche();
        if(habitacion != 4) {
            personaExtra = servicios.personaExtra();
        }
        desayuno = servicios.desayuno();
        formaDePago = servicios.formaDePago();

        Cliente cliente2 = new Cliente(habitacion, desayuno, personaExtra, formaDePago);
        cliente2.imprimirTicket();
    }
}
