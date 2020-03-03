package com.xia.xia.service.Impl;

import com.xia.xia.bean.Person;
import com.xia.xia.mapper.PersonMapper;
import com.xia.xia.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonImpl implements PersonService {
    @Resource
    PersonMapper personMapper;
    public List<Person> getAllPerson(){
        return personMapper.selectAllPerson();
    }
    public String addPerson(Person person){
        try{
            personMapper.insertPerson(person);
            return "success";
        }catch (Exception e){
            return ("error:\n"+e);
        }
    }
    public String deletePerson(Person person){
        try{
            personMapper.deletePerson(person);
            return "success";
        }catch (Exception e){
            return ("error:\n"+e);
        }
    }
    public Person updatePerson(Person person){
        personMapper.updatePerson(person);
        return personMapper.selectPersonById(person);
    }
}
