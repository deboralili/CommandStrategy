public class AbrirEmBreve implements Strategy {

    private EmBreve eb;

    public AbrirEmBreve(EmBreve eb) { this.eb = eb; }

    @Override
    public void executar() {
        this.eb.abrirEmBreve();
    }

    @Override
    public void cancelar() {
        this.eb.fecharEmBreve();
    }
}
