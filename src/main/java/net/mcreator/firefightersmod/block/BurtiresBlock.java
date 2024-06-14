
package net.mcreator.firefightersmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BurtiresBlock extends SlabBlock {
	public BurtiresBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.GRAVEL).strength(1f, 10f).dynamicShape());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}