import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private Float sueldo;

    @Override
    public String toString() {
        return String.format("%s - %d años - $ %.2f",
                             getNombreCompleto(), getEdad(), getSueldo());
    }

    public Empleado(String nom, String ape, LocalDate fec, Float sue) {
        this.nombre = nom;
        this.apellido = ape;
        this.fechaNacimiento = fec;
        this.sueldo = sue;
    }

    public static Comparator<Empleado> ordenarPorNombre = new Comparator<Empleado>() {
        @Override
        public int compare(Empleado empleado, Empleado empleado2) {
            return empleado.getNombreCompleto().compareTo(empleado2.getNombreCompleto());
        }
    };

    public static Comparator<Empleado> ordenarPorSueldoAsc = new Comparator<Empleado>() {
        @Override
        public int compare(Empleado empleado, Empleado empleado2) {
            return empleado.getSueldo().compareTo(empleado2.getSueldo());
        }
    };

    public static Comparator<Empleado> ordenarPorSueldoDes = new Comparator<Empleado>() {
        @Override
        public int compare(Empleado empleado, Empleado empleado2) {
            return empleado2.getSueldo().compareTo(empleado.getSueldo());
        }
    };

    public static Comparator<Empleado> ordenarPorFechaNacimientoAsc = new Comparator<Empleado>() {
        @Override
        public int compare(Empleado empleado, Empleado empleado2) {
            return empleado.getFechaNacimiento().compareTo(empleado2.getFechaNacimiento());
        }
    };

    public static Comparator<Empleado> ordenarPorFechaNacimientoDes = new Comparator<Empleado>() {
        @Override
        public int compare(Empleado empleado, Empleado empleado2) {
            return empleado2.getFechaNacimiento().compareTo(empleado.getFechaNacimiento());
        }
    };

    public int getEdad() {
       return Period.between(getFechaNacimiento(), LocalDate.now()).getYears();
    }

    public String getNombreCompleto() {
        return String.format("%s, %s", getApellido(), getNombre());
    }


    // GETTERS y SETTERS genericos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }
}
