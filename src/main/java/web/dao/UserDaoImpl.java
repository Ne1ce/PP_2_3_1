package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private  EntityManager entityManager;

    @Override
    public List<User> allUsers() {
        return entityManager.createQuery("select u from User u", User.class)
                .getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User showUser(int id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public void updateUser(int id, User userUpdated) {
        User userToUpdate = showUser(id);
        userToUpdate.setName(userUpdated.getName());
        userToUpdate.setSurName(userUpdated.getSurName());
        userToUpdate.setEmail(userUpdated.getEmail());
        entityManager.merge(userToUpdate);

    }

    @Override
    public void deleteUser(int id) {
            entityManager.remove(showUser(id));
    }
}
