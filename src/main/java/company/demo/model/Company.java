package company.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "Company")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Company {

    @Id
    @GeneratedValue
    private int id;

    @Column (name="name")
    private String name;

    @Column (name="type")
    private String type;

    @Column (name = "email")
    private String email;
}
