package com.github.revival.common.entity.mob;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.netty.buffer.ByteBuf;
import net.ilexiconn.llibrary.client.model.modelbase.ChainBuffer;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.github.revival.Revival;
import com.github.revival.common.config.FossilConfig;
import com.github.revival.common.entity.ai.DinoAIEat;
import com.github.revival.common.entity.ai.DinoAIFollowOwner;
import com.github.revival.common.entity.ai.DinoAIRideGround;
import com.github.revival.common.entity.ai.DinoAIWander;
import com.github.revival.common.entity.mob.test.DinoAIFlock;
import com.github.revival.common.entity.mob.test.EntityNewPrehistoric;
import com.github.revival.common.entity.mob.test.Flock;
import com.github.revival.common.enums.EnumPrehistoric;
import com.github.revival.common.enums.EnumPrehistoricAI.Activity;
import com.github.revival.common.enums.EnumPrehistoricAI.Attacking;
import com.github.revival.common.enums.EnumPrehistoricAI.Climbing;
import com.github.revival.common.enums.EnumPrehistoricAI.Following;
import com.github.revival.common.enums.EnumPrehistoricAI.Jumping;
import com.github.revival.common.enums.EnumPrehistoricAI.Moving;
import com.github.revival.common.enums.EnumPrehistoricAI.Response;
import com.github.revival.common.enums.EnumPrehistoricAI.Stalking;
import com.github.revival.common.enums.EnumPrehistoricAI.Taming;
import com.github.revival.common.enums.EnumPrehistoricAI.Untaming;
import com.github.revival.common.enums.EnumPrehistoricAI.WaterAbility;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityGallimimus extends EntityNewPrehistoric
{
	public static final double baseDamage = 1;
	public static final double maxDamage = 3;
	public static final double baseHealth = 8;
	public static final double maxHealth = 40;
	public static final double baseSpeed = 0.25D;
	public static final double maxSpeed = 0.4D;
	public Object tailbuffer = Revival.proxy.getChainBuffer(3);


	public EntityGallimimus(World world) {
		super(world, EnumPrehistoric.Gallimimus);
        this.setSize(1.1F, 2F);
		this.hasFeatherToggle = true;
		this.featherToggle = FossilConfig.featheredGallimimus;
		minSize = 0.5F;
		maxSize = 2.2F;
		teenAge = 4;
		developsResistance = true;
		breaksBlocks = false;
		favoriteFood = Items.carrot;
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(baseSpeed);
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(baseHealth);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(baseDamage);
	}
	
	/*public static final double baseHealth = EnumPrehistoric.Gallimimus.Health0;

	//    final float PUSHDOWN_HARDNESS = 5.0F;
	//final EntityAIControlledByPlayer aiControlledByPlayer;
	public static final double baseDamage = EnumPrehistoric.Gallimimus.Strength0;
	public static final double baseSpeed = EnumPrehistoric.Gallimimus.Speed0;
	public static final double maxHealth = EnumPrehistoric.Gallimimus.HealthMax;
	public static final double maxDamage = EnumPrehistoric.Gallimimus.StrengthMax;
	public static final double maxSpeed = EnumPrehistoric.Gallimimus.SpeedMax;
	private final String texturePath;
	public float herdMemberRange = 32;
	public EntityDinosaur flockLeader = null;
	public boolean isTamed = false;
	private ChunkCoordinates currentHerdTarget;
	public Flock flock;

	public EntityGallimimus(World var1)
	{
		super(var1, EnumPrehistoric.Gallimimus);
		this.updateSize();
		
		this.adultAge = EnumPrehistoric.Gallimimus.AdultAge;
		// Set initial size for hitbox. (length/width, height)
		this.setSize(1.0F, 2.0F);
		// Size of dinosaur at day 0.
		this.minSize = 0.5F;
		// Size of dinosaur at age Adult.
		this.maxSize = 2.2F;

		if (!FossilConfig.featheredGallimimus)
			texturePath = Revival.MODID + ":textures/mob/" + this.SelfType.toString() + "/feathered/" + "Feathered_";
		else
			texturePath = Revival.MODID + ":textures/mob/" + this.SelfType.toString() + "/";

		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.2F));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.1D, true));
		this.tasks.addTask(5, new DinoAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		tasks.addTask(1, new DinoAIRideGround(this, 1)); // mutex all
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));

		this.tasks.addTask(6, new DinoAIEat(this, 48));
		this.tasks.addTask(7, new DinoAIWander(this, 1.0D));

		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityTyrannosaurus.class, 16.0F, 0.8D, 1.33D));
		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntitySpinosaurus.class, 16.0F, 0.8D, 1.33D));
		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityDilophosaurus.class, 16.0F, 0.8D, 1.33D));
		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityDeinonychus.class, 16.0F, 0.8D, 1.33D));
		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityMosasaurus.class, 16.0F, 0.8D, 1.33D));
		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityLiopleurodon.class, 16.0F, 0.8D, 1.33D));
		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityBrachiosaurus.class, 4.0F, 0.8D, 1.33D));
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(EnumPrehistoric.Gallimimus.Speed0);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(EnumPrehistoric.Gallimimus.Health0);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(EnumPrehistoric.Gallimimus.Strength0);
	}

	@Override
	public String getTexture()
	{
		if (this.isModelized())
		{
			return super.getTexture();
		}

		switch (this.getSubSpecies())
		{
		case 1:
			return texturePath + "Gallimimus_Green.png";
		case 2:
			return texturePath + "Gallimimus_LightBlue.png";
		case 3:
			return texturePath + "Gallimimus_Orange.png";
		case 4:
		default:
			return texturePath + "Gallimimus_Brown.png";
		}
	}

	public int getVerticalFaceSpeed()
	{
		return this.isSitting() ? 70 : super.getVerticalFaceSpeed();
	}

	public boolean interact(EntityPlayer var1)
	{
		//Add special item interaction code here
		return super.interact(var1);
	}

	public EntityGallimimus spawnBabyAnimal(EntityAnimal var1)
	{
		return new EntityGallimimus(this.worldObj);
	}

	public float getEyeHeight()
	{
		return (float) this.getDinoAge() / 3.2F;
	}

	public float getMountHeight()
	{
		return this.height / 1.8F;
	}

	public void updateRiderPosition()
	{
		super.updateRiderPosition();
		if (this.riddenByEntity != null)
		{
			this.riddenByEntity.setPosition(this.posX, this.posY + this.getMountHeight() + this.riddenByEntity.getYOffset(), this.posZ);

			//this.riddenByEntity.setPosition(this.posX, this.posY + (double)this.getHalfHeight(), this.posZ);
		}
	}
	public void onLivingUpdate(){
		super.onLivingUpdate();

		if(closestEntity() != null && ((EntityGallimimus)closestEntity()).flock != null){
			((EntityGallimimus)closestEntity()).flock.flockMembers.add(this);
		}else{
			if(flock == null){
				flock = new Flock();
				flock.createFlock(this);
			}else{
				flock.onUpdate();
				if(this.closestEntity() instanceof EntityGallimimus && ((EntityGallimimus)this.closestEntity()).flock != this.flock){
					flock.flockMembers.add(flockLeader);
				}
			}
		}
	}

	public EntityDinosaur closestEntity(){
		IEntitySelector selector =IEntitySelector.selectAnything;
		List<Entity> entities = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand((double)herdMemberRange, 3.0D, (double)herdMemberRange), selector);
		for(Entity mob: entities){
			if(mob instanceof EntityDinosaur){
				if(((EntityDinosaur)mob).SelfType == this.SelfType){
					return (EntityDinosaur) mob;
				}
			}
		}
		return null;
	}


	@Override
	public void updateSize()
	{

		double healthStep;
		double attackStep;
		double speedStep;
		healthStep = (this.maxHealth - this.baseHealth) / (this.adultAge + 1);
		attackStep = (this.maxDamage - this.baseDamage) / (this.adultAge + 1);
		speedStep = (this.maxSpeed - this.baseSpeed) / (this.adultAge + 1);


		if (this.getDinoAge() <= this.adultAge)
		{

			this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(Math.round(this.baseHealth + (healthStep * this.getDinoAge())));
			this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(Math.round(this.baseDamage + (attackStep * this.getDinoAge())));
			this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.baseSpeed + (speedStep * this.getDinoAge()));

			if (this.isTeen())
			{
				this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.5D);
			}
			else if (this.isAdult())
			{
				this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(2.0D);
			}
			else
			{
				this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
			}
		}
	}

	@Override
	public void writeSpawnData(ByteBuf buffer)
	{


	}

	@Override
	public void readSpawnData(ByteBuf additionalData)
	{


	}

	@Override
	public EntityAgeable createChild(EntityAgeable var1)
	{
		EntityGallimimus baby = new EntityGallimimus(this.worldObj);
		baby.setSubSpecies(this.getSubSpecies());
		return baby;
	}*/

	@Override
	public void setSpawnValues() {}

	@Override
	public Activity aiActivityType() {
		return Activity.DURINAL;
	}

	@Override
	public Attacking aiAttackType() {

		return Attacking.BASIC;
	}

	@Override
	public Climbing aiClimbType() {

		return Climbing.NONE;
	}

	@Override
	public Following aiFollowType() {

		return Following.SKITTISH;
	}

	@Override
	public Jumping aiJumpType() {

		return Jumping.TWOBLOCKS;
	}

	@Override
	public Response aiResponseType() {

		return Response.SCARED;
	}

	@Override
	public Stalking aiStalkType() {

		return Stalking.NONE;
	}

	@Override
	public Taming aiTameType() {

		return Taming.FEEDING;
	}

	@Override
	public Untaming aiUntameType() {

		return Untaming.ATTACK;
	}

	@Override
	public Moving aiMovingType() {

		return Moving.WALK;
	}

	@Override
	public WaterAbility aiWaterAbilityType() {

		return WaterAbility.NONE;
	}

	@Override
	public boolean doesFlock() {

		return true;
	}

	@Override
	public Item getOrderItem() {

		return Items.stick;
	}
	
	public void onUpdate(){
		super.onUpdate();
		//Revival.proxy.doChainBuffer(tailbuffer, this);
	}

	public void updateSize()
	{
		 double healthStep;
	        double attackStep;
	        double speedStep;
	        healthStep = (this.maxHealth - this.baseHealth) / (this.getAdultAge() + 1);
	        attackStep = (this.maxDamage - this.baseDamage) / (this.getAdultAge() + 1);
	        speedStep = (this.maxSpeed - this.baseSpeed) / (this.getAdultAge() + 1);
	        
	        
	        if (this.getDinoAge() <= this.getAdultAge())
	        {

	            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(Math.round(this.baseHealth + (healthStep * this.getDinoAge())));
	            this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(Math.round(this.baseDamage + (attackStep * this.getDinoAge())));
	            this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.baseSpeed + (speedStep * this.getDinoAge()));

	            if (this.isTeen())
	            {
	                this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.5D);
	            }
	            else if (this.isAdult())
	            {
	                this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(2.0D);
	            }
	            else
	            {
	                this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
	            }
	        }
	}

	@Override
	public int getAdultAge() {
		return 10;
	}
	
}
