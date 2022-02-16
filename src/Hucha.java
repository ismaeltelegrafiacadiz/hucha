/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hucha;

/**
 *
 * @author ismael
 */
public class Hucha {
    
     int saldo = 0;
     // este cambio es para hacer otro commit
     
     public void introducir(int a){
     saldo+=a;
     }
     
      public void sacar(int a){
     saldo=a;
     }
     public void informar(){
         System.out.println("Hay "+saldo+" en la hucha");
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hucha P=new Hucha();
        
     P.introducir(50);   // Debe meter 50 en la hucha
     P.sacar(25);   // Debe sacar 20 de la hucha
     P.introducir(40);
      P.informar();  // Debe mostrar por pantalla "Hay 30 en la hucha";
    }
    
}
