package com.github.revival.common.item;

import com.github.revival.common.block.BlockFern;
import com.github.revival.common.creativetab.FATabRegistry;
import com.github.revival.common.handler.LocalizationStrings;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class ItemFernSeed extends Item
{
    private Block matchingBlockID;

    public ItemFernSeed(Block ferns)
    {
        super();
        this.matchingBlockID = ferns;
        this.setUnlocalizedName(LocalizationStrings.FERNSEED_NAME);
        this.setCreativeTab(FATabRegistry.tabFItems);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (var7 != 1)
        {
            return true;
        }
        else
        {
            Block var11 = var3.getBlock(var4, var5, var6);

            if (var11 == Blocks.grass && var3.isAirBlock(var4, var5 + 1, var6) && BlockFern.CheckUnderTree(var3, var4, var5, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, this.matchingBlockID);
                var3.setBlockMetadataWithNotify(var4, var5 + 1, var6, (new Random()).nextInt(2) * 8, 2);
                --var1.stackSize;
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    @Override
    public void registerIcons(IIconRegister IIconRegister)
    {
        itemIcon = IIconRegister.registerIcon("fossil:Fern_Seeds");
    }
}
