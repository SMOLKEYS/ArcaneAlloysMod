package aam.content;

import arc.*;
import arc.graphics.*;
import arc.math.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.entities.units.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;

public class AamItems implements ContentList {
    public static Item wintirium, subZero, magmerite, differentialCompound, electronite, arcanite, arcum, arcaneAlloy;

    @Override
    public void load(){
	    wintirium = new Item("wintirium", Color.valueOf("d4eeff")){{
            hardness = 1;
            cost = 0.667f;
	}};
    	subZero = new Item("sub-Zero", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
    	magmerite = new Item("magmerite", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
    	differentialCompound = new Item("differential-compound", Color.valueOf("6d1b8a")){{
            hardness = 1;
            cost = 0.667f;
	}};
    	electronite = new Item("electronite", Color.valueOf("f3e979")){{
            hardness = 1;
            cost = 0.667f;
	}};
    	arcanite = new Item("arcanite", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
    	arcum = new Item("arcum", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
    	arcaneAlloy = new Item("arcane-alloy", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
        carbonicAlloy = new Item("carbonic-alloy", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
        blastAlloy = new Item("blast-alloy", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
        plastidAlloy = new Item("plastid-alloy", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
        electrumAlloy = new Item("electrum-alloy", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
        radioAlloy = new Item("radite-alloy", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
        ultimAlloy = new Item("ultim-alloy", Color.valueOf("a3e2e2")){{
            hardness = 1;
            cost = 0.667f;
	}};
    }
}
