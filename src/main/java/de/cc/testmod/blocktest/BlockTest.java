package de.cc.testmod.blocktest;

import de.cc.testmod.ManagedBlock;
import de.cc.testmod.TestTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IIconCreator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTest extends ManagedBlock<BlockTest> {

	public BlockTest() {
		super("blocktest",Material.iron);
		setHardness(0.5F);
		setStepSound(Block.soundTypeMetal);
		setHarvestLevel("pickaxe", 0);
		setCreativeTab(TestTab.tabTest);
		SoundType test = soundTypeMetal;
		
		SoundType test2 = new SoundType(test.soundName, test.volume * 2, test.frequency/2);
		
		this.setStepSound(test2);
		
	}

	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		super.onBlockAdded(world, pos, state);
		System.out.println("onBlockAdded");
	}

	@Override
	public IBlockState onBlockPlaced(World world, BlockPos pos,
			EnumFacing face, float x, float y, float z, int meta,
			EntityLivingBase ent) {
		System.out.println("onBlockPlaced");
		return super.onBlockPlaced(world, pos, face, x, y, z, meta, ent);
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state,
			EntityLivingBase ent, ItemStack stack) {
		System.out.println("onBlockPlacedBy");
		super.onBlockPlacedBy(world, pos, state, ent, stack);
	}
}
