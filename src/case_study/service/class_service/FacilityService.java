package case_study.service.class_service;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.class_repository.FacilityRepository;
import case_study.repository.interface_repository.IFacilityRepository;
import case_study.service.interface_service.IFacilityService;
import case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private final Scanner scanner = new Scanner(System.in);
    IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        List<Facility> facilityList = facilityRepository.display();
        for (Facility facility : facilityList) {
            System.out.println(facility);
        }
    }

    @Override
    public void add() {
        String serviceCode = Regex.checkRoomFacility();
        String serviceName = "Room";
        double area = Regex.checkArea();
        int rentalCost = Regex.checkRentalCost();
        int maximumPeople = Regex.checkMaximumPeople();
        String rentalType = Regex.choiceRentalType();
        String serviceFree = Regex.choiceServiceFree();
        Facility room = new Room(serviceCode, serviceName, area, rentalCost, maximumPeople, rentalType, serviceFree);
        facilityRepository.addNew(room);
        System.out.println("COMPLETE ADD NEW ROOM !");
    }

    @Override
    public void addVilla() {
        String serviceCode = Regex.checkVillaFacility();
        String serviceName = "Villa";
        double area = Regex.checkArea();
        int rentalCost = Regex.checkRentalCost();
        int maximumPeople = Regex.checkMaximumPeople();
        String rentalType = Regex.choiceRentalType();
        String roomStandard = Regex.choiceRoomStandard();
        double poolArea = Regex.checkPoolArea();
        int numberOfFloors = Regex.checkNumberOfFloors();
        Facility villa = new Villa(serviceCode, serviceName, area, rentalCost, maximumPeople, rentalType, roomStandard, poolArea, numberOfFloors);
        facilityRepository.addNew(villa);
        System.out.println("COMPLETE ADD NEW ROOM !");
    }

    @Override
    public void addHouse() {
        String serviceCode = Regex.checkHouseFacility();
        String serviceName = "House";
        double area = Regex.checkArea();
        int rentalCost = Regex.checkRentalCost();
        int maximumPeople = Regex.checkMaximumPeople();
        String rentalType = Regex.choiceRentalType();
        String roomStandard = Regex.choiceRoomStandard();
        int numberOfFloors = Regex.checkNumberOfFloors();
        Facility house = new House(serviceCode, serviceName, area, rentalCost, maximumPeople, rentalType, roomStandard, numberOfFloors);
        facilityRepository.addNew(house);
        System.out.println("COMPLETE ADD NEW ROOM !");
    }

    @Override
    public void displayListFacilityMaintenance() {
        IFacilityService.super.displayListFacilityMaintenance();
    }
}

