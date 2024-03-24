package metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class MetierImpl implements IMetier {
    public MetierImpl(IDao dao)
    {
        this.dao=dao;
    }





    //@Autowired //ctd quand on cree un objet MetierImpl inject dans dao un objet de type Idao
    private IDao dao; //Couplage faible
    @Override
    public double calcul() {
        //dans la methode calcul on a besoin de la methode getData()
        double data=dao.getData();
        double res=data*10;
        return res;
    }
    //Pour permettre d'injecter dans la variable dao un objet IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
