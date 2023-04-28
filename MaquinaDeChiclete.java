package MaquinaDeChiclete;


public class MaquinaDeChiclete {
    Estados moedaInserida;
    Estados semMoeda;

    int numeroDeChiclete = 100;
   

  
    Estados estado;

   public MaquinaDeChiclete(){
    
   }
    
    

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public void inserirMoeda(){
        estado.inserirMoeda();
        
    }
    public void ejetarMoeda(){
        estado.ejetarMoeda();

    }
    public void reabastecer(){
        estado.reabastecer();
    }
       
           
       
    
        
           
        
        
    
    public int getNumeroDeChiclete() {
        return numeroDeChiclete;
    }
    public void setNumeroDeChiclete(int numeroDeChiclete) {
        this.numeroDeChiclete = numeroDeChiclete;
    }
    
}


