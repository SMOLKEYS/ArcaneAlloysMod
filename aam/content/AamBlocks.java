package aam.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.with;

public class AamBlocks implements ContentList {
    //environment
    public static Block


    //environment
    
    //ores
    oreArcanite, oreMagmerite,
    //crafting
    wintiriumForge, wintiriumCoolantMixer, thermoliteRefinery, volatiteMixer, differentialCompoundCrucible, electroniteCompiler, arcumConverter, arcaneAlloySmelter, arcaneSiliconConverter, arcanicSurgeSmelter,
    //sandbox

    //defense
    electroniteWall, electroniteWallLarge, arcumWall, arcumWallLarge, arcaneAlloyWall, arcaneAlloyWallLarge, arcaneAlloyWallHuge, arcaneAlloyWallGigantic, carbonicAlloyWall, carbonicAlloyWallLarge, carbonicAlloyWallHuge, blastAlloyWall, blastAlloyWallLarge, blastAlloyWallHuge, plastidAlloyWall, plastidAlloyWallLarge, plastidAlloyWallHuge, electrumAlloyWall, electrumAlloyWallLarge, electrumAlloyWallHuge, radioAlloyWall, radioAlloyWallLarge, radioAlloyWallHuge, ultimAlloyWall, ultimAlloyWallLarge, ultimAlloyWallHuge, ultimAlloyWallGigantic,
	
    //transport
    electroniteConveyor,
    //liquid

    //power
    dysonPanel, electronitePowerBank, electroniteSubstation, arcaneBattery,
    //production
    compactDrill, arcaneDrill
    //storage

    //turrets

    //units

    //logic

    //campaign

	//EndEnvironment
		
	//Ores  
    oreMagmerite = new OreBlock(AamItems.magmerite){{
            oreDefault = true;
            oreThreshold = 0.81f;
            oreScale = 23.47619f;
        }};
    oreArcanite = new OreBlock(AamItems.arcanite){{
            oreDefault = true;
            oreThreshold = 0.81f;
            oreScale = 23.47619f;
        }};
	//EndOres
		
