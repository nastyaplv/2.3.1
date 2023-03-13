package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO = new UserDAOImpl();

    public List<User> getAllUsers() {
            return userDAO.getAllUsers();
        }

        public User show(int id) {
            return userDAO.show(id);
        }

        public void save(User user) {
            userDAO.save(user);
        }

        public void update(int id, User updatedUser) {
            userDAO.update(id, updatedUser);
        }

        public void delete(int id) {
            userDAO.delete(id);
        }
}
