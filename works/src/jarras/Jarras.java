package jarras;

public class Jarras
{
    private int litrosJarra4;
    private int litrosJarra3;
    private int movimientos;

    public Jarras()
    {
        this.litrosJarra4 = 0;
        this.litrosJarra3 = 0;
        this.movimientos = 0;
    }

    public void setLitrosJarra3(int litrosJarra3)
    {
        this.litrosJarra3 = litrosJarra3;
    }

    public void setLitrosJarra4(int litrosJarra4)
    {
        this.litrosJarra4 = litrosJarra4;
    }

    public int getLitrosJarra3()
    {
        return litrosJarra3;
    }

    public int getLitrosJarra4()
    {
        return litrosJarra4;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void nuevoMovimiento() {
        movimientos++;
        System.out.println("     " + this.getLitrosJarra4() + ", " + this.getLitrosJarra3() + "             " + this.getReglasPosibles());
    }

    public void llenarJarra3()
    {
        if(litrosJarra3 < 3) {
            litrosJarra3 = 3;
            nuevoMovimiento();
        }
    }

    public void llenarJarra4()
    {
        if(litrosJarra4 < 4) {
            litrosJarra4 = 4;
            nuevoMovimiento();
        }
    }

    public void tirarJarra3()
    {
        if(litrosJarra3 > 0) {
            litrosJarra3 = 0;
            nuevoMovimiento();
        }
    }

    public void tirarJarra4()
    {
        if(litrosJarra4 > 0) {
            litrosJarra4 = 0;
            nuevoMovimiento();
        }
    }

    public void jarra3aJarra4()
    {
        int aguaDada = this.getLitrosJarra3();
        if(litrosJarra4 < 4  && aguaDada > 0)
        {
            int total = litrosJarra4 + aguaDada;

            if(total <= 4)
            {
                litrosJarra4 = total;
                this.setLitrosJarra3(0);
            } else {
                total = total - 4;
                litrosJarra4 = 4;
                this.setLitrosJarra3(total);
            }
            nuevoMovimiento();
        }
    }

    public void jarra4aJarra3()
    {
        int aguaDada = this.getLitrosJarra4();
        if(litrosJarra3 < 3  && litrosJarra4 > 0)
        {
            int total = litrosJarra3 + aguaDada;
            if(total <= 3)
            {
                litrosJarra3 = total;
                this.setLitrosJarra4(0);
            } else {
                total = total - 3;
                litrosJarra3 = 3;
                this.setLitrosJarra4(total);
            }
            nuevoMovimiento();
        }
    }

    public String getReglasPosibles() {
        String reglasPosibles = "";

        if(litrosJarra4 == 0) {
            reglasPosibles += "1 ";
        }
        if(litrosJarra4 > 0) {
            reglasPosibles += "2 ";
        }
        if(litrosJarra4 < 4 && litrosJarra3 > 0) {
            reglasPosibles += "3 ";
        }
        if(litrosJarra3 == 0) {
            reglasPosibles += "4 ";
        }
        if(litrosJarra3 > 0) {
            reglasPosibles += "5 ";
        }
        if(litrosJarra3 < 3 && litrosJarra4 > 0) {
            reglasPosibles += "6 ";
        }

        return reglasPosibles;
    }

    public static void main(String[] args)
    {
        Jarras jarras = new Jarras();

        System.out.println("Reglas:\n" +
                "1) Llenar la jarra de 4 litros\n" +
                "2) Vaciar toda la jarra de 4L\n" +
                "3) Vaciar de la jarra de 3L a la de 4L hasta que se llene\n" +
                "4) Llenar la jarra de 3 litros\n" +
                "5) Vaciar toda la jarra de 3L\n" +
                "6) Vaciar de la jarra de 4L a la de 3L hasta que se llene"
        );
        System.out.println("Estado actual || Reglas aplicables ");
        System.out.println("     0, 0             " + jarras.getReglasPosibles());
        do
        {
            int num = (int) (Math.random()*6+1);

            switch (num) {
                case 1:
                    jarras.llenarJarra4();
                    break;
                case 2:
                    jarras.tirarJarra4();
                    break;
                case 3:
                    jarras.jarra3aJarra4();
                    break;
                case 4:
                    jarras.llenarJarra3();
                    break;
                case 5:
                    jarras.tirarJarra3();
                    break;
                case 6:
                    jarras.jarra4aJarra3();
                    break;
            }

        } while(jarras.getLitrosJarra4() != 2);
        System.out.println("Movimientos que se hicieron: " + jarras.getMovimientos());
    }
}
