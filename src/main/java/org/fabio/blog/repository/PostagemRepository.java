package org.fabio.blog.repository;

import java.util.List;

import org.fabio.blog.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List<Postagem> findAllByTituloContainIgnoreCase (String titulo);

}
