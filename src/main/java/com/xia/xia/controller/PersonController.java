package com.xia.xia.controller;

import com.xia.xia.bean.Person;
import com.xia.xia.service.PersonService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
public class PersonController {
    @Resource
    PersonService personService;
    @RequestMapping("/getAllPerson")
    @ResponseBody
    public List<Person> GetAllPerson(){
        List<Person> personList = personService.getAllPerson();
        return personList;
    }
    @RequestMapping("/addPerson")
    @ResponseBody
    public String AddPerson(@RequestBody Person person){
        String result = personService.addPerson(person);
        return result;
    }
    @RequestMapping("/deletePerson")
    @ResponseBody
    public String DeletePerson(@RequestBody Person person){
        String result = personService.deletePerson(person);
        return result;
    }
    @RequestMapping("/updatePerson")
    @ResponseBody
    public Person UpdatePerson(@RequestBody Person person){
        return personService.updatePerson(person);
    }

}
