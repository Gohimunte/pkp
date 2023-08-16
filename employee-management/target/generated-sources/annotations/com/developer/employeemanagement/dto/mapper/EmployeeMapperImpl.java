package com.developer.employeemanagement.dto.mapper;

import com.developer.employeemanagement.dto.request.EmployeeRequest;
import com.developer.employeemanagement.dto.response.EmployeeResponse;
import com.developer.employeemanagement.entity.EmployeeEntity;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T11:51:05+0700",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230721-1147, environment: Java 17.0.8 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeEntity fromRequestToEntity(EmployeeRequest employeeRequest) {
        if ( employeeRequest == null ) {
            return null;
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setName( employeeRequest.getName() );
        employeeEntity.setName_belakang( employeeRequest.getName_belakang() );
        employeeEntity.setName_depan( employeeRequest.getName_depan() );

        return employeeEntity;
    }

    @Override
    public EmployeeResponse fromEntityToResponse(EmployeeEntity employeeEntity) {
        if ( employeeEntity == null ) {
            return null;
        }

        EmployeeResponse employeeResponse = new EmployeeResponse();

        employeeResponse.setAlamat( employeeEntity.getAlamat() );
        employeeResponse.setId( employeeEntity.getId() );
        employeeResponse.setName( employeeEntity.getName() );
        employeeResponse.setName_belakang( employeeEntity.getName_belakang() );
        employeeResponse.setName_depan( employeeEntity.getName_depan() );

        return employeeResponse;
    }
}
