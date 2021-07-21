package kotharlabs.chaosrings3mod.dimensions;

import kotharlabs.chaosrings3mod.ChaosRings3Mod;
import kotharlabs.chaosrings3mod.biomes.BiomeTheiaUrban;
import kotharlabs.chaosrings3mod.init.ModBiomes;
import kotharlabs.chaosrings3mod.init.ModDimensions;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.ChunkGeneratorFlat;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionTheia extends WorldProvider {
    public static final int DIM_ID = 3312;
    public static final String NAME = "theia";
    public static final String SUFFIX = "_theia";

    public DimensionTheia()
    {
        this.biomeProvider = new BiomeProviderSingle(
                ModBiomes.biomeRefs.get(ChaosRings3Mod.MODID + "_" + BiomeTheiaUrban.NAME)
        );
    }

    @Override
    public DimensionType getDimensionType() {
        return ModDimensions.dimRefs.get(NAME);
    }

    @Override
    public IChunkGenerator createChunkGenerator()
    {
        // TODO Chunk Generator of Theia
        // return new ChunkGeneratorTheia();
        return new ChunkGeneratorFlat(world, world.getSeed(), true, null);
    }

    @Override
    public boolean canRespawnHere()
    {
        return true;
    }

    @Override
    public boolean isSurfaceWorld() {
        return false;
    }
}
