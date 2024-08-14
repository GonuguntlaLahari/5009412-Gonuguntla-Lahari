package com.DigitalNurture.EmployeeManagementSystem.util;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class CustomEnumType implements UserType {

    @Override
    public int[] sqlTypes() {
        return new int[]{Types.VARCHAR}; // Define the SQL type for the enum
    }

    @Override
    public Class<?> returnedClass() {
        return MyEnum.class; // Replace with your actual enum class
    }

    @Override
    public boolean equals(Object x, Object y) throws HibernateException {
        return x == null ? y == null : x.equals(y);
    }

    @Override
    public int hashCode(Object x) throws HibernateException {
        return x == null ? 0 : x.hashCode();
    }
    @Override
    public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session, Object owner) throws HibernateException, SQLException {
        String name = rs.getString(names[0]);
        return name == null ? null : MyEnum.valueOf(name); // Replace with your enum class
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session) throws HibernateException, SQLException {
        if (value == null) {
            st.setNull(index, Types.VARCHAR);
        } else {
            st.setString(index, ((MyEnum) value).name()); // Replace with your enum class
        }
    }

    @Override
    public Object deepCopy(Object value) throws HibernateException {
        return value; // Enums are immutable, so this can just return the value
    }


    @Override
    public Serializable disassemble(Object value) throws HibernateException {
        return (Serializable) deepCopy(value);
    }

    @Override
    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        return deepCopy(cached);
    }

    @Override
    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        return deepCopy(original);
    }
}
