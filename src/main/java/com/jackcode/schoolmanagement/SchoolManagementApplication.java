package com.jackcode.schoolmanagement;

import com.jackcode.schoolmanagement.entity.Student;
import com.jackcode.schoolmanagement.entity.Teacher;
import com.jackcode.schoolmanagement.repository.StudentRepository;
import com.jackcode.schoolmanagement.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SchoolManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Jack", "Dagusen", "jackdagusen@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("Tony", "Stark", "tonystark@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Doctor", "Strange", "docstrange@gmail.com");
//		studentRepository.save(student3);
//		Teacher teacher1 = new Teacher("Mister", "Teacher", "mister@gmail.com", "June 12, 1999", "09278888888");
//		teacherRepository.save(teacher1);
//		Teacher teacher2 = new Teacher("Miss", "Teacher", "miss@gmail.com", "June 2, 1999", "09278881888");
//		teacherRepository.save(teacher2);
//		Teacher teacher3 = new Teacher("Sir", "Teacher", "sir@gmail.com", "June 1, 1999", "09278888818");
//		teacherRepository.save(teacher3);

	}
}
