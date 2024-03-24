package Dao;
//cette classe est une extention .
public class DaoImplV2 implements IDao{
    @Override
    public double getData() {
        System.out.println("Version web service");
        double data=56;
        return data;
    }
}
