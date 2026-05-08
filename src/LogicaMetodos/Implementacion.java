package LogicaMetodos;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos;
import Modelo.Usuarios;

public class Implementacion implements Metodos {

	private List<Usuarios> lista = new ArrayList<Usuarios>();

	// Validar que el usuario no se repita

	@Override // Polimorfismo de sobreescritura
	public void guardar(Usuarios usuario) {
		// TODO Auto-generated method stub

		boolean bandera = false;

		for (Usuarios user : lista) {
			if (user.getUsuario().equals(usuario.getUsuario())) {
				System.out.println("No se guardo ya existe ese usuario");
				bandera = true;
				break;
			}
		}

		if (!bandera) {
			lista.add(usuario);
			System.out.println("Se guardo correctamente");
		}

	}

	@Override
	public List<Usuarios> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Usuarios buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Usuarios usuario) {
		// TODO Auto-generated method stub
		lista.set(indice, usuario);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

}
