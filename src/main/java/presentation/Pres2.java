package presentation;

import Dao.DaoImplV2;
import Dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;

import java.lang.reflect.Method;
import java.util.Scanner;
//injection des depandances dynamic
public class Pres2 {
    public static void main(String[] args) throws Exception {


        //DaoImplV2 dao = new DaoImplV2();


        Scanner scanner=new Scanner(new File("Config.txt"));//lire le fichier de conf
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName); //charger la classe en memoire

        IDao dao=(IDao) cDao.getConstructor().newInstance();// => new DaoImpl() ou tout objet d'une classe qui implemente l'interface IDao


        // MetierImpl metier = new MetierImpl();



        String metierClassName=scanner.nextLine();
        Class cmetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cmetier.getConstructor().newInstance();

        // metier.setDao(dao); // Injection des dépendances
        Method setDao= cmetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);
        System.out.println("Res :" + metier.calcul());

    }
}