	//Crafting
	wintiriumForge = new GenericCrafter("wintirium-forge"){{
            requirements(Category.crafting, with(Items.graphite, 90, Items.silicon, 115, Items.titanium, 80));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(AamItems.wintirium, 2);
            craftTime = 60f;
            itemCapacity = 15;
            size = 3;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;

            consumes.power(2f);
            consumes.item(Items.thorium, 5);
            consumes.liquid(Liquids.cryofluid, 0.8f);
        }};
    wintiriumCoolantMixer = new LiquidConverter("wintirium-coolant-mixer"){{
            requirements(Category.crafting, with(Items.lead, 120, Items.silicon, 75, Items.titanium, 45, AamItems.wintirium, 135));
            outputLiquid = new LiquidStack(AamLiquids.wintiriumCoolant, 0.2f);
            craftTime = 30f;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;
            outputsLiquid = true;

            consumes.power(2.5f);
            consumes.item(AamItems.wintirium, 2);
            consumes.liquid(Liquids.cryofluid, 0.2f);
        }};
    thermoliteRefinery = new LiquidConverter("thermolite-refinery"){{
            requirements(Category.crafting, with(Items.silicon, 150, Items.titanium, 130, AamItems.magmerite, 70, Items.thorium, 95));
            outputLiquid = new LiquidStack(AamLiquids.thermolite, 0.2f);
            craftTime = 60f;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;
            outputsLiquid = true;

            consumes.power(2.5f);
            consumes.item(AamItems.magmerite, 4);
            consumes.liquid(Liquids.slag, 0.4f);
        }};
    volatiteMixer = new GenericCrafter("volatite-mixer"){{
            requirements(Category.crafting, with(Items.lead, 55, Items.titanium, 45, AamItems.wintirium, 30));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(AamItems.volatite, 3);
            craftTime = 60f;
            itemCapacity = 15;
            size = 3;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;

            consumes.power(1.8f);
            consumes.item(Items.sand, 1, Items.coal, 3, Items.blastCompound, 4);
            consumes.liquid(Liquids.cryofluid, 0.2f);
        }};
    differentialCompoundCrucible = new GenericCrafter("differential-compound-crucible"){{
            requirements(Category.crafting, with(Items.silicon, 900, Items.thorium, 770, AamItems.wintirium, 550, Items.surgeAlloy, 440));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(AamItems.differentialCompound, 3);
            craftTime = 20f;
            itemCapacity = 20;
            size = 4;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;

            consumes.power(5f);
            consumes.item(AamItems.magmerite, 10, AamItems.volatite, 5);
            consumes.liquid(AamLiquids.wintiriumCoolant, 2f);
        }};
    electroniteCompiler = new GenericCrafter("electronite-compiler"){{
            requirements(Category.crafting, with(Items.silicon, 150, Items.titanium, 160, Items.surgeAlloy, 125));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(AamItems.electronite, 1);
            craftTime = 45f;
            itemCapacity = 15;
            size = 3;
            hasItems = true;
            hasLiquids = false;
            hasPower = true;

            consumes.power(6.5f);
            consumes.item(Items.silicon, 2, Items.surgeAlloy, 1);
        }};
    arcumConverter = new AttributeCrafter("arcum-converter"){{
            requirements(Category.crafting, with(Items.silicon, 240, Items.titanium, 220, Items.thorium, 130, AamItems.arcanite, 120));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(AamItems.arcum, 2);
            craftTime = 90f;
            size = 3;
            hasPower = true;
            hasLiquids = true;
            itemCapacity = 20;
            boostScale = 0.15f;
            drawer = new DrawSmelter(Color.valueOf("ffef99"));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.1f;

            consumes.items(with(Items.silicon, 4, Items.thorium, 3, AamItems.arcanite, 6));
            consumes.power(5f);
            consumes.liquid(Liquids.water, 1f);
        }};
    arcaneAlloySmelter = new AttributeCrafter("arcane-alloy-smelter"){{
            requirements(Category.crafting, with(Items.titanium, 560, Items.thorium, 420, Items.plastanium, 260, Items.surgeAlloy, 150, AamItems.arcum, 350));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(AamItems.arcaneAlloy, 2);
            craftTime = 120f;
            size = 5;
            hasPower = true;
            hasLiquids = true;
            itemCapacity = 40;
            boostScale = 0.15f;
            drawer = new DrawSmelter(Color.valueOf("ffef99"));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.4f;

            consumes.items(with(Items.plastanium, 8, Items.surgeAlloy, 5, AamItems.arcum, 12));
            consumes.power(12f);
            consumes.liquid(AamLiquids.wintiriumCoolant, 2);
        }};
    arcaneSiliconConverter = new AttributeCrafter("arcane-silicon-crucible"){{
            requirements(Category.crafting, with(Items.metaglass, 370, Items.plastanium, 435, Items.silicon, 1460, Items.surgeAlloy, 450, AamItems.arcaneAlloy, 250));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(Items.silicon, 64);
            craftTime = 90f;
            size = 7;
            hasPower = true;
            hasLiquids = false;
            itemCapacity = 128;
            boostScale = 0.15f;
            drawer = new DrawSmelter(Color.valueOf("ffef99"));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            consumes.items(with(Items.coal, 30, Items.sand, 50, AamItems.volatite, 10));
            consumes.power(15f);
        }};
    arcanicSurgeSmelter = new GenericCrafter("arcanic-surge-smelter"){{
            requirements(Category.crafting, with(Items.silicon, 240, Items.titanium, 135, Items.thorium, 120, Items.surge, 95, AamItems.arcum, 110));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(Items.surgeAlloy, 4);
            craftTime = 60f;
            itemCapacity = 50;
            size = 4;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;

            consumes.power(9f);
            consumes.item(Items.copper, 18, Items.lead, 18, Items.titanium, 15, Items.silicon, 10, AamItems.volatite, 3);
            consumes.liquid(Liquids.cryofluid, 0.5f);
        }};
	//EndCrafting
	
	//Sandbox
		
	//EndSandbox
		
	//Defense

            int wallHealthMultiplier = 4;

