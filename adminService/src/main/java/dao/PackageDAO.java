package dao;

import entity.PackagE;
import entity.User;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PackageDAO {

    private SessionFactory factory;

    public PackageDAO(SessionFactory factory) {
        this.factory = factory;
    }

    //create
    public void addPackage(PackagE pack){

        Session session=factory.openSession();
        Transaction tx = null;
        try{
            tx=session.beginTransaction();
            session.save(pack);
            tx.commit();
        }catch(HibernateError e){
            if(tx!=null)
                tx.rollback();
        }finally {
            session.close();
        }
    }

    //find all
    public List<PackagE> findAll(){
        Session session=factory.openSession();
        Transaction tx=null;
        List<PackagE> packagES = null;
        try{
            tx=session.beginTransaction();
            packagES =session.createQuery("FROM PackagE").list();
            tx.commit();
        }catch (HibernateError e){
            if(tx!=null)
                tx.rollback();
        }finally {
            session.close();
        }
        return packagES;
    }

    //find by Name
    public PackagE findByName(String name){
        Session session=factory.openSession();
        Transaction tx=null;
        List<PackagE> packagES = null;
        try{
            tx=session.beginTransaction();
            Query query = session.createQuery("FROM PackagE WHERE name = :name");
            query.setParameter("name", name);
            packagES= query.list();
            tx.commit();
        }catch (HibernateError e){
            if(tx!=null)
                tx.rollback();
        }finally {
            session.close();
        }
        if (packagES.isEmpty())
            return null;
        else
            return packagES.get(0);
    }

    //delete
    public void deletePackage(PackagE pack){
        Session session=factory.openSession();
        Transaction tx=null;
        try{
            tx=session.beginTransaction();
            session.delete(pack);
            tx.commit();
        }catch (HibernateError e){
            if(tx!=null)
                tx.rollback();
        }finally {
            session.close();
        }
    }

    //update
    public void updatePackage(PackagE pack){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx=session.beginTransaction();
            session.update(pack);
            tx.commit();
        }catch (HibernateError e) {
            if (tx != null)
                tx.rollback();
        }finally {
            session.close();
        }
    }
}
