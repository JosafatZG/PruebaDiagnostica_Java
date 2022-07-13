package com.gm.mundopc;

public class Raton extends DispositivoEntrada{

	// VARIABLES DE CLASE
	   private int idRaton;
	   private static int contadorRatones = 0;
	   
	// CONSTRUCTOR QUE INICIALIZA LAS VARIABLES DE CLASE
	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		setContadorRatones();
		this.setIdRaton();
	}

	// METODOS GETTER Y SETTER PARA PODER RECUPERAR O CAMBIAR
	   // LOS DATOS DE LAS VARIABLES DE CLASE
	
	public int getIdRaton() {
		return idRaton;
	}

	public void setIdRaton() {
		this.idRaton = contadorRatones;
	}

	public static int getContadorRatones() {
		return contadorRatones;
	}

	public static void setContadorRatones() {
		contadorRatones++;	
	}
	
	public String ToString() {
		return "ID Raton: " + this.getIdRaton() + " | " + super.ToString() + " | Contador Ratones: " + getContadorRatones();
	   }
}
