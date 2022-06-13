## Caso de uso: "Seleccionar médico"  
  
**Descripción breve:** este caso de uso describe el proceso por medio del cual el cliente selecciona un medico.                            
**Actor principal:** Paciente.                                                        
**Actor Secundario:** ---                                         
**Trigger:** Este caso de uso se activa cuando el paciente quiere seleccionar un medico.

## Curso Básico  
1) El caso de uso comienza cuando un paciente quiere seleccionar un médico.                              
2) El sistema pide que el paciente seleccione un medico.                                     
3) El paciente selecciona un medico.                                                                                 
5) El sistema verifica la obra social del medico.                                                     
6) El caso de uso termina.                                                          

## Cursos Alternativos                      
  
**Curso Alternativo:** El medico elegido no trabaja con la obra social del paciente
4) El sistema verifica la obra social del medico.                                                                  
4.1) El sistema informa que el medico no trabaja con la obra social del paciente.                                                
4.2) El sistema consulta al paciente si quiere continuar de todas formas.                                                
4.3) El paciente ingresa su respuesta.                                                      
4.4) El sistema verifica la respuesta del paciente.                                                            
4.5) Salta al paso 5).                                                    


----------


**PreCondición:** Verificar que haya medicos disponibles.                                                                                     
**PostCondición:** Verificar que el paciente haya seleccionado un medico.                                                                  
**Suposiciones:** Que el paciente este logueado.                                                                            
**Finalización del caso de uso:** El caso de uso finaliza cuando:                                              

 - El paciente selecciona un medico valido  o                                        
 - El paciente selecciona un medico que no trabaja con su obra social y no quiere proseguir  o                                     
 - El paciente selecciona un medico que no trabaja con su obra social y decide proseguir.
