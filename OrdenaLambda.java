import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaLambda {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Orlando", "Ana", "Lore", "Lis");
        Collections.sort(lista,new Comparator<String>(){
            public int compare(String vlr1, String vlr3){
                return vlr1.length() - vlr3.length();
            }
        });
    }
    
}
