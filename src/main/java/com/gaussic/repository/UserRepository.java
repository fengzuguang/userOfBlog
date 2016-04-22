package com.gaussic.repository;

import com.gaussic.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/4/20.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
