package com.github.revival.common.enums;

import io.netty.util.internal.ThreadLocalRandom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.Item;

import com.github.revival.common.api.EnumDiet;
import com.github.revival.common.creativetab.FATabRegistry;
import com.github.revival.common.entity.mob.DinoFoodBlockList;
import com.github.revival.common.entity.mob.DinoFoodItemList;
import com.github.revival.common.entity.mob.DinoFoodMobList;
import com.github.revival.common.entity.mob.EntityAllosaurus;
import com.github.revival.common.entity.mob.EntityAnkylosaurus;
import com.github.revival.common.entity.mob.EntityBrachiosaurus;
import com.github.revival.common.entity.mob.EntityCeratosaurus;
import com.github.revival.common.entity.mob.EntityCoelacanth;
import com.github.revival.common.entity.mob.EntityCompsognathus;
import com.github.revival.common.entity.mob.EntityConfuciusornis;
import com.github.revival.common.entity.mob.EntityDeinonychus;
import com.github.revival.common.entity.mob.EntityDilophosaurus;
import com.github.revival.common.entity.mob.EntityDodo;
import com.github.revival.common.entity.mob.EntityGallimimus;
import com.github.revival.common.entity.mob.EntityLiopleurodon;
import com.github.revival.common.entity.mob.EntityMammoth;
import com.github.revival.common.entity.mob.EntityMosasaurus;
import com.github.revival.common.entity.mob.EntityNautilus;
import com.github.revival.common.entity.mob.EntityPachycephalosaurus;
import com.github.revival.common.entity.mob.EntityPlesiosaurus;
import com.github.revival.common.entity.mob.EntityPterosaur;
import com.github.revival.common.entity.mob.EntityQuagga;
import com.github.revival.common.entity.mob.EntitySarcosuchus;
import com.github.revival.common.entity.mob.EntitySmilodon;
import com.github.revival.common.entity.mob.EntitySpinosaurus;
import com.github.revival.common.entity.mob.EntityStegosaurus;
import com.github.revival.common.entity.mob.EntityTerrorBird;
import com.github.revival.common.entity.mob.EntityTriceratops;
import com.github.revival.common.entity.mob.EntityTyrannosaurus;
import com.github.revival.common.entity.mob.EntityVelociraptor;
import com.github.revival.common.item.ItemBirdEgg;
import com.github.revival.common.item.ItemDinoEgg;
import com.github.revival.common.item.ItemMammalEmbryo;
import com.github.revival.common.item.forge.ForgeFood;

import cpw.mods.fml.common.registry.GameRegistry;


interface I
{
	int NOTHING = 0;

	int NO_FEEDER = 0;//Bits 0+1:	Dinos Can't use Feeder at all
	int HERBIVORE = 1;//Bit 0:		Dino can use Herbivore Part of Feeder
	int CARNIVORE = 2;//Bit 1: 	Dino can use Carnivore Part of Feeder
	int HERB_CARN = 3;//Bits 0+1: 	Dinos can use Herbivore and Carnivore Part of Feeder

	int MODEL = 1 << 2; //Bit 2: Dino is Modelable
	int TAME = 1 << 3; //Bit 3: Dino is Tameable
	int RIDE = 1 << 4; //Bit 4: Dino is Rideable
	int CARRY = 1 << 5; //Bit 5: Dino can Carry Items

}

public enum EnumPrehistoric {

