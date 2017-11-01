package example.codeclan.com.sql_start_point;

import java.sql.ResultSet;
import java.util.ArrayList;

import db.SqlRunner;

/**
 * Created by allymcgilloway on 31/10/2017.
 */

public class Subject {
    private int id;
    private String name;
    private String description;
    private int wrestler_id;

    public Subject(int id, String name, String description, int wrestler_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.wrestler_id = wrestler_id;
    }

    public Subject(String name, String description, int wrestler_id) {
        this.name = name;
        this.description = description;
        this.wrestler_id = wrestler_id;
    }

    public void save(){

    }



    public static ArrayList<Subject> map(ResultSet rs){
        ArrayList<Subject> subjects = new ArrayList<>();
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int wrestler_id = rs.getInt("wrestler_id");

                subjects.add(new Subject(id, name, description, wrestler_id));
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
        } finally {
            SqlRunner.closeConnection();
        }

        return subjects;
    }
}
