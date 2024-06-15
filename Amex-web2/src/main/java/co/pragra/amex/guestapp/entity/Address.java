package co.pragra.amex.guestapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDRESS_ID", nullable = false)
    private Integer id;
    private int houseNumber;
    private String streetName;
    private String city;
    private String postCode;

    @ManyToOne
    @JoinColumn(name="CONTACT_ID", nullable=true)
    @JsonIgnore
    private Contact contact;

}
