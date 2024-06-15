package co.pragra.amex.guestapp.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TABLE_CONTACT")
@Data
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;

    @Column(unique = true)
    private String email;
    private Date createDate;
    private Date updateDate;

    @OneToOne(cascade = CascadeType.ALL)
    private Document document;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contact", orphanRemoval = true, targetEntity = Address.class)
    private List<Address> addresses = new ArrayList<>();

}
