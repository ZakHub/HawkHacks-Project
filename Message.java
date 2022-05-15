package hh2022;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.restaction.MessageAction;

public class Message extends ListenerAdapter{
    public void onMessageReceived(MessageReceivedEvent event){
        String msg = event.getMessage().getContentRaw();
        String name = event.getMember().getUser().getName();
        if(msg.equalsIgnoreCase("hello")){
            event.getChannel().sendMessage("Hi " + name).queue();             
        }
        if(msg.contains("discord bot")){
            event.getChannel().sendMessage("**secretly appears behind you**").queue();
        }
        if(msg.equalsIgnoreCase("$games")){
           event.getChannel().sendMessage("Hi, Welcome to my gaming world! Please enter a number to indicate your option:\n"
                            + "1.Tic Tac Toe\n"
                            + "2.Rock Paper Scissors\n"
                            + "3.Quess The Number\n"
                            + "4.Hangman\n"
                            + "5.Exit").queue(); 
        }
        int num = Integer.parseInt(msg);
        try{
            if(num==1){
                event.getChannel().sendMessage("Tic Tac Toe's Rule\n"
                        + " Tic-tac-toe is played by two players who alternately place the marks X and O in one of the nine spaces on a three-by-three grid."
                                + " Game ends when three 'X's or three 'O's are placed in a row(whether in vertically, horizontally or diagonally)").queue();
            }else if(num==2){
                event.getChannel().sendMessage("Rock Paper Scissors' Rule\n"
                        + "Rock Paper Scissors is a simultaneous game with three outcomes:  a win, a loss, or a draw."
                                + " Basically the strength of the shapes are like: rock>scissors>paper>rock. e.g if user chooses scissors and the bot chooses paper, the user wins. "
                                + " If the user chooses rock and the bot chooses paper, the bot wins. If both players choose the same, it draws").queue();
            }else if(num==3){
                event.getChannel().sendMessage("Quess The Number's Rule\n"
                        + " Player needs to choose a number from 1-10, and the bots will randomly produce a number. If player guess the correct number, game ends").queue();
            }else if(num==4){
                event.getChannel().sendMessage("Hangman's Rule\n"
                        + " Player needs to guess the letters in the secret word to solve the puzzle."
                                + " The score is based on how fast and how less the hint used by the player").queue();
            }else if(num==5){
                event.getChannel().sendMessage("Goodbye").queue();
                System.exit(0);
            }else{
                event.getChannel().sendMessage("Please enter number from 1 to 5: ").queue();
            }
        }catch(NumberFormatException e){
            System.out.println("Wrong input");
        }
    }
}

