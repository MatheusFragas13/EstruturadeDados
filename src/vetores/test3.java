package vetores;

public class test3 {
    public static void main(String[] args) throws Exception{
        vetor Vetor = new vetor(10);
       
        Vetor.adiciona("elemento 1");
        Vetor.adiciona("elemento 2");
        Vetor.adiciona("elemento 3");
        
        System.out.println(Vetor.tamanho());
        System.out.println(Vetor.toString());
        
        
        
    }
    
}
