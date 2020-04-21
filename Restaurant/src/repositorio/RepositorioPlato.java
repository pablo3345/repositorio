/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Platosybebidas;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;


/**
 *
 * @author pablo
 */
public class RepositorioPlato {
    
       public void guardarPlato(Platosybebidas platosybebidas) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(platosybebidas);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
       
            public ArrayList<Platosybebidas> obtenerTodos(String tipo)
     //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Platosybebidas> arrayADevolver = null;
        
       ArrayList<Platosybebidas> arraytipo = new ArrayList<>();
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
         tx = session.beginTransaction();
         //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
         //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
         arrayADevolver = (ArrayList<Platosybebidas>) session.createQuery("FROM Platosybebidas").list(); 
         
         
         tx.commit();
         
         for(Platosybebidas platos : arrayADevolver){
         
         if(platos.getTipo().equals(tipo)){
         
         arraytipo.add(platos);
         
         
         }
         
         
         
         }
         
         
         
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
        
        return arraytipo;
    }
    

      
  
    
}
