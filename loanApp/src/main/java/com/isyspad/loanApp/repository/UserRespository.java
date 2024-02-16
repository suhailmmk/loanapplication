package com.isyspad.loanApp.repository;

import com.isyspad.loanApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRespository extends JpaRepository<User,Long> {

    @Query(value = "SELECT COUNT(*) FROM User WHERE userName = ?1")
    int countByUsername(String userName);

//    @Query(value = "SELECT expenseamount(ExpenseAmount) FROM user")
//   String expenseamount();

}
