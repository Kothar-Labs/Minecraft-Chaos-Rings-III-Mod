package kotharlabs.chaosrings3mod.world_gen;

import java.util.ArrayList;
import java.util.Random;

import kotharlabs.chaosrings3mod.ChaosRings3Mod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import scala.actors.threadpool.Arrays;

public class ModWorldGenCustomStructure implements IWorldGenerator{

    //Buildings to generate (can have multiple)
    public static final ModWorldGenStructure SAND_TNT_TRAP = new ModWorldGenStructure("sand_tnt_trap");

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.getDimension())
        {
            case 2:
                break;
            case 1:
                break;
            case 0:
                generateStructure(SAND_TNT_TRAP, world, random, chunkX, chunkZ,
                        0.02f, Blocks.GRASS, BiomePlains.class);
                break;
            case -1:
        }
    }
    private void generateStructure(WorldGenerator generator , World world, Random random,
                                   int chunkX, int chunkZ, float chance, Block topBlock, Class... classes)
    {
        ArrayList<Class> classesList = new ArrayList<Class>(Arrays.asList(classes));
        int x = (chunkX * 16) + random.nextInt(15);
        int z = (chunkZ * 16) + random.nextInt(15);
        int y = calculateGenerationHeight(world, x, z,topBlock);
        BlockPos pos = new BlockPos(x,y,z);
        Class biome = world.provider.getBiomeForCoords(pos).getClass();
        if(world.getWorldType() != WorldType.FLAT)
        {
            if(classesList.contains(biome))
            {
                if(Math.random() < chance)
                {
                    ChaosRings3Mod.LOGGER.info("TNT Trap Generated at x = " + x +
                            ", y = " + y + ", z = " + z + ".");
                    generator.generate(world, random, pos);
                }
            }
        }
    }

    /**
     * Calculates the generation height. Generation is possible in [0, 255]
     * @param world World to calculate
     * @param x Position x in world
     * @param z Position z in world
     * @param topBlock Must generate structure on top of the Block that is the same kind as "topBlock"
     * @return Position y to generate structure
     */
    private static int calculateGenerationHeight(World world, int x, int z, Block topBlock) {
        int y = world.getHeight();
        boolean foundGround = false;
        while(!foundGround && y-- >= 0)
        {
            Block block = world.getBlockState(new BlockPos(x, y, z)).getBlock();
            foundGround = block == topBlock;
        }
        return y;
    }
}
