package demoday03.demo.controller;

import demoday03.demo.database.PersonDB;
import demoday03.demo.model.Person;
import demoday03.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

//    @GetMapping("")
//    @ResponseBody
//    public void printListPeople() {
//        personService.printListPeople();
//    }


    @GetMapping
    @ResponseBody
    public List<Person> getPersons(){
        return personService.getAllPerson();
    }
    @GetMapping("/sortPeopleByFullName")
    @ResponseBody
    public List<Person> sortPeopleByFullName(){
        return personService.sortPeopleByFullName();
    }
    @GetMapping("/sortNameZA")
    @ResponseBody
    public List<Person> sortNamePersonZA(){
        return personService.sortPeopleByFullNameReversed();

    }
    @GetMapping("/getSortedJobsAZ")
    @ResponseBody
    public List<String> getSortedJobsAZ(){
        return personService.getSortedJobsAZ();

    }
    @GetMapping("/getSortedCitiesAZ")
    @ResponseBody
    public List<String> getSortedCities(){
        return personService.getSortedCities();

    }
    @GetMapping("/getFemaleNames")
    @ResponseBody
    public List<String> getFemaleNames(){
        return personService.femaleNames();

    }
    @GetMapping("/getHighestEarner")
    @ResponseBody
    public Person getHighestEarner(){
        return personService.highestEarner();

    }
    @GetMapping("/getBornAfter1990")
    @ResponseBody
    public List<Person> getBornAfter1990(){
        return personService.bornAfter1990();

    }
    @GetMapping("/getAverageSalary")
    @ResponseBody
    public double getAverageSalary(){
        return personService.averageSalary();

    }
    @GetMapping("/getAverageAge")
    @ResponseBody
    public double getAverageAge(){
        return personService.averageAge();

    }
    @GetMapping("/nameContains/{keyword}")
    @ResponseBody
    public List<Person> getNameContains(@PathVariable String keyword){
        return personService.nameContains(keyword);

    }
    @GetMapping("/getSortedByAgeForMale")
    @ResponseBody
    public List<Person> getSotrtedByAgeForMale(){
        return personService.sortedByAgeForMale();

    }
    @GetMapping("/getLongestName")
    @ResponseBody
    public Person getLongestName(){
        return personService.getLongestName();

    }
    @GetMapping("/getAboveAverageSalary")
    @ResponseBody
    public List<Person> getAboveAverageSalary(){
        return personService.aboveAverageSalary();

    }
    @GetMapping("/getGroupPeopleByCity")
    @ResponseBody
    public Map<String, List<Person>> getGroupPeopleByCity(){
        return personService.groupPeopleByCity();

    }
    @GetMapping("/getGroupJobByCount")
    @ResponseBody
    public Map<String, Long> getGroupJobByCount(){
        return personService.groupJobByCount();

    }
    @GetMapping("/getInSalaryRange/{start}/{end}")
    @ResponseBody
    public List<Person> getInSalaryRange(@PathVariable int start, @PathVariable int end){
        return personService.inSalaryRange( start ,  end);

    }
    @GetMapping("/getStartsWith/{startWith}")
    @ResponseBody
    public List<Person> getStartsWith(@PathVariable String startWith){
        return personService.startsWith(startWith);

    }
    @GetMapping("/sortByBirthYearDescending")
    @ResponseBody
    public List<Person> sortByBirthYearDescending(){
        return personService.sortByBirthYearDescending();

    }
    @GetMapping("/top5HighestPaid")
    @ResponseBody
    public List<Person> top5HighestPaid(){
        return personService.top5HighestPaid();

    }

    @GetMapping("/inAgeRange/{start}/{end}")
    public List<Person> inAgeRange(@PathVariable int start, @PathVariable int end) {
        return personService.inAgeRange(start,end);
    }



}
