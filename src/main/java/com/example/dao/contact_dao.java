package com.example.dao;

import com.example.dao.mappers.contact_mapper;
import com.example.representations.contact;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;


// this class is used completely for database purpose
public interface contact_dao {

    @Mapper(contact_mapper.class)
    @SqlQuery("Select * from basic_data where id = :id")
    contact get_contact_by_id( @Bind("id") int id );

}