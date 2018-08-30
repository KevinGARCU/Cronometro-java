package cronometro.Unidades;

public class Unidades {
    
    int valor;
    int tope;
    
    public int adelante(){
        
        if(tope==valor){
            valor=0;
        }
        else{
            valor++;
        }
        
        return valor;
    }
    
    public int reversa(){
        
        if(valor==0){
            valor=tope;
        }
        else{
            valor--;
        }
        
        return valor;
    }
    
}
