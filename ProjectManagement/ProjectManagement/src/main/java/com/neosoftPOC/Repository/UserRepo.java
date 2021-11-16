package com.neosoftPOC.Repository;

import com.neosoftPOC.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Long> {
}
