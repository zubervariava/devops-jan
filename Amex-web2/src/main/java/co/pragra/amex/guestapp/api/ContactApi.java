package co.pragra.amex.guestapp.api;

import co.pragra.amex.guestapp.entity.Address;
import co.pragra.amex.guestapp.entity.Contact;
import co.pragra.amex.guestapp.entity.DocTypeEnum;
import co.pragra.amex.guestapp.repo.AddressRepo;
import co.pragra.amex.guestapp.repo.ContactRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContactApi {
    private ContactRepo contactRepo;
    private AddressRepo addressRepo;

    public ContactApi(ContactRepo contactRepo, AddressRepo addressRepo) {
        this.contactRepo = contactRepo;
        this.addressRepo = addressRepo;
    }

    @PostMapping("/api/contact")
    public Contact create(@RequestBody Contact contact){
        List<Address> addresses = addressRepo.saveAll(contact.getAddresses());
        contact.setAddresses(addresses);
        Contact save = contactRepo.save(contact);
        save.getAddresses().forEach(address->{
            address.setContact(save);
            addressRepo.save(address);
        });
        return save;
    }

    @GetMapping("/api/contact" )
    public List<Contact> getAll(
            @RequestParam (required = false) Optional<String> lastName ,
            @RequestParam (required = false) Optional<DocTypeEnum> type,
            @RequestParam (required = false) Optional<String> city

    ){
        if(lastName.isPresent()){
            return contactRepo.findAllByLastNameIgnoreCase(lastName.get());
        }
        if(type.isPresent()){
            return contactRepo.allByDocumentType(type.get());
        }
        if(city.isPresent()){
            return contactRepo.findByCity(city.get());
        }
        return contactRepo.findAll();
    }

    @GetMapping("/api/contact/{id}")
    public Optional<Contact> getById(@PathVariable int id){
        return this.contactRepo.findById(id);
    }


}
