
package net.mcreator.firefightersmod.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CardboardboxBlock extends Block {
	public CardboardboxBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}