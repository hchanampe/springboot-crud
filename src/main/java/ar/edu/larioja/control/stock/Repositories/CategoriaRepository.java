package ar.edu.larioja.control.stock.Repositories;

import ar.edu.larioja.control.stock.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {


    }


