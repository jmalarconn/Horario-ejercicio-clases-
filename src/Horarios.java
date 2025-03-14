import java.util.Scanner;

public class Horarios {

    static class Materia {
        private String nombre;
        private String dia;
        private String hora;

        public Materia(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setDia(String dia) {
            this.dia = dia;
        }

        public String getDia() {
            return dia;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        public String getHora() {
            return hora;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Materia CalculoI = new Materia("Calculo integral");
        Materia fisica2 = new Materia("Física 2");
        Materia Programacion2 = new Materia("Programacion 2");
        Materia Lengua = new Materia("Lengua extranjera");
        Materia Lectura = new Materia("Lectura critica 2");
        Materia Ciudadania = new Materia("Ciudadania");


        while (true) {
            System.out.println("Seleccione una materia para agregar al horario:");
            System.out.println("1. " + CalculoI.getNombre());
            System.out.println("2. " + fisica2.getNombre());
            System.out.println("3. " + Programacion2.getNombre());
            System.out.println("4. " + Lengua.getNombre());
            System.out.println("5. " + Lectura.getNombre());
            System.out.println("6. " + Ciudadania.getNombre());
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 7) {

                System.out.println("Saliendo...");
                break;
            }


            Materia materiaSeleccionada = null;
            switch (opcion) {
                case 1-> materiaSeleccionada = CalculoI;
                case 2-> materiaSeleccionada = fisica2;
                case 3-> materiaSeleccionada = Programacion2;
                case 4-> materiaSeleccionada = Lengua;
                case 5-> materiaSeleccionada = Lectura;
                case 6-> materiaSeleccionada = Ciudadania;

                default->
                    System.out.println("Opción no válida.");
            }

            if (materiaSeleccionada.getDia() == null) {
                System.out.print("Ingrese el día para " + materiaSeleccionada.getNombre() + ": ");
                String dia = scanner.nextLine();
                materiaSeleccionada.setDia(dia);

                System.out.print("Ingrese la hora para " + materiaSeleccionada.getNombre() + ": ");
                String hora = scanner.nextLine();
                materiaSeleccionada.setHora(hora);

                System.out.println(materiaSeleccionada.getNombre() + " agregada al horario.");
            } else {
                System.out.println("Ya has agregado " + materiaSeleccionada.getNombre() + " al horario.");
            }

            System.out.println("\nHorario actual:");
            if (CalculoI.getDia() != null) {
                System.out.println(CalculoI.getNombre() + " - Día: " + CalculoI.getDia() + ", Hora: " + CalculoI.getHora());
            }
            if (fisica2.getDia() != null) {
                System.out.println(fisica2.getNombre() + " - Día: " + fisica2.getDia() + ", Hora: " + fisica2.getHora());
            }
            if (Programacion2.getDia() != null) {
                System.out.println(Programacion2.getNombre() + " - Día: " + Programacion2.getDia() + ", Hora: " + Programacion2.getHora());
            }
            if (Lengua.getDia() != null) {
                System.out.println(Lengua.getNombre() + " - Día: " + Lengua.getDia() + ", Hora: " + Lengua.getHora());
            }if (Lectura.getDia() != null) {
                System.out.println(Lectura.getNombre() + " - Día: " + Lectura.getDia() + ", Hora: " + Lectura.getHora());
            }if (Ciudadania.getDia() != null) {
                System.out.println(Ciudadania.getNombre() + " - Día: " + Ciudadania.getDia() + ", Hora: " + Ciudadania.getHora());
            }
        }
        scanner.close();
    }
}
