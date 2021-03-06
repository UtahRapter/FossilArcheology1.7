package com.github.revival.common.entity.mob.test;

import java.util.List;

import com.github.revival.common.enums.EnumPrehistoricAI.Response;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.Vec3;

public class DinoAITerratorial extends EntityAIBase
{
	public final IEntitySelector selector = new IEntitySelector()
	{
		private static final String __OBFID = "CL_00001575";
		/**
		 * Return whether the specified entity is applicable to this filter.
		 */
		public boolean isEntityApplicable(Entity entity)
		{
			return entity.isEntityAlive() && DinoAITerratorial.this.dino.getEntitySenses().canSee(entity);
		}
	};
	/** The entity we are attached to */
	private EntityNewPrehistoric dino;
	private Entity closestLivingEntity;
	private float distanceFromEntity;
	/** The PathEntity of our entity */
	private PathEntity entityPathEntity;
	/** The PathNavigate of our entity */
	private PathNavigate entityPathNavigate;
	/** The class of the entity we should avoid */
	private Class<? extends Entity> targetEntityClass;
	private static final String __OBFID = "CL_00001574";

	public DinoAITerratorial(EntityNewPrehistoric creature, Class<? extends Entity> target, float distance)
	{
		this.dino = creature;
		this.targetEntityClass = target;
		this.distanceFromEntity = distance;
		this.entityPathNavigate = creature.getNavigator();
		this.setMutexBits(1);
	}

	/**
	 * Returns whether the EntityAIBase should begin execution.
	 */
	public boolean shouldExecute()
	{
		if(this.dino instanceof EntityNewPrehistoric){
			EntityNewPrehistoric prehistoric = (EntityNewPrehistoric)dino;
			if(prehistoric.aiResponseType() != Response.TERRITORIAL){
				return false;
			}
		}
		if(this.dino.preyBlacklist().contains(targetEntityClass)){
			return false;
		}
		if(closestLivingEntity != null){
			if(targetEntityClass == closestLivingEntity.getClass() && targetEntityClass != dino.getClass()){
				if(closestLivingEntity.boundingBox.maxX * 1.5F < dino.boundingBox.maxX && closestLivingEntity.boundingBox.minX * 1.5F > dino.boundingBox.minX
						&& closestLivingEntity.boundingBox.minZ * 1.5F < dino.boundingBox.minZ && closestLivingEntity.boundingBox.minZ  * 1.5F > dino.boundingBox.minZ){
					return false;
				}
			}
		}
		if (this.targetEntityClass == EntityPlayer.class)
		{
			if (this.dino instanceof EntityTameable && ((EntityTameable)this.dino).isTamed())
			{
				return false;
			}

			this.closestLivingEntity = this.dino.worldObj.getClosestPlayerToEntity(this.dino, (double)this.distanceFromEntity);

			if (this.closestLivingEntity == null)
			{
				return false;
			}

		}
		else
		{
			List list = this.dino.worldObj.selectEntitiesWithinAABB(this.targetEntityClass, this.dino.boundingBox.expand((double)this.distanceFromEntity, 3.0D, (double)this.distanceFromEntity), this.selector);

			if (list.isEmpty())
			{
				return false;
			}

			this.closestLivingEntity = (Entity)list.get(0);
		}
		if(closestLivingEntity.getClass() == targetEntityClass){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * Returns whether an in-progress EntityAIBase should continue executing
	 */
	public boolean continueExecuting()
	{
		return !this.entityPathNavigate.noPath();
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	public void startExecuting()
	{
		dino.setAttackTarget((EntityLiving)closestLivingEntity);
	}

	/**
	 * Resets the task
	 */
	public void resetTask()
	{
		this.closestLivingEntity = null;
	}

	/**
	 * Updates the task
	 */
	public void updateTask()
	{
	}
}