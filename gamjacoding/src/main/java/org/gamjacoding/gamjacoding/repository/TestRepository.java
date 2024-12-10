package org.gamjacoding.gamjacoding.repository;

import org.gamjacoding.gamjacoding.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Integer> {
}
