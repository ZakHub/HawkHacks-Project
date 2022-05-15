package hh2022;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;

public class DiscordBot {
    public static void main(String[]args) throws LoginException{
        JDA bot = JDABuilder.createDefault("token")
                .setActivity(Activity.playing("games"))
                .build();
        bot.addEventListener(new Message());
        
    }
}
