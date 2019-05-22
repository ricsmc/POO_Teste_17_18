import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

public class Negocio{
    private Map<String, Contribuinte> contribuintes;

    public void printFamiliasNumerosas(String nomeFich) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(nomeFich);

        for (Contribuinte c : this.contribuintes.values()) {
            pw.write("Nome : "); //falta os gets dos outros
        }
        pw.flush();
        pw.close();
    }


}
