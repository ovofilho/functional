
// Interface funcional utlizando generics 
@FunctionalInterface
public interface IPrincipal<X> {
    public X calcular(X a, X b);

    public default X calcular(X a){
        
        return a;

    }
}
