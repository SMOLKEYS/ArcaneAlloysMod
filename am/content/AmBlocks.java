package mjm.content;

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

public class MjmBlocks implements ContentList {
    //environment
    public static Block


    //environment
    
    //ores
    oreArcanite, oreMagmerite,
    //crafting
    wintiriumForge, wintiriumCoolantMixer, thermoliteRefinery, volatiteMixer, differentialCompoundCrucible, electroniteCompiler, arcumConverter, arcaneAlloySmelter, arcaneSiliconConverter, arcanicSurgeSmelter,
    //sandbox

    //defense
    electroniteWall, electroniteWallLarge, arcumWall, arcumWallLarge, arcaneAlloyWall, arcaneAlloyWallLarge, arcaneAlloyWallHuge, arcaneAlloyWallGigantic,
	
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
    oreMagmerite = new OreBlock(AmItems.magmerite){{
            oreDefault = true;
            oreThreshold = 0.81f;
            oreScale = 23.47619f;
        }};
    oreArcanite = new OreBlock(AmItems.arcanite){{
            oreDefault = true;
            oreThreshold = 0.81f;
            oreScale = 23.47619f;
        }};
	//EndOres
		
	//Crafting
	wintiriumForge = new GenericCrafter("wintirium-forge"){{
            requirements(Category.crafting, with(Items.graphite, 90, Items.silicon, 115, Items.titanium, 80));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(AmItems.wintirium, 2);
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
            requirements(Category.crafting, with(Items.lead, 120, Items.silicon, 75, Items.titanium, 45, AmItems.wintirium, 135));
            outputLiquid = new LiquidStack(AmLiquids.wintiriumCoolant, 0.2f);
            craftTime = 30f;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;
            outputsLiquid = true;

            consumes.power(2.5f);
            consumes.item(AmItems.wintirium, 2);
            consumes.liquid(Liquids.cryofluid, 0.2f);
        }};
    thermoliteRefinery = new LiquidConverter("thermolite-refinery"){{
            requirements(Category.crafting, with(Items.silicon, 150, Items.titanium, 130, AmItems.magmerite, 70, Items.thorium, 95));
            outputLiquid = new LiquidStack(AmLiquids.thermolite, 0.2f);
            craftTime = 60f;
            size = 3;
            hasPower = true;
            hasItems = true;
            hasLiquids = true;
            rotate = false;
            solid = true;
            outputsLiquid = true;

            consumes.power(2.5f);
            consumes.item(AmItems.magmerite, 4);
            consumes.liquid(Liquids.slag, 0.4f);
        }};
    volatiteMixer = new GenericCrafter("volatite-mixer"){{
            requirements(Category.crafting, with(Items.lead, 55, Items.titanium, 45, AmItems.wintirium, 30));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(AmItems.volatite, 3);
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
            requirements(Category.crafting, with(Items.silicon, 900, Items.thorium, 770, AmItems.wintirium, 550, Items.surgeAlloy, 440));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(AmItems.differentialCompound, 3);
            craftTime = 20f;
            itemCapacity = 20;
            size = 4;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;

            consumes.power(5f);
            consumes.item(AmItems.magmerite, 10, AmItems.volatite, 5);
            consumes.liquid(AmLiquids.wintiriumCoolant, 2f);
        }};
    electroniteCompiler = new GenericCrafter("electronite-compiler"){{
            requirements(Category.crafting, with(Items.silicon, 150, Items.titanium, 160, Items.surgeAlloy, 125));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(AmItems.electronite, 1);
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
            requirements(Category.crafting, with(Items.silicon, 240, Items.titanium, 220, Items.thorium, 130, AmItems.arcanite, 120));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(AmItems.arcum, 2);
            craftTime = 90f;
            size = 3;
            hasPower = true;
            hasLiquids = true;
            itemCapacity = 20;
            boostScale = 0.15f;
            drawer = new DrawSmelter(Color.valueOf("ffef99"));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.1f;

            consumes.items(with(Items.silicon, 4, Items.thorium, 3, AmItems.arcanite, 6));
            consumes.power(5f);
            consumes.liquid(Liquids.water, 1f);
        }};
    arcaneAlloySmelter = new AttributeCrafter("arcane-alloy-smelter"){{
            requirements(Category.crafting, with(Items.titanium, 560, Items.thorium, 420, Items.plastanium, 260, Items.surgeAlloy, 150, AmItems.arcum, 350));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(AmItems.arcaneAlloy, 2);
            craftTime = 120f;
            size = 5;
            hasPower = true;
            hasLiquids = true;
            itemCapacity = 40;
            boostScale = 0.15f;
            drawer = new DrawSmelter(Color.valueOf("ffef99"));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.4f;

            consumes.items(with(Items.plastanium, 8, Items.surgeAlloy, 5, AmItems.arcum, 12));
            consumes.power(12f);
            consumes.liquid(AmLiquids.wintiriumCoolant, 2);
        }};
    arcaneSiliconConverter = new AttributeCrafter("arcane-silicon-crucible"){{
            requirements(Category.crafting, with(Items.metaglass, 370, Items.plastanium, 435, Items.silicon, 1460, Items.surgeAlloy, 450, AmItems.arcaneAlloy, 250));
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

            consumes.items(with(Items.coal, 30, Items.sand, 50, AmItems.volatite, 10));
            consumes.power(15f);
        }};
    arcanicSurgeSmelter = new GenericCrafter("arcanic-surge-smelter"){{
            requirements(Category.crafting, with(Items.silicon, 240, Items.titanium, 135, Items.thorium, 120, Items.surge, 95, AmItems.arcum, 110));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(Items.surgeAlloy, 4);
            craftTime = 60f;
            itemCapacity = 50;
            size = 4;
            hasItems = true;
            hasLiquids = true;
            hasPower = true;

            consumes.power(9f);
            consumes.item(Items.copper, 18, Items.lead, 18, Items.titanium, 15, Items.silicon, 10, AmItems.volatite, 3);
            consumes.liquid(Liquids.cryofluid, 0.5f);
        }};
	//EndCrafting
	
