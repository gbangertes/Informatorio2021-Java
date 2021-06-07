public class Empleado {
  protected String nombreYApellido;
  protected Integer dni;
  protected Integer horasTrabajadas;
  protected Integer valorPorHora;

  public Empleado(String nombreYApellido, Integer dni,
				  Integer horasTrabajadas, Integer valorPorHora) {
	this.nombreYApellido = nombreYApellido;
	this.dni = dni;
	this.horasTrabajadas = horasTrabajadas;
	this.valorPorHora = valorPorHora;
  }

  public String getNombreYApellido() {
	return nombreYApellido;
  }

  public Integer getDni() {
	return dni;
  }

  public Integer getHorasTrabajadas() {
	return horasTrabajadas;
  }

  public Integer getValorPorHora() {
	return valorPorHora;
  }
}
