import java.util.Scanner;

public class westernConference {

    public static void westTeamGuesser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play in the Northwest Division?");
        String division = scan.next();
        if (division.equals("Yes")) {
            northwestTeamGuesser();
        } else {
            System.out.println("Does your team play in the Pacific Division?");
            division = scan.next();
            if (division.equals("Yes")) {
                pacificTeamGuesser();
            } else {
                southwestTeamGuesser();
            }
        }
    }

    public static void northwestTeamGuesser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play for the Jazz?");
        String team = scan.next();
        if (team.equals("Yes")) {
            jazzPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Nuggets?");
            team = scan.next();
            if (team.equals("Yes")) {
                nuggetsPlayerGuesser();
            } else {
                System.out.println("Does your player play for the Timeberwolves?");
                team = scan.next();
                if (team.equals("Yes")) {
                    timberwolvesPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Trail Blazers?");
                    team = scan.next();
                    if (team.equals("Yes")) {
                        trailblazersPlayerGuesser();
                    } else {
                        thunderPlayerGuesser();
                    }
                }
            }
        }
    }

    public static void pacificTeamGuesser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play for the Suns?");
        String team = scan.next();
        if (team.equals("Yes")) {
            sunsPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Warriors?");
            team = scan.next();
            if (team.equals("Yes")) {
                warriorsPlayerGuesser();
            } else {
                System.out.println("Does your player play for the Clippers?");
                team = scan.next();
                if (team.equals("Yes")) {
                    clippersPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Lakers?");
                    team = scan.next();
                    if (team.equals("Yes")) {
                        lakersPlayerGuesser();
                    } else {
                        kingsPlayerGuesser();
                    }
                }
            }
        }
    }

    public static void southwestTeamGuesser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play for the Grizzlies?");
        String team = scan.next();
        if (team.equals("Yes")) {
            grizzliesPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Mavericks?");
            team = scan.next();
            if (team.equals("Yes")) {
                mavericksPlayerGuesser();
            } else {
                System.out.println("Does your player play for the Pelicans?");
                team = scan.next();
                if (team.equals("Yes")) {
                    pelicansPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Spurs?");
                    team = scan.next();
                    if (team.equals("Yes")) {
                        spursPlayerGuesser();
                    } else {
                        rocketsPlayerGuesser();
                    }
                }
            }
        }
    }

    public static void nuggetsPlayerGuesser() {
    }

    public static void jazzPlayerGuesser() {
    }

    public static void timberwolvesPlayerGuesser() {
    }

    public static void trailblazersPlayerGuesser() {
    }

    public static void thunderPlayerGuesser() {
    }

    public static void sunsPlayerGuesser() {
    }

    public static void warriorsPlayerGuesser() {
    }

    public static void clippersPlayerGuesser() {
    }

    public static void lakersPlayerGuesser() {
    }

    public static void kingsPlayerGuesser() {
    }

    public static void grizzliesPlayerGuesser() {
    }

    public static void mavericksPlayerGuesser() {
    }

    public static void pelicansPlayerGuesser() {
    }

    public static void spursPlayerGuesser() {
    }

    public static void rocketsPlayerGuesser() {
    }
}
