package feria;

import java.util.Objects;

/**
 * Clase que representa a un socio de una caseta de feria.
 */

public class Socio
{
	private String nombre;
	private int antiguedad;

	/**
	 * Constructor de la clase Socio.
	 * 
	 * @param nombre el nombre del socio
	 * @param antiguedad la antigüedad del socio en esa caseta
	 */

	public Socio(String nombre, int antiguedad)
	{
		this.nombre = nombre;
		this.antiguedad = antiguedad;
	}

	public String toString()
	{
		return this.nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	/**
	 * Compara mi objeto con otro objeto para determinar si son iguales.
	 * Dos objetos son iguales si los socios tienen el mismo nombre.
	 * 
	 * @param obj el objeto a comparar con este objeto
	 * @return true si los objetos son iguales, false en caso contrario
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(nombre, other.nombre);
	}


	
}
