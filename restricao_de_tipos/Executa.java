package restricao_de_tipos;

public class Executa {
    public static void main(String[] args) {
        Receita exec = new Receita("Aluguel", 1000, 5, 3);
        IFReceita imprime = new IFReceita() {
            @Override
            public void imprimir(Receita receita){
                System.out.println(receita.item + " " + receita.preco);

            }
        };
        IFReceita imprime3 = rec -> System.out.println(
            rec.preco
        );
       

        imprime.imprimir(exec);
        System.out.println(imprime.computeTotal(exec));
        imprime3.imprimir(exec);

        //Exemplo de lambda sem parametro
        IFReceitaSemParametro imprime4 = () -> System.out.println("Valor de resposta personalizado");
        imprime4.exibemsg();
    }
}
