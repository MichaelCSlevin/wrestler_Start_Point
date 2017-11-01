package example.codeclan.com.sql_start_point;

import java.util.Date;

/**
 * Created by user on 30/08/2017.
 */

public class Seeds {

    public static void seedData() {

        Wrestler jakeRoberts = new Wrestler("Jake", "The Snake", "Roberts", "0141 565 5656", "snake@ifpwafcad.com", "2003-09-10");
        Wrestler randyOrton = new Wrestler("Randy", "The Viper", "Orton", "0141 443 4567", "bobo@ifpwafcad.com", "2001-01-12");
        Wrestler paulWight = new Wrestler("Paul", "The Big Show", "Wight", "0141 555-4432", "beefcake@ifpwafcad.com", "2005-03-08");
        Wrestler randySavage = new Wrestler("Randy", "Macho Man", "Savage", "555 317-4444", "machoman@hotmail.com", "2000-11-10");
        Wrestler johnCena = new Wrestler("John", "The Champ", "Cena","334 612-5678", "r_steamboat@ifpwafcad.com", "1996-01-01");
        Wrestler brettHart = new Wrestler("Brett", "The Hitman", "Hart", "412 565-5656", "george@ifpwafcad.com", new Date().toString());
        Wrestler dwayneJohnson = new Wrestler("Dwayne", "The Rock", "Johnson", "553 499-8162", "birdman@ifpwafcad.com", "1999-12-03");
        Wrestler razorRamon = new Wrestler("Razor", "The Bad Guy", "Ramon", "617 889-5545", "valentino@ifpwafcad.com", "1998-05-07");
        Wrestler steveAustin = new Wrestler("Steve", "Stone Cold", "Austin", "777 513-3333", "b_heenan@ifpwafcad.com", "2002-07-09");

        jakeRoberts.save();
        randyOrton.save();
        paulWight.save();
        randySavage.save();
        johnCena.save();
        brettHart.save();
        dwayneJohnson.save();
        razorRamon.save();
        steveAustin.save();


        Subject subject1 = new Subject("Financial Consultancy", "Investment advice and financial planning guidance, helping you to maximize your net worth through proper asset allocation. This includes the stocks, bonds, mutual funds, insurance products, and gambling strategies proven to work.", 9);
        Subject subject2 = new Subject("Existential Psychotherapy", "Often wonder what the purpose of life is? After learning the basics of Existential Psychotherapy, you'll understand why you're happy when you're feeling happy, and why you're not feeling happy when you're not happy, allowing you to transcend to a state of pure bliss.", 7);
        Subject subject3 = new Subject("Temper Management", "Are your angry outbursts affecting your relationships with loved-ones? Do tantrums at work hinder your ability to perform? Temper management helps you to channel your anger into positive, life-changing productivity.", 4);
        Subject subject4 = new Subject("Past-Life Regression", "Past-Life Regression is a journey of the soul, backward and forward through time, like a yo-yo.", 2);
        Subject subject5 = new Subject("Marriage Guidance", "Even if you share a solid, caring and mutually beneficial relationship with your spouse, you may both still need urgent counseling. There's only one way to find out. Contact us now!", 1);
        Subject subject6 = new Subject("Dream Analysis", "Dream Analysis will allow you to delve into the depths of your subconcious. Your counselor will put you through a rigorous, disciplined training program, allowing you to remain in a waking state while dreaming. By the end, you'll be able to analyse your dreams while you are having them!", 8);
        Subject subject7 = new Subject("Hypnosis", "Contrary to popular belief, hypnosis can be a powerful and effective form of counseling.", 6);
        Subject subject8 = new Subject("Reiki", "Need a massage but are afraid to let a stranger touch your body? Reiki could be the perfect solution for you.", 5);

        subject1.save();
        subject2.save();
        subject3.save();
        subject4.save();
        subject5.save();
        subject6.save();
        subject7.save();
        subject8.save();
    }
}
