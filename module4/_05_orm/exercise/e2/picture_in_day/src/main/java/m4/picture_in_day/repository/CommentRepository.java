package m4.picture_in_day.repository;

import m4.picture_in_day.model.Comment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class CommentRepository {
//    @Autowired
//    private static SessionFactory sessionFactory;

    public void updateLike(int id){
        Session session = null;
        Transaction transaction = null;

        try {
            session = HibernateConfig.sessionFactory.openSession();
            transaction = session.beginTransaction();
            Comment comment = findOne(id);
            int l = comment.getLiked();
            comment.setLiked(l + 1);
            session.saveOrUpdate(comment);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }


    public Comment findOne(int id) {
        String queryStr = "SELECT c FROM Comment AS c WHERE c.id = :id";
        TypedQuery<Comment> query = HibernateConfig.entityManager.createQuery(queryStr, Comment.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    public void save(Comment comment) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConfig.sessionFactory.openSession();
            transaction = session.beginTransaction();

            session.persist(comment);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
//            if (session != null) {
//                session.close();
//            }
        }
    }
}
