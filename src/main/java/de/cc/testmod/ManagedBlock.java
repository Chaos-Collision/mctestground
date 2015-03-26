package de.cc.testmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static de.cc.testmod.TestMod.MODID;

public abstract class ManagedBlock<T extends ManagedBlock> extends Block {
	
	protected final String sName;
	
	public ManagedBlock(String sName, Material m) {
		super(m);
		setUnlocalizedName(sName);
		this.sName = sName;
	}
	
	public String getName() {
		return this.sName;
	}
	
	public void initClient() {
		// This is currently necessary in order to make your block render properly when it is an item (i.e. in the inventory
	    //   or in your hand or thrown on the ground).
	    // Minecraft knows to look for the item model based on the GameRegistry.registerBlock.  However the registration of
	    //  the model for each item is normally done by RenderItem.registerItems(), and this is not currently aware
	    //   of any extra items you have created.  Hence you have to do it manually.  This will probably change in future.
	    // It must be done in the init phase, not preinit, and must be done on client only.
	    Item itemBlockPartial = GameRegistry.findItem(MODID, this.getName());
	    ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(TestMod.prependMODID(this.getName()), "inventory");
	    final int DEFAULT_ITEM_SUBTYPE = 0;
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockPartial, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
	}
	
	public static<T extends ManagedBlock> T initCommon(Class<T> c) {
		T instance = null;
		try {
			instance = c.newInstance();
			//register block with unlocalized name
			GameRegistry.registerBlock(instance, instance.getName());
			
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return instance;
	}
}
