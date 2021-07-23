package kotharlabs.chaosrings3mod.biomes;

import kotharlabs.chaosrings3mod.ChaosRings3Mod;
import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeTheiaUrban extends Biome
{
    public static final String NAME = "Theia Urban";
    static final int WEIGHT = 10;
    static final float BASE_HEIGHT = 1.5F;
    static final float HEIGHT_VARIATION = 1.2F;
    static final float TEMP = 0.6F;

    public BiomeTheiaUrban()
    {
        super(new BiomeProperties(NAME).setBaseHeight(BASE_HEIGHT).setHeightVariation(HEIGHT_VARIATION)
                .setTemperature(TEMP).setRainDisabled());
        this.setRegistryName(ChaosRings3Mod.MODID, NAME);
        ForgeRegistries.BIOMES.register(this);
        BiomeDictionary.addTypes(this, Type.DRY);
        BiomeManager.addBiome(BiomeType.WARM, new BiomeManager.BiomeEntry(this, WEIGHT));
        // BiomeManager.addSpawnBiome(this);

        topBlock = Block.getBlockFromName("minecraft:iron_block").getDefaultState();
    }
}
