package Client;
import MVC.*;

public class App {
    public void start()  {
        StringBuilder sb = new StringBuilder()
                .append("\n****************************\n")
                .append("+ - добавить работника\n")
                .append("? - поменять отдел\n")
                .append("Z - выход\n");           
ConsoleView ui = new ConsoleView();
Presenter p = new Presenter();
        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "+":
                    p.AddPersona();
                    break;
                case "?":
                    p.UppdateDep();
                    break;          
                case "Z":
                    System.exit(0);
                default:
                    p.Option();
                    break;
            }
        }
    }   
}
