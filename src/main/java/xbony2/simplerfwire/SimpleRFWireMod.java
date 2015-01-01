package xbony2.simplerfwire;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "SimpleRFWireMod", name = "Simple RF Wire Mod", version = "@VERSION@")
public class SimpleRFWireMod {
	public static Block wire;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		wire = new BlockRFWire();
		
		GameRegistry.registerBlock(wire, "rfwire");
	}
}
