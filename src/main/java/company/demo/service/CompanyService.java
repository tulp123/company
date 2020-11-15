package company.demo.service;

import company.demo.model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();

    Company findById(int id);

    Company save(Company company);
}
