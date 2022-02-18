/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasisex;
import javax.swing.Spring;
/**
 *
 * @author stephany GA
 */
public class Tareasisex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //las personas segun lo que gusta y su sexo se van a idenficar por los siguientes numeros
        // Homre =1, Mujer= 2 , Bailar= 3, Comer= 4
         
        GustosDeMaria pers1= new GustosDeMaria (1, 3, "Pedro");
        GustosDeMaria pers2= new GustosDeMaria (1, 3, "Luis");
        GustosDeMaria pers3= new GustosDeMaria (1, 4, "Juan");
        GustosDeMaria pers4= new GustosDeMaria (1, 4, "Mateo");
        GustosDeMaria pers5= new GustosDeMaria (2, 4, "Maria");
        GustosDeMaria pers6= new GustosDeMaria (2, 4, "Ana");
        
        
        // se pide como requisitos que sea homre y le guste bailar
        
        //Persona 1:Pedro
        if (pers1.sexo==1 && pers1.gustos==3) {
            pers1.Resultado();
            
        //Persona 2:Luis
        }if(pers2.sexo==1 && pers2.gustos==3){
            pers2.Resultado();
        
         //Persona 3:Juan
        }if(pers3.sexo==1 && pers3.gustos==3){
          pers3.Resultado();
         
         //Persona 4:Mateo
        }if(pers4.sexo==1 && pers4.gustos==3){
         pers4.Resultado();
         
        //Persona 5:Maria
    
        }if(pers5.sexo==1 && pers5.gustos==3){
         pers5.Resultado();
         
        //Persona 6:Ana 
        }if(pers6.sexo==1 && pers6.gustos==3){
         pers6.Resultado();
     }
        
        
    
    }
}