package com.example.stortorget.repository;

import com.example.stortorget.entity.SalesAd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesAdRepository extends JpaRepository<SalesAd, Long> {

    List<SalesAd> findByUserName(String userName);

    List<SalesAd> findAllByOrderByIdDesc();

    List<SalesAd> findByItemContainingOrDescriptionContaining(String search1, String search2);

    List<SalesAd> findByItemContainingAndCategoryOrDescriptionContainingAndCategory(String search1,String category1, String search2, String category2);


}
