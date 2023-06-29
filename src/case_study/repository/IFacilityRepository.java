package case_study.repository;

import case_study.model.Facility;

import java.util.List;

public interface IFacilityRepository extends IGeneralRepository<Facility>{
    @Override
    default List<Facility> display() {
        return null;
    }

    @Override
    default void addNew(Facility facility) {

    }
    default List<Facility> displayListFacilityMaintenance(){
        return null;
    }
}
