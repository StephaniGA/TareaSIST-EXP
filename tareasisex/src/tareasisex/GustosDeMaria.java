/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasisex;

/**
 *
 * @author stephany GA
 */
public class GustosDeMaria {
    
    int sexo;
    int gustos;
    String nombre;

    public GustosDeMaria(int sexo, int gustos, String nombre) {
        this.sexo = sexo;
        this.gustos = gustos;
        this.nombre = nombre;
    }
    
    public void Resultado (){
        System.out.println("Maria solo estima a "+nombre+" por que es del sexo masculino y le gusta bailar");
    }
}
