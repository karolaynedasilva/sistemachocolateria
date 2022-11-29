package br.univille.sistemachocolateria.entity;

import java.io.Serializable;

public class ItemEstoque implements Serializable{

    private static final long serialVersionUID = 1L;
	
	private long qtd_produto;
	private long qtd_fornecedor;
	private long qtd_funcionario;
	
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

	public long getQtd_fornecedor() {
		return qtd_fornecedor;
	}
	public void setQtd_fornecedor(long qtd_fornecedor) {
		this.qtd_fornecedor = qtd_fornecedor;
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
		if (qtd_fornecedor != other.qtd_fornecedor)
		return false;
		if (qtd_fornecedor != other.qtd_fornecedor)
			return false;
		if (qtd_produto != other.qtd_produto)
			return false;
		
		return true;
	}
	
}
