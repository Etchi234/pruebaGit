package feria;

import java.util.Objects;

public class Socio
{
	private String nombre;
	private int antiguedad;

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
