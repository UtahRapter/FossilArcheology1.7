package mods.fossil.entity.mob;

import mods.fossil.Fossil;
import mods.fossil.handler.AnuTeleporter;
import mods.fossil.util.DeathOrbFX;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;

public class EntityAnuDead extends EntityLiving
{

	public boolean slowed;
	private Entity target;
	public int deathTicks = 0;
	public int deathTicks_animation = 0;

	public int maxLifespan = 940;
	public EntityAnuDead(World world)
	{
		super(world);
		this.setSize(1.8F, 0.8F);
		this.isImmuneToFire = true;
		this.ignoreFrustumCheck = true;

	}

	public void moveEntityWithHeading(float par1, float par2) {
		this.motionX *= 0.0D;
		this.motionY *= 0.0D;
		this.motionZ *= 0.0D;
	}
	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(16, new Byte((byte)0));
	}
	public void playSummonSong(){
		this.playSound("fossil:anu_death_effect", 0.15F, 1F);
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
	}

	public boolean interact(EntityPlayer entity)
	{
		if ((entity.ridingEntity == null) && (entity.riddenByEntity == null) && (entity instanceof EntityPlayerMP))
		{
			EntityPlayerMP thePlayer = (EntityPlayerMP) entity;

			if (thePlayer.timeUntilPortal > 0)
			{
				thePlayer.timeUntilPortal = 10;
			}
			else if (thePlayer.dimension != Fossil.dimensionID_treasure)
			{
				thePlayer.timeUntilPortal = 10;
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, Fossil.dimensionID_treasure, new AnuTeleporter(thePlayer.mcServer.worldServerForDimension(Fossil.dimensionID_treasure)));
			}
			else
			{
				thePlayer.timeUntilPortal = 10;
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new AnuTeleporter(thePlayer.mcServer.worldServerForDimension(0)));
			}
		}
		return true;
	}
	/**
	 * handles entity death timer, experience orb and particle creation
	 */
	protected void onDeathUpdate()
	{
		if(deathTicks < this.maxLifespan){
			deathTicks++;
		}
		if(deathTicks == this.maxLifespan){
			this.setDead();
		}
		if(deathTicks_animation > this.maxLifespan){
			deathTicks_animation--;
		}
		if(deathTicks == 40){
			this.playSummonSong();
		}
		for (int i = 0; i < 2; ++i)
		{
			if(worldObj.isRemote){
				EntityFX particle1 = new DeathOrbFX(worldObj, (double)this.posX, (double)this.posY, (double)this.posZ, 0, 0, 0);
				Minecraft.getMinecraft().effectRenderer.addEffect(particle1);
			}
		}
	}

	/**
	 * Makes the entity despawn if requirements are reached
	 */
	protected void despawnEntity() {

	}
	/**
	 * Returns true if other Entities should be prevented from moving through this Entity.
	 */
	public boolean canBeCollidedWith()
	{
		return true;
	}

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume()
	{
		return 5.0F;
	}
}