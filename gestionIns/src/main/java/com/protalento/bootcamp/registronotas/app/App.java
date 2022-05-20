package com.protalento.bootcamp.registronotas.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.protalento.bootcamp.registronotas.domain.Alumno;
import com.protalento.bootcamp.registronotas.domain.Cursos;
import com.protalento.bootcamp.registronotas.domain.Inscripciones;
import com.protalento.bootcamp.registronotas.domain.Materia;
import com.protalento.bootcamp.registronotas.services.AlumnoService;
import com.protalento.bootcamp.registronotas.services.CursosService;
import com.protalento.bootcamp.registronotas.services.InscripcionesService;
import com.protalento.bootcamp.registronotas.services.MateriaService;
import com.protalento.bootcamp.registronotas.services.MenuAlumnoService;
import com.protalento.bootcamp.registronotas.services.MenuCursosService;
import com.protalento.bootcamp.registronotas.services.MenuInscripcionesService;
import com.protalento.bootcamp.registronotas.services.MenuMateriaService;
import com.protalento.bootcamp.registronotas.services.implement.AlumnoServiceImpl;
import com.protalento.bootcamp.registronotas.services.implement.CursosServiceImp;
import com.protalento.bootcamp.registronotas.services.implement.InscripcionesServicesImpl;
import com.protalento.bootcamp.registronotas.services.implement.MateriaServiceImpl;
import com.protalento.bootcamp.registronotas.services.implement.MenuAlumnoServiceImpl;
import com.protalento.bootcamp.registronotas.services.implement.MenuCursosServiceImpl;
import com.protalento.bootcamp.registronotas.services.implement.MenuInscripcionesServiceImpl;
import com.protalento.bootcamp.registronotas.services.implement.MenuMateriaServiceImpl;

public class App {

