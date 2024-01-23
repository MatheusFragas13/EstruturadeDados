package conceitoNo;

public class main {
    public static void main(String[] args) {
        no no1= new no("Conteudo no1");
        no no2= new no("Conteudo no2");
        no1.setproximoNo(no2);


        no no3= new no("Conteudo no3");
        no2.setproximoNo(no3);

        no no4= new no("Conteudo no4");
        no3.setproximoNo(no4);

        //no1 -> no2 -> no3 -> no4 -> null//

        System.out.println(no1);
        System.out.println(no1.getproximoNo()); //No1 apontando pro no2 atraves do get
        //System.out.println(no2);

        System.out.println("--------------------------------------");

        System.out.println(no1);
        System.out.println(no1.getproximoNo().getproximoNo());
        System.out.println(no1.getproximoNo().getproximoNo().getproximoNo());
        System.out.println(no1.getproximoNo().getproximoNo().getproximoNo().getproximoNo());//apos o no4 sera nullo!
        //erro pois não tem atribuição nesse nó

        System.out.println("--------------------------------------");
    }
}
