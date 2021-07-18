package kotharlabs.chaosrings3mod.items.weapons;

import kotharlabs.chaosrings3mod.CR3CreativeTabs;
import kotharlabs.chaosrings3mod.materials.CR3Materials;
import kotharlabs.chaosrings3mod.util.RegistryUtil;
import net.minecraft.item.ItemSword;

public class ChainSword extends ItemSword {

    public ChainSword() {
        super(CR3Materials.CHAIN_SWORD);
        RegistryUtil.setItemName(this, "chain_sword")
                .setCreativeTab(CR3CreativeTabs.CR3_WEAPONS);

    }
}
