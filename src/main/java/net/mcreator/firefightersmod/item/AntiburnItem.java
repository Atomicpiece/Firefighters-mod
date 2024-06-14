
package net.mcreator.firefightersmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class AntiburnItem extends Item {
	public AntiburnItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		AntiburnRightclickedProcedure.execute();
		return ar;
	}
}