package com.learningSpringBoot.FirstProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@GetMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(new Course(1, "Learn spring boot", "salman"),
				new Course(2, "Learn java from basics", "salman"), new Course(3, "Learn java from basics", "salman"));
	}

}
