package it.akademija.bookinstitution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookInstitutionControler {

    @Autowired
    private BookInstitutionService bookInstitutionService;

//    @RequestMapping(value = "/institution/add", method = RequestMethod.GET){
//        public void addInstitution(){
//            bookInstitutionService.addBookInstitution();
//        }
    }

