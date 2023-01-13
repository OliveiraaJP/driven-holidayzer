import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Feriados {
    
    private Map<String, String> feriados = new HashMap<String, String>();

    public Feriados(){
    this.feriados.put("01/01/2023", "Confraternização mundial");
    this.feriados.put("21/02/2023", "Carnaval");
    this.feriados.put("17/04/2023", "Páscoa");
    this.feriados.put("21/04/2023", "Tiradentes");
    this.feriados.put("01/05/2023", "Dia do trabalho");
    this.feriados.put("08/06/2023", "Corpus Christi");
    this.feriados.put("07/09/2023", "Independência do Brasil");
    this.feriados.put("12/10/2023", "Nossa Senhora Aparecida");
    this.feriados.put("02/11/2023", "Finados");
    this.feriados.put("15/11/2023", "Proclamação da República");
    this.feriados.put("25/12/2023", "Natal");
    }

    public String getFeriado(String date) {
        String existeFeriado = this.feriados.get(date);
        if (existeFeriado == null)
          return "Não tem feriado esse dia";
        return existeFeriado;
      }

      public Collection<String> getTodosFeriados() {
        return this.feriados.values();

      } 
}
