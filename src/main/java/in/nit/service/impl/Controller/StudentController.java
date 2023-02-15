package in.nit.service.impl.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.nit.Model.Student;
import in.nit.service.StudentService;

@Controller
public class StudentController 
{
	
	
	
	@Autowired
	private StudentService studentService;
	                          
	
	
	@GetMapping("/students")
	public String listStudent(Model model)
	{
		model.addAttribute("students", studentService.getAllStudent());
		
		return "students";
	}
	
	
	 
	@GetMapping("/students/new")
	public String createStudentForm(Model model, Student student)
	{
		model.addAttribute("student", student);
		
		return "CREATE_Student";
	}
	
	

	@PostMapping("/students")
	public String saveStudent(Student student)
	{
		studentService.saveStudent(student);
		
		return "redirect:/students";
	}
	

	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Integer id, Model model)
	{
		model.addAttribute("student", studentService.getStudentById(id));
		
		return "edit_student";
	}
	
	
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Integer id,Student student, Model model)
	{
		Student obj = studentService.getStudentById(id);
		
		
		obj.setFirstName(student.getFirstName());
		
		obj.setLastName(student.getLastName());
		
		obj.setEmail(student.getEmail());
		
		
		studentService.updateStudent(obj);
		
		return "redirect:/students";
	}
	
	
	
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Integer id)
	{
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	

}
