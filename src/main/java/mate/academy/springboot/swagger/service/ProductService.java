package mate.academy.springboot.swagger.service;

import mate.academy.springboot.swagger.model.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    Product save(Product product);

    Product get(Long id);

    void update(Product product);

    void delete(Long id);

    List<Product> findAllByPriceBetween(Pageable pageable, BigDecimal from, BigDecimal to);

    List<Product> findAll(PageRequest pageRequest);
}