import java.util.ArrayList;
import java.util.List;

public class Controle {
    private List<Strategy> strategies = new ArrayList<Strategy>();

    public void executarStrategy(Strategy strategy){
        this.strategies.add(strategy);
        strategy.executar();
    }

    public void cancelarUltimoStrategy() {
        if (strategies.size() != 0) {
            Strategy strategy = this.strategies.get(this.strategies.size() - 1);
            strategy.cancelar();
            this.strategies.remove(this.strategies.size() - 1);
        }
    }
}
