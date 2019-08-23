package senati.ddw.ciclo03.tareaddw01b;

import javax.swing.JOptionPane;

public class Ejercicio008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto=JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
		 //Pasamos el String a int
		 int codigo=Integer.parseInt(texto);
		 //Pasamos el codigo a caracter
		 char caracter=(char)codigo;
		 System.out.println(caracter);
		 } 
	}

