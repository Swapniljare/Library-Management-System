package com.backendMarch.librarymanagementsystem.Repository;

import com.backendMarch.librarymanagementsystem.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

    @Query(value = "select * from transaction t where t.card_id=:cardId AND transaction_status = 'SUCCESS'",nativeQuery = true)
    List<Transaction> getAllSuccessfulTxnsWithCardNo(int cardId);
}


