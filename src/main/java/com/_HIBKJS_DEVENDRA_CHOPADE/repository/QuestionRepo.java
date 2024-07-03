package com._HIBKJS_DEVENDRA_CHOPADE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com._HIBKJS_DEVENDRA_CHOPADE.model.Question;


@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
