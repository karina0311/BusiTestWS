/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.busitestws.dao;

import com.mycompany.busitestws.model.Especialidad;
import com.mycompany.busitestws.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Karina
 */
public class EspecialidadDAO {
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public Especialidad getEspecialidadByID(int id){
        Especialidad especialidad = null;
        Session session = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            especialidad = (Especialidad) session.createQuery("from Especialidad e where e.IDEspecialidad = :ID").setParameter("ID", id).uniqueResult();
            session.getTransaction().commit();
        }
        catch(Exception ex){
            if(session != null){
                session.getTransaction().rollback();
            }
        }
        finally{
            if(session != null){
                session.close();
            }
        }
        
        return especialidad;
    }
    
    public List<Especialidad> getAllEspecialidades(){
        List<Especialidad> especialidades = null;
        Session session = null;
        
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            especialidades = session.createQuery("from Especialidad e").list();
            session.getTransaction().commit();
        }
        catch(Exception ex){
            if(session != null){
                session.getTransaction().rollback();
            }
        }
        finally{
            if(session != null){
                session.close();
            }
        }
        
        return especialidades;
    }
    
}
