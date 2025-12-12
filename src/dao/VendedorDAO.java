/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ClienteTam;
import bean.VendedorTam;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u07431666128
 */
public class VendedorDAO extends AbstractDAO {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorTam.class);
        criteria.add(Restrictions.eq("idvendedor_tam", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorTam.class);
        criteria.add(Restrictions.like("nomeTam", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listEmail(String VU) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorTam.class);
        criteria.add(Restrictions.like("emailTam", "%" + VU + "%"));

        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNomeEmail(String nome, String VU) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorTam.class);
        criteria.add(Restrictions.like("nomeTam", "%" + nome + "%"));
        criteria.add(Restrictions.like("emailTam", "%" + VU + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorTam.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

}
