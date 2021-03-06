package com.github.revival.client.model.prehistoric;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.ilexiconn.llibrary.common.animation.Animator;
import net.ilexiconn.llibrary.common.animation.IAnimated;
import net.minecraft.entity.Entity;

import com.github.revival.client.model.prehistoric.test.ModelNewPrehistoric;
import com.github.revival.common.entity.mob.test.EntityNewPrehistoric;

public class ModelDilophosaurus extends ModelNewPrehistoric
{
	public MowzieModelRenderer lowerBody;
    public MowzieModelRenderer rightThigh;
    public MowzieModelRenderer leftThigh;
    public MowzieModelRenderer tail1;
    public MowzieModelRenderer upperBody;
    public MowzieModelRenderer tail2;
    public MowzieModelRenderer tail3;
    public MowzieModelRenderer rightUpperArm;
    public MowzieModelRenderer leftUpperArm;
    public MowzieModelRenderer neck;
    public MowzieModelRenderer rightLowerArm;
    public MowzieModelRenderer leftLowerArm;
    public MowzieModelRenderer headPivot;
    public MowzieModelRenderer head;
    public MowzieModelRenderer leftCrest;
    public MowzieModelRenderer rightCrest;
    public MowzieModelRenderer upperJaw;
    public MowzieModelRenderer lowerJaw;
    public MowzieModelRenderer rightLeg;
    public MowzieModelRenderer rightFoot;
    public MowzieModelRenderer leftLeg;
    public MowzieModelRenderer leftFoot;
	private Animator animator;

