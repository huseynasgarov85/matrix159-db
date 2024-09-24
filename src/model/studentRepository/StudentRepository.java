package model.studentRepository;

import model.studentDto.StudentDto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static model.Main.connection;

public class StudentRepository {
    public static List<StudentDto> findAll() throws SQLException, ClassNotFoundException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student");
        List<StudentDto> list = new ArrayList<>();
        while (resultSet.next()) {
            var customer = new StudentDto(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname"),
                    resultSet.getInt("score")
            );
            list.add(customer);
        }
        return list;
    }

    public static StudentDto findId(Integer id) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from student where id = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        return new StudentDto(resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("surname"),
                resultSet.getInt("score"));
    }

    public static List<StudentDto> delete(Integer id) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = connection.prepareStatement("delete from student where id = ?");
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();


        return findAll();

    }

    public static StudentDto update(Integer id) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = connection.prepareStatement("update student set name = ? where id = ?");
        preparedStatement.setString(1, "Sabir");
        preparedStatement.setInt(2, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        return new StudentDto(resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getString("surname"),
                resultSet.getInt("score"));
    }
}
