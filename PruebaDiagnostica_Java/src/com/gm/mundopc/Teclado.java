package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{

	// VARIABLES DE CLASE
	   private int idTeclado;
	   private static int contadorTeclados = 0;
	   
	// CONSTRUCTOR QUE INICIALIZA LAS VARIABLES DE CLASE
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		setContadorTeclados();
		this.setIdTeclado();
	}

	// METODOS GETTER Y SETTER PARA PODER RECUPERAR O CAMBIAR
	   // LOS DATOS DE LAS VARIABLES DE CLASE
	
	public int getIdTeclado() {
		return idTeclado;
	}

	public void setIdTeclado() {
		this.idTeclado = contadorTeclados;
	}

	public static int getContadorTeclados() {
		return contadorTeclados;
	}

	public static void setContadorTeclados() {
		contadorTeclados++;
	}
	
	public String ToString() {
		return "ID Teclado: " + this.getIdTeclado() + " | " + super.ToString() + " | Contador Teclados: " + getContadorTeclados();
   }
}
