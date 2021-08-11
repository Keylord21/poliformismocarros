
package polimorfismoejemplovehiculos;

public class Main {
    public static void main(String[] args){
        Vehiculos misVehiculos [] = new Vehiculos[4];
        
        misVehiculos[0] = new Vehiculos("GH7","AUDI","AT");
        misVehiculos[1] = new vehiculocarga(900,"GH7","AUDI","AT");
        misVehiculos[2] = new Vehiculodeportivo(2,"GH7","AUDI","AT");
        misVehiculos[3] = new vehiculoturismo(1800,"GH7","AUDI","AT");
        
        for(Vehiculos vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }

    }
}
