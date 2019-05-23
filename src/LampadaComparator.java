import java.util.Comparator;

public class LampadaComparator implements Comparator<Lampada> {
    public int compare (Lampada l1, Lampada l2){
        if (l1.totalConsumo() == l1.totalConsumo()) return 0;
        if (l1.totalConsumo() > l2.totalConsumo()) return 1;
        else return -1;
    }
}
