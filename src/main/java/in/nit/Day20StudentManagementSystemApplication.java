package in.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.nit.Model.Student;
import in.nit.repository.StudentRepository;

@SpringBootApplication
public class Day20StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day20StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception 
	{
		
		
//		Student student5=new Student(null,"Naveed_Sir","radio","navid123@gmail.com");
//		studentRepository.save(student5);
//		
//		Student student6=new Student(null,"Amit_Sir","Shah","amitt23@gmail.com");
//		studentRepository.save(student6);
//		
//		Student student7=new Student(null,"Nikhil_Sir","Patil","nikhil123@gmail.com");
//		studentRepository.save(student7);
//		
//		Student student8=new Student(null,"Raheman_Sir","Shahh","raheman123@gmail.com");
//		studentRepository.save(student8);
//		
//		Student student9=new Student(null,"Natraj_Sir","Disuza","natraj@gmail.com");
//		studentRepository.save(student9);
		
		
		
		
	}

}
