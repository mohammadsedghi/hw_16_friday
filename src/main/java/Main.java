import Base.entity.Item;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Session session = HibernateUtil.getSessionFactory().openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
//        CriteriaQuery<Item> cr = cb.createQuery(Item.class);
//        Root<Item> root = cr.from(Item.class);
//        cr.select(root);
//        cr.orderBy(
//                cb.desc(root.get("itemName")),
//                cb.desc(root.get("itemPrice")));
//
//
//        TypedQuery<Item> query = session.createQuery(cr);
//        List<Item> results = query.getResultList();
//
//        results.forEach(System.out::println);



//        CriteriaQuery<Double> cr = cb.createQuery(Double.class);
//        Root<Item> root = cr.from(Item.class);
//        cr.select(cb.avg(root.get("itemPrice")));
//
//
//        TypedQuery<Double> query = session.createQuery(cr);
//        Double itemProjected = query.getSingleResult();
//        System.out.println(itemProjected);

//        CriteriaUpdate<Item> criteriaUpdate = cb.createCriteriaUpdate(Item.class);
//        Root<Item> root = criteriaUpdate.from(Item.class);
//        criteriaUpdate.set("itemPrice", 20000);
//        criteriaUpdate.where(cb.equal(root.get("itemPrice"), 15000));
//
//        Transaction transaction = session.beginTransaction();
//        session.createQuery(criteriaUpdate).executeUpdate();
//        transaction.commit();

        CriteriaDelete<Item> criteriaDelete = cb.createCriteriaDelete(Item.class);
        Root<Item> root = criteriaDelete.from(Item.class);
        criteriaDelete.where(cb.greaterThan(root.get("itemPrice"), 12000));

        Transaction transaction = session.beginTransaction();
        session.createQuery(criteriaDelete).executeUpdate();
        transaction.commit();





    }
}
