package codigo;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class Players {
	
	public boolean validarNome(String nome){
		
		boolean valida = true;
		
		if(!nome.equals("")){
			for(int i=0; i<modelo.Players.players.size(); i++){
				if(nome.equals(modelo.Players.players.get(i).getNome())){
					valida = false;
					JOptionPane.showMessageDialog(null, "Já existe um jogador com esse nome.");
					break;
				}else{
					valida = true;
				}
			}
		}else{
			JOptionPane.showMessageDialog(null, "Preencha todos os campos");
			valida = false;
		}
		
		return valida;
		
	}
	
	public String guardarHora(){
		
		//LocalDateTime
		LocalDateTime tempo = LocalDateTime.now();
				
		int dia = tempo.getDayOfMonth();
		int mes = tempo.getMonthValue();
		int ano = tempo.getYear();
		String data = dia+"/"+mes+"/"+ano;
		
		return data;
		
	}

}
