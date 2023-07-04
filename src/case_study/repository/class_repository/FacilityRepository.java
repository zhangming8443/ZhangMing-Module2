package case_study.repository.class_repository;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.interface_repository.IFacilityRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static List<Facility> facilityList = new ArrayList<>();
    private Map<Facility, Integer> facilityMap = new LinkedHashMap();
    @Override
    public List<Facility> display() {
        return facilityList;
    }

    @Override
    public void addNew(Facility facility) {
        facilityList.add(facility);
    }
    @Override
    public void displayListFacilityMaintenance(Facility facility) {
        IFacilityRepository.super.displayListFacilityMaintenance(facility);
    }
}
