package case_study.repository.interface_repository;

import case_study.model.facility.Facility;

import java.util.List;

public interface IFacilityRepository extends IGeneralRepository<Facility> {
    @Override
    default List<Facility> display() {
        return null;
    }

    @Override
    default void addNew(Facility facility) {

    }

    default void displayListFacilityMaintenance(Facility facility) {

    }
}
