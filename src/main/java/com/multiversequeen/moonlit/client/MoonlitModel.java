// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package com.multiversequeen.moonlit.client;

import com.multiversequeen.moonlit.entities.MoonlitEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class MoonlitModel extends AnimatedEntityModel<MoonlitEntity> {
    private final AnimatedModelRenderer Moonlit_adult_snout;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Torso;
	private final AnimatedModelRenderer Torso_1;
	private final AnimatedModelRenderer Torso_2;
	private final AnimatedModelRenderer spine11;
	private final AnimatedModelRenderer spine12;
	private final AnimatedModelRenderer spine13;
	private final AnimatedModelRenderer spine14;
	private final AnimatedModelRenderer Neck;
	private final AnimatedModelRenderer spine10;
	private final AnimatedModelRenderer neck2;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Skull;
	private final AnimatedModelRenderer spine7;
	private final AnimatedModelRenderer spine8;
	private final AnimatedModelRenderer spine9;
	private final AnimatedModelRenderer head2;
	private final AnimatedModelRenderer Horns;
	private final AnimatedModelRenderer Horn_big_left;
	private final AnimatedModelRenderer Horn_small_left;
	private final AnimatedModelRenderer Horn_big_right;
	private final AnimatedModelRenderer Horn_small_right;
	private final AnimatedModelRenderer Snout;
	private final AnimatedModelRenderer Snout2;
	private final AnimatedModelRenderer snout3;
	private final AnimatedModelRenderer tooth;
	private final AnimatedModelRenderer tooth2;
	private final AnimatedModelRenderer tooth3;
	private final AnimatedModelRenderer tooth4;
	private final AnimatedModelRenderer tooth5;
	private final AnimatedModelRenderer tooth6;
	private final AnimatedModelRenderer tooth7;
	private final AnimatedModelRenderer tooth8;
	private final AnimatedModelRenderer jaw;
	private final AnimatedModelRenderer Jaw2;
	private final AnimatedModelRenderer tooth9;
	private final AnimatedModelRenderer tooth10;
	private final AnimatedModelRenderer tooth11;
	private final AnimatedModelRenderer tooth12;
	private final AnimatedModelRenderer tooth13;
	private final AnimatedModelRenderer tooth14;
	private final AnimatedModelRenderer tooth15;
	private final AnimatedModelRenderer tooth16;
	private final AnimatedModelRenderer tooth17;
	private final AnimatedModelRenderer tail;
	private final AnimatedModelRenderer Tail1;
	private final AnimatedModelRenderer Tail_1;
	private final AnimatedModelRenderer spine;
	private final AnimatedModelRenderer spine2;
	private final AnimatedModelRenderer Tail2;
	private final AnimatedModelRenderer Tail_2;
	private final AnimatedModelRenderer spine5;
	private final AnimatedModelRenderer spine6;
	private final AnimatedModelRenderer Tail3;
	private final AnimatedModelRenderer Tail_3;
	private final AnimatedModelRenderer Spine3;
	private final AnimatedModelRenderer Spine4;
	private final AnimatedModelRenderer Tail4;
	private final AnimatedModelRenderer Legs;
	private final AnimatedModelRenderer leg_front_left;
	private final AnimatedModelRenderer Leg_front_left1;
	private final AnimatedModelRenderer Leg_front_left2;
	private final AnimatedModelRenderer Leg_front_left_claws;
	private final AnimatedModelRenderer Claw_10;
	private final AnimatedModelRenderer Claw_11;
	private final AnimatedModelRenderer Claw_12;
	private final AnimatedModelRenderer Leg_front_right;
	private final AnimatedModelRenderer Leg_front_right1;
	private final AnimatedModelRenderer Leg_front_right2;
	private final AnimatedModelRenderer Leg_front_right_claws;
	private final AnimatedModelRenderer Claw_7;
	private final AnimatedModelRenderer Claw_8;
	private final AnimatedModelRenderer Claw_9;
	private final AnimatedModelRenderer Leg_back_left;
	private final AnimatedModelRenderer Leg_back_left_1;
	private final AnimatedModelRenderer Leg_back_left_2;
	private final AnimatedModelRenderer Leg_back_left_3;
	private final AnimatedModelRenderer Leg_back_left_4;
	private final AnimatedModelRenderer Leg_back_left_claws;
	private final AnimatedModelRenderer Claw_4;
	private final AnimatedModelRenderer Claw_5;
	private final AnimatedModelRenderer Claw_6;
	private final AnimatedModelRenderer Leg_back_right;
	private final AnimatedModelRenderer Leg_back_right_1;
	private final AnimatedModelRenderer Leg_back_right_2;
	private final AnimatedModelRenderer Leg_back_right_3;
	private final AnimatedModelRenderer Leg_back_right_4;
	private final AnimatedModelRenderer Leg_back_left_claws2;
	private final AnimatedModelRenderer Claw_1;
	private final AnimatedModelRenderer Claw_2;
	private final AnimatedModelRenderer Claw_3;

    public MoonlitModel() {
        textureWidth = 128;
  	  	textureHeight = 128;
    	Moonlit_adult_snout = new AnimatedModelRenderer(this);
		Moonlit_adult_snout.setRotationPoint(6.0F, 7.0F, -12.0F);
		
		Moonlit_adult_snout.setModelRendererName("Moonlit_adult_snout");
		this.registerModelRenderer(Moonlit_adult_snout);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(-6.0F, 17.0F, 12.0F);
		Moonlit_adult_snout.addChild(Body);
		
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Torso = new AnimatedModelRenderer(this);
		Torso.setRotationPoint(0.0F, -22.7374F, 0.6187F);
		Body.addChild(Torso);
		
		Torso.setModelRendererName("Torso");
		this.registerModelRenderer(Torso);

		Torso_1 = new AnimatedModelRenderer(this);
		Torso_1.setRotationPoint(0.0F, 6.7374F, 18.3813F);
		Torso.addChild(Torso_1);
		setRotationAngle(Torso_1, -0.0982F, 0.0F, 0.0F);
		Torso_1.setTextureOffset(0, 32).addBox(-8.0F, -7.0F, -20.0F, 16.0F, 12.0F, 20.0F, 0.0F, false);
		Torso_1.setModelRendererName("Torso_1");
		this.registerModelRenderer(Torso_1);

		Torso_2 = new AnimatedModelRenderer(this);
		Torso_2.setRotationPoint(0.0F, 3.7374F, -0.6187F);
		Torso.addChild(Torso_2);
		setRotationAngle(Torso_2, 0.0982F, 0.0F, 0.0F);
		Torso_2.setTextureOffset(0, 0).addBox(-7.0F, -5.0F, -19.0F, 14.0F, 10.0F, 22.0F, 0.0F, false);
		Torso_2.setModelRendererName("Torso_2");
		this.registerModelRenderer(Torso_2);

		spine11 = new AnimatedModelRenderer(this);
		spine11.setRotationPoint(0.0F, -0.7626F, 13.8813F);
		Torso.addChild(spine11);
		setRotationAngle(spine11, -0.8836F, 0.0F, 0.0F);
		spine11.setTextureOffset(38, 68).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine11.setModelRendererName("spine11");
		this.registerModelRenderer(spine11);

		spine12 = new AnimatedModelRenderer(this);
		spine12.setRotationPoint(0.0F, -1.7626F, 3.8813F);
		Torso.addChild(spine12);
		setRotationAngle(spine12, -0.8836F, 0.0F, 0.0F);
		spine12.setTextureOffset(32, 68).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine12.setModelRendererName("spine12");
		this.registerModelRenderer(spine12);

		spine13 = new AnimatedModelRenderer(this);
		spine13.setRotationPoint(0.0F, -0.7626F, -5.1187F);
		Torso.addChild(spine13);
		setRotationAngle(spine13, 0.8836F, 0.0F, 0.0F);
		spine13.setTextureOffset(6, 68).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine13.setModelRendererName("spine13");
		this.registerModelRenderer(spine13);

		spine14 = new AnimatedModelRenderer(this);
		spine14.setRotationPoint(0.0F, 0.2374F, -15.1187F);
		Torso.addChild(spine14);
		setRotationAngle(spine14, 0.8836F, 0.0F, 0.0F);
		spine14.setTextureOffset(0, 68).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine14.setModelRendererName("spine14");
		this.registerModelRenderer(spine14);

		Neck = new AnimatedModelRenderer(this);
		Neck.setRotationPoint(0.0F, -16.0F, 16.0F);
		Body.addChild(Neck);
		
		Neck.setModelRendererName("Neck");
		this.registerModelRenderer(Neck);

		spine10 = new AnimatedModelRenderer(this);
		spine10.setRotationPoint(0.0F, -8.5F, 4.5F);
		Neck.addChild(spine10);
		spine10.setTextureOffset(61, 61).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine10.setModelRendererName("spine10");
		this.registerModelRenderer(spine10);

		neck2 = new AnimatedModelRenderer(this);
		neck2.setRotationPoint(0.0F, -1.7175F, 1.3536F);
		Neck.addChild(neck2);
		setRotationAngle(neck2, 0.7854F, 0.0F, 0.0F);
		neck2.setTextureOffset(0, 64).addBox(-5.0F, -3.5F, -3.1716F, 10.0F, 7.0F, 12.0F, 0.0F, false);
		neck2.setModelRendererName("neck2");
		this.registerModelRenderer(neck2);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(0.0F, -7.0F, 7.0F);
		Neck.addChild(Head);
		
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Skull = new AnimatedModelRenderer(this);
		Skull.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Skull);
		
		Skull.setModelRendererName("Skull");
		this.registerModelRenderer(Skull);

		spine7 = new AnimatedModelRenderer(this);
		spine7.setRotationPoint(0.0F, -8.4142F, 4.7071F);
		Skull.addChild(spine7);
		setRotationAngle(spine7, -0.7854F, 0.0F, 0.0F);
		spine7.setTextureOffset(53, 61).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine7.setModelRendererName("spine7");
		this.registerModelRenderer(spine7);

		spine8 = new AnimatedModelRenderer(this);
		spine8.setRotationPoint(0.0F, -8.4142F, 0.7071F);
		Skull.addChild(spine8);
		setRotationAngle(spine8, -0.7854F, 0.0F, 0.0F);
		spine8.setTextureOffset(45, 61).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine8.setModelRendererName("spine8");
		this.registerModelRenderer(spine8);

		spine9 = new AnimatedModelRenderer(this);
		spine9.setRotationPoint(0.0F, -6.4142F, -1.2929F);
		Skull.addChild(spine9);
		setRotationAngle(spine9, -0.7854F, 0.0F, 0.0F);
		spine9.setTextureOffset(37, 61).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine9.setModelRendererName("spine9");
		this.registerModelRenderer(spine9);

		head2 = new AnimatedModelRenderer(this);
		head2.setRotationPoint(0.0F, -0.5F, 0.5F);
		Skull.addChild(head2);
		head2.setTextureOffset(50, 0).addBox(-7.0F, -8.5F, -2.5F, 14.0F, 11.0F, 11.0F, 0.0F, false);
		head2.setModelRendererName("head2");
		this.registerModelRenderer(head2);

		Horns = new AnimatedModelRenderer(this);
		Horns.setRotationPoint(0.0F, 23.0F, -23.0F);
		Head.addChild(Horns);
		
		Horns.setModelRendererName("Horns");
		this.registerModelRenderer(Horns);

		Horn_big_left = new AnimatedModelRenderer(this);
		Horn_big_left.setRotationPoint(-8.0F, -29.8284F, 27.2929F);
		Horns.addChild(Horn_big_left);
		setRotationAngle(Horn_big_left, -0.7854F, 0.0F, 0.0F);
		Horn_big_left.setTextureOffset(78, 104).addBox(-1.0F, -1.5F, -6.3284F, 2.0F, 3.0F, 7.0F, 0.0F, false);
		Horn_big_left.setModelRendererName("Horn_big_left");
		this.registerModelRenderer(Horn_big_left);

		Horn_small_left = new AnimatedModelRenderer(this);
		Horn_small_left.setRotationPoint(-8.0F, -25.4979F, 24.9969F);
		Horns.addChild(Horn_small_left);
		setRotationAngle(Horn_small_left, -0.3927F, 0.0F, 0.0F);
		Horn_small_left.setTextureOffset(0, 44).addBox(-1.0F, -1.1585F, -3.7305F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		Horn_small_left.setModelRendererName("Horn_small_left");
		this.registerModelRenderer(Horn_small_left);

		Horn_big_right = new AnimatedModelRenderer(this);
		Horn_big_right.setRotationPoint(8.0F, -31.8284F, 25.2929F);
		Horns.addChild(Horn_big_right);
		setRotationAngle(Horn_big_right, -0.7854F, 0.0F, 0.0F);
		Horn_big_right.setTextureOffset(99, 81).addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 7.0F, 0.0F, false);
		Horn_big_right.setModelRendererName("Horn_big_right");
		this.registerModelRenderer(Horn_big_right);

		Horn_small_right = new AnimatedModelRenderer(this);
		Horn_small_right.setRotationPoint(8.0F, -26.4979F, 23.9969F);
		Horns.addChild(Horn_small_right);
		setRotationAngle(Horn_small_right, -0.3927F, 0.0F, 0.0F);
		Horn_small_right.setTextureOffset(0, 14).addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		Horn_small_right.setModelRendererName("Horn_small_right");
		this.registerModelRenderer(Horn_small_right);

		Snout = new AnimatedModelRenderer(this);
		Snout.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Snout);
		
		Snout.setModelRendererName("Snout");
		this.registerModelRenderer(Snout);

		Snout2 = new AnimatedModelRenderer(this);
		Snout2.setRotationPoint(0.0F, 2.0F, 0.0F);
		Snout.addChild(Snout2);
		
		Snout2.setModelRendererName("Snout2");
		this.registerModelRenderer(Snout2);

		snout3 = new AnimatedModelRenderer(this);
		snout3.setRotationPoint(-2.0F, -2.5F, 9.0F);
		Snout2.addChild(snout3);
		snout3.setTextureOffset(96, 69).addBox(-2.0F, -3.5F, 0.0F, 8.0F, 5.0F, 7.0F, 0.0F, false);
		snout3.setModelRendererName("snout3");
		this.registerModelRenderer(snout3);

		tooth = new AnimatedModelRenderer(this);
		tooth.setRotationPoint(-3.0F, -1.0F, 12.7071F);
		Snout2.addChild(tooth);
		setRotationAngle(tooth, -0.7854F, 0.0F, 0.0F);
		tooth.setTextureOffset(15, 14).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth.setModelRendererName("tooth");
		this.registerModelRenderer(tooth);

		tooth2 = new AnimatedModelRenderer(this);
		tooth2.setRotationPoint(-3.0F, -1.0F, 14.7071F);
		Snout2.addChild(tooth2);
		setRotationAngle(tooth2, -0.7854F, 0.0F, 0.0F);
		tooth2.setTextureOffset(15, 13).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth2.setModelRendererName("tooth2");
		this.registerModelRenderer(tooth2);

		tooth3 = new AnimatedModelRenderer(this);
		tooth3.setRotationPoint(-3.0F, -1.0F, 10.7071F);
		Snout2.addChild(tooth3);
		setRotationAngle(tooth3, -0.7854F, 0.0F, 0.0F);
		tooth3.setTextureOffset(15, 15).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth3.setModelRendererName("tooth3");
		this.registerModelRenderer(tooth3);

		tooth4 = new AnimatedModelRenderer(this);
		tooth4.setRotationPoint(3.0F, -1.0F, 10.7071F);
		Snout2.addChild(tooth4);
		setRotationAngle(tooth4, -0.7854F, 0.0F, 0.0F);
		tooth4.setTextureOffset(2, 15).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth4.setModelRendererName("tooth4");
		this.registerModelRenderer(tooth4);

		tooth5 = new AnimatedModelRenderer(this);
		tooth5.setRotationPoint(3.0F, -1.0F, 14.7071F);
		Snout2.addChild(tooth5);
		setRotationAngle(tooth5, -0.7854F, 0.0F, 0.0F);
		tooth5.setTextureOffset(0, 15).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth5.setModelRendererName("tooth5");
		this.registerModelRenderer(tooth5);

		tooth6 = new AnimatedModelRenderer(this);
		tooth6.setRotationPoint(3.0F, -1.0F, 12.7071F);
		Snout2.addChild(tooth6);
		setRotationAngle(tooth6, -0.7854F, 0.0F, 0.0F);
		tooth6.setTextureOffset(2, 14).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth6.setModelRendererName("tooth6");
		this.registerModelRenderer(tooth6);

		tooth7 = new AnimatedModelRenderer(this);
		tooth7.setRotationPoint(1.0F, -1.0F, 15.7071F);
		Snout2.addChild(tooth7);
		setRotationAngle(tooth7, -0.7854F, -1.5708F, 0.0F);
		tooth7.setTextureOffset(0, 14).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth7.setModelRendererName("tooth7");
		this.registerModelRenderer(tooth7);

		tooth8 = new AnimatedModelRenderer(this);
		tooth8.setRotationPoint(-1.0F, -1.0F, 15.7071F);
		Snout2.addChild(tooth8);
		setRotationAngle(tooth8, -0.7854F, -1.5708F, 0.0F);
		tooth8.setTextureOffset(2, 13).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth8.setModelRendererName("tooth8");
		this.registerModelRenderer(tooth8);

		jaw = new AnimatedModelRenderer(this);
		jaw.setRotationPoint(0.0F, 2.0F, 8.5F);
		Snout.addChild(jaw);
		setRotationAngle(jaw, 0.0F, 0.0F, 0.0F);
		
		jaw.setModelRendererName("jaw");
		this.registerModelRenderer(jaw);

		Jaw2 = new AnimatedModelRenderer(this);
		Jaw2.setRotationPoint(0.0F, 0.0F, 0.0F);
		jaw.addChild(Jaw2);
		Jaw2.setTextureOffset(57, 57).addBox(-4.0F, -1.0F, -7.5F, 8.0F, 2.0F, 15.0F, 0.0F, false);
		Jaw2.setModelRendererName("Jaw2");
		this.registerModelRenderer(Jaw2);

		tooth9 = new AnimatedModelRenderer(this);
		tooth9.setRotationPoint(-3.0F, -1.0F, 1.2071F);
		jaw.addChild(tooth9);
		setRotationAngle(tooth9, -0.7854F, 0.0F, 0.0F);
		tooth9.setTextureOffset(0, 13).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth9.setModelRendererName("tooth9");
		this.registerModelRenderer(tooth9);

		tooth10 = new AnimatedModelRenderer(this);
		tooth10.setRotationPoint(3.0F, -1.0F, 1.2071F);
		jaw.addChild(tooth10);
		setRotationAngle(tooth10, -0.7854F, 0.0F, 0.0F);
		tooth10.setTextureOffset(2, 3).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth10.setModelRendererName("tooth10");
		this.registerModelRenderer(tooth10);

		tooth11 = new AnimatedModelRenderer(this);
		tooth11.setRotationPoint(3.0F, -1.0F, 3.2071F);
		jaw.addChild(tooth11);
		setRotationAngle(tooth11, -0.7854F, 0.0F, 0.0F);
		tooth11.setTextureOffset(0, 3).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth11.setModelRendererName("tooth11");
		this.registerModelRenderer(tooth11);

		tooth12 = new AnimatedModelRenderer(this);
		tooth12.setRotationPoint(-3.0F, -1.0F, 3.2071F);
		jaw.addChild(tooth12);
		setRotationAngle(tooth12, -0.7854F, 0.0F, 0.0F);
		tooth12.setTextureOffset(2, 1).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth12.setModelRendererName("tooth12");
		this.registerModelRenderer(tooth12);

		tooth13 = new AnimatedModelRenderer(this);
		tooth13.setRotationPoint(-3.0F, -1.0F, 5.2071F);
		jaw.addChild(tooth13);
		setRotationAngle(tooth13, -0.7854F, 0.0F, 0.0F);
		tooth13.setTextureOffset(2, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth13.setModelRendererName("tooth13");
		this.registerModelRenderer(tooth13);

		tooth14 = new AnimatedModelRenderer(this);
		tooth14.setRotationPoint(3.0F, -1.0F, 5.2071F);
		jaw.addChild(tooth14);
		setRotationAngle(tooth14, -0.7854F, 0.0F, 0.0F);
		tooth14.setTextureOffset(2, 2).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth14.setModelRendererName("tooth14");
		this.registerModelRenderer(tooth14);

		tooth15 = new AnimatedModelRenderer(this);
		tooth15.setRotationPoint(2.0F, -1.0F, 6.2071F);
		jaw.addChild(tooth15);
		setRotationAngle(tooth15, -0.7854F, -1.5708F, 0.0F);
		tooth15.setTextureOffset(0, 2).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth15.setModelRendererName("tooth15");
		this.registerModelRenderer(tooth15);

		tooth16 = new AnimatedModelRenderer(this);
		tooth16.setRotationPoint(-2.0F, -1.0F, 6.2071F);
		jaw.addChild(tooth16);
		setRotationAngle(tooth16, -0.7854F, -1.5708F, 0.0F);
		tooth16.setTextureOffset(0, 1).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth16.setModelRendererName("tooth16");
		this.registerModelRenderer(tooth16);

		tooth17 = new AnimatedModelRenderer(this);
		tooth17.setRotationPoint(0.0F, -1.0F, 6.2071F);
		jaw.addChild(tooth17);
		setRotationAngle(tooth17, -0.7854F, -1.5708F, 0.0F);
		tooth17.setTextureOffset(0, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		tooth17.setModelRendererName("tooth17");
		this.registerModelRenderer(tooth17);

		tail = new AnimatedModelRenderer(this);
		tail.setRotationPoint(-6.0F, -2.0F, -5.0F);
		Moonlit_adult_snout.addChild(tail);
		
		tail.setModelRendererName("tail");
		this.registerModelRenderer(tail);

		Tail1 = new AnimatedModelRenderer(this);
		Tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(Tail1);
		
		Tail1.setModelRendererName("Tail1");
		this.registerModelRenderer(Tail1);

		Tail_1 = new AnimatedModelRenderer(this);
		Tail_1.setRotationPoint(0.0F, -0.1317F, 0.0607F);
		Tail1.addChild(Tail_1);
		setRotationAngle(Tail_1, 0.7854F, 0.0F, 0.0F);
		Tail_1.setTextureOffset(52, 32).addBox(-5.0F, -3.0F, -12.1569F, 10.0F, 6.0F, 13.0F, 0.0F, false);
		Tail_1.setModelRendererName("Tail_1");
		this.registerModelRenderer(Tail_1);

		spine = new AnimatedModelRenderer(this);
		spine.setRotationPoint(0.0F, -0.5F, -3.5F);
		Tail1.addChild(spine);
		spine.setTextureOffset(5, 61).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine.setModelRendererName("spine");
		this.registerModelRenderer(spine);

		spine2 = new AnimatedModelRenderer(this);
		spine2.setRotationPoint(0.0F, 3.5F, -7.5F);
		Tail1.addChild(spine2);
		spine2.setTextureOffset(57, 29).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine2.setModelRendererName("spine2");
		this.registerModelRenderer(spine2);

		Tail2 = new AnimatedModelRenderer(this);
		Tail2.setRotationPoint(0.0F, 8.0F, -8.0F);
		Tail1.addChild(Tail2);
		
		Tail2.setModelRendererName("Tail2");
		this.registerModelRenderer(Tail2);

		Tail_2 = new AnimatedModelRenderer(this);
		Tail_2.setRotationPoint(0.0F, -0.1068F, 0.0918F);
		Tail2.addChild(Tail_2);
		setRotationAngle(Tail_2, 0.3927F, 0.0F, 0.0F);
		Tail_2.setTextureOffset(31, 70).addBox(-3.0F, -2.0657F, -11.8848F, 6.0F, 4.0F, 13.0F, 0.0F, false);
		Tail_2.setModelRendererName("Tail_2");
		this.registerModelRenderer(Tail_2);

		spine5 = new AnimatedModelRenderer(this);
		spine5.setRotationPoint(0.0F, -0.5772F, -3.8879F);
		Tail2.addChild(spine5);
		setRotationAngle(spine5, -0.3927F, 0.0F, 0.0F);
		spine5.setTextureOffset(50, 4).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine5.setModelRendererName("spine5");
		this.registerModelRenderer(spine5);

		spine6 = new AnimatedModelRenderer(this);
		spine6.setRotationPoint(0.0F, 1.4228F, -8.8879F);
		Tail2.addChild(spine6);
		setRotationAngle(spine6, -0.3927F, 0.0F, 0.0F);
		spine6.setTextureOffset(14, 44).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		spine6.setModelRendererName("spine6");
		this.registerModelRenderer(spine6);

		Tail3 = new AnimatedModelRenderer(this);
		Tail3.setRotationPoint(0.0F, 4.0F, -11.0F);
		Tail2.addChild(Tail3);
		
		Tail3.setModelRendererName("Tail3");
		this.registerModelRenderer(Tail3);

		Tail_3 = new AnimatedModelRenderer(this);
		Tail_3.setRotationPoint(0.0F, 0.3376F, -0.6979F);
		Tail3.addChild(Tail_3);
		setRotationAngle(Tail_3, 0.1963F, 0.0F, 0.0F);
		Tail_3.setTextureOffset(85, 22).addBox(-2.0F, -1.4947F, -11.599F, 4.0F, 3.0F, 13.0F, 0.0F, false);
		Tail_3.setModelRendererName("Tail_3");
		this.registerModelRenderer(Tail_3);

		Spine3 = new AnimatedModelRenderer(this);
		Spine3.setRotationPoint(0.0F, -0.4176F, -3.525F);
		Tail3.addChild(Spine3);
		setRotationAngle(Spine3, 0.9817F, 0.0F, 0.0F);
		Spine3.setTextureOffset(9, 41).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		Spine3.setModelRendererName("Spine3");
		this.registerModelRenderer(Spine3);

		Spine4 = new AnimatedModelRenderer(this);
		Spine4.setRotationPoint(0.0F, 0.5824F, -8.525F);
		Tail3.addChild(Spine4);
		setRotationAngle(Spine4, 0.9817F, 0.0F, 0.0F);
		Spine4.setTextureOffset(9, 11).addBox(0.0F, -1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		Spine4.setModelRendererName("Spine4");
		this.registerModelRenderer(Spine4);

		Tail4 = new AnimatedModelRenderer(this);
		Tail4.setRotationPoint(-0.1464F, 2.5F, -13.3891F);
		Tail3.addChild(Tail4);
		setRotationAngle(Tail4, 0.0F, -0.7854F, 0.0F);
		Tail4.setTextureOffset(72, 22).addBox(-3.0F, -0.5F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Tail4.setModelRendererName("Tail4");
		this.registerModelRenderer(Tail4);

		Legs = new AnimatedModelRenderer(this);
		Legs.setRotationPoint(-6.0F, 17.0F, 12.0F);
		Moonlit_adult_snout.addChild(Legs);
		
		Legs.setModelRendererName("Legs");
		this.registerModelRenderer(Legs);

		leg_front_left = new AnimatedModelRenderer(this);
		leg_front_left.setRotationPoint(-6.0F, -17.0F, 12.0F);
		Legs.addChild(leg_front_left);
		setRotationAngle(leg_front_left, -0.3927F, 0.0F, 0.0F);
		
		leg_front_left.setModelRendererName("leg_front_left");
		this.registerModelRenderer(leg_front_left);

		Leg_front_left1 = new AnimatedModelRenderer(this);
		Leg_front_left1.setRotationPoint(0.0F, -0.7708F, 0.4278F);
		leg_front_left.addChild(Leg_front_left1);
		setRotationAngle(Leg_front_left1, -0.1963F, 0.0F, 0.0F);
		Leg_front_left1.setTextureOffset(54, 95).addBox(-3.0F, -2.4373F, -2.3689F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		Leg_front_left1.setModelRendererName("Leg_front_left1");
		this.registerModelRenderer(Leg_front_left1);

		Leg_front_left2 = new AnimatedModelRenderer(this);
		Leg_front_left2.setRotationPoint(0.0F, 9.0F, -4.0F);
		leg_front_left.addChild(Leg_front_left2);
		setRotationAngle(Leg_front_left2, 0.3927F, 0.0F, 0.0F);
		Leg_front_left2.setTextureOffset(0, 104).addBox(-3.0F, -0.6976F, 0.5475F, 6.0F, 11.0F, 6.0F, 0.0F, false);
		Leg_front_left2.setModelRendererName("Leg_front_left2");
		this.registerModelRenderer(Leg_front_left2);

		Leg_front_left_claws = new AnimatedModelRenderer(this);
		Leg_front_left_claws.setRotationPoint(0.0F, 16.889F, 3.0719F);
		leg_front_left.addChild(Leg_front_left_claws);
		setRotationAngle(Leg_front_left_claws, 0.7854F, 0.0F, 0.0F);
		
		Leg_front_left_claws.setModelRendererName("Leg_front_left_claws");
		this.registerModelRenderer(Leg_front_left_claws);

		Claw_10 = new AnimatedModelRenderer(this);
		Claw_10.setRotationPoint(2.25F, 0.3786F, 2.0F);
		Leg_front_left_claws.addChild(Claw_10);
		setRotationAngle(Claw_10, 0.7854F, 0.0F, 0.0F);
		Claw_10.setTextureOffset(32, 64).addBox(-0.75F, -1.6173F, -0.5761F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		Claw_10.setModelRendererName("Claw_10");
		this.registerModelRenderer(Claw_10);

		Claw_11 = new AnimatedModelRenderer(this);
		Claw_11.setRotationPoint(0.0F, -0.5452F, 2.3827F);
		Leg_front_left_claws.addChild(Claw_11);
		setRotationAngle(Claw_11, 0.7854F, 0.0F, 0.0F);
		Claw_11.setTextureOffset(0, 64).addBox(-0.75F, -1.2347F, -1.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		Claw_11.setModelRendererName("Claw_11");
		this.registerModelRenderer(Claw_11);

		Claw_12 = new AnimatedModelRenderer(this);
		Claw_12.setRotationPoint(-2.25F, -0.6214F, 1.0F);
		Leg_front_left_claws.addChild(Claw_12);
		setRotationAngle(Claw_12, 0.7854F, 0.0F, 0.0F);
		Claw_12.setTextureOffset(57, 36).addBox(-0.75F, -0.2031F, -0.5761F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		Claw_12.setModelRendererName("Claw_12");
		this.registerModelRenderer(Claw_12);

		Leg_front_right = new AnimatedModelRenderer(this);
		Leg_front_right.setRotationPoint(6.0F, -17.0F, 12.0F);
		Legs.addChild(Leg_front_right);
		setRotationAngle(Leg_front_right, -0.3927F, 0.0F, 0.0F);
		
		Leg_front_right.setModelRendererName("Leg_front_right");
		this.registerModelRenderer(Leg_front_right);

		Leg_front_right1 = new AnimatedModelRenderer(this);
		Leg_front_right1.setRotationPoint(0.0F, 3.2292F, -0.5722F);
		Leg_front_right.addChild(Leg_front_right1);
		setRotationAngle(Leg_front_right1, -0.1963F, 0.0F, 0.0F);
		Leg_front_right1.setTextureOffset(93, 93).addBox(-3.0F, -6.5556F, -2.1685F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		Leg_front_right1.setModelRendererName("Leg_front_right1");
		this.registerModelRenderer(Leg_front_right1);

		Leg_front_right2 = new AnimatedModelRenderer(this);
		Leg_front_right2.setRotationPoint(0.0F, 12.0F, 0.0F);
		Leg_front_right.addChild(Leg_front_right2);
		setRotationAngle(Leg_front_right2, 0.3927F, 0.0F, 0.0F);
		Leg_front_right2.setTextureOffset(100, 0).addBox(-3.0F, -5.0F, -2.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);
		Leg_front_right2.setModelRendererName("Leg_front_right2");
		this.registerModelRenderer(Leg_front_right2);

		Leg_front_right_claws = new AnimatedModelRenderer(this);
		Leg_front_right_claws.setRotationPoint(0.0F, 16.889F, 3.0719F);
		Leg_front_right.addChild(Leg_front_right_claws);
		setRotationAngle(Leg_front_right_claws, 0.7854F, 0.0F, 0.0F);
		
		Leg_front_right_claws.setModelRendererName("Leg_front_right_claws");
		this.registerModelRenderer(Leg_front_right_claws);

		Claw_7 = new AnimatedModelRenderer(this);
		Claw_7.setRotationPoint(-2.25F, 0.3786F, 2.0F);
		Leg_front_right_claws.addChild(Claw_7);
		setRotationAngle(Claw_7, 0.7854F, 0.0F, 0.0F);
		Claw_7.setTextureOffset(52, 32).addBox(-0.75F, -1.6173F, -0.5761F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		Claw_7.setModelRendererName("Claw_7");
		this.registerModelRenderer(Claw_7);

		Claw_8 = new AnimatedModelRenderer(this);
		Claw_8.setRotationPoint(0.0F, 0.3786F, 2.0F);
		Leg_front_right_claws.addChild(Claw_8);
		setRotationAngle(Claw_8, 0.7854F, 0.0F, 0.0F);
		Claw_8.setTextureOffset(50, 0).addBox(-0.75F, -1.6173F, -0.5761F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		Claw_8.setModelRendererName("Claw_8");
		this.registerModelRenderer(Claw_8);

		Claw_9 = new AnimatedModelRenderer(this);
		Claw_9.setRotationPoint(2.25F, 0.3786F, 2.0F);
		Leg_front_right_claws.addChild(Claw_9);
		setRotationAngle(Claw_9, 0.7854F, 0.0F, 0.0F);
		Claw_9.setTextureOffset(14, 14).addBox(-0.75F, -1.6173F, -0.5761F, 1.0F, 4.0F, 3.0F, 0.0F, false);
		Claw_9.setModelRendererName("Claw_9");
		this.registerModelRenderer(Claw_9);

		Leg_back_left = new AnimatedModelRenderer(this);
		Leg_back_left.setRotationPoint(-6.0F, -17.0F, -12.0F);
		Legs.addChild(Leg_back_left);
		
		Leg_back_left.setModelRendererName("Leg_back_left");
		this.registerModelRenderer(Leg_back_left);

		Leg_back_left_1 = new AnimatedModelRenderer(this);
		Leg_back_left_1.setRotationPoint(0.0F, 0.76F, -0.0051F);
		Leg_back_left.addChild(Leg_back_left_1);
		setRotationAngle(Leg_back_left_1, 0.9817F, 0.0F, 0.0F);
		Leg_back_left_1.setTextureOffset(0, 83).addBox(-3.0F, -2.5711F, -4.4792F, 6.0F, 12.0F, 9.0F, 0.0F, false);
		Leg_back_left_1.setModelRendererName("Leg_back_left_1");
		this.registerModelRenderer(Leg_back_left_1);

		Leg_back_left_2 = new AnimatedModelRenderer(this);
		Leg_back_left_2.setRotationPoint(0.0F, 9.7091F, 4.8463F);
		Leg_back_left.addChild(Leg_back_left_2);
		setRotationAngle(Leg_back_left_2, -1.1781F, 0.0F, 0.0F);
		Leg_back_left_2.setTextureOffset(88, 51).addBox(-3.0F, -0.4567F, -5.7961F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		Leg_back_left_2.setModelRendererName("Leg_back_left_2");
		this.registerModelRenderer(Leg_back_left_2);

		Leg_back_left_3 = new AnimatedModelRenderer(this);
		Leg_back_left_3.setRotationPoint(0.0F, 9.9307F, -4.9164F);
		Leg_back_left.addChild(Leg_back_left_3);
		setRotationAngle(Leg_back_left_3, 0.3927F, 0.0F, 0.0F);
		Leg_back_left_3.setTextureOffset(24, 105).addBox(-3.0F, -2.2648F, -2.4389F, 6.0F, 9.0F, 5.0F, 0.0F, false);
		Leg_back_left_3.setModelRendererName("Leg_back_left_3");
		this.registerModelRenderer(Leg_back_left_3);

		Leg_back_left_4 = new AnimatedModelRenderer(this);
		Leg_back_left_4.setRotationPoint(0.0F, 16.4003F, -4.1069F);
		Leg_back_left.addChild(Leg_back_left_4);
		setRotationAngle(Leg_back_left_4, -1.5708F, 0.0F, 0.0F);
		Leg_back_left_4.setTextureOffset(98, 38).addBox(-3.0F, -7.5148F, -3.3137F, 6.0F, 8.0F, 4.0F, 0.0F, false);
		Leg_back_left_4.setModelRendererName("Leg_back_left_4");
		this.registerModelRenderer(Leg_back_left_4);

		Leg_back_left_claws = new AnimatedModelRenderer(this);
		Leg_back_left_claws.setRotationPoint(0.0F, 15.75F, 2.0F);
		Leg_back_left.addChild(Leg_back_left_claws);
		setRotationAngle(Leg_back_left_claws, 0.3709F, 0.0F, 0.0F);
		
		Leg_back_left_claws.setModelRendererName("Leg_back_left_claws");
		this.registerModelRenderer(Leg_back_left_claws);

		Claw_4 = new AnimatedModelRenderer(this);
		Claw_4.setRotationPoint(2.25F, 0.2322F, 1.3536F);
		Leg_back_left_claws.addChild(Claw_4);
		setRotationAngle(Claw_4, 0.7854F, 0.0F, 0.0F);
		Claw_4.setTextureOffset(56, 74).addBox(-0.75F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		Claw_4.setModelRendererName("Claw_4");
		this.registerModelRenderer(Claw_4);

		Claw_5 = new AnimatedModelRenderer(this);
		Claw_5.setRotationPoint(0.0F, 0.2322F, 1.3536F);
		Leg_back_left_claws.addChild(Claw_5);
		setRotationAngle(Claw_5, 0.7854F, 0.0F, 0.0F);
		Claw_5.setTextureOffset(72, 51).addBox(-0.75F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		Claw_5.setModelRendererName("Claw_5");
		this.registerModelRenderer(Claw_5);

		Claw_6 = new AnimatedModelRenderer(this);
		Claw_6.setRotationPoint(-2.25F, 0.2322F, 0.3536F);
		Leg_back_left_claws.addChild(Claw_6);
		setRotationAngle(Claw_6, 0.7854F, 0.0F, 0.0F);
		Claw_6.setTextureOffset(64, 64).addBox(-0.75F, -0.7929F, -0.7929F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		Claw_6.setModelRendererName("Claw_6");
		this.registerModelRenderer(Claw_6);

		Leg_back_right = new AnimatedModelRenderer(this);
		Leg_back_right.setRotationPoint(6.0F, -17.0F, -12.0F);
		Legs.addChild(Leg_back_right);
		
		Leg_back_right.setModelRendererName("Leg_back_right");
		this.registerModelRenderer(Leg_back_right);

		Leg_back_right_1 = new AnimatedModelRenderer(this);
		Leg_back_right_1.setRotationPoint(0.0F, 0.76F, -0.0051F);
		Leg_back_right.addChild(Leg_back_right_1);
		setRotationAngle(Leg_back_right_1, 0.9817F, 0.0F, 0.0F);
		Leg_back_right_1.setTextureOffset(69, 74).addBox(-3.0F, -2.5711F, -4.4792F, 6.0F, 12.0F, 9.0F, 0.0F, false);
		Leg_back_right_1.setModelRendererName("Leg_back_right_1");
		this.registerModelRenderer(Leg_back_right_1);

		Leg_back_right_2 = new AnimatedModelRenderer(this);
		Leg_back_right_2.setRotationPoint(0.0F, 9.7091F, 4.8463F);
		Leg_back_right.addChild(Leg_back_right_2);
		setRotationAngle(Leg_back_right_2, -1.1781F, 0.0F, 0.0F);
		Leg_back_right_2.setTextureOffset(30, 87).addBox(-3.0F, -0.4567F, -5.7961F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		Leg_back_right_2.setModelRendererName("Leg_back_right_2");
		this.registerModelRenderer(Leg_back_right_2);

		Leg_back_right_3 = new AnimatedModelRenderer(this);
		Leg_back_right_3.setRotationPoint(0.0F, 9.9307F, -4.9164F);
		Leg_back_right.addChild(Leg_back_right_3);
		setRotationAngle(Leg_back_right_3, 0.3927F, 0.0F, 0.0F);
		Leg_back_right_3.setTextureOffset(0, 0).addBox(-3.0F, -2.2648F, -2.4389F, 6.0F, 9.0F, 5.0F, 0.0F, false);
		Leg_back_right_3.setModelRendererName("Leg_back_right_3");
		this.registerModelRenderer(Leg_back_right_3);

		Leg_back_right_4 = new AnimatedModelRenderer(this);
		Leg_back_right_4.setRotationPoint(0.0F, 16.4003F, -4.1069F);
		Leg_back_right.addChild(Leg_back_right_4);
		setRotationAngle(Leg_back_right_4, -1.5708F, 0.0F, 0.0F);
		Leg_back_right_4.setTextureOffset(0, 32).addBox(-3.0F, -7.5148F, -3.3137F, 6.0F, 8.0F, 4.0F, 0.0F, false);
		Leg_back_right_4.setModelRendererName("Leg_back_right_4");
		this.registerModelRenderer(Leg_back_right_4);

		Leg_back_left_claws2 = new AnimatedModelRenderer(this);
		Leg_back_left_claws2.setRotationPoint(0.0F, 15.75F, 2.0F);
		Leg_back_right.addChild(Leg_back_left_claws2);
		setRotationAngle(Leg_back_left_claws2, 0.3709F, 0.0F, 0.0F);
		
		Leg_back_left_claws2.setModelRendererName("Leg_back_left_claws2");
		this.registerModelRenderer(Leg_back_left_claws2);

		Claw_1 = new AnimatedModelRenderer(this);
		Claw_1.setRotationPoint(2.25F, 0.2322F, 1.3536F);
		Leg_back_left_claws2.addChild(Claw_1);
		setRotationAngle(Claw_1, 0.7854F, 0.0F, 0.0F);
		Claw_1.setTextureOffset(56, 64).addBox(-0.75F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		Claw_1.setModelRendererName("Claw_1");
		this.registerModelRenderer(Claw_1);

		Claw_2 = new AnimatedModelRenderer(this);
		Claw_2.setRotationPoint(0.0F, 0.2322F, 1.3536F);
		Leg_back_left_claws2.addChild(Claw_2);
		setRotationAngle(Claw_2, 0.7854F, 0.0F, 0.0F);
		Claw_2.setTextureOffset(48, 64).addBox(-0.75F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		Claw_2.setModelRendererName("Claw_2");
		this.registerModelRenderer(Claw_2);

		Claw_3 = new AnimatedModelRenderer(this);
		Claw_3.setRotationPoint(-2.25F, 0.2322F, 0.3536F);
		Leg_back_left_claws2.addChild(Claw_3);
		setRotationAngle(Claw_3, 0.7854F, 0.0F, 0.0F);
		Claw_3.setTextureOffset(40, 64).addBox(-0.75F, -0.7929F, -0.7929F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		Claw_3.setModelRendererName("Claw_3");
		this.registerModelRenderer(Claw_3);

	    this.rootBones.add(Moonlit_adult_snout);
    }

    @Override
    public ResourceLocation getAnimationFileLocation() {
        return new ResourceLocation("moonlit", "animations/moonlit.animation.json");
    }
}