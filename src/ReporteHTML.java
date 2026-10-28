public class ReporteHTML implements GeneradoReporte{
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a HTML...");
        System.out.println("<html><body>" + contenido + "</body></html>");
    }
}
