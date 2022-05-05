Caso de uso: Seleccionar rango de fecha
================================
**Descripción breve:** Este caso de uso describe el proceso por medio del cual el paciente selecciona un rango de fechas.   
**Actor principal:** Paciente  
**Actor Secundario:** ----  
**Trigger:** Este caso de uso se activa cuando el paciente quiere seleccionar un rango de fechas para el turno.

Curso Básico
----------------------
1) El caso de uso comienza cuando un paciente necesita seleccionar un rango de fechas.  
2) El sistema pide que el paciente seleccione un rango de fechas.  
3) El paciente selecciona un rango de fechas.  
4) El sistema verifica que haya turnos en ese rango de fechas.
5) El caso de uso termina.

Cursos Alternativos
----------------------
**Curso Alternativo:** No hay turnos en el rango de fechas seleccionado por el paciente.  
4) El sistema verifica que haya turnos en ese rango de fechas.  
4.1) El sistema informa al paciente que no hay turnos en ese rango de fechas.  
4.2) El sistema consulta al paciente si quiere ver los turnos de la siguiente semana.  
4.3) El paciente confirma querer ver los turnos de la semana siguiente.  
4.4) El sistema verifica la respuesta.  
4.5) Vuelve al 4).  
  
**Curso Alternativo:** El paciente no quiere ver los turnos de la siguiente semana.  
4.2) El sistema consulta al paciente si quiere ver los turnos de la siguiente semana.  
4.2.1) El paciente deniega querer ver los turnos de la semana siguiente.  
4.2.2) El sistema verifica la respuesta.  
4.2.3) Vuelve al paso 5).  

----------------------
**PreCondición:** ----  
**PostCondición:** Que el rango de fechas seleccionado sea valido  
**Suposiciones:** Que se haya seleccionado un medico  
**Finalización del caso de uso:** El caso de uso finaliza cuando:  

 - El paciente selecciona un rango de fechas valido.
 - El paciente decide no ver los turnos de la siguiente semana.