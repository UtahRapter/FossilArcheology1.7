package com.github.revival.common.creativetab;

import net.ilexiconn.llibrary.common.content.IContentHandler;
import net.minecraft.creativetab.CreativeTabs;

public class FATabRegistry implements IContentHandler
{
    public static CreativeTabs tabFBlocks;
    public static CreativeTabs tabFItems;
    public static CreativeTabs tabFFood;
    public static CreativeTabs tabFCombat;
    public static CreativeTabs tabFTools;
    public static CreativeTabs tabFFigurines;
    public static CreativeTabs tabFBones;

    public void init()
    {
        tabFBlocks = new TabFBlocks("Fossil Blocks");
        tabFItems = new TabFItems("Fossil Items");
        tabFFood = new TabFFood("Fossil Food");
        tabFCombat = new TabFCombat("Fossil Combat");
        tabFTools = new TabFTools("Fossil Deco");
        tabFFigurines = new TabFFigurines("Fossil Test");
        tabFBones = new TabFBones("Fossil Bones");
    }

    public void gameRegistry() throws Exception
    {

    }
}