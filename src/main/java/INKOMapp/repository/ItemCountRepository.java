package INKOMapp.repository;

import INKOMapp.model.ItemCounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCountRepository extends JpaRepository<ItemCounts, Long> {
}
