package cz.czechitas.webapp;

import java.util.*;

public class FemaleService extends FemaleForm {

    private static final List<String> STATMENT = Arrays.asList(
            "Hmmm, tvůj partner neni atraktivní ani pro černý trh...nechej si ho!",
            "To není špatné, ale nic moc oslňujícího to není. ",
            "Gratuluji, to vypadá na pěkný výsledek.",
            "Paráda, opravdu slušný počet velbloudů.",
            "Wau, tomu říkám výsledek, pokud potřebuješ vydělat, určitě prodej. "
    );

    public int spoctiVelbloudy() {
        int vzdelani = this.getDosazeneVzdelani();
        int sroubovak = this.getSroubovak();
        int uklid = this.getUklid();
        int ridicak = this.getRidicak();
        int rodice = this.getRodice();

        int vysledekVelbloudu = vzdelani + sroubovak + uklid + ridicak + rodice;

        if (vysledekVelbloudu < 0) {
            vysledekVelbloudu = 0;
        }
        return vysledekVelbloudu;

    }

    public String getStatement() {
        int vysledekVelbloudu = this.spoctiVelbloudy();
        int index = 0;
        if (vysledekVelbloudu > 0 && vysledekVelbloudu < 5) {
            index = 0;
        } else if (vysledekVelbloudu >= 5 && vysledekVelbloudu < 10) {
            index = 1 ;
        } else if (vysledekVelbloudu >= 10 && vysledekVelbloudu < 15) {
            index = 2;
        } else if (vysledekVelbloudu >= 15 && vysledekVelbloudu < 20) {
            index = 3;
        } else if (vysledekVelbloudu >= 20) {
            index = 4;
        }
        return STATMENT.get(index);
    }

//    public String sklonovaniVelblouda () {
//        if
//    }
}
