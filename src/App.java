public class App {
    public static void main(String[] args) throws Exception {

        Feriados feriado = new Feriados();

        System.out.println(" ---- Testando a busca por feriado específico ---- \n");
        System.out.println(feriado.getFeriado("01/05/2023"));
        System.out.println(feriado.getFeriado("09/06/2023") + "\n");
        System.out.println("\n");

        System.out.println("--- Buscando todos os feriados cadastrados ---\n");
        System.out.println(feriado.getTodosFeriados());
    }
}
