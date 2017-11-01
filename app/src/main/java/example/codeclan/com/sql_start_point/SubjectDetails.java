package example.codeclan.com.sql_start_point;

import java.sql.ResultSet;

import db.SqlRunner;

/**
 * Created by allymcgilloway on 31/10/2017.
 */

public class SubjectDetails {
    private String description;
    private String name;
    private String member_since;
    private String telephone;
    private String email;

    public SubjectDetails(String description, String name, String member_since, String telephone, String email) {
        this.description = description;
        this.name = name;
        this.member_since = member_since;
        this.telephone = telephone;
        this.email = email;
    }

//    public static SubjectDetails find(int id){
//
//    }


    public static SubjectDetails map(ResultSet rs){
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String description = rs.getString("description");
                String first_name = rs.getString("first_name");
                String nick_name = rs.getString("nick_name");
                String last_name = rs.getString("last_name");
                String member_since = rs.getString("member_since");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");

                String name = String.format("%s %s %s", first_name, nick_name, last_name);

                return new SubjectDetails(description, name, member_since, telephone, email);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
        } finally {
            SqlRunner.closeConnection();
        }

        return null;
    }
}

