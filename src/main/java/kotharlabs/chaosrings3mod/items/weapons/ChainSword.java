package kotharlabs.chaosrings3mod.items.weapons;

import kotharlabs.chaosrings3mod.CR3CreativeTabs;
import kotharlabs.chaosrings3mod.materials.CR3Materials;
import kotharlabs.chaosrings3mod.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;

import java.util.HashSet;

public class ChainSword extends ItemTool {

    static final float dmg = 5.0f;
    static final float atkSpd = -2.5f;
    static final int durability = 500;

    public ChainSword() {
        super(dmg, atkSpd, ToolMaterial.IRON, new HashSet<Block>());
        RegistryUtil.setItemName(this, "chain_sword")
                .setCreativeTab(CR3CreativeTabs.CR3_WEAPONS)
                .setMaxDamage(durability);
    }

}
