package xbony2.simplerfwire;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RFWire extends Block{

	public RFWire() {
		super(Material.circuits);
		this.setCreativeTab(CreativeTabs.tabRedstone);
		this.setBlockName("rfWire");
	}

}
