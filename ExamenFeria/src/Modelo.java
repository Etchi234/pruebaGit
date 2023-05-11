package feria;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Modelo {

	private ListaPrecios listaPrecios;
	private ListaSocios listaSocios;
	private HashMap<Socio, LinkedList<Consumicion>> listasCuentas;

	public Modelo() {

	}

	public ListaPrecios getListaPrecios() {
		return listaPrecios;
	}

	public void setListaPrecios(ListaPrecios listaPrecios) {
		this.listaPrecios = listaPrecios;
	}

	public ListaSocios getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(ListaSocios listaSocios) {
		this.listaSocios = listaSocios;
	}

	public HashMap<Socio, LinkedList<Consumicion>> getListasCuentas() {
		return listasCuentas;
	}

	public void setListasCuentas(HashMap<Socio, LinkedList<Consumicion>> listasCuentas) {
		this.listasCuentas = listasCuentas;
	}

	public boolean anadeArticulo(String denominacion, String tamano, Float precio) {

//		if(this.listaPrecios.put(new Articulo(denominacion, tamano), precio)==null) {
//			return true;
//		}
//		return false;
		

		return this.listaPrecios.put(new Articulo(denominacion, tamano), precio) == null;
	}

	public boolean borraArticulo(String nombre, String tamano) {

	//se borra el articulo de la lista de precios.
		
		 if(nombre.equals(nombre)&& (tamano.equals(tamano))) {
			 
		};
		return this.listaPrecios.remove(nombre, tamano);
		
	}
	
	//
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



	public void anadeConsumicion(Socio socio, Articulo articulo,int cantidad) {
		
		listasCuentas.put(socio, new LinkedList<Consumicion>());
		
		
		
	}
	
	//consumiciones pendientes de cada socio.
	//me tiene que dar una lista de consumiciones del socio
	//pasado por parametro.
	
	
	public LinkedList<Consumicion> getListaConsumiciones(Socio socio) {
		
		return listasCuentas.get(socio);
	}
	
	//cambio String por un float porque deduzco k tengo k calcular el total de la cuenta 
	//del socio k m pasan por parametro
	
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


