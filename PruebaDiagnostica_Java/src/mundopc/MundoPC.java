package mundopc;
import com.gm.mundopc.*;

public class MundoPC {

	public static void main(String[] args) {
		
		//DispositivoEntrada dispositivoEntrada = new DispositivoEntrada("USB", "Samsung");
		//System.out.println(dispositivoEntrada.ToString());
		
		//Raton raton = new Raton(1,"USB", "Samsung", 10);
		Raton raton = new Raton("USB", "Samsung");
		Raton raton1 = new Raton("USB", "LG");
		Raton raton2 = new Raton("Inalambrico", "Logitech");
		//System.out.println(raton.ToString());
		//System.out.println(raton1.ToString());
		
		Teclado teclado = new Teclado("USB", "Samsung");
		Teclado teclado1 = new Teclado("USB", "LG");
		Teclado teclado2 = new Teclado("Inalambrico", "Asus");
		//System.out.println(teclado.ToString());
		//System.out.println(teclado1.ToString());
		
		Monitor monitor = new Monitor("Asus", 15.5);
		Monitor monitor1 = new Monitor("LG", 18.5);
		Monitor monitor2 = new Monitor("Sony", 20.0);
		//System.out.println(monitor.ToString());
		//System.out.println(monitor1.ToString());
		
		Computadora computadora = new Computadora("PCGamer", monitor, teclado, raton);
		Computadora computadora1 = new Computadora("Notebook", monitor1, teclado1, raton1);
		Computadora computadora2 = new Computadora("Home", monitor2, teclado2, raton2);
		//System.out.println(computadora.ToString());
		
		Orden orden = new Orden();
		orden.agregarComputadora(computadora);
		orden.agregarComputadora(computadora1);
		orden.agregarComputadora(computadora2);
		orden.MostrarOrden();
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadora);
		orden1.MostrarOrden();
	}

}
