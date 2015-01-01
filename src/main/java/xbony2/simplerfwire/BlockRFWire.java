package xbony2.simplerfwire;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockRFWire extends Block{

	public BlockRFWire() {
		super(Material.iron);
		this.setBlockName("simplerfwire");
		this.setBlockTextureName("simplerfwire:wire");
		this.setHardness(1.5F);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(CreativeTabs.tabRedstone);
	}
	
	@Override
	public final boolean hasTileEntity(int metadata){
	    return true;
	}
	
	@Override
	public final TileEntity createTileEntity(World world, int metadata) {
	    return new TileEntityRFWire();
	}
}
