package kotharlabs.chaosrings3mod.items;

import kotharlabs.chaosrings3mod.CR3CreativeTabs;
import kotharlabs.chaosrings3mod.util.RegistryUtil;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class Chocolate extends ItemFood {

    static final int HUNGER = 1;
    static final float SATURATION = 0.0f;

    public Chocolate() {
        super(HUNGER, SATURATION, false);
        RegistryUtil.setItemName(this, "chocolate")
                .setCreativeTab(CR3CreativeTabs.CR3_FOOD);
        this.setAlwaysEdible();
        this.setPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH,1),1.0F);
    }

}
