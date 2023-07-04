package case_study.service.interface_service;

public interface IFacilityService extends IGeneralService {
    @Override
    default void display() {

    }

    @Override
    default void add() {

    }

    void addVilla();

    void addHouse();

    default void displayListFacilityMaintenance() {

    }


}
