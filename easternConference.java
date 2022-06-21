import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Scanner;

public class easternConference {
    public static void eastTeamGuesser() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play in the Atlantic Division?");
        String division = scan.next();
        if (division.equals("Yes")) {
            atlanticTeamGuesser();
        } else {
            System.out.println("Does your player play in the Central Division?");
            division = scan.next();
            if (division.equals("Yes")) {
                centralTeamGuesser();
            } else {
                southeastTeamGuesser();
            }
        }
    }


    public static void atlanticTeamGuesser() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play for the Knicks?");
        String team = scan.next();
        if (team.equals("Yes")) {
            knicksPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Celtics?");
            team = scan.next();
            if (team.equals("Yes")) {
                celticsPlayerGuesser();
            } else {
                System.out.println("Does your player play for the 76ers?");
                team = scan.next();
                if (team.equals("Yes")) {
                    sixersPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Raptors?");
                    team = scan.next();
                    if (team.equals("Yes")) {
                        raptorsPlayerGuesser();
                    } else {
                        netsPlayerGuesser();
                    }
                }
            }
        }
    }

    public static void centralTeamGuesser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play for the Bucks?");
        String team = scan.next();
        if (team.equals("Yes")) {
            bucksPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Bulls?");
            team = scan.next();
            if (team.equals("Yes")) {
                bullsPlayerGuesser();
            } else {
                System.out.println("Does your player play for the Cavaliers?");
                team = scan.next();
                if (team.equals("Yes")) {
                    cavaliersPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Pacers?");
                    team = scan.next();
                    if (team.equals("Yes")) {
                        pacersPlayerGuesser();
                    } else {
                        pistonsPlayerGuesser();
                    }
                }
            }
        }
    }

    public static void southeastTeamGuesser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play for the Heat?");
        String team = scan.next();
        if (team.equals("Yes")) {
            heatPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Hawks?");
            team = scan.next();
            if (team.equals("Yes")) {
                hawksPlayerGuesser();
            } else {
                System.out.println("Does your player play for the Hornets?");
                team = scan.next();
                if (team.equals("Yes")) {
                    hornetsPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Wizards?");
                    team = scan.next();
                    if (team.equals("Yes")) {
                        wizardsPlayerGuesser();
                    } else {
                        magicPlayerGuesser();
                    }
                }
            }
        }
    }

    public static void knicksPlayerGuesser() throws IOException {
        final String url =
                "https://basketball.realgm.com/nba/players";
        final Document document = Jsoup.connect(url).get();
        for (Element row : document.select(
                "tablesaw-sortable.tablesaw-swipe.tablesaw")) {
            if (row.select("tr:nth-of-type(1)").text().equals("Steven Adams")) {
                String name = row.select("td:nth-of-type(1)").text();

                System.out.println(name);
            }
        }
    }

    public static void celticsPlayerGuesser() {
    }

    public static void sixersPlayerGuesser() {
    }

    public static void raptorsPlayerGuesser() {
    }

    public static void netsPlayerGuesser() {
    }

    public static void bucksPlayerGuesser() {
    }

    public static void bullsPlayerGuesser() {
    }

    public static void cavaliersPlayerGuesser() {
    }

    public static void pacersPlayerGuesser() {
    }

    public static void pistonsPlayerGuesser() {
    }

    public static void heatPlayerGuesser() {
    }

    public static void hawksPlayerGuesser() {
    }

    public static void hornetsPlayerGuesser() {
    }

    public static void wizardsPlayerGuesser() {
    }

    public static void magicPlayerGuesser() {
    }
}
