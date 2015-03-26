package de.cc.testmod;

import de.cc.testmod.blocktest.BlockTest;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TestMod.MODID, version = TestMod.VERSION)
public class TestMod
{
	@Mod.Instance(TestMod.MODID)
	public static TestMod instance;
	
	@SidedProxy(clientSide="de.cc.testmod.ClientProxy",
            serverSide="de.cc.testmod.ServerProxy")
	public static CommonProxy proxy;
	
    public static final String MODID = "testmod";
    public static final String VERSION = "0.1";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {    	
    	proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
    
    public static String prependMODID(String str) {
    	return MODID + ":" + str;
    }
}
