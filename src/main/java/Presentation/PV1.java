package Presentation;

import Dao.DaoImpl;
import Metier.MetierImpl;

public class PV1 {
    public static void main(String[] args) {
        DaoImpl d=new DaoImpl();
        MetierImpl m=new MetierImpl(d);
        System.out.printf("RES"+m.calcul());
    }
}
