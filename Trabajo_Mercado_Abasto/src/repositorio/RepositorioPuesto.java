/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import mercadoAbasto.util.HibernateUtil;
import modelo.Cliente;
import modelo.Puesto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pablo
 */
public class RepositorioPuesto {
    
      public void guardarCliente(Puesto puesto) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(puesto);
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
      
          public ArrayList<Puesto> obtenerTodosPuesto()
     //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Puesto> arrayADevolver = null;
        
       // return this.listaEmpleados.toArray(arrayADevolver);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
         tx = session.beginTransaction();
         //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
         //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
         arrayADevolver = (ArrayList<Puesto>) session.createQuery("FROM Puesto").list(); 
         
         
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
        
        return arrayADevolver;
    }
    
}
