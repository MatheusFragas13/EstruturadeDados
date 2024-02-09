package vetores;

public class test7 {
    public static void main(String[] args) {
        vetor Vetor = new vetor(10);
        Vetor.adiciona("B");
        Vetor.adiciona("C");
        Vetor.adiciona("E");
        Vetor.adiciona("F");
        Vetor.adiciona("G");

        System.out.println(Vetor);

        Vetor.adiciona(0, "A");

        System.out.println(Vetor);

        Vetor.adiciona(3, "D");

        System.out.println(Vetor);
    }
}
