package kotharlabs.chaosrings3mod;

import kotharlabs.chaosrings3mod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CR3CreativeTabs {

    public static final CreativeTabs CR3_FOOD = new CreativeTabs("cr3_food"){
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.itemRefs.get("cr3:chocolate"));
        }
    };

    public static final CreativeTabs CR3_WEAPONS = new CreativeTabs("cr3_weapons"){
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.itemRefs.get("cr3:chain_sword"));
        }
    };
}
