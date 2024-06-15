package co.pragra.amex.guestapp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ID_DOCUMENT")
@Data
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "DOCUMENT_NUMBER")
    private String idNumber;

    @Enumerated(EnumType.ORDINAL)
    private DocTypeEnum doctype;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date issueDate;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date expiryDate;
}
