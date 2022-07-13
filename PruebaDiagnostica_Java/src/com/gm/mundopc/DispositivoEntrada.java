package com.gm.mundopc;

public class DispositivoEntrada {
	// VARIABLES DE CLASE
	   private String tipoEntrada;
	   private String marca;
	   
	// CONSTRUCTOR QUE INICIALIZA LAS VARIABLES DE CLASE
	   public DispositivoEntrada(String tipoEntrada, String marca) {
		   this.setTipoEntrada(tipoEntrada);
		   this.setMarca(marca);
	   }
	
	// METODOS GETTER Y SETTER PARA PODER RECUPERAR O CAMBIAR
	   // LOS DATOS DE LAS VARIABLES DE CLASE

	   public String getTipoEntrada() {
	      return tipoEntrada;
	   }

	   public void setTipoEntrada(String tipoEntrada) {
		   this.tipoEntrada = tipoEntrada;
	   }
	   
	   public String getMarca() {
		   return marca;
	   }

	   public void setMarca(String marca) {
		   this.marca = marca;
	   }
	   
	   public String ToString() {
		   return "Tipo Entrada: " + this.getTipoEntrada() + " | Marca: " + this.getMarca();
	   }
}
