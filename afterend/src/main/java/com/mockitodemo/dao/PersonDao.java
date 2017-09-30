package com.mockitodemo.dao;

import com.mockitodemo.pojo.Person;

public interface PersonDao {
    public Person fetchPerson(Integer personID );
    public void update( Person person );
}


