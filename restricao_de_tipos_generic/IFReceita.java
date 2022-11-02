/*Interface funcional criada para utilizar a classe Receita
 * 
 */
package restricao_de_tipos_generic;

@FunctionalInterface
public interface IFReceita<X extends Receita> {
    public void imprimir(X receita); //Agora o parametro deve ser do tipo receita
    public default float computeTotal(X receita){
        float precoDesconto = calculaDesconto(receita);
        return precoDesconto + (precoDesconto * receita.taxa);
    }

    private float calculaDesconto(X receita){
        return receita.preco - (receita.preco * receita.desconto);
    }

}
