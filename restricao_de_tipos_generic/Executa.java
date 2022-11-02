package restricao_de_tipos_generic;

public class Executa {
    public static void main(String[] args) {
        Receita exec = new Receita("Aluguel", 1000, 5, 3);
        IFReceita<Receita> imprime = new IFReceita() {
            @Override
            public void imprimir(Receita receita){
                System.out.println(receita.item + " " + receita.preco);

            }
        };
        IFReceita<Receita> imprime3 = rec -> System.out.println(
            rec.preco
        );
        ReceitaEspecial recEsp = new ReceitaEspecial(exec, 50);

        IFReceita<Receita> recEspecial = rec -> System.out.println(rec.preco);

        recEspecial.imprimir(recEsp);

        imprime.imprimir(exec);
        System.out.println(imprime.computeTotal(exec));
        imprime3.imprimir(exec);

        //Exemplo de lambda sem parametro
        IFReceitaSemParametro imprime4 = () -> System.out.println("Valor de resposta personalizado");
        imprime4.exibemsg();
    }
}
