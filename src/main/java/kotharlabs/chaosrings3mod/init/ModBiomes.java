package kotharlabs.chaosrings3mod.init;

import kotharlabs.chaosrings3mod.biomes.BiomeTheiaUrban;
import kotharlabs.chaosrings3mod.dimensions.DimensionTheia;
import net.minecraft.world.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.Hashtable;

public class ModBiomes
{
    public static Hashtable<String, Biome> biomeRefs = new Hashtable<>();

    /**
     * Preferred way of adding a new biome to biomeRefs
     * Use this method instead of directly calling biomeRefs.put(str, item)
     * because it gets the registry name as specified in that specific dimension,
     * @param b Biome to be added to refs
     */
    private static void addToRefs(Biome b)
    {
        biomeRefs.put(b.getRegistryName().toString(), b);
    }

    /**
     * Fills in the dimRefs array of the class so that it can be ref
     */
    public static void fillInBiomeRefs()
    {
        addToRefs(new BiomeTheiaUrban());
    }

}
