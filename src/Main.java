//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String datos = "Ventas: $50000 - Clientes: 25";

    SistemaGestion sistema = new SistemaGestion(new ReportePDF());
    sistema.generarReporte(datos);

    sistema.cambiarGenerador(new ReporteExcel());
    sistema.generarReporte(datos);

    sistema.cambiarGenerador(new ReporteHTML());
    sistema.generarReporte(datos);
}
