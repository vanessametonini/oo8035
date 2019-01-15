package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	Conta conta;
	
	public void criaConta(Evento evento) {
		
		String tipo = evento.getSelecionadoNoRadio("tipo"); 
				
		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		}
		else if(tipo.contentEquals("Conta Poupança")){
			this.conta = new ContaPoupanca();
		}
		
		this.conta.setTitular(evento.getString("titular"));
		this.conta.setAgencia(evento.getString("agencia"));
		this.conta.setNumero(evento.getInt("numero"));
		
	}
	
	public void deposita(Evento evento) {
		double valorDepositado = evento.getDouble("valorOperacao");
		this.conta.deposita(valorDepositado);
	}
	
	public void saca(Evento evento) {
		double valorSaque = evento.getDouble("valorOperacao");
		this.conta.saca(valorSaque);	
	}
	
	public void transfere(Evento evento){
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}

}
