/*Classe receita criada para explicar a interface funcional com restrição
 de tipo baseado nas páginas 8 e 14 do livro functional interfaces*/
package restricao_de_tipos_generic;

public class Receita {
    String item;
    float preco;
    float desconto;
    float taxa;
  

    //construtor
    public Receita(String item, float preco, float desconto, float taxa) {
        this.item = item;
        this.preco = preco;
        this.desconto = desconto;
        this.taxa = taxa;
    }
    public Receita(Receita r){
        this.item = r.item;
        this.preco = r.preco;
        this.desconto = r.desconto;
        this.taxa = r.taxa;
    }

    

    
}
