public class FecharEmBreve implements Strategy {
    private EmBreve eb;

    public FecharEmBreve(EmBreve eb) { this.eb = eb; }

    @Override
    public void executar() {
        this.eb.fecharEmBreve();
    }

    @Override
    public void cancelar() {
        this.eb.abrirEmBreve();
    }
}
