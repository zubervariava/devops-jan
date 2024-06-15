package co.pragra.amex.guestapp.repo;

import co.pragra.amex.guestapp.entity.Contact;
import co.pragra.amex.guestapp.entity.DocTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.w3c.dom.DocumentType;

import java.util.List;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {
    List<Contact> findAllByLastNameIgnoreCase(String lastName);

    @Query("select c from Contact c , Document  d where c.document.id = d.id and d.doctype = :type")
    List<Contact> allByDocumentType(@Param("type") DocTypeEnum docType);

    @Query(value = "SELECT *  FROM TABLE_CONTACT C , TABLE_CONTACT_ADDRESSES D, ADDRESS E WHERE C.ID = D.CONTACT_ID AND D.ADDRESSES_ADDRESS_ID = E.ADDRESS_ID AND\n" +
            "UPPER(E.CITY) = UPPER(:city)", nativeQuery = true)
    List<Contact> findByCity(String city);


}
