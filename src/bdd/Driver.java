package bdd;

import java.io.Serializable;
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

    public void showSavedGame(String query){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd_java", "java", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.print(resultSet.getString("id"));
                System.out.print("   -   ");
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
                System.out.print(resultSet.getString("money"));
                System.out.print("   -   ");
                System.out.println(resultSet.getString("position")+"/80 cases");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public String getStringData(String query, String colunm){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd_java", "java", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            return resultSet.getString(colunm);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }

    }

    public int getIntData(String query, String colunm){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd_java", "java", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            return resultSet.getInt(colunm);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return 0;
        }
    }

    public String getType(int id){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd_java", "java", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT type FROM savedgame WHERE id = "+ id);
            resultSet.next();
            return resultSet.getString("type");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }

    }




}
