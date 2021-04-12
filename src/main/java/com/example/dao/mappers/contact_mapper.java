package com.example.dao.mappers;

import com.example.representations.contact;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class contact_mapper implements ResultSetMapper<contact> {

    @Override
    public contact map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new contact( resultSet.getInt("id"), resultSet.getString("name"));
    }
}
