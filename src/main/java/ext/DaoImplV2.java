package ext;

import Dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.printf("version web service");
        double t=11;
        return t;
    }
}
