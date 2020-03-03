package com.xia.xia.mapper;

import com.xia.xia.bean.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonMapper {
    List<Person> selectAllPerson();
    void insertPerson(@Param("person") Person person);
    void deletePerson(@Param("person") Person person);
    void updatePerson(@Param("person") Person person);
    Person selectPersonById(@Param("person") Person person);
}
