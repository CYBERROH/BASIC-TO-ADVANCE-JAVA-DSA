package day4;

class Single {
    String teamName = "Avengers";

    public void showTeam() {
        String name = "Tony stark";
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

class Stark extends IronMan {
    String company = "Tcs";
    String suit = "armor";

    public void show() {
        System.out.println("company: " + company);
        System.out.println("suit: " + suit);
    }
}

public class multilevel {
    public static void main(String args[]) {
        Stark im = new Stark();
        im.showTeam();
        im.showIron();
        im.show();
    }
}
