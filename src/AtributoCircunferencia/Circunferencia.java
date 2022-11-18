package AtributoCircunferencia;

import java.util.Scanner;

public class Circunferencia {

    private double Radio;

    //metodo constructor por parametro
    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }
    //metodo constructor vacio
    public Circunferencia() {
    }
    //metodo get
    public double getRadio() {
        return Radio;
    }
    //metodo set
    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
   
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio ");
        Radio=leer.nextDouble();
    }
    
    public double area (double Radio){
        double area = Math.PI*Radio*Radio;
        return area;
    }
    
    public double perimetro (double Radio){
        double perimetro = 2 * Math.PI * Radio;
        return perimetro;
    }
}
