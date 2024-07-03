package com._HIBKJS_DEVENDRA_CHOPADE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com._HIBKJS_DEVENDRA_CHOPADE.model.Result;



@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {

}
