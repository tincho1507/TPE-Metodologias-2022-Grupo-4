
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import Clases.Direccion;
import Clases.InstitucionMedica;
import Clases.Paciente;
import Clases.Medico;
import Condiciones.Medico.*;
import Clases.Turno;
import Condiciones.Turno.FiltroHorario;
import Condiciones.Turno.FiltroRango;
import Condiciones.Turno.FiltroTurnoAnd;
import java.time.LocalDateTime;	
public class Main {

	public static void main(String[] args) {
		InstitucionMedica i = new InstitucionMedica("Sanatorio");

		//Hay que crear 3 LocalDateTime random con horas para probar
		LocalDateTime ldt = LocalDateTime.of(2019, 12, 12, 12, 12);
		LocalDateTime ldt2 = LocalDateTime.of(2019, 12, 13, 13, 12);
		LocalDateTime ldt3 = LocalDateTime.of(2019, 12, 11, 14, 12);
		
		//Hay que crear una lista de 3 clase Turno
		Turno t1 = new Turno(ldt, 1, null, null);
		Turno t2 = new Turno(ldt2, 1, null, null);
		Turno t3 = new Turno(ldt3, 1, null, null);

		//Lista de Turnos
		ArrayList<Turno> listaTurnos = new ArrayList<Turno>();
		listaTurnos.add(t1);
		listaTurnos.add(t2);
		listaTurnos.add(t3);

		//Creo arrayList de obra sociales y añado obras sociales a la lista
		ArrayList<String> listaObrasSociales = new ArrayList<String>();
		listaObrasSociales.add("OS1");
		listaObrasSociales.add("OS2");
		listaObrasSociales.add("OS3");


		//Creo arrayList de dias laborales
		ArrayList<String> listaDiasLaborales = new ArrayList<String>();
		listaDiasLaborales.add("Lunes");
		listaDiasLaborales.add("Martes");
		listaDiasLaborales.add("Miercoles");
		listaDiasLaborales.add("Jueves");
		listaDiasLaborales.add("Viernes");

		//Aca hay que crear 3 medicos con nombre,apellido,dni,mail,nroMatricula,especialidad,horaInicio,horaFin,diasLaborales, obrasSociales al azar
		Medico m = new Medico("Juan", "Perez", 12345678, "mail", 
		12345, "Odontologia", 8, 18, listaDiasLaborales, listaObrasSociales);
		Medico m1 = new Medico("Gregory", "House", 4444444, "mail", 
		444, "Cirujano", 8, 18, listaDiasLaborales, listaObrasSociales);
		Medico m2 = new Medico("Roberto", "Falcone", 55555, "mail", 
		3333, "Pediatra", 8, 18, listaDiasLaborales, listaObrasSociales);		
		

		//Le añado los turnos a los medicos
		m.add(t1);
		m1.add(t2);
		m2.add(t3);

		t1.setMedico(m);
		t2.setMedico(m1);
		t3.setMedico(m2);

		//Creo Arraylist de medicos y añado m,m1 y m2
		ArrayList<Medico> listaMedicos = new ArrayList<Medico>();
		listaMedicos.add(m);
		listaMedicos.add(m1);
		listaMedicos.add(m2);

		for (Medico medico : listaMedicos) {
			i.addMedico(medico);
		}


		Direccion d = new Direccion("Calle falsa", 123, "Ciudad");
		//Creo un paciente con nombre,apellido,dni,mail,telefono,direccion,obraSocial

		Paciente p = new Paciente("Miguel", "Benitez", 12345, "mail", "OS1", 123489,12334, d );
		
		Scanner selector = new Scanner (System.in);
		
		int opcion = 0;
		System.out.println("Bienvenido a TurnoFacil");

		while (opcion != 2)
		{

		//Primero el paciente debe elegir que quiere hacer

			System.out.println("0-Sacar turno");
			System.out.println("1-Ver sus proximos turnos");
			System.out.println("2-Salir");
			opcion = Integer.parseInt(selector.nextLine());
			
			//Si el paciente quiere ver sus proximos turnos
			if (opcion == 0)
			{
				//El usuario ingresa si quiere filtrar por obra social y especialidad
			  System.out.println("Quiere filtrar a los medicos por obra social y especialidad? 1-Si 2-No");
			  int resultado = Integer.parseInt(selector.nextLine());
			  Medico medicoSeleccionado = null;
			  ArrayList<Medico> medicosDisponible = new ArrayList<Medico>();
			  //Si quiere filtrar por obra social y especialidad
			  if (resultado == 1)
			  {

				  System.out.println("Ingrese la obra social:");
				  String obraSocial = selector.nextLine();
				  System.out.println("Ingrese la especialidad");
				  String especialidad = selector.nextLine();
				  //Creacion de filtros por especialidad y obra social
				  FiltroMedico filtroEspecialidad = new FiltroEspecialidad(especialidad);
				  FiltroMedico filtroObraSocial = new FiltroObraSocial(obraSocial);
				  FiltroMedico filtroCompuesto = new FiltroCompuestoAnd(filtroEspecialidad, filtroObraSocial);
				   medicosDisponible = (i.listarMedicosFiltro(filtroCompuesto));
				  
				
				}
			  else
			  {
				  //Si no quiere filtrar por obra social y especialidad

				   medicosDisponible = (i.listarMedicosFiltro(null));

				}
				if (medicosDisponible.size() != 0){
					for (int j = 0; j < medicosDisponible.size(); j++)
					{
						System.out.println(j + ":" + medicosDisponible.get(j).getNombre());
					}
						
					//El usuario ingresa el medico que quiere ver sus proximos turnos
					System.out.println("Ingrese el numero del medico");
					int indiceMedicoSeleccionado = Integer.parseInt(selector.nextLine());
					if (indiceMedicoSeleccionado >= 0 && indiceMedicoSeleccionado < medicosDisponible.size())
					{
						medicoSeleccionado = medicosDisponible.get(indiceMedicoSeleccionado);
					
						if (medicoSeleccionado.trabajaObraSocial(p.getObraSocial())){
							System.out.println("El medico no trabaja en la obra social tuya");
						}
						System.out.println("El médico inicia a trabajar a las : " + medicoSeleccionado.getHoraInicio() + " y termina de trabajar a las : " + medicoSeleccionado.getHoraFin());
			
						//Mostrar los turnos del medico en el rango de la fecha
						System.out.println("Ingrese la fecha de inicio para su busqueda (yyyy-MM-dd)");
						String fechaInicioString = selector.nextLine();
						System.out.println("Ingrese la fecha de fin para su busqueda (yyyy-MM-dd)");
			
						String fechaFinString = selector.nextLine();
						
						//Pasamos las fechas a LocalDate
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
						LocalDate fechaInicioLocal = LocalDate.parse(fechaInicioString, formatter);
						LocalDate fechaFinLocal = LocalDate.parse(fechaFinString, formatter);
						
						//Ingresa si quiere el turno por la mañana o la tarde
						System.out.println("Desea su turno por la mañana? 1-Si 2-No");
						int turnoMananaSeleccionado = Integer.parseInt(selector.nextLine());
			
			
						//Creamos los filtros de fecha
						FiltroRango  filtroRango = new FiltroRango(fechaInicioLocal, fechaFinLocal);
						FiltroHorario filtroHorario = new FiltroHorario(turnoMananaSeleccionado);
						FiltroTurnoAnd filtroCompuesto = new FiltroTurnoAnd(filtroRango, filtroHorario);
						
						//Se obtienen y se muestran los turnos disponibles
						ArrayList<Turno> turnosDisponible = i.mostrarTurnosDisponibles(filtroCompuesto, medicoSeleccionado);
						if (turnosDisponible.size() == 0){
							System.out.println("No hay turnos disponibles, desea ver los de la siguiente semana? 1-Si 2-No");
							int proximaSemanaSeleccionada = Integer.parseInt(selector.nextLine());
							if (proximaSemanaSeleccionada == 1){
								filtroRango = new FiltroRango(fechaInicioLocal.plusDays(7), fechaFinLocal.plusDays(7));
								turnosDisponible = i.mostrarTurnosDisponibles(filtroCompuesto, medicoSeleccionado);
							}
							
						}
						if (turnosDisponible.size() != 0){
						System.out.println("Los turnos disponibles son:");
						for ( int j = 0; j < turnosDisponible.size(); j++)
						{
							System.out.println(j + ":" + turnosDisponible.get(j).getFecha().toString());
						}
						//Se ingresa el numero de turno que quiere reservar
						System.out.println("Ingrese el numero de turno");
						int nroTurnoSeleccionado = Integer.parseInt(selector.nextLine());
						if ( nroTurnoSeleccionado < turnosDisponible.size()){
							//Se reconfirma sus datos
							System.out.println("Por favor reconfirme sus datos:");
							System.out.println(p.toString());
							System.out.println("Ingrese 1 para confirmar");
							int confirmacionSeleccionada = Integer.parseInt(selector.nextLine());
							//Aca se saca turno
							if (confirmacionSeleccionada == 1){
								System.out.println("Datos confirmados");
							
							}
							else { System.out.println("Datos no confirmados");}


						} 
						else { System.out.println("El numero de turno ingresado no existe");}
						
					
						}
						else {
							System.out.println("No hay turnos disponibles");
						}
	
					
					}
					else
					{
						System.out.println("El medico seleccionado no existe");
					}
					}
				else
				{
					System.out.println("No hay medicos disponibles");
				}
			//Mostrar fechas del medico	
				}
			else
			{
				if (opcion == 1)
				{
					//Ver sus proximos turnos no las vamos a hacer
				}
				else
				{
					if (opcion == 2)
					{
						System.exit(0);
					}						//Ver sus turnos anteriores
					else {
						System.out.println("La opcion ingresada no es valida");
					}
				}
			}

				
		}
		selector.close();
	}

}
