package demo.multidatasource.repository;

import demo.multidatasource.repository.readRepository.MahasiswaReadRepository;
import demo.multidatasource.repository.writeRepository.MahasiswaWriteRepository;

public interface MahasiswaRepositoryCombo extends MahasiswaReadRepository, MahasiswaWriteRepository {

}
