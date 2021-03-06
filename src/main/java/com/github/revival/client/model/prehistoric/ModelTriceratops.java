package com.github.revival.client.model.prehistoric;

import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.ilexiconn.llibrary.common.animation.Animator;
import net.ilexiconn.llibrary.common.animation.IAnimated;
import net.minecraft.entity.Entity;

import com.github.revival.client.model.prehistoric.test.ModelNewPrehistoric;
import com.github.revival.common.entity.mob.test.EntityNewPrehistoric;

public class ModelTriceratops extends ModelNewPrehistoric {
    public MowzieModelRenderer upperBody;
    public MowzieModelRenderer rightFrontThigh;
    public MowzieModelRenderer leftFrontThigh;
    public MowzieModelRenderer rightHindThigh;
    public MowzieModelRenderer leftHindThigh;
    public MowzieModelRenderer lowerBody;
    public MowzieModelRenderer neck;
    public MowzieModelRenderer tail1;
    public MowzieModelRenderer tail2;
    public MowzieModelRenderer quills;
    public MowzieModelRenderer tail3;
    public MowzieModelRenderer quills_1;
    public MowzieModelRenderer quills_2;
    public MowzieModelRenderer headPivot;
    public MowzieModelRenderer head;
    public MowzieModelRenderer beak;
    public MowzieModelRenderer frill;
    public MowzieModelRenderer leftHorn1;
    public MowzieModelRenderer rightHorn1;
    public MowzieModelRenderer beakbottom;
    public MowzieModelRenderer noseHorn;
    public MowzieModelRenderer frillProtrusions;
    public MowzieModelRenderer leftHorn2;
    public MowzieModelRenderer rightHorn2;
    public MowzieModelRenderer rightFrontLeg;
    public MowzieModelRenderer leftFrontLeg;
    public MowzieModelRenderer rightHindLeg;
    public MowzieModelRenderer leftHindLeg;
	private Animator animator;

