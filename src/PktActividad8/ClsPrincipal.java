package PktActividad8;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ImageIcon;
public class ClsPrincipal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Creacion de los llamados
		//Arreglo del vector
		ClsCalculo arrObj[]= new ClsCalculo[5];
		//Llamado de Promedio
		ClsNota Calculo= new ClsNota();
		//Creacion del color
		UIManager UI=new UIManager();
		//creacion del icono
		ImageIcon icono = new ImageIcon("src/img/icono.png");
		//Declaracion de las variables
		String Tomo = null;
		char nota = 0;
		int Folio = 0;
		int Asiento = 0;
		String PNombre = null;
		String SNombre = null;
		String PApellido = null;
		String SApellido = null;
		int Parcial1=0;
		int Parcial2=0;
		int Parcial3=0;
		int Labo1=0;
		int Labo2=0;
		int Labo3=0;
		int Semestral=0;
		int i;
		//Definir color
		UI.put("OptionPane.background",new Color (152, 203, 220 ));UI.put("Panel.background", new Color(106, 194, 222));
		//Creacion del vector
		for(i=0;i<arrObj.length;i++) {
			Tomo=JOptionPane.showInputDialog("Ingresa el tomo del estudiante: "+(i+1));
			Folio=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el folio del estudiante:"+(i+1)));
			Asiento=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Asiento del estudiante: "+(i+1)));
			PNombre=JOptionPane.showInputDialog("¿Cual es el nombre del estudiante: "+(i+1)+"?");
			SNombre=JOptionPane.showInputDialog("¿Cual es el segundo nombre del estudiante: "+(i+1)+"?");
			PApellido=JOptionPane.showInputDialog("¿Cual es el apellido del estudiante: "+(i+1)+" ?");
			SApellido=JOptionPane.showInputDialog("¿Cual es el segundo apellido del estudiante: "+(i+1)+"?");
			Parcial1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota del parcial 1 del estudiante: "+(i+1)));
			Parcial2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota del parcial 2 del estudiante: "+(i+1)));
			Parcial3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota del parcial 3 del estudiante: "+(i+1)));
			Labo1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota del laboratorio 1 del estudiante: "+(i+1)));
			Labo2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota del laboratorio 2 del estudiante: "+(i+1)));
			Labo3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota del laboratorio 3 del estudiante: "+(i+1)));
			Semestral=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota del semestral del estudiante: "+(i+1)));
			//Vinculacion con el vector
			arrObj[i]=new ClsCalculo(Tomo,Folio,Asiento,PNombre,SNombre,PApellido,SApellido,Parcial1,Parcial2,Parcial3,Labo1,Labo2,Labo3,Semestral);
		}
		//Impresion del vector
		for(i=0;i<arrObj.length;i++) {
            int porcentajeTotal = Calculo.MtdPromedio(Parcial1, Parcial2, Parcial3, Labo1, Labo2, Labo3, Semestral);
            char notaFinal=ClsNota.MtdNota(porcentajeTotal);
			JOptionPane.showMessageDialog(null, "Datos del Estudiante "+(i+1)
					+ "\nNombre Completo: "+ arrObj[i].getPrimerNombre()+" "+  arrObj[i].getSegundoNombre()+ " "+ arrObj[i].getPrimerApellido()+" "+ arrObj[i].getSegundoApellido()+" "+""
					+"\nCedula: "+ arrObj[i].getTomo()+"-"+arrObj[i].getFolio()+"-"+ arrObj[i].getAsiento()+""
					+ "\n\nNotas Parciales:\nParcial 1 :"+arrObj[i].getNotaParcial1()+"\nParcial 2 :"+  arrObj[i].getNotaParcial2()+"\nParcial 3 :"+ arrObj[i].getNotaParcial3()+
					"\n\nNotas laboratorios:\n"+"Laboratorio 1: "+  arrObj[i].getNotaLaboratorio1()+"\nLaboratorio 2: "+ arrObj[i].getNotaLaboratorio2()+ "\nLaboratorio 3: "+ arrObj[i].getNotaLaboratorio3()+""
					+ "\n\nNota Semestral: "+  arrObj[i].getNotaSemestral()+"\n\nPorcentaje final : "+porcentajeTotal+"%"+"\nNota Final: "+notaFinal,"Datos",0,icono);
			
		}
		
}
	
}