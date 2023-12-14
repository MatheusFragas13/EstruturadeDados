package atribuicRef;

public class objeto {

    Integer num;

   public objeto(Integer num){
    this.num = num;
   }

    public void Setnum(Integer num){
        this.num = num;
    }
    
    @Override
    public String toString() {
        return this.num.toString();
    }
}
