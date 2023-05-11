package feria;


public class Consumicion
{
	//articulo y cantidad pendientes
	private Articulo articulo;
	private int cantidad;

	/**
	 * Constructor de la clase Consumición.
	 * 
	 * @param articulo con su nombre y tamaño.
	 * @param cantidad la cantidad del artículo consumidos por el socio.
	 */

	public Consumicion(Articulo articulo, int cantidad)
	{
		this.articulo = articulo;
		this.cantidad = cantidad;
	}

	/**
     * Método para obtener el artículo.
     *
     * @return el artículo.
     */

	public Articulo getArticulo() {
		return articulo;
	}

	/**
     * Método para actualizar el artículo.
     *
     * @param listaPrecios el artículo a actualizar.
     */

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	/**
     * Método para obtener la cantidad consumida.
     *
     * @return la cantidad consumida.
     */

	public int getCantidad() {
		return cantidad;
	}

	/**
     * Método para actualizar la cantidad.
     *
     * @param listaPrecios la cantidad a actualizar.
     */
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "    " + articulo + "\t" + cantidad ;
	}




}
