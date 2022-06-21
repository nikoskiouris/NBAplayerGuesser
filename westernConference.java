import java.util.Scanner;

public class westernConference {

    public static void westTeamGuesser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play in the Northwest Division?");
        if (scan.next().equals("Yes")) {
            northwestTeamGuesser();
        } else {
            System.out.println("Does your team play in the Pacific Division?");
            if (scan.next().equals("Yes")) {
                pacificTeamGuesser();
            } else {
                southwestTeamGuesser();
            }
        }
    }

    public static void northwestTeamGuesser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play for the Jazz?");
        if (scan.next().equals("Yes")) {
            jazzPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Nuggets?");
            if (scan.next().equals("Yes")) {
                nuggetsPlayerGuesser();
            } else {
                System.out.println("Does your player play for the Timeberwolves?");
                if (scan.next().equals("Yes")) {
                    timberwolvesPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Trail Blazers?");
                    if (scan.next().equals("Yes")) {
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
        if (scan.next().equals("Yes")) {
            sunsPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Warriors?");
            if (scan.next().equals("Yes")) {
                warriorsPlayerGuesser();
            } else {
                System.out.println("Does your player play for the Clippers?");
                if (scan.next().equals("Yes")) {
                    clippersPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Lakers?");
                    if (scan.next().equals("Yes")) {
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
        if (scan.next().equals("Yes")) {
            grizzliesPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Mavericks?");
            if (scan.next().equals("Yes")) {
                mavericksPlayerGuesser();
            } else {
                System.out.println("Does your player play for the Pelicans?");
                if (scan.next().equals("Yes")) {
                    pelicansPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Spurs?");
                    if (scan.next().equals("Yes")) {
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