	Nautilus(EntityNautilus.class, EnumMobType.FISH, EnumTimePeriod.MESOZOIC, EnumDiet.NONE, I.NOTHING, true),
	Coelacanth(EntityCoelacanth.class, EnumMobType.FISH, EnumTimePeriod.MESOZOIC, EnumDiet.NONE, I.NOTHING, true),
	Triceratops(EntityTriceratops.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.HERBIVORE, I.MODEL | I.TAME | I.RIDE | I.HERBIVORE, true),
	Velociraptor(EntityVelociraptor.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.CARNIVORE, I.TAME | I.CARNIVORE, true),
	Tyrannosaurus(EntityTyrannosaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.CARNIVORE, I.MODEL | I.TAME | I.RIDE | I.CARNIVORE, true),
	Pterosaur(EntityPterosaur.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.PISCIVORE, I.MODEL | I.TAME | I.CARNIVORE, true),
	Plesiosaur(EntityPlesiosaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.PISCIVORE, I.MODEL | I.TAME | I.RIDE | I.CARNIVORE, true),
	Mosasaurus(EntityMosasaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.PISCCARNIVORE, I.MODEL | I.CARNIVORE, true),
	Stegosaurus(EntityStegosaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.HERBIVORE, I.MODEL | I.TAME | I.HERBIVORE, true),
	Dilophosaurus(EntityDilophosaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.CARNIVORE, I.TAME | I.CARNIVORE, true),
	Brachiosaurus(EntityBrachiosaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.HERBIVORE, I.MODEL | I.TAME | I.RIDE | I.HERBIVORE, true),
	Spinosaurus(EntitySpinosaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.PISCCARNIVORE, I.MODEL | I.CARNIVORE, true),
	Compsognathus(EntityCompsognathus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.CARNIVORE, I.MODEL | I.TAME | I.CARNIVORE, true),
	Ankylosaurus(EntityAnkylosaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.HERBIVORE, I.MODEL | I.TAME | I.RIDE | I.HERBIVORE, true),
	Pachycephalosaurus(EntityPachycephalosaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.HERBIVORE, I.TAME | I.HERBIVORE, true),
	Deinonychus(EntityDeinonychus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.CARNIVORE_EGG, I.MODEL | I.TAME | I.CARNIVORE, true),
	Gallimimus(EntityGallimimus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.OMNIVORE, I.MODEL | I.TAME | I.RIDE | I.HERB_CARN, true),
	Liopleurodon(EntityLiopleurodon.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.PISCCARNIVORE, I.MODEL | I.CARNIVORE, true),
	Allosaurus(EntityAllosaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.CARNIVORE, I.MODEL | I.TAME | I.RIDE | I.CARNIVORE, true),
	Sarcosuchus(EntitySarcosuchus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.PISCCARNIVORE, I.TAME | I.CARNIVORE, true),
	Ceratosaurus(EntityCeratosaurus.class, EnumMobType.DINOSAUR, EnumTimePeriod.MESOZOIC, EnumDiet.CARNIVORE, I.MODEL | I.TAME | I.RIDE | I.CARNIVORE, true),
	Confuciusornis(EntityConfuciusornis.class, EnumMobType.BIRD, EnumTimePeriod.MESOZOIC, EnumDiet.HERBIVORE, I.TAME | I.HERBIVORE, true),
	Dodo(EntityDodo.class, EnumMobType.BIRD, EnumTimePeriod.CENOZOIC, EnumDiet.HERBIVORE, I.TAME | I.HERBIVORE, true),
	TerrorBird(EntityTerrorBird.class, EnumMobType.TERRORBIRD, EnumTimePeriod.CENOZOIC, EnumDiet.CARNIVORE, I.TAME, true),
	Mammoth(EntityMammoth.class, EnumMobType.MAMMAL, EnumTimePeriod.CENOZOIC, EnumDiet.HERBIVORE, I.TAME | I.RIDE | I.HERBIVORE, true),
	Smilodon(EntitySmilodon.class, EnumMobType.MAMMAL, EnumTimePeriod.CENOZOIC, EnumDiet.CARNIVORE, I.TAME | I.CARNIVORE, true),
	Quagga(EntityQuagga.class, EnumMobType.MAMMAL, EnumTimePeriod.CENOZOIC, EnumDiet.HERBIVORE, I.TAME | I.RIDE | I.HERBIVORE, true),
	Elasmotherium(EntityQuagga.class, EnumMobType.MAMMAL, EnumTimePeriod.CENOZOIC, EnumDiet.HERBIVORE, I.TAME | I.RIDE | I.HERBIVORE, true),
	Pig(EntityPig.class, EnumMobType.VANILLA, EnumTimePeriod.CURRENT, EnumDiet.OMNIVORE, I.NOTHING, false),
	Cow(EntityCow.class, EnumMobType.VANILLA, EnumTimePeriod.CURRENT, EnumDiet.HERBIVORE, I.NOTHING, false),
	Sheep(EntitySheep.class, EnumMobType.VANILLA, EnumTimePeriod.CURRENT, EnumDiet.HERBIVORE, I.NOTHING, false),
	Horse(EntityHorse.class, EnumMobType.VANILLA, EnumTimePeriod.CURRENT, EnumDiet.HERBIVORE, I.NOTHING, false),
	Chicken(EntityChicken.class, EnumMobType.CHICKEN, EnumTimePeriod.CURRENT, EnumDiet.HERBIVORE, I.NOTHING, false);

