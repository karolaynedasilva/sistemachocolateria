package br.univille.sistemachocolateria.entity;

import java.io.Serializable;

public class ItemEstoque implements Serializable{

    private static final long serialVersionUID = 1L;
	
	private long qtd_produto;
	private long qtd_franquiado;
	private long qtd_funcionario;
	// private long qtd_produto_estoque;
	
	// public long getQtd_produto_estoque() {
	// 	return qtd_produto_estoque;
	// }
	// public void setQtd_produto_estoque(long qtd_produto_estoque) {
	// 	this.qtd_produto_estoque = qtd_produto_estoque;
	// }
	public long getQtd_funcionario() {
		return qtd_funcionario;
	}
	public void setQtd_funcionario(long qtd_funcionario) {
		this.qtd_funcionario = qtd_funcionario;
	}
	public long getQtd_produto() {
		return qtd_produto;
	}
	public void setQtd_produto(long qtd_produto) {
		this.qtd_produto = qtd_produto;
	}

	public long getQtd_franquiado() {
		return qtd_franquiado;
	}
	public void setQtd_franquiado(long qtd_franquiado) {
		this.qtd_franquiado = qtd_franquiado;
	}
    
		@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemEstoque other = (ItemEstoque) obj;
		if (qtd_funcionario != other.qtd_funcionario)
		return false;
		if (qtd_franquiado != other.qtd_franquiado)
			return false;
		if (qtd_produto != other.qtd_produto)
			return false;
		// if (qtd_produto_estoque != other.qtd_produto_estoque)
		// return false;
		
		return true;
	}
	
}
