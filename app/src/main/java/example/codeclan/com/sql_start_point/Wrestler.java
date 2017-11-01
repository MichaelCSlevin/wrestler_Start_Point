package example.codeclan.com.sql_start_point;

import java.sql.ResultSet;
import java.util.ArrayList;

import db.SqlRunner;

/**
 * Created by allymcgilloway on 31/10/2017.
 */

public class Wrestler {

    private int id;
    private String first_name;
    private String nick_name;
    private String last_name;
    private String telephone;
    private String email;
    private String member_since;

    public Wrestler(int id, String first_name, String nick_name, String last_name, String telephone, String email, String member_since) {
        this.id = id;
        this.first_name = first_name;
        this.nick_name = nick_name;
        this.last_name = last_name;
        this.telephone = telephone;
        this.email = email;
        this.member_since = member_since;
    }

    public Wrestler(String first_name, String nick_name, String last_name, String telephone, String email, String member_since) {
        this.first_name = first_name;
        this.nick_name = nick_name;
        this.last_name = last_name;
        this.telephone = telephone;
        this.email = email;
        this.member_since = member_since;
    }

    public int getId() {
        return id;
    }

    public void save(){

    }

    public static ArrayList<Wrestler> map(ResultSet rs){
        ArrayList<Wrestler> wrestlers = new ArrayList<>();
        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String first_name = rs.getString("first_name");
                String nick_name = rs.getString("last_name");
                String last_name = rs.getString("last_name");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");
                String member_since = rs.getString("member_since");

                wrestlers.add(new Wrestler(id, first_name, nick_name, last_name, telephone, email, member_since));
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " : " + e.getMessage());
        } finally {
            SqlRunner.closeConnection();
        }

        return wrestlers;
    }
}
