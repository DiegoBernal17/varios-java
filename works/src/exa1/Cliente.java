package exa1;

public class Cliente {
    private int habitacion;
    private int desayuno;
    private int personaExtra;
    private int formaDePago;
    private double comision;
    private double subtotal;
    private double iva;

    public Cliente(int habitacion, int desayuno, int personaExtra, int formaDePago) {
        this.habitacion = habitacion;
        this.desayuno = desayuno;
        this.personaExtra = personaExtra;
        this.formaDePago = formaDePago;
        subtotal = 0;
        iva = 0;
    }

    public void imprimirTicket() {
        System.out.println(
                "-------------------------------------------------\n" +
                "Tipo de habitación:        " + tipoHabitacion() + "\n" +
                "Huésped extra (0-1):       " + personaExtra  + "\n" +
                "Total, costo habitación:   " + costoHabitacion() + "\n" +
                "Costo desayuno:            " + costoDesayuno() + "\n" +
                "Comisión:                  " + sacarComision() + "\n" +
                "Subtotal sin iva:          " + subtotal + "\n" +
                "IVA:                       " + sacarIVA() + "\n" +
                "Total a pagar:             " + totalAPagar()
        );
    }

    public String tipoHabitacion() {
        String tipoHabitacion = "";
        switch (habitacion) {
            case 1:
                tipoHabitacion = "PRESIDENCIAL";
            break;
            case 2:
                tipoHabitacion = "DELUXE";
            break;
            case 3:
                tipoHabitacion = "DOBLE";
            break;
            case 4:
                tipoHabitacion = "SENCILLA";
            break;
        }
        return tipoHabitacion;
    }

    public double costoHabitacion() {
        int costoHabitacion=0;
        switch (habitacion) {
            case 1:
                costoHabitacion = 5000;
            break;
            case 2:
                costoHabitacion = 3000;
            break;
            case 3:
                costoHabitacion = 1500;
            break;
            case 4:
                costoHabitacion = 700;
            break;
        }

        if(personaExtra > 0) {
            costoHabitacion += 200;
        }
        subtotal += costoHabitacion;
        return costoHabitacion;
    }

    public double costoDesayuno() {
        int costoTotalDesayuno = 0, costoDelDesayuno=0;
        if(desayuno != 3) {
            if(desayuno == 1) {
                costoDelDesayuno = 75;
            } else {
                costoDelDesayuno = 100;
            }
            switch (habitacion) {
                case 1:
                    costoTotalDesayuno = 4 * costoDelDesayuno;
                    break;
                case 2:
                    costoTotalDesayuno = 4 * costoDelDesayuno;
                    break;
                case 3:
                    costoTotalDesayuno = 2 * costoDelDesayuno;
                    break;
                case 4:
                    costoTotalDesayuno = costoDelDesayuno;
                    break;
            }
            if(personaExtra == 1){
                costoTotalDesayuno += costoDelDesayuno;
            }
        }
        subtotal += costoTotalDesayuno;
        return costoTotalDesayuno;
    }

    public double sacarComision() {
        if(formaDePago == 1)
            comision = 0;
        else if(formaDePago == 2)
            comision = subtotal*0.03;
        return comision;
    }

    public double sacarIVA() {
        iva = subtotal*0.16;
        return iva;
    }

    public double totalAPagar() {
        return comision+subtotal+iva;
    }
}
