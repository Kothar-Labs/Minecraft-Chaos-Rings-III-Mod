package kotharlabs.chaosrings3mod.util;

import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

public interface IStructure {
    public static final WorldServer worldServer = FMLCommonHandler.instance().
            getMinecraftServerInstance().getWorld(0);
    public static final PlacementSettings settings = (new PlacementSettings()).setChunk(null).
            setIgnoreEntities(false).setIgnoreStructureBlock(false).setMirror(Mirror.NONE)
            .setRotation(Rotation.NONE);
}
