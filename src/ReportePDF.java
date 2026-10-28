public class ReportePDF implements GeneradoReporte {

    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a PDF...");
        System.out.println("[PDF] " + contenido);
    }
}
