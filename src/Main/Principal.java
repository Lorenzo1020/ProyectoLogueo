package Main;

import java.util.Scanner;

import LogicaMetodos.Implementacion;
import Modelo.Usuarios;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = null;

		System.out.println("Hola mundo");
		System.out.println("Tienes un " + 100);

		String usuario;
		String contrasena;
		boolean estatus;

		Usuarios user;

		int menuPrin, indice;

		// Realizar la instacia de clase --- ya tenemos acceso a todo lo qque contenga
		// esa clase
		Implementacion imp = new Implementacion();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4---EDITAR");
			System.out.println("5--ELIMINAR");
			System.out.println("6---SALIR");

			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();

			switch (menuPrin) {
			case 1:
				try {
					System.out.println("Ingresa el nombre");
					lectura = new Scanner(System.in);
					usuario = lectura.nextLine();

					System.out.println("Ingresa la contraseña");
					lectura = new Scanner(System.in);
					contrasena = lectura.nextLine();

					estatus = true;

					// Crear el objeto
					user = new Usuarios(usuario, contrasena, estatus);

					// Agregar a la lista
					imp.guardar(user);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.getLocalizedMessage());
				}
				break;
			case 2:
				if (imp.mostrar().size() > 0)
					System.out.println(imp.mostrar());
				else
					System.out.println("No hay registros");
				break;
			case 3:
				try {
					System.out.println("Ingrese el indice del registro a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					user = imp.buscar(indice);
					System.out.println(user);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe");
				}
				break;
			case 4:
				// Para editar primero hay que buscar

				try {
					System.out.println("Ingrese el indice del registro a editar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					user = imp.buscar(indice);
					System.out.println(
							"Se encontro el usuario para editar " + user.getUsuario() + " Estatus " + user.isEstatus());

					// Proceso para editar
					System.out.println("Ingrese el nuevo estatus");
					lectura = new Scanner(System.in);
					estatus = lectura.nextBoolean();

					// actualizar el objeto
					user.setEstatus(estatus);
					// actualiza en la lista
					imp.editar(indice, user);
					System.out.println("Se edito");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe");
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el indice del registro a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminar
					imp.eliminar(indice);
					System.out.println("Se elimino");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro");
				}
				break;
			case 6:
				break;
			}

		} while (menuPrin < 6);

	}

}
