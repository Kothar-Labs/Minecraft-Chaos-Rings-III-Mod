package kotharlabs.chaosrings3mod.items.weapons;

import kotharlabs.chaosrings3mod.CR3CreativeTabs;
import kotharlabs.chaosrings3mod.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.item.ItemTool;

import java.util.HashSet;

public class LaTraviata extends ItemTool {

    static final float dmg = 3.0f;
    static final float atkSpd = -2.0f;
    static final int durability = 600;

    public LaTraviata() {
        super(dmg, atkSpd, ToolMaterial.IRON, new HashSet<Block>());
        RegistryUtil.setItemName(this, "la_traviata")
                .setCreativeTab(CR3CreativeTabs.CR3_WEAPONS)
                .setMaxDamage(durability);
    }

}
