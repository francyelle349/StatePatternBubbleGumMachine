package MaquinaDeChiclete;

public class SemMoeda implements Estados {

    MaquinaDeChiclete maquinaDeChiclete;

    public SemMoeda(MaquinaDeChiclete maquinaDeChiclete) {
        this.maquinaDeChiclete = maquinaDeChiclete;
    }

    @Override
    public void inserirMoeda() {
       System.out.println("Aguardando uma moeda");
    }

    @Override
    public void ejetarMoeda() {
       System.out.println("Não há moeda para ser retirada");
       maquinaDeChiclete.setEstado(new SemMoeda(maquinaDeChiclete));


    }

    @Override
    public void reabastecer() {
       System.out.println("Não pode ser reabastecida pois a maquina está sem moeda");
    }

    
    
}
