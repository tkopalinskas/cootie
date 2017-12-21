package it.akademija.bookinstitution;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookInstitutionRepository extends JpaRepository<BookInstitution, Long> {
    BookInstitution findBookInsitutionByName(String institutionname);
}
