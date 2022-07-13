package com.gm.mundopc;

public class Computadora {
	// VARIABLES DE CLASE
	   private int idComputadora;
	   private String nombre;
	   private Monitor monitor;
	   private Teclado teclado;
	   private Raton raton;
	   private static int contadorComputadoras = 0;
	   
	// CONSTRUCTOR QUE INICIALIZA LAS VARIABLES DE CLASE
	   public Computadora() {
		   
	   }
	   
	   public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
	      setContadorComputadoras();
		  this.setIdComputadora();
	      this.setNombre(nombre);
	      this.setMonitor(monitor);
	      this.setTeclado(teclado);
	      this.setRaton(raton);
	   }
	   
	// METODOS GETTER Y SETTER PARA PODER RECUPERAR O CAMBIAR
	   // LOS DATOS DE LAS VARIABLES DE CLASE

		public int getIdComputadora() {
			return idComputadora;
		}
	
		public void setIdComputadora() {
			this.idComputadora = contadorComputadoras;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Monitor getMonitor() {
			return monitor;
		}

		public void setMonitor(Monitor monitor) {
			this.monitor = monitor;
		}

		public Teclado getTeclado() {
			return teclado;
		}

		public void setTeclado(Teclado teclado) {
			this.teclado = teclado;
		}

		public Raton getRaton() {
			return raton;
		}

		public void setRaton(Raton raton) {
			this.raton = raton;
		}
		
		public static int getContadorComputadoras() {
			return contadorComputadoras;
		}

		public static void setContadorComputadoras() {
			contadorComputadoras++;
		}
	   
	   public String ToString() {
		   String msg = "";
		   msg = "ID Computadora: " + this.getIdComputadora() + " | Nombre: " + this.getNombre() + "\n";
		   msg += this.monitor.ToString() + "\n" + this.teclado.ToString() + "\n" + this.raton.ToString();
		   return msg;
	   }
}
