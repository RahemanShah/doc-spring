package in.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	

}
