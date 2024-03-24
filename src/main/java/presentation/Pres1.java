package presentation;

import Dao.DaoImpl;
import Dao.DaoImplV2;
import metier.MetierImpl;
// LA COUCHE PRESENTATION EST OUVERTE A LA MODIFICATION
//injection static
public class Pres1 {
    public static void main(String[] args)
    {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier = new MetierImpl(dao); //injection via constructuer
        //DaoImplV2 dao = new DaoImplV2();
        //metier.setDao(dao); // Injection des dépendances
        System.out.println("Résultat ="+ metier.calcul());

    }
}
