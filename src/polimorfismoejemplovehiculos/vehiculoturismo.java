
package polimorfismoejemplovehiculos;

public class vehiculoturismo extends Vehiculos{
    private int cilindrada;
    
    public vehiculoturismo (int cilindrada, String marca , String modelo , String matricula){
        super(matricula, marca , modelo);
        this.cilindrada = cilindrada ;
    }
    
    public int getcilindrada(){
        return cilindrada;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+"\nMarca"+marca+"\nModelo"+modelo+"\nCilindraje: "+cilindrada;
    }
}