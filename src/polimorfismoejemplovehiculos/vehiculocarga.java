
package polimorfismoejemplovehiculos;


public class vehiculocarga extends Vehiculos{
    private int carga;
    
    public vehiculocarga (int carga, String marca , String modelo , String matricula){
        super(matricula, marca , modelo);
        this.carga = carga ;
    }
    
    public int getcarga(){
        return carga;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca"+marca+"\nModelo"+modelo+"\nCarga: "+carga;
    }
}
