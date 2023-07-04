package case_study.repository.class_repository;

import case_study.model.booking.Contract;
import case_study.repository.interface_repository.IContractRepository;

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
