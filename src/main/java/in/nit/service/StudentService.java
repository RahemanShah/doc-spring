package in.nit.service;

import java.util.List;

import in.nit.Model.Student;

public interface StudentService
{
	
   public List<Student> getAllStudent();               //-----1
	
	
   public Student saveStudent(Student student);       //-----2
	
	
	
   public Student getStudentById(Integer id);        //-----3
	
	
	
   public Student updateStudent(Student student);  //--------4
	
	
	
   public void deleteStudentById(Integer id);      //---------5

}
