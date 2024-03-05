package tns.college.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tns.college.entity.College;
import tns.college.service.CollegeService;
/**
* @Rest controller : EmployeeController : Acts as Rest Controler
* "/employees" - All the end points should be prepended with employees
* (@RequestBody Employee employee) annotation known as request body it takes the json and it converts 
* the json to the employee so we* are going to pass the json from our postman and that json will be
* converted to the employee object
* @PostMapping : signifies that we want to create a new entity in our database
* @PathVariable : Get the value from URL
*/
@RestController

public class CollegeController {

@Autowired
CollegeService collegeService;
// http://localhost:8071/admin- Post
@RequestMapping("/college")
public String college() {
	return"wellcome";
}
@PostMapping("/add")
public College addCollege(@RequestBody College college)
{
return collegeService.save(college);
}
// http://localhost:8071/admin/2 - Get
@GetMapping(path="/get/{id}")
public College getCollege(@PathVariable long id)
{
return collegeService.getCollege(id);
}
// http://localhost:8071/admin/2 - Put
@PutMapping(path="/update/{id}")
public College updateCollege(@RequestBody College college, @PathVariable long id)
{
return collegeService.update(id,college);
}
// http://localhost:8071/admin/2 - Delete
@DeleteMapping(path="/delete/{id}")
public String deleteCollege(@PathVariable int id)
{
return collegeService.delete(id); 
}
// http://localhost:8071/admin Get
@GetMapping("/record")
public List<College> getAllCollege()
{
return collegeService.getClglist();
}
}
