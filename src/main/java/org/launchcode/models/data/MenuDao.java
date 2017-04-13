package org.launchcode.models.data;

import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by cyncia on 2017/4/12.
 */
@Transactional
@Repository
public interface MenuDao extends CrudRepository<Menu, Integer> {
}
