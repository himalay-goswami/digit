package dev.udd.sso.backendapi.backendapi.repository;

import dev.udd.sso.backendapi.backendapi.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class BackendRepository {

    private final List<UserEntity> userEntityList;

    public BackendRepository(List<UserEntity> userEntityList) {
        this.userEntityList = userEntityList;
    }

    public void addUser(UserEntity user){
        userEntityList.add(user);
    }

    public UserEntity getUser(String sso){
      for(UserEntity s: userEntityList){
          if(Objects.equals(s.getSso(), sso)){
              return s;
          }}
      return null;
    }

}
