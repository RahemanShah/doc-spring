package in.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.nit.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	Student findByEmail(String email);
}
