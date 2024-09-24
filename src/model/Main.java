package model;

import model.studentDto.StudentDto;
import model.studentRepository.StudentRepository;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static Connection connection;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      proccessStudentDto();
    }
    public static void proccessStudentDto() throws SQLException, ClassNotFoundException {
        connect();
//        var customer = StudentRepository.findAll();
//        System.out.println(customer);
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
//        var foundNumber = StudentRepository.findId(number);
//        System.out.println(foundNumber);
//        var delete = StudentRepository.delete(1);
//        System.out.println(delete);
        //update islemir sual
//        var customer = StudentRepository.update(2);
//        System.out.println(customer);
        close();
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Matrix_159"
                , "postgres"
                , "huseyn570");
    }

    public static void close() throws SQLException {
        connection.close();
    }
}