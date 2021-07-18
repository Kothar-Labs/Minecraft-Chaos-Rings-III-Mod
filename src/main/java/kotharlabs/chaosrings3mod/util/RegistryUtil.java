package kotharlabs.chaosrings3mod.util;

import kotharlabs.chaosrings3mod.ChaosRings3Mod;
import net.minecraft.item.Item;

public class RegistryUtil {

    public static Item setItemName(Item i, String itemName)
    {
        return i.setRegistryName(ChaosRings3Mod.MODID, itemName)
                .setTranslationKey(ChaosRings3Mod.MODID + "." + itemName);
    }
}