	private final Class dinoClass;
	public EnumMobType type;
	public EnumDiet diet;
	public EnumTimePeriod timeperiod;
	public DinoFoodItemList FoodItemList;
	public DinoFoodBlockList FoodBlockList;
	public DinoFoodMobList FoodMobList;
	public int MaxAge = 999;
	public int AdultAge = 6;
	public int TeenAge = 3;
	public double Health0 = 20;
	public double HealthMax = 20;
	public double Strength0 = 2;
	public double StrengthMax = 2;
	public double Speed0 = 0.25D;
	public double SpeedMax = 0.3D;
	public int BreedingTicks = 3000;
	public int AgingTicks = 12000;
	public int MaxHunger = 100;
	public float HungryLevel = 0.8f;
	public float Exp0 = 1.0f;
	public float ExpInc = 0.2f;
	private static float sizeBaby = 1;
	private static float sizeTeen = 1;
	private static float sizeAdult = 1;
	public int Flags = 0;
	public Item orderItem;
	public Item foodItem;
	public Item cookedFoodItem;
	public Item DNAItem;
	public Item eggItem;
	public Item embryoItem;
	public Item birdEggItem;
	public Item bestBirdEggItem;
	public int growTime = 100;

	EnumPrehistoric(Class class0, EnumMobType animalType, EnumTimePeriod timeperiod, EnumDiet diet, int f0, boolean init)
	{
		this.dinoClass = class0;
		this.type = animalType;
		this.timeperiod = timeperiod;
		this.diet = diet;
		this.Flags = f0;
		this.FoodItemList = new DinoFoodItemList();
		this.FoodBlockList = new DinoFoodBlockList();
		this.FoodMobList = new DinoFoodMobList();
	}

