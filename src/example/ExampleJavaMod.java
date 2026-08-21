package loadoutsizeincreaser;

import mindustry.Vars;
import mindustry.game.Schematics;
import mindustry.mod.Mod;
import mindustry.world.*;

public class Main extends Mod {

    public Main() {
        Vars.schematics = new CustomSchematics();
        Vars.schematics.load();
    }

    public static class CustomSchematics extends Schematics {
        
        @Override
        public int getMaxLaunchSize(Block block) {
            return block.size + maxLoadoutSchematicPad * 3;
        }
    }
}
