package kotharlabs.chaosrings3mod;

import kotharlabs.chaosrings3mod.commands.CommandDimensionTeleport;
import kotharlabs.chaosrings3mod.init.ModBiomes;
import kotharlabs.chaosrings3mod.init.ModDimensions;
import kotharlabs.chaosrings3mod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.world.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ChaosRings3Mod.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        ModItems.fillInItemRefs();
        for (Item i : ModItems.itemRefs.values())
        {
            event.getRegistry().register(i);
        }
    }

    public static void registerDimensions()
    {
        ModDimensions.fillInDimRefs();
        for (DimensionType dim : ModDimensions.dimRefs.values())
        {
            DimensionManager.registerDimension(dim.getId(), dim);
        }
    }

    public static void registerBiomes()
    {
        ModBiomes.fillInBiomeRefs();
    }

    public static void serverRegistries(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new CommandDimensionTeleport());
    }
}
