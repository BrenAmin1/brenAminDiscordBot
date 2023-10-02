package yukibot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;


//The "Main" class file
public class Bot {
    public static void main(String[] arguments) throws Exception
    {
        String token = "ODkwMDE4NzA2NDEzOTk0MDI3.YUpsgw.jK4j4KHhxQAzzBeR6hGZaQ6AshQ";
        JDA api = JDABuilder.createDefault(token)
                .addEventListeners(new PingPongListener())
                .addEventListeners(new MusicBot())
                .build();
    }
}
