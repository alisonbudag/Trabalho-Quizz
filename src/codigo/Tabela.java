package codigo;

import java.util.Collections;

import javax.swing.table.DefaultTableModel;

public class Tabela {

public DefaultTableModel listarRanking() {
		
		//DefaultTableModel
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Nome");
		model.addColumn("Acertos");
		model.addColumn("Categoria");
		model.addColumn("Data");
		
		Collections.sort(modelo.Players.players);
		
		for(int i=0; i<modelo.Players.players.size(); i++) {
			model.addRow(new Object[] {
					modelo.Players.players.get(i).getNome(),
					modelo.Players.players.get(i).getAcertos(),
					modelo.Players.players.get(i).getCategoria(),
					modelo.Players.players.get(i).getData()
				});
		}
			
		//Retorno
		return model;
				
	}
	
}