	public static void init(){

		for(int i = 0; i < EnumPrehistoric.values().length; i++)
		{
			EnumPrehistoric.values()[i].DNAItem = new Item().setUnlocalizedName("dna" + EnumPrehistoric.values()[i].name()).setTextureName("fossil:prehistoric/dna/" + EnumPrehistoric.values()[i].name() + "_DNA").setCreativeTab(FATabRegistry.tabFItems);	
			GameRegistry.registerItem(EnumPrehistoric.values()[i].DNAItem, "dna" + EnumPrehistoric.values()[i].name());
		}
		for(int i = 0; i < EnumPrehistoric.values().length; i++)
		{
			if(EnumPrehistoric.values()[i].type == EnumMobType.DINOSAUR){
				EnumPrehistoric.values()[i].eggItem = new ItemDinoEgg(EnumPrehistoric.values()[i]).setUnlocalizedName("egg" + EnumPrehistoric.values()[i].name()).setTextureName("fossil:prehistoric/dinoEggs/" + EnumPrehistoric.values()[i].name() + "_Egg").setCreativeTab(FATabRegistry.tabFItems);	
				GameRegistry.registerItem(EnumPrehistoric.values()[i].eggItem, "egg" + EnumPrehistoric.values()[i].name());
			}
		}
		for(int i = 0; i < EnumPrehistoric.values().length; i++)
		{
			if(EnumPrehistoric.values()[i].type == EnumMobType.MAMMAL || EnumPrehistoric.values()[i].type == EnumMobType.VANILLA){
				EnumPrehistoric.values()[i].embryoItem = new ItemMammalEmbryo(i).setUnlocalizedName("embryo" + EnumPrehistoric.values()[i].name()).setTextureName("fossil:prehistoric/embryos/" + EnumPrehistoric.values()[i].name() + "_Syringe").setCreativeTab(FATabRegistry.tabFItems);	
				GameRegistry.registerItem(EnumPrehistoric.values()[i].embryoItem, "embryo" + EnumPrehistoric.values()[i].name());
			}
		}
		for(int i = 0; i < EnumPrehistoric.values().length; i++)
		{
			if(EnumPrehistoric.values()[i].type == EnumMobType.BIRD){
				EnumPrehistoric.values()[i].birdEggItem = new ItemBirdEgg(EnumPrehistoric.values()[i], false).setUnlocalizedName("egg" + EnumPrehistoric.values()[i].name()).setTextureName("fossil:prehistoric/birdEggs/Egg_" + EnumPrehistoric.values()[i].name() ).setCreativeTab(FATabRegistry.tabFItems);	
				GameRegistry.registerItem(EnumPrehistoric.values()[i].birdEggItem, "egg" + EnumPrehistoric.values()[i].name());
			}
		}
		for(int i = 0; i < EnumPrehistoric.values().length; i++)
		{
			if(EnumPrehistoric.values()[i].type == EnumMobType.BIRD || EnumPrehistoric.values()[i].type == EnumMobType.CHICKEN){
				EnumPrehistoric.values()[i].bestBirdEggItem = new ItemBirdEgg(EnumPrehistoric.values()[i], true).setUnlocalizedName("eggCultivated" + EnumPrehistoric.values()[i].name()).setTextureName("fossil:prehistoric/birdEggs/Egg_Cultivated_" + EnumPrehistoric.values()[i].name() ).setCreativeTab(FATabRegistry.tabFItems);	
				GameRegistry.registerItem(EnumPrehistoric.values()[i].bestBirdEggItem, "eggCultivated" + EnumPrehistoric.values()[i].name());
			}
		}
		for(int i = 0; i < EnumPrehistoric.values().length; i++)
		{
			if(EnumPrehistoric.values()[i].timeperiod != EnumTimePeriod.CURRENT){
				if(EnumPrehistoric.values()[i].type != EnumMobType.FISH){
					EnumPrehistoric.values()[i].foodItem = new ForgeFood(3, 0.3F, true, "prehistoric/food/" + EnumPrehistoric.values()[i].name() + "_Meat").setUnlocalizedName("raw" + EnumPrehistoric.values()[i].name()).setCreativeTab(FATabRegistry.tabFItems);	
					GameRegistry.registerItem(EnumPrehistoric.values()[i].foodItem, "raw" + EnumPrehistoric.values()[i].name());
				}
			}
		}
		for(int i = 0; i < EnumPrehistoric.values().length; i++)
		{
			if(EnumPrehistoric.values()[i].timeperiod != EnumTimePeriod.CURRENT){
				EnumPrehistoric.values()[i].cookedFoodItem = new ForgeFood(8, 0.8F, true, "prehistoric/cookedFood/" + EnumPrehistoric.values()[i].name() + "_Meat_Cooked").setUnlocalizedName("cooked" + EnumPrehistoric.values()[i].name()).setCreativeTab(FATabRegistry.tabFItems);	
				GameRegistry.registerItem(EnumPrehistoric.values()[i].cookedFoodItem, "cooked" + EnumPrehistoric.values()[i].name());
			}
		}
	}

	public static boolean isDNA(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if (values()[i].DNAItem == i0)
			{
				return true;
			}
		}

