package testPuerto;

import domain.Amarre;
import domain.Anfibio;
import domain.Barco;
import domain.Catamaran;
import domain.Cliente;
import domain.Lancha;
import domain.MotoAcuatica;
import domain.Puerto;
import domain.Velero;
import domain.Yate;
import domain.alquiler;

public class Test {

	public static void main(String[] args) {
		Puerto puerto = new Puerto(10);

		Barco velero1 = new Velero("AA121FI", 25.00, 2021);
		Barco velero2 = new Velero("AE431FS", 25.00, 2019);
		Barco catamaran1 = new Catamaran("AA875ZL", 70.00, 1995);
		Barco yate1 = new Yate("NBR378", 170.00, 2023);
		Barco motoacuatica1 = new MotoAcuatica("AF435DS", 2.00, 2017);
		Barco lancha1 = new Lancha("HFK204", 7.00, 2013);
		Barco anfibio1 = new Anfibio("FDA434", 10.00, 2020, 4, 40);
		Barco anfibio2 = new Anfibio("WER455", 11.00, 2011, 6, 60);
		Barco yate2 = new Yate("SER432", 210.00, 1997);
		Barco lancha2 = new Lancha("AE965NT", 6.00, 2007);

		Amarre amarre0 = new Amarre(0, 0, true, null);
		Amarre amarre1 = new Amarre(1, 1, true, null);
		Amarre amarre2 = new Amarre(2, 2, true, null);
		Amarre amarre3 = new Amarre(3, 3, true, null);
		Amarre amarre4 = new Amarre(4, 4, true, null);
		Amarre amarre5 = new Amarre(5, 5, true, null);
		Amarre amarre6 = new Amarre(6, 6, true, null);
		Amarre amarre7 = new Amarre(7, 7, true, null);
		Amarre amarre8 = new Amarre(8, 8, true, null);
		Amarre amarre9 = new Amarre(9, 9, true, null);

		puerto.addAmarre(amarre0);
		puerto.addAmarre(amarre1);
		puerto.addAmarre(amarre2);
		puerto.addAmarre(amarre3);
		puerto.addAmarre(amarre4);
		puerto.addAmarre(amarre5);
		puerto.addAmarre(amarre6);
		puerto.addAmarre(amarre7);
		puerto.addAmarre(amarre8);
		puerto.addAmarre(amarre9);

		Cliente cliente1 = new Cliente("Matheo", "Kovach", 4254654);
		Cliente cliente2 = new Cliente("Nicolas", "Ferrero", 41524524);
		Cliente cliente3 = new Cliente("Gian Franco", "Odoguardi", 41524792);
		Cliente cliente4 = new Cliente("Joao", "Galarza", 94915195);
		Cliente cliente5 = new Cliente("Santiago", "Rodriguez Thea", 43994385);

		alquiler alquiler0 = new alquiler(amarre0, velero1, cliente1, 12, null, true);
		alquiler alquiler1 = new alquiler(amarre1, velero2, cliente2, 12, null, true);
		alquiler alquiler2 = new alquiler(amarre2, catamaran1, cliente3, 12, null, true);
		alquiler alquiler3 = new alquiler(amarre3, motoacuatica1, cliente4, 12, null, true);
		alquiler alquiler4 = new alquiler(amarre4, lancha1, cliente5, 12, null, true);
		alquiler alquiler5 = new alquiler(amarre5, anfibio1, cliente1, 12, null, true);
		alquiler alquiler6 = new alquiler(amarre6, yate1, cliente2, 12, null, true);
		alquiler alquiler7 = new alquiler(amarre7, yate2, cliente3, 12, null, true);
		alquiler alquiler8 = new alquiler(amarre8, lancha2, cliente4, 12, null, true);
		alquiler alquiler9 = new alquiler(amarre9, anfibio2, cliente5, 12, null, true);

		alquiler0.iniciarAlquiler();
		alquiler1.iniciarAlquiler();
		alquiler2.iniciarAlquiler();
		alquiler3.iniciarAlquiler();
		alquiler4.iniciarAlquiler();
		alquiler5.iniciarAlquiler();
		alquiler6.iniciarAlquiler();
		alquiler7.iniciarAlquiler();
		alquiler8.iniciarAlquiler();
		alquiler9.iniciarAlquiler();

		puerto.addAlquiler(alquiler0);
		puerto.addAlquiler(alquiler1);
		puerto.addAlquiler(alquiler2);
		puerto.addAlquiler(alquiler3);
		puerto.addAlquiler(alquiler4);
		puerto.addAlquiler(alquiler5);
		puerto.addAlquiler(alquiler6);
		puerto.addAlquiler(alquiler7);
		puerto.addAlquiler(alquiler8);
		puerto.addAlquiler(alquiler9);


		System.out.println("LISTADO AMARRES");
		puerto.mostrarAmarres();
		System.out.println("Total amarres: " + puerto.getTotalAmarres());
		System.out.println("Ammarres ocupados: " + puerto.getAmarresOcupados());
		System.out.println("Amarres disponibles: " + puerto.getCantidadAmarresLibres());

		System.out.println("LISTADO ALQUILERES");

		puerto.mostrarAlquileresEnCurso();
		System.out.println("Alquileres realizados: " + puerto.getCantidadAlquileres());
		System.out.println("Alquileres en curso: " + puerto.getCantidadAlquileresEnCurso());

		System.out.println("Tarifas a pagar finalizados");

		alquiler3.finalizarAlquiler(23);
		alquiler5.finalizarAlquiler(30);

		System.out.println("LISTADO AMARRES");
		puerto.mostrarAmarres();
		System.out.println("Total amarres: " + puerto.getTotalAmarres());
		System.out.println("Ammarres ocupados: " + puerto.getAmarresOcupados());
		System.out.println("Amarres disponibles: " + puerto.getCantidadAmarresLibres());
		System.out.println("LISTADO ALQUILERES");
		puerto.mostrarAlquileresEnCurso();
		System.out.println("Alquileres realizados: " + puerto.getCantidadAlquileres());
		System.out.println("Alquileres en curso: " + puerto.getCantidadAlquileresEnCurso());

	}

}
