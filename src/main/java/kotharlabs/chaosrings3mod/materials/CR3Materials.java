package kotharlabs.chaosrings3mod.materials;

import kotharlabs.chaosrings3mod.ChaosRings3Mod;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class CR3Materials {

    public static final Item.ToolMaterial CHAIN_SWORD
            = EnumHelper.addToolMaterial(ChaosRings3Mod.MODID + ":" + "tutorial_tool", 2,
            625, 7.0F, 3.0F, 10);
}
