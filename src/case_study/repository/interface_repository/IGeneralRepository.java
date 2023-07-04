package case_study.repository.interface_repository;

import java.util.List;

public interface IGeneralRepository <T>{
    List<T> display();
    void addNew(T t);
}
