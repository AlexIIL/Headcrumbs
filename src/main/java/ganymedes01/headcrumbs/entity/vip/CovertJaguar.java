package ganymedes01.headcrumbs.entity.vip;

import ganymedes01.headcrumbs.entity.EntityHuman;
import ganymedes01.headcrumbs.entity.VIPHandler;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class CovertJaguar extends VIPHandler {

	@Override
	protected int maxBaseDropAmount() {
		return 2;
	}

	@Override
	protected ItemStack getItem(EntityHuman entity) {
		return new ItemStack(Blocks.RAIL);
	}
}