        electroniteWall = new Wall("electronite-wall"){{
            requirements(Category.defense, with(AamItems.electronite, 6,));
            health = 190 * wallHealthMultiplier;
            size = 1;
        }};
        electroniteWallLarge = new Wall("electronite-wall-large"){{
            requirements(Category.defense, with(AamItems.electronite, 24));
            health = 190 * 4 * wallHealthMultiplier;
            size = 2;
        }};
        arcumWall = new Wall("arcum-wall"){{
            requirements(Category.defense, with(AamItems.arcum, 6, Items.Titanium, 3));
            health = 210 * wallHealthMultiplier;
            size = 1;
        }};
        arcumWallLarge = new Wall("arcum-wall-large"){{
            requirements(Category.defense, with(AamItems.arcum, 24, Items.Titanium, 12));
            health = 210 * 4 * wallHealthMultiplier;
            size = 2;
        }};
        arcaneAlloyWall = new Wall("arcane-alloy-wall"){{
            requirements(Category.defense, with(AamItems.arcaneAlloy, 10, Items.Thorium, 5 Items.plastanium, 5));
            health = 350 * wallHealthMultiplier;
            size = 1;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            lightningChance = 0.2f;
        }};
        arcaneAlloyWallLarge = new Wall("arcane-alloy-wall-large"){{
            requirements(Category.defense, with(AamItems.arcaneAlloy, 40, Items.Thorium, 20 Items.plastanium, 20));
            health = 350 * 4 * wallHealthMultiplier;
            size = 2;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            lightningChance = 0.2f;
        }};
        arcaneAlloyWallHuge = new Wall("arcane-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.arcaneAlloy, 90, Items.Thorium, 45 Items.plastanium, 45));
            health = 350 * 9 * wallHealthMultiplier;
            size = 3;insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            lightningChance = 0.2f;
        }};
        arcaneAlloyWallGigantic = new Wall("arcane-alloy-wall-gigantic"){{
            requirements(Category.defense, with(AamItems.arcaneAlloy, 160, Items.Thorium, 80, Items.plastanium, 80));
            health = 350 * 16 * wallHealthMultiplier;
            size = 4;insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            lightningChance = 0.2f;
        }};
        carbonicAlloyWall = new Wall("carbonic-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.carbonicAlloy, 6));
            health = 330 * wallHealthMultiplier;
            size = 1;
        }};
        carbonicAlloyWallLarge = new Wall("carbonic-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.carbonicAlloy, 24));
            health = 330 * 4 * wallHealthMultiplier;
            size = 2;
        }};
        carbonicAlloyWallHuge = new Wall("carbonic-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.carbonicAlloy, 54, AamItems.arcaneAlloy, 12));
            health = 330 * 9 * wallHealthMultiplier;
            size = 3;
        }};
        blastAlloyWall = new Wall("blast-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.blastAlloy, 6));
            health = 280 * wallHealthMultiplier;
            size = 1;
        }};
        blastAlloyWallLarge = new Wall("blast-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.blastAlloy, 24));
            health = 280 * 4 * wallHealthMultiplier;
            size = 2;
        }};
        blastAlloyWallHuge = new Wall("blast-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.blastAlloy, 54, AamItems.arcaneAlloy, 12));
            health = 280 * 9 * wallHealthMultiplier;
            size = 3;
        }};
        plastidAlloyWall = new Wall("plastid-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.plastidAlloy, 6));
            health = 340 * wallHealthMultiplier;
            size = 1;
        }};
        plastidAlloyWallLarge = new Wall("plastid-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.plastidAlloy, 24));
            health = 340 * 4 * wallHealthMultiplier;
            size = 2;
        }};
        plastidAlloyWallHuge = new Wall("plastid-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.plastidAlloy, 54, AamItems.arcaneAlloy, 12));
            health = 340 * 9 * wallHealthMultiplier;
            size = 3;
        }};
        electrumAlloyWall = new Wall("electrum-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.electrumAlloy, 6));
            health = 390 * wallHealthMultiplier;
            size = 1;
        }};
        electrumAlloyWallLarge = new Wall("electrum-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.electrumAlloy, 24));
            health = 390 * 4 * wallHealthMultiplier;
            size = 2;
        }};
        electrumAlloyWallHuge = new Wall("electrum-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.electrumAlloy, 54, AamItems.arcaneAlloy, 12));
            health = 390 * 9 * wallHealthMultiplier;
            size = 3;
        }};
        radioAlloyWall = new Wall("radio-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.radioAlloy, 6));
            health = 400 * wallHealthMultiplier;
            size = 1;
        }};
        radioAlloyWallLarge = new Wall("radio-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.radioAlloy, 24));
            health = 400 * 4 * wallHealthMultiplier;
            size = 2;
        }};
        radioAlloyWallHuge = new Wall("radio-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.radioAlloy, 54, AamItems.arcaneAlloy, 12));
            health = 400 * 9 * wallHealthMultiplier;
            size = 3;
        }};
        ultimAlloyWall = new Wall("ultim-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.ultimAlloy, 15));
            health = 630 * wallHealthMultiplier;
            size = 1;
        }};
        ultimAlloyWallLarge = new Wall("ultim-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.ultimAlloy, 60));
            health = 630 * 4 * wallHealthMultiplier;
            size = 2;
        }};
        ultimAlloyWallHuge = new Wall("ultim-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.ultimAlloy, 135, AamItems.arcaneAlloy, 35));
            health = 630 * 9 * wallHealthMultiplier;
            size = 3;
        }};
        ultimAlloyWallGigantic = new Wall("ultim-alloy-wall-huge"){{
            requirements(Category.defense, with(AamItems.ultimAlloy, 240, AamItems.arcaneAlloy, 60));
            health = 630 * 16 * wallHealthMultiplier;
            size = 4;
        }};
	//EndDefense 

    //Transport  
	electroniteConveyor = new StackConveyor("electronite-conveyor"){{
            requirements(Category.distribution, with(Items.silicon, 1, AamItems.electronite, 1));
            health = 115;
            speed = 4f / 60f;
            itemCapacity = 20;
        }};
	//EndTransport
		
	//Liquid	
		
	//EndLiquid
		
	//Power
    dysonPanel = new SolarGenerator("dyson-panel"){{
            requirements(Category.power, with(Items.silicon, 560, Items.titanium, 240, Items.phaseFabric, 150, AamItems.electronite, 360, AamItems.arcum, 240));
            size = 5;
            powerProduction = 30f;
        }};
	electronitePowerBank = new Battery("electronite-power-bank"){{
            requirements(Category.power, with(Items.silicon, 150 Items.surgeAlloy, 50 AamItems.electronite, 75));
            size = 4;
            consumes.powerBuffered(800000f);
            baseExplosiveness = 25f;
        }};	
    electroniteSubstation = new PowerNode("electronite-substation"){{
            requirements(Category.power, with(Items.silicon, 70, Items.thorium, 60 AamItems.electronite, 145 AamItems.arcum, 95));
            size = 4;
            maxNodes = 3;
            laserRange = 110f;
            schematicPriority = -15;
        }};
	arcaneBattery = new Battery("arcane-battery"){{
            requirements(Category.power, with(Items.silicon, 140, AamItems.electronite, 120, AamItems.arcaneAlloy, 180));
            size = 3;
            consumes.powerBuffered(5000000f);
            baseExplosiveness = 70f;
        }};	
		
	//EndPower
		
	//Production
	arcaneDrill = new Drill("arcane-drill"){{
            requirements(Category.production, with(Items.silicon, 120, Items.thorium, 145, Items.surgeAlloy, 110, AamItems.arcaneAlloy, 95));
            drillTime = 200;
            size = 5;
            hasPower = true;
            tier = 9;
            updateEffect = Fx.pulverizeMedium;
            drillEffect = Fx.mineBig;

            consumes.power(5f);
            consumes.liquid(Liquids.water, 1f).boost();
        }};
    compactDrill = new Drill("compact-drill"){{
            requirements(Category.production, with(Items.silicon, 60, Items.titanium, 35, AamItems.arcum, 45));
            drillTime = 450;
            size = 2;
            hasPower = true;
            tier = 7;
            updateEffect = Fx.pulverizeMedium;
            drillEffect = Fx.mineBig;

            consumes.power(5f);
            consumes.liquid(Liquids.water, 0.2f).boost();
        }};
	//EndProduction
		
	//Storage
		
	//EndStorage
		
	//Turrets

	//EndTurrets
		
	//Units

	//EndUnits
		
	//Logic	
		
	//EndLogic
		
	//Campaign
	
	//EndCampaign
		
	//Experimental
		
	//EndExperimental
    }
}
