package bdd;

import java.sql.*;

public class Driver {


    public void dbQuery(String query){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd_java", "java", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.print(resultSet.getString("name"));
                System.out.print("   -   ");
                System.out.print(resultSet.getString("type"));
                System.out.print("   -   ");
                System.out.print(resultSet.getString("health"));
                System.out.print("   -   ");
                System.out.print(resultSet.getString("strength"));
                System.out.print("   -   ");
                System.out.print(resultSet.getString("weaponpower"));
                System.out.print("   -   ");
                System.out.println(resultSet.getString("money"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void insertInto(String query){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd_java", "java", "root");
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
