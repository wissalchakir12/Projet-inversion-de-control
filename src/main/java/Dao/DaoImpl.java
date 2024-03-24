package Dao;

import org.springframework.stereotype.Component;

@Component("dao") //creer un objet avec le nom dao
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version base de données");
        double data=34.0;
        return data;
    }
}
