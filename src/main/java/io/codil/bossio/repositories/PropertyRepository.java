package io.codil.bossio.repositories;

import io.codil.bossio.models.Property;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * Extension of {@link PagingAndSortingRepository} to provide additional method to retrieve properties
 * by name.
 *
 * @author Jaime Rojas
 * @see Property
 */
public interface PropertyRepository extends PagingAndSortingRepository<Property, Long> {

    /**
     * Retrieves a properties by its name.
     *
     * @param name properties name
     * @return all properties with a name like the given one
     */
    Iterable<Property> findByNameLike(String name);
}
