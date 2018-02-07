package model.service;
import javax.json.*;
import org.json.simple.*;
import java.rmi.Remote;


public interface MethodInt extends Remote {
    JSONArray absentListInEachSession4Interface (long sessionID) throws Exception;
    void absentList4EachStudent()throws Exception ;
}

