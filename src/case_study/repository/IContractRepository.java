package case_study.repository;

import case_study.model.Contract;

import java.util.List;

public interface IContractRepository extends IGeneralRepository<Contract>{
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
