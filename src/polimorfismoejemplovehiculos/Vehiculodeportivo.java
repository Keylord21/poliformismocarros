
package polimorfismoejemplovehiculos;
public class Vehiculodeportivo  extends Vehiculos{
    private int nPuertas;
    
    public Vehiculodeportivo (int nPuertas, String marca , String modelo , String matricula){
        super(matricula, marca , modelo);
        this.nPuertas = nPuertas ;
    }
    
    public int getnPuertas(){
        return nPuertas;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca"+marca+"\nModelo"+modelo+"\nNumero de Puertas: "+nPuertas;
    }
}