    public ModelDilophosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.tail1 = new MowzieModelRenderer(this, 92, 0);
        this.tail1.setRotationPoint(0.0F, -0.2F, 8.3F);
        this.tail1.addBox(-2.5F, -2.3F, 0.0F, 5, 5, 8, 0.0F);
        this.setRotateAngle(tail1, -0.045553093477052F, -0.0F, 0.0F);
        this.upperBody = new MowzieModelRenderer(this, 66, 0);
        this.upperBody.setRotationPoint(0.0F, -0.5F, -0.5F);
        this.upperBody.addBox(-3.0F, -2.0F, -6.0F, 6, 6, 7, 0.0F);
        this.setRotateAngle(upperBody, 0.011344640137963142F, -0.0F, 0.0F);
        this.leftUpperArm = new MowzieModelRenderer(this, 14, 10);
        this.leftUpperArm.mirror = true;
        this.leftUpperArm.setRotationPoint(3.0F, 0.0F, -5.0F);
        this.leftUpperArm.addBox(0.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F);
        this.rightLowerArm = new MowzieModelRenderer(this, 0, 10);
        this.rightLowerArm.setRotationPoint(-1.0F, 3.0F, 0.5F);
        this.rightLowerArm.addBox(-0.9F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(rightLowerArm, -0.2617993877991494F, 0.0F, 0.0F);
        this.leftLeg = new MowzieModelRenderer(this, 24, 12);
        this.leftLeg.setRotationPoint(1.5F, 3.5F, 2.5F);
        this.leftLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(leftLeg, -0.2617993877991494F, -0.0F, 0.0F);
        this.leftThigh = new MowzieModelRenderer(this, 24, 0);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(3.4F, 12.7F, 4.5F);
        this.leftThigh.addBox(0.0F, -1.0F, -2.5F, 3, 6, 5, 0.0F);
        this.neck = new MowzieModelRenderer(this, 42, 21);
        this.neck.setRotationPoint(0.0F, -0.2F, -5.3F);
        this.neck.addBox(-2.0F, -1.4F, -9.0F, 4, 4, 10, 0.0F);
        this.setRotateAngle(neck, -0.4553564018453205F, -0.0F, 0.0F);
        this.lowerJaw = new MowzieModelRenderer(this, 2, 13);
        this.lowerJaw.setRotationPoint(0.0F, 0.9F, -3.8F);
        this.lowerJaw.addBox(-1.5F, 0.0F, -6.5F, 3, 1, 6, 0.0F);
        this.setRotateAngle(lowerJaw, 0.045553093477052F, -0.0F, 0.0F);
        this.leftLowerArm = new MowzieModelRenderer(this, 0, 10);
        this.leftLowerArm.mirror = true;
        this.leftLowerArm.setRotationPoint(1.0F, 3.0F, 0.5F);
        this.leftLowerArm.addBox(-1.1F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(leftLowerArm, -0.2617993877991494F, -0.0F, 0.0F);
        this.tail3 = new MowzieModelRenderer(this, 88, 15);
        this.tail3.setRotationPoint(0.0F, -0.3F, 10.4F);
        this.tail3.addBox(-1.0F, -0.7F, -0.2F, 2, 2, 17, 0.0F);
        this.setRotateAngle(tail3, -0.091106186954104F, -0.0F, 0.0F);
        this.leftFoot = new MowzieModelRenderer(this, 35, 21);
        this.leftFoot.setRotationPoint(0.0F, 6.1F, -0.4F);
        this.leftFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(leftFoot, 0.2617993877991494F, -0.0F, 0.0F);
        this.rightUpperArm = new MowzieModelRenderer(this, 14, 10);
        this.rightUpperArm.setRotationPoint(-3.0F, 0.0F, -5.0F);
        this.rightUpperArm.addBox(-2.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F);
        this.upperJaw = new MowzieModelRenderer(this, 0, 0);
        this.upperJaw.setRotationPoint(0.0F, -0.8F, -5.2F);
        this.upperJaw.addBox(-2.0F, -2.0F, -5.2F, 4, 4, 5, 0.0F);
        this.setRotateAngle(upperJaw, 0.045553093477052F, -0.0F, 0.0F);
        this.rightCrest = new MowzieModelRenderer(this, 18, 11);
        this.rightCrest.setRotationPoint(-1.5F, -2.3F, -5.6F);
        this.rightCrest.addBox(0.0F, -4.0F, -5.0F, 0, 4, 10, 0.0F);
        this.setRotateAngle(rightCrest, 0.008028514559173916F, -0.0F, 0.0F);
        this.headPivot = new MowzieModelRenderer(this, 0, 0);
        this.headPivot.setRotationPoint(0.0F, 0.8F, -6.8F);
        this.setRotateAngle(headPivot, 0.6829473363053812F, -0.0F, 0.0F);
        this.head = new MowzieModelRenderer(this, 0, 20);
        this.head.addBox(-3.0F, -3.0F, -6.0F, 6, 5, 6, 0.0F);
        this.rightThigh = new MowzieModelRenderer(this, 24, 0);
        this.rightThigh.setRotationPoint(-3.4F, 12.7F, 4.5F);
        this.rightThigh.addBox(-3.0F, -1.0F, -2.5F, 3, 6, 5, 0.0F);
        this.leftCrest = new MowzieModelRenderer(this, 18, 11);
        this.leftCrest.setRotationPoint(1.5F, -2.3F, -5.6F);
        this.leftCrest.addBox(0.0F, -4.0F, -5.0F, 0, 4, 10, 0.0F);
        this.setRotateAngle(leftCrest, 0.008028514559173916F, -0.0F, 0.0F);
        this.tail2 = new MowzieModelRenderer(this, 93, 36);
        this.tail2.setRotationPoint(0.0F, -0.3F, 7.29F);
        this.tail2.addBox(-2.0F, -1.4F, 0.0F, 4, 3, 12, 0.0F);
        this.setRotateAngle(tail2, 0.045553093477052F, -0.0F, 0.0F);
        this.lowerBody = new MowzieModelRenderer(this, 67, 13);
        this.lowerBody.setRotationPoint(0.0F, 11.7F, -1.8F);
        this.lowerBody.addBox(-3.5F, -3.0F, 0.0F, 7, 8, 10, 0.0F);
        this.rightFoot = new MowzieModelRenderer(this, 35, 21);
        this.rightFoot.mirror = true;
        this.rightFoot.setRotationPoint(0.0F, 6.1F, -0.4F);
        this.rightFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rightFoot, 0.2617993877991494F, -0.0F, 0.0F);
        this.rightLeg = new MowzieModelRenderer(this, 24, 12);
        this.rightLeg.mirror = true;
        this.rightLeg.setRotationPoint(-1.5F, 3.5F, 2.5F);
        this.rightLeg.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rightLeg, -0.2617993877991494F, -0.0F, 0.0F);
        this.lowerBody.addChild(this.tail1);
        this.lowerBody.addChild(this.upperBody);
        this.upperBody.addChild(this.leftUpperArm);
        this.rightUpperArm.addChild(this.rightLowerArm);
        this.leftThigh.addChild(this.leftLeg);
        this.upperBody.addChild(this.neck);
        this.head.addChild(this.lowerJaw);
        this.leftUpperArm.addChild(this.leftLowerArm);
        this.tail2.addChild(this.tail3);
        this.leftLeg.addChild(this.leftFoot);
        this.upperBody.addChild(this.rightUpperArm);
        this.head.addChild(this.upperJaw);
        this.head.addChild(this.rightCrest);
        this.neck.addChild(this.headPivot);
        this.headPivot.addChild(this.head);
        this.head.addChild(this.leftCrest);
        this.tail1.addChild(this.tail2);
        this.rightLeg.addChild(this.rightFoot);
        this.rightThigh.addChild(this.rightLeg);
        this.setInitPose();
		animator = new Animator(this);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		animate((IAnimated)entity, f, f1, f2, f3, f4, f5);
        this.leftThigh.render(f5);
        this.rightThigh.render(f5);
        this.lowerBody.render(f5);
    }
    

    public void animate(IAnimated entity, float f, float f1, float f2, float f3, float f4, float f5) {
		animator.update(entity);
		this.setToInitPose();
		setRotationAngles(f, f1, f2, f3, f4, f5, (Entity)entity);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		MowzieModelRenderer[] tailParts = {this.tail1, this.tail2, this.tail3};
		MowzieModelRenderer[] neckParts = {this.neck, this.head};
		MowzieModelRenderer[] leftArmParts = {this.leftUpperArm, this.leftLowerArm};
		MowzieModelRenderer[] rightArmParts = {this.rightUpperArm, this.rightLowerArm};
		this.faceTarget(head, 1, f3, f4);
		float speed = 0.1F;
		float speed2 = 0.8F;
		float sitProgress = ((EntityNewPrehistoric)(entity)).sitProgress;
		this.walk(upperBody, speed, 0.1F, false, 1F, 0F, entity.ticksExisted, 1);
		this.bob(lowerBody, speed, 0.7F, false, entity.ticksExisted, 1);
		this.walk(leftThigh, speed2, 0.8F, false, 0F, 0.4F, f, f1);
		this.walk(leftLeg, speed2, 0.2F, false, 0F, -0.6F, f, f1);
		this.walk(leftFoot, speed2, -0.8F, true, 0.3F, 0.4F, f, f1);
		this.walk(rightThigh, speed2, 0.8F, true, 0F, 0.4F, f, f1);
		this.walk(rightLeg, speed2, 0.2F, true, 0F, -0.6F, f, f1);
		this.walk(rightFoot, speed2, -0.8F, false, 0.3F, 0.4F, f, f1);
		this.chainWave(tailParts, speed, 0.05F, -3, entity.ticksExisted, 1);
		this.chainWave(leftArmParts, speed, 0.15F, -3, entity.ticksExisted, 1);
		this.chainWave(rightArmParts, speed, 0.15F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed, 0.15F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed2, 0.25F, -3, f, f1);
		this.chainWave(neckParts, speed, 0.15F, 3, entity.ticksExisted, 1);
		sitAnimationRotation(upperBody, sitProgress, (float)Math.toRadians(0.65D), 0, 0);
        sitAnimationRotation(upperJaw, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
        sitAnimationRotation(leftFoot, sitProgress, (float)Math.toRadians(90.0D), 0, 0);
        sitAnimationRotation(leftUpperArm, sitProgress, (float)Math.toRadians(2.0D), (float)Math.toRadians(5.0D), -((float)Math.toRadians(26.0D)));
        sitAnimationRotation(lowerJaw, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
        sitAnimationRotation(tail2, sitProgress, -((float)Math.toRadians(7.83D)), 0, 0);
        sitAnimationRotation(tail3, sitProgress, (float)Math.toRadians(10.43D), 0, 0);
        sitAnimationRotation(leftCrest, sitProgress, (float)Math.toRadians(0.46D), 0, 0);
        sitAnimationRotation(rightLeg, sitProgress, -((float)Math.toRadians(65.0D)), 0, 0);
        sitAnimationRotation(rightFoot, sitProgress, (float)Math.toRadians(90.0D), 0, 0);
        sitAnimationRotation(rightThigh, sitProgress, -((float)Math.toRadians(25.0D)), 0, 0);
        sitAnimationRotation(rightCrest, sitProgress, (float)Math.toRadians(0.46D), 0, 0);
        sitAnimationRotation(tail1, sitProgress, -((float)Math.toRadians(10.43D)), 0, 0);
        sitAnimationRotation(leftLowerArm, sitProgress, -((float)Math.toRadians(15.0D)), 0, 0);
        sitAnimationRotation(leftThigh, sitProgress, -((float)Math.toRadians(25.0D)), 0, 0);
        sitAnimationRotation(rightLowerArm, sitProgress, -((float)Math.toRadians(15.0D)), 0, 0);
        sitAnimationRotation(headPivot, sitProgress, (float)Math.toRadians(70.43D), 0, 0);
        sitAnimationRotation(leftLeg, sitProgress, -((float)Math.toRadians(65.0D)), 0, 0);
        sitAnimationRotation(rightUpperArm, sitProgress, (float)Math.toRadians(2.0D), -((float)Math.toRadians(5.0D)), (float)Math.toRadians(26.0D));
        sitAnimationRotation(neck, sitProgress, -((float)Math.toRadians(57.39D)), 0, 0);
        sitAnimationPos(lowerBody, sitProgress, 0, 5.8F, 0);
        sitAnimationPos(leftThigh, sitProgress, 0, 5.8F, 0);
        sitAnimationPos(rightThigh, sitProgress, 0, 5.8F, 0);
	}


}
