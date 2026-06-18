package br.com.lukedevfull.repository;

import br.com.lukedevfull.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
//@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
