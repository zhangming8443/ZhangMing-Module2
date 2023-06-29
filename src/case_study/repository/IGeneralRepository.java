package case_study.repository;

import java.util.List;

public interface IGeneralRepository <T>{
    List<T> display();
    void addNew(T t);
}
