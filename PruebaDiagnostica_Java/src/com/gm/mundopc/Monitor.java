package com.gm.mundopc;

public class Monitor {

	// VARIABLES DE CLASE
	   private int idMonitor;
	   private String marca;
	   private Double tamaño;
	   private static int contadorMonitores = 0;
	   
	// CONSTRUCTOR QUE INICIALIZA LAS VARIABLES DE CLASE
	   public Monitor() {
		   
	   }
	   
	   public Monitor(String marca, Double tamaño) {
		   this.setMarca(marca);
		   this.setTamaño(tamaño);
		   setContadorMonitores();
		   this.setIdMonitor();
		   
	   }

	// METODOS GETTER Y SETTER PARA PODER RECUPERAR O CAMBIAR
	   // LOS DATOS DE LAS VARIABLES DE CLASE
	   
		public int getIdMonitor() {
			return idMonitor;
		}
	
		public void setIdMonitor() {
			this.idMonitor = contadorMonitores;;
		}
	
		public String getMarca() {
			return marca;
		}
	
		public void setMarca(String marca) {
			this.marca = marca;
		}
	
		public Double getTamaño() {
			return tamaño;
		}
	
		public void setTamaño(Double tamaño) {
			this.tamaño = tamaño;
		}
	
		public int getContadorMonitores() {
			return contadorMonitores;
		}
	
		public static void setContadorMonitores() {
			contadorMonitores++;
		}
		   
		public String ToString() {
			String msg = "";
			msg = "ID Monitor: " + this.getIdMonitor() + " | Marca: " + this.getMarca();
			msg += " | Tamaño: " + this.getTamaño() + " | Contador Monitores: " + this.getContadorMonitores();
			return msg;
	   }
}
