package mjm.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class MjmLiquids implements ContentList {
    public static Liquid thermolite, wintiriumCoolant;

    @Override
    public void load(){
        thermolite = new Liquid("thermolite", Color.valueOf("e2c16d")){{
            temperature = 2f;
            effect = StatusEffects.melting, StatusEffects.burning;
            lightColor = Color.valueOf("f0511d").a(0.4f);
        }};
        wintiriumCoolant = new Liquid("wintirium-coolant", Color.valueOf("e2c16d")){{
            temperature = 0.1f;
            effect = StatusEffects.freezing;
            lightColor = Color.valueOf("f0511d").a(0.4f);
        }};
    }
}