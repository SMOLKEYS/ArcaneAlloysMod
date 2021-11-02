package aam;

import arc.*;
import arc.func.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.ctype.*;
import mindustry.game.EventType.*;
import mindustry.game.Team;
import mindustry.mod.*;
import mindustry.mod.Mods.*;
import aam.content.*;
import mindustry.net.*;
import mindustry.type.*;
import mindustry.ui.*;
import mindustry.world.*;
import mindustry.world.blocks.*;

import static java.lang.Float.*;
import static mindustry.Vars.*;

public class ArcaneAlloysMod extends Mod{

    private final ContentList[] aamContent = {
            new aamLiquids(),
            new aamItems(),
            //new aamBullets(),
            //new aamUnits(),
            new aamBlocks(),
            //new aamSectors(),
            //new aamPlanets(),
            new aamTechTree()
    };

    @Override
    public void init(){
        Vars.enableConsole = true;
    }

    @Override
    public void loadContent() {
        for (ContentList list : aamContent) {
            list.load();
        }
    }
}
