package de.cc.testmod;

import static de.cc.testmod.TestMod.MODID;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TestTab extends CreativeTabs {
	public static final CreativeTabs tabTest = new TestTab();

	public TestTab() {
		super(MODID);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTabLabel() {
		return MODID;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return MODID;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return Items.brick;
	}
}
