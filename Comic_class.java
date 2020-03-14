import java.util.Scanner;

/**
 * Comic_class
 */
public class Comic_class {
    Scanner scn = new Scanner(System.in);
    private String name, contry, skin, skill, sex;
    
    public Comic_class(){

    }

    public void addcos(String newname, String newcontry, String newskin, String newskill, String newsex){
        System.out.println("Cosplay name :");
        newname = scn.nextLine();
        this.name = newname;
        System.out.println("Cosplay contry :");
        newcontry = scn.nextLine();
        this.contry = newcontry;
        System.out.println("Cosplay skin :");
        newskin = scn.nextLine();
        this.skin = newskin;
        System.out.println("Cosplay skill :");
        newskill = scn.nextLine();
        this.skill = newskill;
        System.out.println("Cosplay sex :");
        newsex = scn.nextLine();
        this.sex = newsex;
    }
    public String getcos(){
        return "Name : " + this.name + "\nContry : " + this.contry + "\nSkin : " + this.skin + "\nSkill : " + this.skill + "\nSex : " + this.sex + "\n";
    }
    
}