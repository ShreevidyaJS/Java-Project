package tns.college.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tns.college.entity.College;
import tns.college.repository.CollegeRepository;
/**Service class: All the business logic of the app is here
* Create service to add values to the database
* These classes are auto-detected by the spring context when the annotation-based configuration is used 
* along with class path scanningAutowired : SB creates an instance of EmployeeRepository and injects into 
* EmployeeService
*/
@Service

public class CollegeService {

@Autowired
CollegeRepository collegeRepository;
/**logic for saving an entity to the database: Here we are creating a save method in our service which will
* be calling the save method of the repository so all these methods are predefined in the repository so
* when you have your jpa repository it gives you awhole bunch of method for saving for updating for 
* fetching and for deleting so you don't have to write anything yourself so this is the beauty of
spring boot so i write this save method this is going to save an entity to my database 
*/
public College save(College Clg)
{
return collegeRepository.save(Clg);
}
public College getCollege(long id)
{
return collegeRepository.findById(id).get();
}
public College update(long id,College college)
{
College Clg =collegeRepository.findById(id).get();
Clg.setCollegeadmin(college.getCollegeadmin());
Clg.setCollegename(college.getCollegename());
return collegeRepository.save(Clg);
}
public String delete(long id)
{
collegeRepository.deleteById(id);
return "Entity with this id is deleted"+id;
}
public List<College> getClglist()
{
return collegeRepository.findAll();
}
}