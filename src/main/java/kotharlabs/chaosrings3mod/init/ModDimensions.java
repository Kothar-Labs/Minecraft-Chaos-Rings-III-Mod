package kotharlabs.chaosrings3mod.init;

import kotharlabs.chaosrings3mod.dimensions.DimensionTheia;
import net.minecraft.world.DimensionType;

import java.util.Hashtable;

public class ModDimensions
{
    public static Hashtable<String, DimensionType> dimRefs = new Hashtable<>();

    /**
     * Preferred way of adding a new dimension to dimRefs.
     * Use this method instead of directly calling dimRefs.put(str, item)
     * because it gets the registry name as specified in that specific dimension,
     * @param dim Dimension to be added to refs
     */
    private static void addToRefs(DimensionType dim)
    {
        dimRefs.put(dim.getName(), dim);
    }

    /**
     * Fills in the dimRefs array of the class so that it can be ref
     */
    public static void fillInDimRefs()
    {
        addToRefs(DimensionType.register(DimensionTheia.NAME, DimensionTheia.SUFFIX,
                DimensionTheia.DIM_ID, DimensionTheia.class, false));
    }
}
