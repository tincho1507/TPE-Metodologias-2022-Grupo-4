Caso de uso: Seleccionar turno
================================
**Descripción breve:** este caso de uso describe el proceso por medio del cual el paciente selecciona un turno.  
**Actor principal:** Paciente  
**Actor Secundario:** ----  
**Trigger:** Este caso de uso se activa cuando el paciente quiere seleccionar un turno.  

Curso Básico
----------------------
1) El caso de uso comienza cuando un paciente necesita seleccionar un turno.  
2) El sistema pide que el paciente seleccione un turno.  
3) El paciente selecciona un turno.  
4) El sistema pide reconfirmar los datos del paciente.  
5) El paciente confirma sus datos.  
6) El sistema verifica el turno.  
7) El sistema actualiza los turnos.  
8) El caso de uso termina.  

Cursos Alternativos
----------------------
**Curso Alternativo:** El paciente no confirma sus datos  
4) El sistema pide reconfirmar los datos del paciente.  
4.1) El paciente no confirma sus datos.  
4.2) Pasa al 8).  

**Curso Alternativo:** El turno elegido no es valido.  
6) El sistema verifica el turno.  
6.1) El sistema informa que el turno seleccionado no es valido.  
6.2) Vuelve al 2).  

------------


**PreCondición:** ----  
**PostCondición:** Que los turnos queden actualizados.  
**Suposiciones:** Que se haya elegido un medico y un rango de fechas.  
**Finalización del caso de uso:** El caso de uso finaliza cuando:  

 - El paciente selecciona un turno y este se actualiza.
 - El paciente no confirma sus datos.

