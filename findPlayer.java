import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class findPlayer {

    public static void main(String[] args) throws IOException {
        System.out.println("Answer either \"Yes\" or \"No\"");
        System.out.println(playerDatabase());
    }

    public static String playerDatabase() throws IOException {
        //Start questions
        playerGuesser();

        //As players get deemed ineligible (wrong team, height, etc, make sure to remove them from the ArrayList

        String[] player1 = new String[2];
        player1[0] = "Niko";
        player1[1] = "Shooting Guard";

        String[] player2 = new String[2];
        player2[0] = "RJ";
        player2[1] = "Small Forward";

        ArrayList<String[]> playerInfo = new ArrayList<>();
        playerInfo.add(0,player1);
        playerInfo.add(1,player2);

        String players = String.valueOf(playerInfo.get(0)[0]);

        return players;
    }

    public static void playerGuesser() throws IOException {
        Scanner scan = new Scanner(System.in);
        //Conference
        System.out.println("Does your player play in the Eastern Conference?");
        String conference = scan.next();
        if (conference.equals("Yes")) {
            easternConference.eastTeamGuesser();
        } else {
            westernConference.westTeamGuesser();
        }
    }


}