	public static void main(String[] args) {
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		List<Cursos> cursos = new ArrayList<Cursos>();
		List<Materia> materias = new ArrayList<Materia>();
		List<Inscripciones> inscripciones = new ArrayList<Inscripciones>();
		DBMemoria db = new DBMemoria(alumnos, cursos, materias, inscripciones);
		
		AlumnoService service = new AlumnoServiceImpl(db);
		CursosService service2 = new CursosServiceImp(db);
		MateriaService service3 = new MateriaServiceImpl(db);
		InscripcionesService service4 = new InscripcionesServicesImpl(db,service2,service,service3);
		MenuAlumnoService menuAlumno = new MenuAlumnoServiceImpl();
		MenuCursosService menuCurso = new MenuCursosServiceImpl();
		MenuMateriaService menuMateria = new MenuMateriaServiceImpl();
		MenuInscripcionesService menuInscripciones = new MenuInscripcionesServiceImpl(db,service2,service,service3);
		Alumno auxAlumno=new Alumno();
		Cursos auxCurso = new Cursos();
		Materia auxMateria = new Materia();
		Inscripciones auxInsc = new Inscripciones();
		
		Scanner teclado = new Scanner(System.in);
		int opcion;
		
		do {
			opcion = menuAlumno.menuppal(teclado);
			switch(opcion) {
			       case 1:
				             do {
				        	 opcion=menuAlumno.submenu(teclado);
				        	 switch(opcion) {
				        	 	    case 1:
				        	 	    	auxAlumno=menuAlumno.save(teclado);
				        	 	    	service.save(auxAlumno);
				        		        break;
				        	 	    case 2:
					        	 		   if(!(alumnos.size()==0)){
							       				int idsearch = menuAlumno.findById(teclado);
							       				auxAlumno=service.findByid(idsearch);
							       				if(auxAlumno.getNombres()==null)
							       					System.out.println("Alumno no encontrado!");
						        	             }else {
						        	        	   System.out.println("-----------------------------------------------------");
						        	        	   System.out.println("No hay alumnos registrados...");
						        	             }
				       			             break;
				        	 	    case 3:
					        	 		     if(!(alumnos.size()==0)){
						        	 		   	int idalumno = menuAlumno.findById(teclado);
						        	 		    service.delete(idalumno);
					        	 		        }else {
							        	        	 System.out.println("-----------------------------------------------------");
							        	        	 System.out.println("No hay alumnos registrados...");
				        	                    }
				        	 	             break;
				        	 	    case 4:
						        	 		  if(!(alumnos.size()==0)){
							        	 		    service.toList();
							        	 		    System.out.println("Ingrese el DNI:");
							        	 		    int dni=teclado.nextInt();
							        	 		    auxAlumno = service.findByid(dni);
							        	 		    System.out.println(auxAlumno.toString());
							        	 		    Alumno alumno_actualizado = new Alumno();
							        	 		    alumno_actualizado=menuAlumno.update(teclado);
							        	 		    alumno_actualizado.setId(dni);
							        	 		    service.update(alumno_actualizado);
						        	                }else{
							        	        	 System.out.println("-----------------------------------------------------");
							        	        	 System.out.println("No hay alumnos registrados...");
						        	                }
				        	 	                    break;
				        	 	   case 5:
						        	 		  if(!(alumnos.size()==0)){
							        	 		   menuAlumno.findAll(teclado);
							        	 		   service.toList();
						        	 		  	   }else{
							        	        	 System.out.println("-----------------------------------------------------");
							        	        	 System.out.println("No hay alumnos registrados...");
						        	 		  	   }
						        	 		  break;
				        	 	   default:
				        	 		   	
				        	 	              break;
				        	 	   }
				               }while(opcion!=9);
				                break;
			  case 2: 
			         do {
			        	 opcion=menuMateria.submenu(teclado);
			        	 switch(opcion) {
			        	 case 1:
						  auxMateria=menuMateria.save(teclado);
						  service3.save(auxMateria);
		  	 	    	  
		  	 	    	 break;
			        	 case 2:
				        		 if(!(materias.size()==0)){
					       				int idsearch = menuMateria.findById(teclado);
					       				auxMateria=service3.findByid(idsearch);
					       				System.out.println("Información de la Materia");
					       				System.out.println(auxMateria.toString());
					       				
					        	           }else {
					        	        	   System.out.println("-----------------------------------------------------");
					        	        	 System.out.println("No hay materias registrados...");
					        	        	
					        	           }
			        	         break;
			        	 case 3:
				        		 if(!(materias.size()==0)){
				        	 		   	int idmateria = menuMateria.findById(teclado);
				        	 		    service3.delete(idmateria);
				        	 		    
					        	 		  }else {
					        	        	 System.out.println("-----------------------------------------------------");
					        	        	 System.out.println("No hay materias registrados...");
					        	        	
					        	           }
			        	          break;
			        	 case 4:
					        		 if(!(materias.size()==0)){
					        	 		    service3.toList();
					        	 		    System.out.println("Ingrese el ID de la materia:");
					        	 		    int id=teclado.nextInt();
					        	 		    auxMateria = service3.findByid(id);
					        	 		    System.out.println(auxMateria.toString());
					        	 		    Materia materia_actualizada = new Materia();
					        	 		    materia_actualizada=menuMateria.update(teclado);
					        	 		    materia_actualizada.setId(id);
					        	 		    service3.update(materia_actualizada);
						        	          }else{
						        	        	 System.out.println("-----------------------------------------------------");
						        	        	 System.out.println("No hay materias registrados...");
						        	           }
			                           break;
			        	 case 5: 
						        	   if(!(materias.size()==0)){
						        	 		   menuMateria.findAll(teclado);
						        	 		   service3.toList();
						        	 		    }else{
						        	        	 System.out.println("-----------------------------------------------------");
						        	        	 System.out.println("No hay materias registrados...");
						        	            }
			                            break;
			        	 default:
			        		            
		        	 	                break;
			        	  }
			        }while(opcion!=9);
			               break;
			  case 3: 
			         do {
			        	 opcion=menuCurso.submenu(teclado);
			        	 switch(opcion) {
			        	 case 1:
						  auxCurso=menuCurso.save(teclado);
						  service2.save(auxCurso);
		  	 	    	 break;
			        	 case 2:
			        		 if(!(cursos.size()==0)){
				       				int idsearch = menuCurso.findById(teclado);
				       				auxCurso=service2.findByid(idsearch);
				       				System.out.println("Información del curso");
				       				System.out.println(auxCurso.toString());
				       				
			        	           }else {
			        	        	   System.out.println("-----------------------------------------------------");
			        	        	   System.out.println("No hay cursos registrados...");
			        	        	 
			        	           }
			        	 break;
			        	 case 3:
			        		 if(!(cursos.size()==0)){
			        	 		   	int idcurso = menuCurso.findById(teclado);
			        	 		    service2.delete(idcurso);
			        	 		    
			        	 		  }else {
			        	        	 System.out.println("-----------------------------------------------------");
			        	        	 System.out.println("No hay cursos registrados...");
			        	        	 
			        	           }
			        	 break;
			        	 case 4:
				        		 if(!(cursos.size()==0)){
				        	 		    service2.toList();
				        	 		    System.out.println("Ingrese el ID del curso:");
				        	 		    int id=teclado.nextInt();
				        	 		    auxCurso = service2.findByid(id);
				        	 		    System.out.println(auxCurso.toString());
				        	 		    Cursos curso_actualizado = new Cursos();
				        	 		    curso_actualizado=menuCurso.update(teclado);
				        	 		    curso_actualizado.setId(id);
				        	 		    service2.update(curso_actualizado);
				        	 		   
					        	          }else{
					        	        	 System.out.println("-----------------------------------------------------");
					        	        	 System.out.println("No hay cursos registrados...");
					        	        	 
					        	           }
			                           break;
			        	  case 5: 
					        		 if(!(cursos.size()==0)){
					        	 		   menuCurso.findAll(teclado);
					        	 		   service2.toList();
					        	 		   
					        	 		 }else{
					        	        	 System.out.println("-----------------------------------------------------");
					        	        	 System.out.println("No hay cursos registrados...");
					        	        	 
					        	           }
			                         break;
			        	   default:
			        		 
		        	 	   break;
			        	 }
			         }while(opcion!=9);
                     break;
			  case 4: 
				      do {
				    	  opcion=menuInscripciones.submenu(teclado);
				    	  switch(opcion) {
					        	 	    case 1:
					        	 	    	if(!(alumnos.size()<1||materias.size()<1||cursos.size()<1)){
					        	 	    	auxInsc=menuInscripciones.save(teclado);
					        	 	    	service4.save(auxInsc);
					        	 	    	
					        	 	    	}else {
					        	 	    		System.out.println("No hay alumnos, cursos o materias registradas");
					        	 	    		
					        	 	    	}
					        		        break;
					        	 	    case 2:
						        	 		   if(!(inscripciones.size()==0)){
								       				int idsearch = menuInscripciones.findById(teclado);
								       				service4.findByIdAlumno(idsearch);							       				
							        	             }else {
							        	        	   System.out.println("-----------------------------------------------------");
							        	        	   System.out.println("No hay inscripciones registradas...");
							        	        	   
							        	             }
					       			             break;
					        	 	    case 3:
						        	 		     if(!(inscripciones.size()==0)){
							        	 		   	int id_inscripciones = menuInscripciones.findById(teclado);
							        	 		    service4.delete(id_inscripciones);
							        	 		    
						        	 		        }else {
								        	        	 System.out.println("-----------------------------------------------------");
								        	        	 System.out.println("No hay inscripciones registradas...");
								        	        	 
					        	                    }
					        	 	             break;
					        	 	    case 4:
							        	 		  if(!(inscripciones.size()==0)){
								        	 		    service4.toList();
								        	 		    System.out.println("Ingrese el DNI:");
								        	 		    int dni=teclado.nextInt();
								        	 		    auxInsc = service4.findByid(dni);
								        	 		    System.out.println(auxInsc.toString());
								        	 		    Inscripciones ins = new Inscripciones();
								        	 		    ins=menuInscripciones.update(teclado);
								        	 		    ins.setId(dni);
								        	 		    service4.update(ins);
								        	 		    
							        	                }else{
								        	        	 System.out.println("-----------------------------------------------------");
								        	        	 System.out.println("No hay inscripciones registradas...");
								        	        	 
							        	                }
					        	 	                    break;
					        	 	   case 5:
							        	 		  if(!(inscripciones.size()==0)){
								        	 		   service4.toList();
							        	 		  	   }else{
								        	        	 System.out.println("-----------------------------------------------------");
								        	        	 System.out.println("No hay inscripciones registradas...");
								        	        	 
							        	 		  	   }
							        	 		  break;
					        	 	   default:
					        	 		          
					        	 	              break;
					        	 	   }
				    	  
				      }while(opcion!=9);
				      break;
			  default:
			           break;
		}
	
	}while(opcion!=0);
		
	System.out.println("Saliendo...");
  }

}
