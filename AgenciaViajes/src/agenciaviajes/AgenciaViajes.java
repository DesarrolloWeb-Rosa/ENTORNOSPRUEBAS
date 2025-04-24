
package agenciaviajes;
import java.io.*;

public class AgenciaViajes {
   
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader( new InputStreamReader(System.in) ); 
    Viaje vUno, vDos;
    System.out.println("VIAJE 1");
    System.out.print("Origen: ");
    String o=br.readLine();
    System.out.print("Destino: ");
    String d=br.readLine();
    System.out.print("¿Cuantas plazas? ");
    int np=Integer.parseInt(br.readLine().trim());
    System.out.print("Precio: ");
    double pr=Double.parseDouble(br.readLine().trim());
    vUno=new Viaje(o,d,np,pr);
    System.out.println("VIAJE 2");
    System.out.print("Origen: ");
    o=br.readLine();
    System.out.print("Destino: ");
    d=br.readLine();
    System.out.print("¿Cuantas plazas? ");
    np=Integer.parseInt(br.readLine().trim());
    System.out.print("Precio: ");
    pr=Double.parseDouble(br.readLine().trim());
    vDos=new Viaje(o,d,np,pr);    
    System.out.println("DATOS VIAJE 1");   
    System.out.println(vUno.toString());
    System.out.println("DATOS VIAJE 2");   
    System.out.println(vDos.toString());
    System.out.println("¿Cuantas reservas?");    
    int r=Integer.parseInt(br.readLine().trim());
    System.out.println("¿Cuantos niños?");
    int ninyos=Integer.parseInt(br.readLine().trim());
    double importe=vUno.reservar(r, ninyos);
    if (importe==0)
        System.out.println("No suficientes plazas libres");
    else
        System.out.println("Tu reserva asciende a: "+importe);
    
    }
}
