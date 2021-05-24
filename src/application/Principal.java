package application;

import controller.ConsultaPacienteController;
import controller.PrincipalController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
// COLOCAR ENTER PRA LOGAR
public class Principal extends Application {
	public static Stage stage;
	public static Scene scn = null;
	static PrincipalController pControl = new PrincipalController();
	static ConsultaPacienteController consultaPacienteController = new ConsultaPacienteController();
	
	@Override
	public void start(Stage stg) throws Exception {
		stage = stg;
		stg.setTitle("Clínica Médica");
		mudarScene(0);
		stg.show();
	}
	
	public static void mudarScene(int index){
		switch(index){
		case 0:
			stage.setTitle("Login");
			scn = pControl.telaLogin();
			break;
		case 1:
			stage.setTitle("Escolha");
			scn = pControl.telaEscolha();
			break;
		case 2:
			stage.setTitle("Paciente");
			scn = consultaPacienteController.telaPaciente();
			break;
		case 3:
		case 4:
		}
		stage.setScene(scn);
	}


	public static void main(String[] args) {
		Application.launch(Principal.class, args);
	}
}