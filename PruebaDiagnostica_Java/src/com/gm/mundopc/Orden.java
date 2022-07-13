package com.gm.mundopc;

public class Orden {
	
	// VARIABLES DE CLASE
	   private int idOrden;
	   private int maxComputadoras = 5;
	   private Computadora[] computadora = new Computadora[this.maxComputadoras];
	   private static int contadorOrdenes = 0;
	   private static int contadorComputadoras = 0;
	   
	   
	// CONSTRUCTOR QUE INICIALIZA LAS VARIABLES DE CLASE
	   public Orden() {
		   setContadorOrdenes();
		   this.setIdOrden();
		   contadorComputadoras=0;
	   }
	   
	// METODOS GETTER Y SETTER PARA PODER RECUPERAR O CAMBIAR
	   // LOS DATOS DE LAS VARIABLES DE CLASE
	   
		public int getIdOrden() {
			return idOrden;
		}
		
		public void setIdOrden() {
			this.idOrden = contadorOrdenes;
		}
		
		public Computadora[] getComputadora() {
			return computadora;
		}
		
		public void setComputadora(Computadora[] computadora) { 
			this.computadora = computadora;
		}
		
		public void agregarComputadora(Computadora computadora) {
			if(contadorComputadoras < this.maxComputadoras) {
				this.computadora[contadorComputadoras] = computadora;
				setContadorComputadoras();
			}
			else
			{
				System.out.println("Error, maximo de computadoras alcanzado");
			}
		}
		
		public int getContadorOrdenes() {
			return contadorOrdenes;
		}
		
		public static void setContadorOrdenes() {
			contadorOrdenes++;
		}
		
		public int getContadorComputadoras() {
			return contadorComputadoras;
		}
		
		public static void setContadorComputadoras() {
			contadorComputadoras++;
		}
		
		public int getMaxComputadoras() {
			return maxComputadoras;
		}
		
		public void setMaxComputadoras(int maxComputadoras) {
			this.maxComputadoras = maxComputadoras;
		}
		
		public void MostrarOrden() {
			String msg = "";
			msg = "ID Orden: " + this.getIdOrden() + "\n";
			for(int i = 0; i < contadorComputadoras; i++) {
				msg += "\n" + this.getComputadora()[i].ToString() + "\n";
			}
			
			System.out.println(msg);
		}
}
