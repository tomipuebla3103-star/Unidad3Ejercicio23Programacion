public class ReporteExcel implements GeneradoReporte {

    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Excel...");
        System.out.println("[EXCEL] " + contenido);
    }
}
