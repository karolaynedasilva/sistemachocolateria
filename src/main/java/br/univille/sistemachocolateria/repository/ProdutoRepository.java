package br.univille.sistemachocolateria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.univille.sistemachocolateria.entity.Produto;
import br.univille.sistemachocolateria.util.PaginacaoUtil;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

        // public PaginacaoUtil<Produto> findByName(String nome, int pagina) {

	// 	int tamanho = 5;
	// 	int inicio = (pagina - 1) * tamanho;
	// 	List<Produto> produtos = getEntityManager()
	// 			.createQuery("select p from Produto p where p.descricao like concat('%',?1,'%')", Produto.class)
	// 			.setParameter(1, nome).setFirstResult(inicio).setMaxResults(tamanho).getResultList();

	// 	long totalRegistros = produtos.size();
	// 	long totalDePaginas = (totalRegistros + (tamanho - 1)) / tamanho;

	// 	return new PaginacaoUtil<>(tamanho, pagina, totalDePaginas, produtos, null);

	// }

	// public static Object getEntityManager() {
        //         return null;
        // }

        // public PaginacaoUtil<Produto> findByFornecedor(Long idFornecedor, int pagina) {

	// 	int tamanho = 5;
	// 	int inicio = (pagina - 1) * tamanho;
	// 	List<Produto> produtos = getEntityManager()
	// 			.createQuery("select p from Produto p where p.fornecedor.id = ?1", Produto.class)
	// 			.setParameter(1, idFornecedor).setFirstResult(inicio).setMaxResults(tamanho).getResultList();

	// 	long totalRegistros = produtos.size();
	// 	long totalDePaginas = (totalRegistros + (tamanho - 1)) / tamanho;

	// 	return new PaginacaoUtil<>(tamanho, pagina, totalDePaginas, produtos, null);

	// }

	// public PaginacaoUtil<Produto> buscaPaginada(int pagina) {
	// 	int tamanho = 5;
	// 	int inicio = (pagina - 1) * tamanho;
	// 	List<Produto> produtos = getEntityManager()
	// 			.createQuery("select p from Produto p order by p.descricao asc", Produto.class).setFirstResult(inicio)
	// 			.setMaxResults(tamanho).getResultList();

	// 	long totalRegistros = count();
	// 	long totalDePaginas = (totalRegistros + (tamanho - 1)) / tamanho;

	// 	return new PaginacaoUtil<>(tamanho, pagina, totalDePaginas, produtos, null);
	// }

	// public long count() {
	// 	return getEntityManager().createQuery("select count(*) from Produto", Long.class).getSingleResult();
	// }
}
