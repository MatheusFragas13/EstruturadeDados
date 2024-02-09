package vetores;

public class test9 {
    public static void main(String[] args) {
        vetor Vetor = new vetor(3);
        Vetor.adiciona("B");
        Vetor.adiciona("G");
        Vetor.adiciona("D");
        Vetor.adiciona("E");
        Vetor.adiciona("F");

        System.out.println(Vetor);

        Vetor.remove(1);

        System.out.println(Vetor);
    }
}
