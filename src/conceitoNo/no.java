package conceitoNo;

public class no{

    private String conteudo;
    public no proximoNo;

    public no(String conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;


    }

    public String getConteudo(){
    return conteudo;
    }

    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

     public no getproximoNo(){
    return proximoNo;
    }

    public void setproximoNo(no proximoNo){
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString(){
        return this.conteudo;
    }
    }



