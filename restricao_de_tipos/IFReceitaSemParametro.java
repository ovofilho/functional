package restricao_de_tipos;
@FunctionalInterface
public interface IFReceitaSemParametro {
    public void exibemsg();
    public default void exibemsgobj(Receita obj){
        System.out.println("Vc precisa sobrecarregar esse metodo");
    }
    
}