	//Sandbox
		
	//EndSandbox
		
	//Defense

            int wallHealthMultiplier = 4;

        electroniteWall = new Wall("electronite-wall"){{
            requirements(Category.defense, with(AmItems.electronite, 6,));
            health = 190 * wallHealthMultiplier;
            size = 1;
        }};
        electroniteWallLarge = new Wall("electronite-wall-large"){{
            requirements(Category.defense, with(AmItems.electronite, 24));
            health = 190 * 4 * wallHealthMultiplier;
            size = 2;
        }};
        arcumWall = new Wall("arcum-wall"){{
            requirements(Category.defense, with(AmItems.arcum, 6, Items.Titanium, 6));
            health = 210 * wallHealthMultiplier;
            size = 1;
        }};
        arcumWallLarge = new Wall("arcum-wall-large"){{
            requirements(Category.defense, with(AmItems.arcum, 24, Items.Titanium, 24));
            health = 210 * 4 * wallHealthMultiplier;
            size = 2;
        }};
        arcaneAlloyWall = new Wall("arcane-alloy-wall"){{
            requirements(Category.defense, with(AmItems.arcaneAlloy, 10, Items.Thorium, 5 Items.plastanium, 5));
            health = 350 * wallHealthMultiplier;
            size = 1;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            lightningChance = 0.2f;
        }};
        arcaneAlloyWallLarge = new Wall("arcane-alloy-wall-large"){{
            requirements(Category.defense, with(AmItems.arcaneAlloy, 40, Items.Thorium, 20 Items.plastanium, 20));
            health = 350 * 4 * wallHealthMultiplier;
            size = 2;
            insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            lightningChance = 0.2f;
        }};
        arcaneAlloyWallHuge = new Wall("arcane-alloy-wall-huge"){{
            requirements(Category.defense, with(AmItems.arcaneAlloy, 90, Items.Thorium, 45 Items.plastanium, 45));
            health = 350 * 9 * wallHealthMultiplier;
            size = 3;insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            lightningChance = 0.2f;
        }};
        arcaneAlloyWallGigantic = new Wall("arcane-alloy-wall-gigantic"){{
            requirements(Category.defense, with(AmItems.arcaneAlloy, 160, Items.Thorium, 80, Items.plastanium, 80));
            health = 350 * 16 * wallHealthMultiplier;
            size = 4;insulated = true;
            absorbLasers = true;
            schematicPriority = 10;
            lightningChance = 0.2f;
        }};

	//EndDefense 

    //Transport  
	electroniteConveyor = new StackConveyor("electronite-conveyor"){{
            requirements(Category.distribution, with(Items.silicon, 1, AmItems.electronite, 1));
            health = 115;
            speed = 4f / 60f;
            itemCapacity = 20;
        }};
	//EndTransport
		
	//Liquid	
		
	//EndLiquid
		
	//Power
    dysonPanel = new SolarGenerator("dyson-panel"){{
            requirements(Category.power, with(Items.silicon, 560, Items.titanium, 240, Items.phaseFabric, 150, AmItems.electronite, 360, AmItems.arcum, 240));
            size = 5;
            powerProduction = 30f;
        }};
	electronitePowerBank = new Battery("electronite-power-bank"){{
            requirements(Category.power, with(Items.silicon, 150 Items.surgeAlloy, 50 AmItems.electronite, 75));
            size = 4;
            consumes.powerBuffered(800000f);
            baseExplosiveness = 25f;
        }};	
    electroniteSubstation = new PowerNode("electronite-substation"){{
            requirements(Category.power, with(Items.silicon, 70, Items.thorium, 60 AmItems.electronite, 145 AmItems.arcum, 95));
            size = 4;
            maxNodes = 3;
            laserRange = 110f;
            schematicPriority = -15;
        }};
	arcaneBattery = new Battery("arcane-battery"){{
            requirements(Category.power, with(Items.silicon, 140, AmItems.electronite, 120, AmItems.arcaneAlloy, 180));
            size = 3;
            consumes.powerBuffered(5000000f);
            baseExplosiveness = 70f;
        }};	
		
	//EndPower
		
	//Production
	arcaneDrill = new Drill("arcane-drill"){{
            requirements(Category.production, with(Items.silicon, 120, Items.thorium, 145, Items.surgeAlloy, 110, AmItems.arcaneAlloy, 95));
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
            requirements(Category.production, with(Items.silicon, 60, Items.titanium, 35, AmItems.arcum, 45));
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