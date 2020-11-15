package company.demo.dao;

import company.demo.model.Company;

import java.util.List;

public interface CompanyDao {
    List<Company> findAll();

    Company findById(int id);

    Company save (Company company);
}
