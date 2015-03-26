package de.cc.testmod;

/**
 * CombinedClientProxy is used to set up the mod and start it running on normal minecraft.  It contains all the code that should run on the
 *   client side only.
 *   For more background information see here http://greyminecraftcoder.blogspot.com/2013/11/how-forge-starts-up-your-code.html
 */
public class ClientProxy extends CommonProxy {
	@Override
	public void preInit() {
		super.preInit();
	}
	@Override
	public void init() {
		super.init();
		this.blockTest.initClient();
	}
	@Override
	public void postInit() {
		super.postInit();
	}
}
