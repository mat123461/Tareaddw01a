package senati.ddw.ciclo03.tareaddw01b;

import javax.swing.JOptionPane;

public class Ejercicio007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto=JOptionPane.showInputDialog("Introduce un numero");
		//Pasamos el String a int
		int numero=Integer.parseInt(texto);
		//Comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
		if (numero%2==0){
		System.out.println("El numero "+numero+" es divisible entre 2");
	}
		else{
		System.out.println("El numero "+numero+" no es divisible entre 2");
		}
		}
}
