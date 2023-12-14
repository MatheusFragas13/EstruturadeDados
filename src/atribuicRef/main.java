package atribuicRef;


public class main {
    public static void main(String[] args){
        int intA = 1;
        int intB = intA;
        
        System.out.println("Int A = " + intA + "Int B=" + intB);
        intA = 2; //valor
        System.out.println("Int A = " + intA + "Int B=" + intB);
        /**Com tipos primitivos a atribuição funciona de uma forma que voce possa mudar o valor de
        *  uma unica varivael conforme o codigo for sendo escrito, com tipos primitivos o java não copia a referecia é sim o valor.**/

        objeto objA = new objeto(1);
        objeto objB = objA;
        System.out.println("Int A = " + objA + "Int B=" + objB);
        objA.Setnum(2);//set
        System.out.println("Int A =" + objA + "Int B=" + objB);
        /**   Com objeto ele copia a referencia de memoria do objeto a e atribuindo a referencia de memoria do objeto a, elas apontam pro mesmo endereço de memoria, ela esta indo la no endereço e setando.
         * */
    }
}
