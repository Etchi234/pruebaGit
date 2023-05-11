package feria;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Clase que representa la gestión de una caseta.
*/

public class Modelo {

	private ListaPrecios listaPrecios;
	private ListaSocios listaSocios;
	private HashMap<Socio, LinkedList<Consumicion>> listasCuentas;

    /**
     * Constructor vacío de la clase Modelo.
     */
	public Modelo() {

	}

	/**
     * Método para obtener la lista de precios.
     *
     * @return la lista de precios.
     */

	public ListaPrecios getListaPrecios() {
		return listaPrecios;
	}

	/**
     * Método para actualizar la lista de precios.
     *
     * @param listaPrecios la lista de precios a actualizar.
     */

	public void setListaPrecios(ListaPrecios listaPrecios) {
		this.listaPrecios = listaPrecios;
	}

	/**
     * Método para obtener la lista de socios.
     *
     * @return la lista de socios.
     */

	public ListaSocios getListaSocios() {
		return listaSocios;
	}

	/**
     * Método para actualizar la lista de socios.
     *
     * @param listaPrecios la lista de socios a actualizar.
     */

	public void setListaSocios(ListaSocios listaSocios) {
		this.listaSocios = listaSocios;
	}

	/**
     * Método para obtener la lista de consumisiones.
     *
     * @return la lista de consumisiones del socio.
     */

	public HashMap<Socio, LinkedList<Consumicion>> getListasCuentas() {
		return listasCuentas;
	}

	public void setListasCuentas(HashMap<Socio, LinkedList<Consumicion>> listasCuentas) {
		this.listasCuentas = listasCuentas;
	}

	/**
     * Método para añadir un nuevo artículo a la lista de precios.
     *
     * @param denominacion el nombre del artículo a añadir.
     * @param tamano el tamaño del artículo a añadir.
     * @param precio el precio del artículo a añadir.
     * @return true si se añadió correctamente, false en caso contrario.
     */

	public boolean anadeArticulo(String denominacion, String tamano, Float precio) {

//		if(this.listaPrecios.put(new Articulo(denominacion, tamano), precio)==null) {
//			return true;
//		}
//		return false;
		

		return this.listaPrecios.put(new Articulo(denominacion, tamano), precio) == null;
	}

	/**
     * Método para borrar un artículo de la lista de precios.
     *
     * @param nombre el nombre del artículo a borrar.
     * @param tamano el tamaño del artículo a borrar.
     * @return true si se borró correctamente, false en caso contrario.
     */

	public boolean borraArticulo(String nombre, String tamano) {

	//se borra el articulo de la lista de precios.
		
		 if(nombre.equals(nombre)&& (tamano.equals(tamano))) {
			 
		};
		return this.listaPrecios.remove(nombre, tamano);
		
	}
	
		/**
     * Método para comprobar si hay una cuenta pendiente con un artículo y tamaño específicos.
     *
     * @param art el nombre del artículo a comprobar.
     * @param tamano el tamaño del artículo a comprobar.
     * @return true si hay una cuenta pendiente, false en caso contrario.
     */
	public boolean hayCuentaPendienteConEseArticulo(String art,String tamano) {
		Articulo artBuscado= new Articulo(art, tamano);
		boolean estaPendiente = false;
		
		/*
		 * vamos a recorrer consumisiones que estan pendientes 
		 * entramos en el linkedList y lo recorremos (le decimos que recorremos los valores
		 * del linkelist porque en el mapa es lo que queremos) eso nos da
		 * una lista con articulo y cantidad 
		 */
		for (LinkedList<Consumicion> listaConsumiciones : this.listasCuentas.values()) {
			/*
			 * vamos a recorrer cada linea de la lista de consumiciones
			 */
			for (Consumicion c : listaConsumiciones) {
				if(c.getArticulo().equals(artBuscado)) {
	//if(c.getArticulo().getDenominacion().equals(art) && c.getArticulo().getTamano()==tamano)
					estaPendiente=true;
					
				}
				
			}
		}
	
	
		return estaPendiente;
	}

		/**
		Agrega una nueva consumición a la cuenta del socio pasado como parametro.
		@param socio el socio al que se le añadirá la consumición
		@param articulo el artículo pedido
		@param cantidad la cantidad pedida del artículo
		*/

	public void anadeConsumicion(Socio socio, Articulo articulo,int cantidad) {
		
		listasCuentas.put(socio, new LinkedList<Consumicion>());
		
		
		
	}
	
	//consumiciones pendientes de cada socio.
	//me tiene que dar una lista de consumiciones del socio
	//pasado por parametro.
	
	/**
	 * Devuelve la lista de consumiciones del socio pasado por parámetro.
	 * 
	 * @param socio el socio cuya lista de consumiciones se desea obtener
	 * @return una lista de tipo Consumicion que representan las consumiciones del socio pasado por parámetro.
	 * Si el socio no tiene ninguna consumición registrada, se devuelve null.
	 */
	
	public LinkedList<Consumicion> getListaConsumiciones(Socio socio) {
		
		return listasCuentas.get(socio);
	}
	
	//cambio String por un float porque deduzco k tengo k calcular el total de la cuenta 
	//del socio k m pasan por parametro

	/**
        * Calcula el total de la cuenta de un socio.
		* @param socio el socio del que se quiere calcular el total de la cuenta.
		* @return el total de la cuenta del socio con la lista de artículos pensientes y la suma de la cantidad que le queda por pagar.
		*/

	
	public String calculaTotalCuenta(Socio socio) {
		
		String resultado="";
		Float f=0.0f;
		
		if(this.listasCuentas.get(socio)!= null) {
			
		
		for (Consumicion c : getListaConsumiciones(socio)) {
			
		resultado += resultado + listaPrecios.get(c.getArticulo())*c.getCantidad();
		
		}
		
			
		}
		return resultado;
		
		
	}

	
}


