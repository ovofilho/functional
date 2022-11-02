public class Principal{
    public static void main(String[] args) {
        IPrincipal<Integer> somar = new IPrincipal<>() {
            @Override
            public Integer calcular(Integer a, Integer b) {
        
                return a + b;
            };
        };
        
        IPrincipal<Integer> somar3 = (a,  b) -> a + b;
        IPrincipal<String> devolve = new IPrincipal<>(){
            @Override
            public String calcular(String z){
               
                String x ="Vai imprimir isso! ";
                return x + z;
            }
            @Override
            public String calcular(String a, String b){
                return a + " " + b;
            }
        };
        IPrincipal<String> devolve3 = (a,b) -> a + " " + b;
        
        System.out.println(somar.calcular(5,6));
        System.out.println(somar.calcular(4));
        System.out.println(devolve.calcular("Bom dia"));
        System.out.println(devolve.calcular("Teste 1","teste5"));
        System.out.println(somar3.calcular(7, 7));
        System.out.println(devolve3.calcular("Agora com ", "Expressão Lambda!!"));
        System.out.println(devolve3.calcular("Este é o teste do método default"));

    }
    
}