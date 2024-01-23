package vetores;


public class test5 {
    public static void main(String[] args) {
        vetor Vetor = new vetor(10);

        Vetor.adiciona("elemento 1");
        Vetor.adiciona("elemento 2");
        Vetor.adiciona("elemento 3");
        
        System.out.println(Vetor.busca(50));

    }
    
}
