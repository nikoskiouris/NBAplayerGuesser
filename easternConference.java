import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Scanner;

public class easternConference {
    public static void eastTeamGuesser() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play in the Atlantic Division?");
        if (scan.next().equals("Yes")) {
            atlanticTeamGuesser();
        } else {
            System.out.println("Does your player play in the Central Division?");
            if (scan.next().equals("Yes")) {
                centralTeamGuesser();
            } else {
                southeastTeamGuesser();
            }
        }
    }


    public static void atlanticTeamGuesser() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Does your player play for the Knicks?");
        if (scan.next().equals("Yes")) {
            knicksPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Celtics?");
            if (scan.next().equals("Yes")) {
                celticsPlayerGuesser();
            } else {
                System.out.println("Does your player play for the 76ers?");
                if (scan.next().equals("Yes")) {
                    sixersPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Raptors?");
                    if (scan.next().equals("Yes")) {
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
        if (scan.next().equals("Yes")) {
            bucksPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Bulls?");
            if (scan.next().equals("Yes")) {
                bullsPlayerGuesser();
            } else {
                System.out.println("Does your player play for the Cavaliers?");
                if (scan.next().equals("Yes")) {
                    cavaliersPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Pacers?");
                    if (scan.next().equals("Yes")) {
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
        if (scan.next().equals("Yes")) {
            heatPlayerGuesser();
        } else {
            System.out.println("Does your player play for the Hawks?");
            if (scan.next().equals("Yes")) {
                hawksPlayerGuesser();
            } else {
                System.out.println("Does your player play for the Hornets?");
                if (scan.next().equals("Yes")) {
                    hornetsPlayerGuesser();
                } else {
                    System.out.println("Does your player play for the Wizards?");
                    if (scan.next().equals("Yes")) {
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
