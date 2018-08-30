package cronometro;
 
import cronometro.Unidades.Horas;
import cronometro.Unidades.minutos;
import cronometro.Unidades.Segundos;
import cronometro.Unidades.Decimas;
import cronometro.Unidades.Centecimas;
import cronometro.Unidades.Milesimas;

public class Cronometro {
  
    public static void main(String[] args) {
        
        Horas hor = new Horas();
        minutos min = new minutos();
        Segundos seg = new Segundos();
        Decimas dec = new Decimas();
        Centecimas cent= new Centecimas();
        Milesimas mil = new Milesimas();
        
        int horAux;
        int minAux;
        int segAux;
        int decAux;
        int centAux;
        int milAux;
        
        System.out.println("0 : 0 : 0");
        
        //Adelante
       
       for(int i=0; i<=24; i++){
           horAux = hor.adelante();
           for(int j=0; j<=60; j++){
               minAux = min.adelante();
               for(int k=0; k<=60; k++){
                   segAux = seg.adelante();
                   for(int l=0; l<=10; l++){
                       decAux = dec.adelante();
                       for(int m=0; m<=10; m++){
                          centAux = cent.adelante();
                          for(int n=0; n<=10; n++){
                              milAux = mil.adelante();
                              System.out.println(horAux+" : "+minAux+" : "+segAux+" : "+decAux+" : "+centAux+" : "+" : "+milAux);
                          }
                       }
                   }
               }
           }
       }
       
       //Reversa
         
       for(int i=24; i>=0; i--){
           horAux = hor.adelante();
           for(int j=60; j>=0; j--){
               minAux = min.adelante();
               for(int k=60; k>=0; k--){
                   segAux = seg.adelante();
                   for(int l=10; l>=0; l--){
                       decAux = dec.adelante();
                       for(int m=10; m>=0; m--){
                          centAux = cent.adelante();
                          for(int n=10; n>=0; n--){
                              milAux = mil.adelante();
                              System.out.println(horAux+" : "+minAux+" : "+segAux+" : "+decAux+" : "+centAux+" : "+" : "+milAux);
                          }
                       }
                   }
               }
           }
       }
    }
    
}
