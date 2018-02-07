import model.entity.Student;
import model.service.Methods;
import model.service.Service;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
/*import model.service.StudentService;
import model.service.SessionService;*/

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class Main implements Serializable{
    public static void main(String[] args) throws Exception {

        java.rmi.registry.LocateRegistry.createRegistry(1099);
        Methods methods = new Methods();
        java.rmi.Naming.rebind("Service", methods);

        //Initialize database
        //Service service = new Service();
        //service.register();

        /*SessionService sessionService = new SessionService();
        ArrayList<ArrayList<String>> sessions = sessionService.inputData();
        sessionService.register(sessions);

        StudentService personService = new StudentService();
        ArrayList<ArrayList<String>> data = personService.inputData();
        personService.register(data);*/
    }
}
