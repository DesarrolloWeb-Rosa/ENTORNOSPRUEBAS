//COMENTARIOS AÑADIDIOS
package agenciaviajes;

public class Viaje {
    private String origen;
    private String destino;
    private String codigo;
    private int plazas;
    private int reservas;
    private double precio;
    private static int numViajes=0;
    private static double totalRec=0;
    
    public Viaje(String o, String d, int np, double pr){
        numViajes++;
        origen=o.toUpperCase();
        destino=d.toUpperCase();
        plazas=np;
        reservas=0;
        precio=pr;
        codigo=origen.substring(0, 2)+destino.substring(0, 2)+ numViajes;
    }
    
    public double reservar(int np, int ninyos){
        if (np<= (plazas-reservas) ){
           reservas=reservas+np; //reservas+=np;
           double total=(np-ninyos)*precio+ ninyos*(precio-precio*0.20);
           totalRec+=total;
           return total; 
        }
        else
           return 0; //no hay suficientes plazas        
    }
    
    public boolean setPlazas(int p){
        if (p>=reservas)
        {
            plazas=p;
            return true;
        }
        else
            return false;
    }
    
    public String toString(){
        String cadena= "Origen: "+origen+"\n"+"Destino: "+destino+"\n";
        cadena+="Código: "+codigo+"\n"+"Plazas: "+plazas+"\n"+"Precio: "+precio;
        cadena+="\n"+"Reservas: "+reservas;
        return cadena;
    }
}
