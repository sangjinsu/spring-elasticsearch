package demo.elasticsearch.repository;

import demo.elasticsearch.domain.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {


}
