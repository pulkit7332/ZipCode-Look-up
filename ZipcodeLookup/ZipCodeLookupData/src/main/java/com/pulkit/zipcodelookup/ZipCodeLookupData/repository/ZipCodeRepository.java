package com.pulkit.zipcodelookup.ZipCodeLookupData.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pulkit.zipcodelookup.ZipCodeLookupData.ZipCode;

@Repository
public interface ZipCodeRepository extends DataTablesRepository<ZipCode, Long> {

}
