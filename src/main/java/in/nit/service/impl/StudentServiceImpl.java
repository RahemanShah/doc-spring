package in.nit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.Model.Student;
import in.nit.repository.StudentRepository;
import in.nit.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	
	@Autowired
	private StudentRepository studentRepository;



	@Override
	public List<Student> getAllStudent() 
	{
		return studentRepository.findAll();
	}		

    @Override
     public Student saveStudent(Student student) 
    {
    	return studentRepository.save(student);
    }
    
    

     @Override
     public Student getStudentById(Integer id) 
    {
	   return studentRepository.findById(id).get();
    } 


     
      @Override
      public Student updateStudent(Student student)
     {
	   return studentRepository.save(student);
     }
      
      
      
      
      @Override
       public void deleteStudentById(Integer id) 
      {
    	  studentRepository.deleteById(id);
      }

}

