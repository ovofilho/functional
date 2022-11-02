/* Com esta classe, a IFReceita não faz muito sentido
 * Pois a interface não poderá ser utilizada a menos que sofra alteração
*/
package restricao_de_tipos_generic;

public class ReceitaEspecial extends Receita{

    float taxaConta;

    ReceitaEspecial(Receita r, float c){
        super(r);
        taxaConta = c;

    }

    
}
