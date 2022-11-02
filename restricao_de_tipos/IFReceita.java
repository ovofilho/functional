/*Interface funcional criada para utilizar a classe Receita
 * 
 */
package restricao_de_tipos;

@FunctionalInterface
public interface IFReceita {
    public void imprimir(Receita receita);
    public default float computeTotal(Receita receita){
        float precoDesconto = calculaDesconto(receita);
        return precoDesconto + (precoDesconto * receita.taxa);
    }

    private float calculaDesconto(Receita receita){
        return receita.preco - (receita.preco * receita.desconto);
    }

}
