package feria;


public class Articulo implements Comparable<Articulo>
{
	private String denominacion;
	private String tamano;

	/**
	 * Constructor de la clase Artículo.
	 * 
	 * @param denominacion nombre del artículo.
	 * @param tamaño tamaño del artículo.
	 */
	
	public Articulo(String denominacion, String tamano) 
	{
		super();
		this.denominacion = denominacion;
		this.tamano = tamano;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denominacion == null) ? 0 : denominacion.hashCode());
		result = prime * result + ((tamano == null) ? 0 : tamano.hashCode());
		return result;
	}

	/**
	 * Compara mi objeto con otro objeto para determinar si son iguales.
	 * Dos objetos son iguales si los artículos tienen el mismo nombre y el mismo tamaño.
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
		Articulo other = (Articulo) obj;
		if (denominacion == null) {
			if (other.denominacion != null)
				return false;
		} else if (!denominacion.equals(other.denominacion))
			return false;
		if (tamano == null) {
			if (other.tamano != null)
				return false;
		} else if (!tamano.equals(other.tamano))
			return false;
		return true;
	}

	
	/**

	* Compara mi artículo con otro objeto artículo. La comparación se realiza primero por la denominación
	* y luego por el tamaño en caso de que la denominación sea igual.
	* @param otro El otro objeto artículo a comparar con mi objeto artículo.
	* @return Un valor negativo si este artículo es menor que otro, cero si son iguales, o un valor positivo si este
	* artículo es mayor que otro.
	*/

public int compareTo(Articulo otro)
{
	int res;
	
	res = this.denominacion.compareTo(otro.denominacion);
	if(res == 0)
		res = this.tamano.compareTo(otro.tamano);
	return res;
}

public String toString()
{
	return this.denominacion+" "+this.tamano;
}

/**
     * Método para obtener el nombre del artículo.
     *
     * @return el nombre del artículo.
     */
public String getDenominacion() {
	return denominacion;
}

/**
     * Método para actualizar el nombre del artículo.
     *
     * @param listaPrecios el nombre del artículo a actualizar.
     */

public void setDenominacion(String denominacion) {
	this.denominacion = denominacion;
}

/**
     * Método para obtener el tamaño del artículo.
     *
     * @return el tamaño del artículo.
     */

public String getTamano() {
	return tamano;
}

/**
     * Método para actualizar el tamño del artículo.
     *
     * @param listaPrecios el tamaño del artículo a actualizar.
     */
public void setTamano(String tamano) {
	this.tamano = tamano;
}

}