		return false;
	}

	public static boolean isDinoEgg(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if (values()[i].type == EnumMobType.DINOSAUR){
				if (values()[i].eggItem == i0)
				{
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * takes an Item and returns if it is a dino meat drop
	 */
	public static boolean isFoodItem(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if (values()[i].foodItem == i0)
			{
				return true;
			}
		}

		return false;
	}

	/**
	 * takes an item, if it is a dinos dropItem or EggItem, it returns the corresponding DNA Item
	 */
	public static Item getDNA(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if (values()[i].bestBirdEggItem == i0 || values()[i].birdEggItem == i0 || values()[i].embryoItem == i0 || values()[i].foodItem == i0 || values()[i].eggItem == i0)
			{
				return values()[i].DNAItem;
			}
		}

		return null;
	}

	public static boolean isEmbryo(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].type == EnumMobType.MAMMAL){

				if (values()[i].embryoItem == i0)
				{
					return true;
				}
			}
		}

		return false;
	}
	public static boolean isBirdEgg(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].type == EnumMobType.BIRD){

				if (values()[i].birdEggItem == i0)
				{
					return true;
				}
			}
		}

		return false;
	}
	public static boolean isBestBirdEgg(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].type == EnumMobType.BIRD || values()[i].type == EnumMobType.CHICKEN){

				if (values()[i].bestBirdEggItem == i0)
				{
					return true;
				}
			}
		}

		return false;
	}
	/**
	 * takes an item, if it is a dinos DNAItem or EggItem, it returns the corresponding Drop Item
	 */
	public static Item getFoodItem(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if (values()[i].bestBirdEggItem == i0 || values()[i].birdEggItem == i0 || values()[i].embryoItem == i0 || values()[i].DNAItem == i0 || values()[i].eggItem == i0)
			{
				return values()[i].foodItem;
			}
		}
		return null;
	}

	/**
	 * takes an item, if it is a dinos DNAItem or DropItem, it returns the corresponding Egg Item
	 */
	public static Item getEgg(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].type == EnumMobType.DINOSAUR){

				if (values()[i].foodItem == i0 || values()[i].DNAItem == i0)
				{
					return values()[i].eggItem;
				}
			}
		}

		return null;
	}
	public static Item getEmbryo(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].type == EnumMobType.MAMMAL){
				if(values()[i].DNAItem == i0 || values()[i].foodItem == i0 )
				{
					return values()[i].embryoItem;
				}
			}
		}

		return null;
	}
	public static Item getBirdEgg(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].type == EnumMobType.BIRD){
				if(values()[i].bestBirdEggItem == i0 || values()[i].DNAItem == i0 || values()[i].foodItem == i0)
				{
					return values()[i].birdEggItem;
				}
			}
		}

		return null;
	}public static Item getBestBirdEgg(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].type == EnumMobType.BIRD || values()[i].type == EnumMobType.CHICKEN){

				if(values()[i].birdEggItem == i0 || values()[i].DNAItem == i0 || values()[i].foodItem == i0)
				{
					return values()[i].bestBirdEggItem;
				}
			}
		}

		return null;
	}
	/**
	 * takes an drop-,dna- or eggitem and gives the index, -1 means not found
	 */
	public static int getIndex(Item i0)
	{
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].bestBirdEggItem == i0 || values()[i].embryoItem == i0 || values()[i].birdEggItem == i0 || values()[i].DNAItem == i0 || values()[i].foodItem == i0 || values()[i].eggItem == i0)
			{
				return i;
			}
		}

		return -1;
	}

	/**
	 * sets the OrderItem,DropItem,DNAItem and EggItem for the Dino
	 */
	private void setOrderItem(Item order)
	{
		this.orderItem = order;
	}
	private void setAges(int Teen, int Adult, int Max)
	{
		if (Teen > 0)
		{
			this.TeenAge = Teen;
		}

		if (Adult > 0)
		{
			this.AdultAge = Adult;
		}

		if (Max > 0)
		{
			this.MaxAge = Max;
		}
	}

	private void setDinoSize(float sizeBaby, float sizeTeen, float sizeAdult)
	{
		EnumPrehistoric.sizeBaby = sizeBaby;
		EnumPrehistoric.sizeTeen = sizeTeen;
		EnumPrehistoric.sizeAdult = sizeAdult;
	}

	/**
	 * sets the min/max values for Health, Attack Damage, Speed, and the Max Hunger Value
	 */
	private void setProperties(double H0, double HMax, double Str0, double StrMax, double Sp0, double SpMax, int Hunger)
	{
		if (H0 > 0)
		{
			this.Health0 = H0;
		}

		if (Str0 > 0)
		{
			this.Strength0 = Str0;
		}

		if (Sp0 > 0)
		{
			this.Speed0 = Sp0;
		}

		if (HMax > 0)
		{
			this.HealthMax = HMax;
		}

		if (StrMax > 0)
		{
			this.StrengthMax = StrMax;
		}

		if (SpMax > 0)
		{
			this.SpeedMax = SpMax;
		}

		if (Hunger > 0)
		{
			this.MaxHunger = Hunger;
		}
	}

	/**
	 * sets the breeding time, the aging time and the hungry-level
	 * Hungry level h:below h*MaxHunger, the dinos starts looking for food, below (1-h)*Maxhunger, the dino is starving
	 */
	private void setAddProperties(int Breed, int Age, float HLevel)
	{
		if (Breed > 0)
		{
			this.BreedingTicks = Breed;
		}

		if (Age > 0)
		{
			this.AgingTicks = Age;
		}

		if (HLevel > 0)
		{
			this.HungryLevel = HLevel;
		}
	}

	/**
	 * sets the breeding time, the aging time and the hungry-level
	 * Hungry level h:below h*MaxHunger, the dinos starts looking for food, below (1-h)*Maxhunger, the dino is starving
	 */
	private void setExperience(float E0, float EInc)
	{
		if (E0 > 0)
		{
			this.Exp0 = E0;
		}

		if (EInc > 0)
		{
			this.ExpInc = EInc;
		}
	}

	public Class getDinoClass()
	{
		return this.dinoClass;
	}

	public boolean isModelable()
	{
		return (this.Flags & I.MODEL) != 0;
	}

	public boolean isTameable()
	{
		return (this.Flags & I.TAME) != 0;
	}

	public boolean isRideable()
	{
		return (this.Flags & I.RIDE) != 0;
	}

	public boolean canCarryItems()
	{
		return (this.Flags & I.CARRY) != 0;
	}

	public boolean useFeeder()
	{
		return (this.Flags & I.HERB_CARN) != 0;
	}

	public boolean isHerbivore()
	{
		return (this.Flags & I.HERBIVORE) != 0;
	}

	public boolean isCarnivore()
	{
		return (this.Flags & I.CARNIVORE) != 0;
	}
	
	
	public static EnumPrehistoric getRandomMezoic(){
		List<EnumPrehistoric> list = new ArrayList<EnumPrehistoric>();
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].timeperiod == EnumTimePeriod.MESOZOIC){
				list.add(values()[i]);
			}
		}
		int index = new Random().nextInt(list.size());		
		return list.get(index);

	}
	public static Item getRandomMesozoicDNA(){
		List<Item> list = new ArrayList<Item>();
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].timeperiod == EnumTimePeriod.MESOZOIC){
				list.add(values()[i].DNAItem);
			}
		}
		int index = new Random().nextInt(list.size());		
		return list.get(index);

	}
	public static EnumPrehistoric getRandomCenozoic(){
		List<EnumPrehistoric> list = new ArrayList<EnumPrehistoric>();
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].timeperiod == EnumTimePeriod.CENOZOIC){
				list.add(values()[i]);
			}
		}
		int index = new Random().nextInt(list.size());		
		return list.get(index);

	}
	public static EnumPrehistoric getRandom(){
		List<EnumPrehistoric> list = new ArrayList<EnumPrehistoric>();
		for (int i = 0; i < values().length; i++)
		{
			list.add(values()[i]);
		}
		int index = ThreadLocalRandom.current().nextInt(list.size());		
		return list.get(index);

	}
	public static int getBones(){
		List<EnumPrehistoric> list = new ArrayList<EnumPrehistoric>();
		for (int i = 0; i < values().length; i++)
		{
			if(values()[i].timeperiod != EnumTimePeriod.CURRENT || values()[i].type != EnumMobType.FISH){
				list.add(values()[i]);
			}
		}
		return list.size();

	}
}
