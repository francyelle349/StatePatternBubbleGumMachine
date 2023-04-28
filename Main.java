package MaquinaDeChiclete;

public class Main {
    public static void main(String[] args){
        
        MaquinaDeChiclete maquinaDeChiclete = new MaquinaDeChiclete();

        System.out.println("-----------SEM MOEDA------------");
        maquinaDeChiclete.setEstado(new SemMoeda(maquinaDeChiclete));
        maquinaDeChiclete.ejetarMoeda();
       
    
        

        System.out.println("------------COM MOEDA--------------");
        maquinaDeChiclete.setEstado(new MoedaInserida(maquinaDeChiclete));
        maquinaDeChiclete.ejetarMoeda();
        maquinaDeChiclete.ejetarMoeda();


       
        System.out.println("---------DISPENSANDO CHICLETE--------------");
        maquinaDeChiclete.setEstado(new DispensandoChiclete(maquinaDeChiclete));
        maquinaDeChiclete.reabastecer();
        
        

       
    }
    
}
