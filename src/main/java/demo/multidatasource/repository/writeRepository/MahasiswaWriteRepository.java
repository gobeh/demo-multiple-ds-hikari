package demo.multidatasource.repository.writeRepository;

import demo.multidatasource.model.Mahasiswa;
import org.springframework.data.repository.CrudRepository;

public interface MahasiswaWriteRepository extends CrudRepository<Mahasiswa, Long> {
}
