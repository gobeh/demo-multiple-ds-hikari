package demo.multidatasource.repository.readRepository;

import demo.multidatasource.model.Mahasiswa;
import org.springframework.data.repository.CrudRepository;

public interface MahasiswaReadRepository extends CrudRepository<Mahasiswa, Long> {
}
