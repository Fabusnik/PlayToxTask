package ru.fab.playtoxtask.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fab.playtoxtask.model.User;

//@Transactional
@Repository
public interface CrudUserRepository extends JpaRepository<User, Integer>{

//    @Transactional
//    @Modifying
//    @Query("DELETE FROM User u WHERE u.id=:id")
//    int delete(@Param("id") int id);
//
//    @Override
//    @Transactional
//    User save(User user);
//
//    @Override
//    Optional<User> findById(Integer id);
//
//    @Override
//    List<User> findAll(Sort sort);
}
