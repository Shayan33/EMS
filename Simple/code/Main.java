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
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        //Service service = new Service();
        //service.register();

        Scanner input = new Scanner(System.in);
        Methods methods = new Methods();

        while (true) {
            System.out.println("           ");
            System.out.println("           ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Choose one of these Queries : (for example enter 2 for second query)");
            System.out.println("1. Absent List for each Session");
            System.out.println("2. Absent List for each Student");
            System.out.println("3. Accepted List");
            System.out.println("4. Failed List");
            System.out.println("5. Acceptance Percentage");
            System.out.println("6. Was Class Effective? ");
            System.out.println("7. Student Report");
            System.out.println("8. Verified List for Final Exam");

            int selectQuery = input.nextInt();

            switch (selectQuery) {
                case 1:
                    System.out.println("Insert a Session : ");
                    long sessionInput = -1;

                    try {
                        sessionInput = input.nextInt();
                    }

                    catch (InputMismatchException a) {
                        System.out.println("invalid input!, try again...");
                        sessionInput = input.nextInt();
                    }
                    methods.absentListInEachSession(sessionInput);


                    break;
                case 2:
                    System.out.println("Insert Student ID from below list : ");
                    methods.absentList4EachStudent();
                    break;
                case 3:
                    methods.acceptedList();
                    break;
                case 4:
                    methods.acceptedList();
                    break;
                case 5:
                    methods.acceptancePercentage();
                    break;
                case 6:
                    methods.acceptancePercentage();
                    break;
                case 7:
                    methods.report();
                    break;
                case 8:
                    methods.verifiedList4FinalExam();
                    break;
                default:
                    System.out.println("wrong input, try again!");

            }
        }


        //Initialize database
        /*SessionService sessionService = new SessionService();
        ArrayList<ArrayList<String>> sessions = sessionService.inputData();
        sessionService.register(sessions);

        StudentService personService = new StudentService();
        ArrayList<ArrayList<String>> data = personService.inputData();
        personService.register(data);*/
    }
}
