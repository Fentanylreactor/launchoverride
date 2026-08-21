package loadoutsizeincreaser;

import arc.Events;
import mindustry.Vars;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.game.Schematics;
import mindustry.mod.Mod;
import mindustry.world.*; 

public class Main extends Mod {

    @Override
    public void init() {
        Events.on(ClientLoadEvent.class, event -> {
            CustomSchematics custom = new CustomSchematics();
            custom.load();
            Vars.schematics = custom;
        });
    }

    public static class CustomSchematics extends Schematics {
        
        @Override
        public int getMaxLaunchSize(Block block) {
            return 10 + (block.size * 2);
        }
    }
}
