package case_study.repository;

import case_study.model.Facility;

import java.util.List;

public class FacilityRepository implements IFacilityRepository {
    @Override
    public List<Facility> display() {
        return IFacilityRepository.super.display();
    }

    @Override
    public void addNew(Facility facility) {
        IFacilityRepository.super.addNew(facility);
    }

    @Override
    public List<Facility> displayListFacilityMaintenance() {
        return IFacilityRepository.super.displayListFacilityMaintenance();
    }
}
