package case_study.repository.interface_repository;

import case_study.model.booking.Contract;

import java.util.List;

public interface IContractRepository extends IGeneralRepository<Contract> {
    @Override
    default void addNew(Contract contract) {

    }
    @Override
    default List display() {
        return null;
    }
    default void editContract(Contract contract){

    }


}
