package de.cc.testmod;

import de.cc.testmod.blocktest.BlockTest;

/**
 * CommonProxy is used to set up the mod and start it running.  It contains all the code that should run on both the
 *   Standalone client and the dedicated server.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public abstract class CommonProxy {
	
	public static BlockTest blockTest;
	
	public void preInit() {
		blockTest = BlockTest.initCommon(BlockTest.class);
	}
	
	public void init() {
		
	}
	
	public void postInit() {
		
	}
}