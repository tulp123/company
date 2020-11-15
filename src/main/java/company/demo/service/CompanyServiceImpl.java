package company.demo.service;

import company.demo.dao.CompanyDao;
import company.demo.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> findAll(){
        return companyDao.findAll();
    }

    @Override
    public Company findById(int id) {
        return companyDao.findById(id);
    }

    @Override
    public Company save(Company company) {
        return companyDao.save(company);
    }

}