    public ModelTriceratops() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.upperBody = new MowzieModelRenderer(this, 77, 0);
        this.upperBody.setRotationPoint(0.0F, 14.6F, 1.0F);
        this.upperBody.addBox(-3.5F, 0.0F, -6.0F, 7, 6, 6, 0.0F);
        ModelUtils.setRotateAngle(upperBody, 0.12217304763960307F, -0.0F, 0.0F);
        this.frillProtrusions = new MowzieModelRenderer(this, 20, 8);
        this.frillProtrusions.setRotationPoint(1.0F, 0.1F, 0.0F);
        this.frillProtrusions.addBox(-6.0F, -7.6F, -0.1F, 10, 8, 1, 0.0F);
        ModelUtils.setRotateAngle(frillProtrusions, 0.0013962634015954637F, -0.0F, 0.0F);
        this.neck = new MowzieModelRenderer(this, 0, 0);
        this.neck.setRotationPoint(0.5F, 0.8F, -5.0F);
        this.neck.addBox(-2.0F, 0.0F, -3.0F, 3, 4, 3, 0.0F);
        ModelUtils.setRotateAngle(neck, -0.06981317007977318F, -0.0F, 0.0F);
        this.beakbottom = new MowzieModelRenderer(this, 14, 43);
        this.beakbottom.setRotationPoint(0.0F, 2.0F, -3.5F);
        this.beakbottom.addBox(-1.0F, -1.0F, -2.7F, 2, 1, 3, 0.0F);
        ModelUtils.setRotateAngle(beakbottom, 0.2513223807039196F, -0.0F, 0.0F);
        this.leftHindThigh = new MowzieModelRenderer(this, 12, 24);
        this.leftHindThigh.setRotationPoint(2.4F, 18.0F, 4.0F);
        this.leftHindThigh.addBox(0.0F, -1.0F, -2.0F, 2, 4, 3, 0.0F);
        this.rightHorn2 = new MowzieModelRenderer(this, 33, 27);
        this.rightHorn2.setRotationPoint(0.1F, 0.29F, -3.2F);
        this.rightHorn2.addBox(-0.5F, -0.8F, -4.0F, 1, 1, 4, 0.0F);
        ModelUtils.setRotateAngle(rightHorn2, 0.1832595714594046F, 0.0F, 0.0F);
        this.quills_2 = new MowzieModelRenderer(this, 18, 52);
        this.quills_2.setRotationPoint(-0.5F, 0.7F, 3.5F);
        this.quills_2.addBox(0.0F, -5.0F, -2.0F, 1, 5, 2, 0.0F);
        ModelUtils.setRotateAngle(quills_2, 0.05235987755982988F, 0.0F, 0.0F);
        this.leftFrontThigh = new MowzieModelRenderer(this, 0, 16);
        this.leftFrontThigh.setRotationPoint(2.8F, 19.4F, -3.0F);
        this.leftFrontThigh.addBox(0.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F);
        ModelUtils.setRotateAngle(leftFrontThigh, 0.20943951023931953F, -0.0F, 0.0F);
        this.tail2 = new MowzieModelRenderer(this, 68, 17);
        this.tail2.setRotationPoint(0.0F, 0.6F, 2.5F);
        this.tail2.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        ModelUtils.setRotateAngle(tail2, -0.05044001538263612F, -0.0F, 0.0F);
        this.quills_1 = new MowzieModelRenderer(this, 10, 51);
        this.quills_1.setRotationPoint(-0.5F, 0.2F, 2.5F);
        this.quills_1.addBox(0.0F, -5.0F, -2.0F, 1, 5, 3, 0.0F);
        ModelUtils.setRotateAngle(quills_1, 0.05235987755982988F, 0.0F, 0.0F);
        this.lowerBody = new MowzieModelRenderer(this, 104, 1);
        this.lowerBody.setRotationPoint(0.0F, 1.98F, -1.5F);
        this.lowerBody.addBox(-3.0F, -2.0F, 0.0F, 6, 6, 6, 0.0F);
        ModelUtils.setRotateAngle(lowerBody, -0.17907078125461823F, 0.0F, 0.0F);
        this.leftFrontLeg = new MowzieModelRenderer(this, 16, 19);
        this.leftFrontLeg.setRotationPoint(1.3F, 1.6F, 0.5F);
        this.leftFrontLeg.addBox(-1.5F, -1.0F, -3.1F, 2, 2, 3, 0.0F);
        ModelUtils.setRotateAngle(leftFrontLeg, 1.3613568165555772F, -0.0F, 0.0F);
        this.rightHindThigh = new MowzieModelRenderer(this, 12, 24);
        this.rightHindThigh.mirror = true;
        this.rightHindThigh.setRotationPoint(-2.4F, 18.0F, 4.0F);
        this.rightHindThigh.addBox(-2.0F, -1.0F, -2.0F, 2, 4, 3, 0.0F);
        this.tail3 = new MowzieModelRenderer(this, 54, 21);
        this.tail3.setRotationPoint(0.0F, 0.5F, 2.5F);
        this.tail3.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        ModelUtils.setRotateAngle(tail3, 0.2555162024919699F, -0.0F, 0.0F);
        this.rightFrontLeg = new MowzieModelRenderer(this, 16, 19);
        this.rightFrontLeg.mirror = true;
        this.rightFrontLeg.setRotationPoint(-1.3F, 1.6F, 0.5F);
        this.rightFrontLeg.addBox(-0.5F, -1.0F, -3.1F, 2, 2, 3, 0.0F);
        ModelUtils.setRotateAngle(rightFrontLeg, 1.3613568165555772F, -0.0F, 0.0F);
        this.leftHindLeg = new MowzieModelRenderer(this, 32, 19);
        this.leftHindLeg.setRotationPoint(0.4F, 2.0F, 0.3F);
        this.leftHindLeg.addBox(-0.5F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
        ModelUtils.setRotateAngle(leftHindLeg, 1.5707963267948966F, -0.0F, 0.0F);
        this.rightHindLeg = new MowzieModelRenderer(this, 32, 19);
        this.rightHindLeg.mirror = true;
        this.rightHindLeg.setRotationPoint(-0.4F, 2.0F, 0.3F);
        this.rightHindLeg.addBox(-1.5F, -1.0F, -4.0F, 2, 2, 4, 0.0F);
        ModelUtils.setRotateAngle(rightHindLeg, 1.5707963267948966F, -0.0F, 0.0F);
        this.frill = new MowzieModelRenderer(this, 20, 0);
        this.frill.setRotationPoint(0.0F, -0.8F, -1.2F);
        this.frill.addBox(-4.0F, -7.0F, 0.0F, 8, 7, 1, 0.0F);
        ModelUtils.setRotateAngle(frill, -0.6618288523562498F, -0.0F, 0.0F);
        this.tail1 = new MowzieModelRenderer(this, 48, 10);
        this.tail1.setRotationPoint(0.0F, -1.7F, 5.5F);
        this.tail1.addBox(-2.5F, -0.2F, 0.0F, 5, 4, 3, 0.0F);
        ModelUtils.setRotateAngle(tail1, -0.463210383479295F, -0.0F, 0.0F);
        this.beak = new MowzieModelRenderer(this, 0, 43);
        this.beak.setRotationPoint(0.0F, -0.1F, -3.4F);
        this.beak.addBox(-1.0F, -1.0F, -3.5F, 2, 2, 4, 0.0F);
        ModelUtils.setRotateAngle(beak, 0.2808606942177475F, -0.0F, 0.0F);
        this.rightHorn1 = new MowzieModelRenderer(this, 32, 35);
        this.rightHorn1.setRotationPoint(-1.5F, -1.7F, -1.0F);
        this.rightHorn1.addBox(-0.4F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        ModelUtils.setRotateAngle(rightHorn1, -0.8051203839449842F, 0.06981317007977318F, -0.20943951023931953F);
        this.headPivot = new MowzieModelRenderer(this, 0, 34);
        this.headPivot.setRotationPoint(-0.5F, 1.8F, -2.2F);
        ModelUtils.setRotateAngle(headPivot, 0.20943951023931953F, -0.0F, 0.0F);
        this.head = new MowzieModelRenderer(this, 0, 34);
        this.head.setRotationPoint(0, 0, 0);
        this.head.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 4, 0.0F);
        ModelUtils.setRotateAngle(head, 0F, -0.0F, 0.0F);
        this.rightFrontThigh = new MowzieModelRenderer(this, 0, 16);
        this.rightFrontThigh.mirror = true;
        this.rightFrontThigh.setRotationPoint(-2.8F, 19.4F, -3.0F);
        this.rightFrontThigh.addBox(-2.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F);
        ModelUtils.setRotateAngle(rightFrontThigh, 0.20943951023931953F, -0.0F, 0.0F);
        this.leftHorn1 = new MowzieModelRenderer(this, 32, 35);
        this.leftHorn1.setRotationPoint(1.5F, -1.7F, -1.0F);
        this.leftHorn1.addBox(-0.6F, -0.5F, -4.0F, 1, 1, 4, 0.0F);
        ModelUtils.setRotateAngle(leftHorn1, -0.8051203839449842F, -0.06981317007977318F, 0.20943951023931953F);
        this.leftHorn2 = new MowzieModelRenderer(this, 33, 27);
        this.leftHorn2.setRotationPoint(-0.1F, 0.29F, -3.6F);
        this.leftHorn2.addBox(-0.5F, -0.8F, -4.0F, 1, 1, 4, 0.0F);
        ModelUtils.setRotateAngle(leftHorn2, 0.1832595714594046F, 0.0F, 0.0F);
        this.quills = new MowzieModelRenderer(this, 0, 50);
        this.quills.setRotationPoint(-0.5F, 1.2F, 2.8F);
        this.quills.addBox(0.0F, -5.0F, -4.0F, 1, 5, 4, 0.0F);
        ModelUtils.setRotateAngle(quills, 0.05235987755982988F, 0.0F, 0.0F);
        this.noseHorn = new MowzieModelRenderer(this, 24, 37);
        this.noseHorn.setRotationPoint(0.0F, -0.2F, -2.0F);
        this.noseHorn.addBox(-0.5F, -0.5F, -2.2F, 1, 1, 2, 0.0F);
        ModelUtils.setRotateAngle(noseHorn, -1.1760028499937791F, -0.0F, 0.0F);
        this.frill.addChild(this.frillProtrusions);
        this.upperBody.addChild(this.neck);
        this.headPivot.addChild(this.head);
        this.head.addChild(this.beakbottom);
        this.rightHorn1.addChild(this.rightHorn2);
        this.tail3.addChild(this.quills_2);
        this.tail1.addChild(this.tail2);
        this.tail2.addChild(this.quills_1);
        this.upperBody.addChild(this.lowerBody);
        this.leftFrontThigh.addChild(this.leftFrontLeg);
        this.tail2.addChild(this.tail3);
        this.rightFrontThigh.addChild(this.rightFrontLeg);
        this.leftHindThigh.addChild(this.leftHindLeg);
        this.rightHindThigh.addChild(this.rightHindLeg);
        this.head.addChild(this.frill);
        this.lowerBody.addChild(this.tail1);
        this.head.addChild(this.beak);
        this.head.addChild(this.rightHorn1);
        this.neck.addChild(this.headPivot);
        this.head.addChild(this.leftHorn1);
        this.leftHorn1.addChild(this.leftHorn2);
        this.tail1.addChild(this.quills);
        this.beak.addChild(this.noseHorn);
        this.setInitPose();
		animator = new Animator(this);
    }

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		animate((IAnimated)entity, f, f1, f2, f3, f4, f5);
		this.rightFrontThigh.render(f5);
		this.leftFrontThigh.render(f5);
		this.upperBody.render(f5);
		this.rightHindThigh.render(f5);
		this.leftHindThigh.render(f5);

	}

	public void animate(IAnimated entity, float f, float f1, float f2, float f3, float f4, float f5) {
		animator.update(entity);
        this.setToInitPose();
		setRotationAngles(f, f1, f2, f3, f4, f5, (Entity)entity);

//		animator.setAnimationId(EntityNewPrehistoric.animation_sit.animationId);
//		animator.startPhase(20);
//		sitPose(true);
//		animator.endPhase();
//
//		animator.setAnimationId(EntityNewPrehistoric.animation_getUp.animationId);
//		animator.startPhase(0);
//		sitPose(true);
//		animator.endPhase();
//		animator.resetPhase(20);
//		animator.endPhase();

	}

	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		MowzieModelRenderer[] tailParts = {this.tail1, this.tail2, this.tail3};
		MowzieModelRenderer[] neckParts = {this.neck, this.head};

		this.faceTarget(head, 1, f3, f4);

		float speed = 0.5F;
		float speed2 = 0.1F;
		float sitProgress = ((EntityNewPrehistoric)(entity)).sitProgress;
        sitAnimationRotation(rightHindLeg, sitProgress, (float)Math.toRadians(110.0D), 0, 0);
        sitAnimationRotation(lowerBody, sitProgress, -((float)Math.toRadians(13.04D)), 0, 0);
        sitAnimationRotation(tail3, sitProgress, -(float)Math.toRadians(14.64D), 0, 0);
        sitAnimationRotation(leftHindThigh, sitProgress, -((float)Math.toRadians(10.0D)), 0, 0);
        sitAnimationRotation(tail2, sitProgress, (float)Math.toRadians(13.04D), 0, 0);
        sitAnimationRotation(rightFrontThigh, sitProgress, -((float)Math.toRadians(13.0D)), 0, 0);
        sitAnimationRotation(leftHindLeg, sitProgress, (float)Math.toRadians(110.0D), 0, 0);
        sitAnimationRotation(leftFrontThigh, sitProgress, -((float)Math.toRadians(13.0D)), 0, 0);
        sitAnimationRotation(tail1, sitProgress, ((float)Math.toRadians(15D)), 0, 0);
        sitAnimationRotation(quills, sitProgress, (float)Math.toRadians(3.0D), 0, 0);
        sitAnimationRotation(upperBody, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
        sitAnimationRotation(rightHindThigh, sitProgress, -((float)Math.toRadians(10.0D)), 0, 0);
        sitAnimationRotation(rightFrontLeg, sitProgress, -(float)Math.toRadians(90.0D), 0, 0);
        sitAnimationRotation(leftFrontLeg, sitProgress, -(float)Math.toRadians(90.0D), 0, 0);
        sitAnimationRotation(neck, sitProgress, -((float)Math.toRadians(18.26D)), 0, 0);
        sitAnimationRotation(head, sitProgress, (float)Math.toRadians(31.3D), 0, 0);
        sitAnimationPos(upperBody, sitProgress, 0F, 16.20F - upperBody.initRotationPointY, 0F);
		sitAnimationPos(rightFrontThigh, sitProgress, 0F, 21.30F - rightFrontThigh.initRotationPointY, 0F);
		sitAnimationPos(leftFrontThigh, sitProgress, 0F, 21.30F - leftFrontThigh.initRotationPointY, 0F);
		sitAnimationPos(rightHindThigh, sitProgress, 0F, 20.50F - rightHindThigh.initRotationPointY, 0F);
		sitAnimationPos(leftHindThigh, sitProgress, 0F, 20.50F - leftHindThigh.initRotationPointY, 0F);
		this.walk(upperBody, speed2, 0.05F, false, 1F, 0F, entity.ticksExisted, 1);
		this.walk(lowerBody, speed2, -0.05F, false, 1F, 0F, entity.ticksExisted, 1);
		this.bob(upperBody, speed2, 0.2F, false, entity.ticksExisted, 1);
		this.walk(leftHindThigh, speed, 0.8F, false, 0F, 0.4F, f, f1);
		this.walk(leftHindLeg, speed, 0.2F, false, 0F, -0.6F, f, f1);
		this.walk(rightHindThigh, speed, 0.8F, true, 0F, 0.4F, f, f1);
		this.walk(rightHindLeg, speed, 0.2F, true, 0F, -0.6F, f, f1);
		this.walk(leftFrontThigh, speed, 0.8F, true, 0F, 0.4F, f, f1);
		this.walk(leftFrontLeg, speed, 0.2F, true, 0F, -0.6F, f, f1);
		this.walk(rightFrontThigh, speed, 0.8F, false, 0F, 0.4F, f, f1);
		this.walk(rightFrontLeg, speed, 0.2F, false, 0F, -0.6F, f, f1);
		this.chainWave(tailParts, speed2, 0.05F, -3, entity.ticksExisted, 1);
		this.chainSwing(tailParts, speed2, 0.35F, -3, entity.ticksExisted, 1);
		this.chainWave(neckParts, speed2, 0.05F, -3, entity.ticksExisted, 1);
		//((ChainBuffer)((EntityTriceratops)entity).tailbuffer).applyChainSwingBuffer(tailParts);

	}

