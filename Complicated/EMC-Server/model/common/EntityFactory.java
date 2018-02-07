package model.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityFactory {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ws1");
    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
