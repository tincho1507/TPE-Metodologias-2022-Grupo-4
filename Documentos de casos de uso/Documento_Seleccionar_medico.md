## Caso de uso: "Seleccionar médico"  
  
**Descripción breve:** este caso de uso describe el proceso por medio del cual el cliente selecciona un medico.                            
**Actor principal:** Paciente.                                                        
**Actor Secundario:** ---                                         
**Trigger:** Este caso de uso se activa cuando el paciente quiere seleccionar un medico.

## Curso Básico  
1) El caso de uso comienza cuando un paciente quiere seleccionar un médico.                              
2) El sistema pide que el paciente seleccione un medico.                                     
3) El paciente selecciona un medico.                               
4) El sistema verifica la existencia del medico.                                                  
5) El sistema verifica la obra social del medico.                                                     
6) El caso de uso termina.                                                          

## Cursos Alternativos
**Curso Alternativo:** El paciente ingresa un medico no existente                                                   
4) El sistema verifica la existencia del medico.                                                             
4.1) El sistema informa que el medico no existe.                                                              
4.2) Vuelve a 2).                                                  
  
**Curso Alternativo:** El medico elegido no trabaja con la obra social del paciente                                                
5) El sistema verifica la obra social del medico.                                                                  
5.1) El sistema informa que el medico no trabaja con la obra social del paciente.                                                
5.2) El sistema consulta al paciente si quiere continuar de todas formas.                                                
5.3) El paciente confirma que quiere seguir.                                                        
5.4) El sistema verifica la respuesta del paciente.                                                            
5.5) Salta al paso 6).                                                    

**Curso Alternativo:** El paciente no quiere continuar                               
5.2) El sistema consulta al paciente si quiere continuar de todas formas.                                        
5.3.1) El paciente deniega que quiera seguir.                                                                          
5.3.2) El sistema verifica la respuesta del paciente.                                                            
5.3.3) Salta al paso 6).

----------

**PreCondición:** Verificar que haya medicos disponibles.                                                                                     
**PostCondición:** Verificar que el paciente haya seleccionado un medico.                                                                  
**Suposiciones:** Que el paciente este logueado.                                                                            
**Finalización del caso de uso:** El caso de uso finaliza cuando:                                              

 - El paciente selecciona un medico valido.
 - El paciente selecciona un medico que no trabaja con su obra social y no quiere proseguir.
 - El paciente selecciona un medico que no trabaja con su obra social y decide proseguir.
