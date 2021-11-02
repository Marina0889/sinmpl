package ru.sapteh.dao;

import javax.persistence.Entity;
import java.util.List;

public interface Dao <Entity, Key>{
    Entity findById(Key key);
    List<Entity> findAll();
    void save(Entity entity);
    void update(Entity entity);
    void deleteById(Entity entity);
}
