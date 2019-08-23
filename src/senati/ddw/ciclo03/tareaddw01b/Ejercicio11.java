package senati.ddw.ciclo03.tareaddw01b;

import java.util.Scanner;

public class Ejercicio11 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduce el número de ventas");
		int numVentas=sc.nextInt();
		int sumaVentas=0;
		for (int i=0;i<numVentas;i++){
		System.out.println("Introduce el precio de la venta "+(i+1));
		int venta=sc.nextInt();
		sumaVentas=sumaVentas+venta;
		}
		System.out.println(sumaVentas);
		}
	}

