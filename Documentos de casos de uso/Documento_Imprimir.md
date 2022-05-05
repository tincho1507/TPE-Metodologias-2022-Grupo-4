**Nombre del caso de uso:** "Imprimir".  
**Descripción breve:** este caso de uso describe el proceso por medio del cual el paciente imprime el turno.
**Actor principal:** Paciente  
**Actor Secundario:** ---  
  
**Trigger:** Este caso de uso se activa cuando el paciente quiere imprimir el turno.

**Curso Básico**:  
1) El caso de uso comienza cuando un paciente necesita imprimir el turno.  
2) El sistema consulta al paciente si quiere imprimir el turno.  
3) El paciente confirma querer imprimir el turno.  
4) El sistema verifica la respuesta del paciente.
5) El caso de uso termina.
  
**Curso Alternativo:** El paciente no quiere imprimir
2) El sistema consulta al paciente si quiere imprimir el turno.  
2.1) El paciente deniega querer imprimir el turno.
2.2) El sistema verifica la respuesta del paciente.
2.3) Vuelve a 5).

**PreCondición:** ----.
**PostCondición:** ----.
**Suposiciones:** Que se haya elegido un medico, un rango de fechas y un turno. 
  
**Finalización del caso de uso:** El caso de uso finaliza cuando:

 - El paciente confirma imprimir el turno.
 - El paciente no confirma querer imprimir el turno.

