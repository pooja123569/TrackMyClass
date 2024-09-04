package com.tka.firstspringbootproject;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class ClassroomDao {

    // Initialize SessionFactory once for reuse
    private static final SessionFactory sessionFactory = new Configuration()
            .configure()
            .addAnnotatedClass(Classroom.class)
            .buildSessionFactory();

    // Fetch all classrooms using Hibernate
    public List<Classroom> fetchAllClassroom() {
        List<Classroom> classrooms = new ArrayList<>();
        try (Session session = sessionFactory.openSession()) {
            classrooms = session.createQuery("FROM Classroom", Classroom.class).list();
            System.out.println("Fetching all classrooms.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classrooms;
    }

    // Insert data using Hibernate
    public void insertData(String name) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Classroom classroom = new Classroom();
            classroom.setName(name);
            session.save(classroom);
            transaction.commit();
            System.out.println("Data inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete data using Hibernate
    public void deleteData(Long id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Classroom classroom = session.get(Classroom.class, id);
            if (classroom != null) {
                session.delete(classroom);
                transaction.commit();
                System.out.println("User details deleted successfully!");
            } else {
                System.out.println("Classroom with id " + id + " not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update data using Hibernate
    public void updateData(Long id, String newName) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Classroom classroom = session.get(Classroom.class, id);
            if (classroom != null) {
                classroom.setName(newName);
                session.update(classroom);
                transaction.commit();
                System.out.println("User details updated successfully!");
            } else {
                System.out.println("Classroom with id " + id + " not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
