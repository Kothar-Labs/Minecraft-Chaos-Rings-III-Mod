package kotharlabs.chaosrings3mod.commands;

import com.google.common.collect.Lists;
import kotharlabs.chaosrings3mod.ChaosRings3Mod;
import kotharlabs.chaosrings3mod.commands.util.Teleport;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

import java.util.List;

public class CommandDimensionTeleport extends CommandBase
{
    private final List<String> aliases = Lists.newArrayList(ChaosRings3Mod.MODID, "tp", "tpdim",
            "tpdimension", "teleportdimension", "teleport");

    @Override
    public String getName() {
        return "tpdimension";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "tpdimension <id>";
    }

    @Override
    public List<String> getAliases() {
        return aliases;
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender)
    {
        return true;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        if (args.length < 1) return;

        String s = args[0];
        int dimensionID;

        try
        {
            dimensionID = Integer.parseInt(s);
        } catch (NumberFormatException e)
        {
            sender.sendMessage(new TextComponentString(TextFormatting.RED + "Dimension ID Invalid."));
            return;
        }

        if (sender instanceof EntityPlayer)
        {
            Teleport.teleportToDimension((EntityPlayer) sender, dimensionID, sender.getPosition().getX(),
                    sender.getPosition().getY() + 5, sender.getPosition().getZ());
        }
    }


}
