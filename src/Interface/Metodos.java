package Interface;

import java.util.List;

import Modelo.Usuarios;

//interface es una plantilla para declarar metodos vacios(abstractos)
public interface Metodos {
	
	//Metodos:
	//1--Procedimientos(no tienen valor de retorno)
		//Sintaxis: modificadorAcceso void(vacio) nombreProc(parametros o argumentos / valores de entrada);
	//2--Funciones(siempre retornan algo)
		//Sintaxis: modificadorAcceso tipoRetorno(valor de salida) nombreFunc(parametros o argumentos / valores de entrada);
	
	public void guardar(Usuarios usuario);
	
	public List<Usuarios> mostrar();
	
	public Usuarios buscar(int indice);
	
	public void editar(int indice, Usuarios usuario);
	
	public void eliminar(int indice);
	

}
