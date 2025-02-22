package com.api.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Data access layer component
@Repository
public interface UserRepository extends CrudRepository<User,Long> {}
