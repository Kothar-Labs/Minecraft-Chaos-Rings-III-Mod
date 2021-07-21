package kotharlabs.chaosrings3mod.biomes;

import kotharlabs.chaosrings3mod.ChaosRings3Mod;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeTheiaUrban extends Biome
{
    public static String NAME = "theia_urban";

    public BiomeTheiaUrban()
    {
        super(new BiomeProperties(NAME).setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F)
                .setRainDisabled().setWaterColor(16711680));
        this.setRegistryName(ChaosRings3Mod.MODID, NAME);
        ForgeRegistries.BIOMES.register(this);
        BiomeDictionary.addTypes(this, Type.DRY);
        BiomeManager.addBiome(BiomeType.WARM, new BiomeManager.BiomeEntry(this, 10));
        BiomeManager.addSpawnBiome(this);
    }
}
