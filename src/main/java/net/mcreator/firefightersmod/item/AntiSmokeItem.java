
package net.mcreator.firefightersmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class AntiSmokeItem extends Item {
	public AntiSmokeItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		AntiSmokeRightclickedProcedure.execute();
		return ar;
	}
}