//	@Override
//	public void sitPose(boolean animate) {
//        ModelUtils.animateOrSetRotation(animator, animate, lowerBody, -0.17907078125461823F, 0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, leftHindLeg, 0.45378560551852565F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, leftFrontThigh, -0.22689280275926282F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, neck, -0.31869712141416456F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, rightHindLeg, 0.45378560551852565F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, tail1, -0.40980330836826856F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, upperBody, -0.045553093477052F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, quills_1, 0.05235987755982988F, 0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, tail2, 0.22759093446006054F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, rightFrontThigh, -0.22689280275926282F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, rightFrontLeg, 0.22689280275926282F, 0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, beak, 0.2808606942177475F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, head, 0.5462880558742251F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, leftFrontLeg, 0.22689280275926282F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, quills, 0.05235987755982988F, 0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, beakbottom, 0.2513223807039196F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, tail3, 0.2555162024919699F, -0.0F, 0.0F, false);
//        ModelUtils.animateOrSetRotation(animator, animate, quills_2, 0.05235987755982988F, 0.0F, 0.0F, false);
//        ModelUtils.animateToPos(animator, animate, upperBody, 0F, 16.20F - upperBody.initRotationPointY, 0F, true);
//		ModelUtils.animateToPos(animator, animate, rightFrontThigh, 0F, 21.3F - rightFrontThigh.initRotationPointY, 0F, true);
//		ModelUtils.animateToPos(animator, animate, leftFrontThigh, 0F, 21.3F - leftFrontThigh.initRotationPointY, 0F, true);
//		ModelUtils.animateToPos(animator, animate, rightHindThigh, 0F, 19.9F - rightHindThigh.initRotationPointY, 0F, true);
//		ModelUtils.animateToPos(animator, animate, leftHindThigh, 0F, 19.9F - leftHindThigh.initRotationPointY, 0F, true);
//		ModelUtils.setPos(animator, animate, upperBody, 0F, 16.20F, 1F, false);
//		ModelUtils.setPos(animator, animate, rightFrontThigh, -2.8F, 21.30F, -3F, false);
//		ModelUtils.setPos(animator, animate, leftFrontThigh, 2.8F, 21.30F, -3F, false);
//		ModelUtils.setPos(animator, animate, rightHindThigh, -2.4F, 19.90F, 4F, false);
//		ModelUtils.setPos(animator, animate, leftHindThigh, 2.4F, 19.90F, 4F, false);
//	}
}
