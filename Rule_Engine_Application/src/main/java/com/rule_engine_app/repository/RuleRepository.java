package com.rule_engine_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rule_engine_app.model.Rule;

@Repository
public interface RuleRepository extends JpaRepository<Rule, Long>{

}
