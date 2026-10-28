public class SistemaGestion {
    private GeneradoReporte generador;

    public SistemaGestion(GeneradoReporte generador) {
        this.generador = generador;
    }

    public void cambiarGenerador(GeneradoReporte generador) {
        this.generador = generador;
    }

    public void generarReporte(String contenido) {
        generador.exportar(contenido);
    }
}
