package case_study.repository;

import case_study.model.Contract;

import java.util.List;

public class ContractRepository implements IContractRepository {
    @Override
    public void addNew(Contract contract) {
        IContractRepository.super.addNew(contract);
    }

    @Override
    public List display() {
        return IContractRepository.super.display();
    }

    @Override
    public void editContract(Contract contract) {
        IContractRepository.super.editContract(contract);
    }
}
