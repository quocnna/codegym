package m4.music_page.repository;

import m4.music_page.model.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Repository
public class SongRepository {
    @Autowired
    private SessionFactory sessionFactory;

    private static EntityManager entityManager;

    public List<Song> findAll() {
        entityManager = sessionFactory.createEntityManager();
        String queryStr = "SELECT s FROM Song AS s";
        TypedQuery<Song> query = entityManager.createQuery(queryStr, Song.class);
        return query.getResultList();
//        Session session = sessionFactory.getCurrentSession();
//        CriteriaBuilder cb = session.getCriteriaBuilder();
//        CriteriaQuery<Song> cq = cb.createQuery(Song.class);
//        Root<Song> root = cq.from(Song.class);
//        cq.select(root);
//        Query query = session.createQuery(cq);
    }

    public void delete(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Customer book = session.byId(Customer.class).load(id);
//        session.delete(book);
    }

    public void save(Song song) {
//        Session currentSession = sessionFactory.getCurrentSession();
//        currentSession.saveOrUpdate(theCustomer);
    }

    public Optional<Song> getById(int id) {
//        Session currentSession = sessionFactory.getCurrentSession();
//        Customer theCustomer = currentSession.get(Customer.class, theId);
        return null;
    }
}
