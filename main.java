class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters y setters
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    // Getter y setter
    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    // Getter y setter
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class main {
    public static void main(String[] args) {
        // Crear objeto de la clase Cliente
        Cliente cliente1 = new Cliente(25, "Juan", "123456789", 1000.0);

        // Mostrar propiedades del cliente
        System.out.println("Cliente:");
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Teléfono: " + cliente1.getTelefono());
        System.out.println("Crédito: " + cliente1.getCredito());

        // Crear objeto de la clase Trabajador
        Trabajador trabajador1 = new Trabajador(30, "María", "987654321", 2000.0);

        // Mostrar propiedades del trabajador
        System.out.println("\nTrabajador:");
        System.out.println("Edad: " + trabajador1.getEdad());
        System.out.println("Nombre: " + trabajador1.getNombre());
        System.out.println("Teléfono: " + trabajador1.getTelefono());
        System.out.println("Salario: " + trabajador1.getSalario());
    }
}
