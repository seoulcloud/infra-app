package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer>{

}
