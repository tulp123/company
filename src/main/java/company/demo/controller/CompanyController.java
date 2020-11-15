package company.demo.controller;

import company.demo.model.Company;
import company.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/company"})
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    //Get all company
    @GetMapping
    public List<Company> getAll(){
        return companyService.findAll();
    }

    //Get a single company
    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable(value = "id") int id ){
        return companyService.findById(id);
    }

    //Create a company
    @PostMapping
    public Company createCompany(@RequestBody Company company){
        return companyService.save(company);
    }

    //Update a company
    @PutMapping("/{id}")
    public Company updateCompany(@PathVariable(value = "id") int id, @RequestBody Company company){
        company.setId(id);
        Company updateCompany = companyService.save(company);
        return updateCompany;
    }
}
