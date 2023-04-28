package MaquinaDeChiclete;

public class MoedaInserida implements Estados {

  MaquinaDeChiclete maquinaDeChiclete;

    public MoedaInserida(){
    
    }
    
    public MoedaInserida(MaquinaDeChiclete maquinaDeChiclete) {
    this.maquinaDeChiclete = maquinaDeChiclete;
  }

    @Override
    public void inserirMoeda() {
        System.out.println("A moeda já está inserida, retire seu chiclete");
        
    }

    @Override
    public void ejetarMoeda() {
      System.out.println("Ejetando moeda...");
      maquinaDeChiclete.setEstado(new SemMoeda(maquinaDeChiclete));
      // ir para o estado sem moeda
    }

    @Override
    public void reabastecer() {
      System.out.println("Não precisa reabastecer");
     
    }

   
    

    }
    

