package MaquinaDeChiclete;

public class DispensandoChiclete implements Estados {

    
  MaquinaDeChiclete maquinaDeChiclete;

  
  public DispensandoChiclete(){

  }
  public DispensandoChiclete(MaquinaDeChiclete maquinaDeChiclete) {
  this.maquinaDeChiclete = maquinaDeChiclete;
  
}
     
   

    @Override
    public void inserirMoeda() {
        System.out.println("moeda já inserida, espere para colocar o proximo até o chiclete ser dispensado");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("não é possivel devolver a moeda, pois o chiclete já está sendo dispensado");
    }

    @Override
    public void reabastecer() {
        System.out.println("precisa reabastecer");
        maquinaDeChiclete.numeroDeChiclete -= 1;
        
        
        
       
    }

    

    
}
