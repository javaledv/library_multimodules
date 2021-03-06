package ml.ledv.library.modules.db.repository;

import ml.ledv.library.modules.db.entity.impl.ContentEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContentRepository extends PagingAndSortingRepository<ContentEntity, String> {
}
