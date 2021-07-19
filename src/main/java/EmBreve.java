import java.util.ArrayList;
import java.util.List;

public class EmBreve {
    private List trailers;
    private String situacao = "Em Breve indisponível.";

    public EmBreve(String t){
        trailers = new ArrayList<String>();
        trailers.add(t);
    }
    public String getSituacao(){
        return this.situacao;
    }
    public void abrirEmBreve(){ this.situacao = "Em Breve disponível."; }
    public void fecharEmBreve(){ this.situacao = "Em Breve indisponível."; }
}
