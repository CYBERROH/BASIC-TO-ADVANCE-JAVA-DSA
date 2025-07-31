package day4;

class Single {
    String teamName = "Avengers";

    public void showTeam() {
        String name = "Tony Stark";
        String suit = "armor";
        System.out.println("team: " + teamName);
        System.out.println("hero: " + name);
        System.out.println("suit: " + suit);
    }
}

class IronMan extends Single {
    public void showIron() {
        System.out.println("IronMan is part of team: " + teamName);
    }
}

class Stark extends Single {
    String company = "Tcs";
    String suit = "armor";

    public void show() {
        System.out.println("company: " + company);
        System.out.println("suit: " + suit);
    }
}

public class heirra {
    public static void main(String args[]) {
        IronMan im = new IronMan();
        im.showTeam();
        im.showIron();

        Stark st = new Stark();
        st.showTeam();
        st.show();
    }
}
