package its_meow.betteranimalsplus.client.model;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;

/**
 * handoffate - cybercat5555 Created using Tabula 5.1.0
 */
public class ModelHandOfFate<T extends Entity> extends EntityModel<T> {

    public RendererModel bowlBase;
    public RendererModel bowlWall01;
    public RendererModel bowlStand01;
    public RendererModel bowlStand02;
    public RendererModel bowlStand03;
    public RendererModel bowlStandRivit;
    public RendererModel metal01a;
    public RendererModel metal02a;
    public RendererModel metal03a;
    public RendererModel metal04a;
    public RendererModel metal05a;
    public RendererModel metal06a;
    public RendererModel metal07a;
    public RendererModel metal08a;
    public RendererModel bowlWall02;
    public RendererModel bowlWall03;
    public RendererModel bowlWall04;
    public RendererModel bowlWall05;
    public RendererModel bowlWall06;
    public RendererModel bowlStand01b;
    public RendererModel bowlStand02b;
    public RendererModel bowlStand03b;
    public RendererModel metal01b;
    public RendererModel metal01i;
    public RendererModel metal01j;
    public RendererModel metal01k;
    public RendererModel metal01c;
    public RendererModel metal01e;
    public RendererModel metal01f;
    public RendererModel metal01d;
    public RendererModel metal01g;
    public RendererModel metal01h;
    public RendererModel metal02b;
    public RendererModel metal02f;
    public RendererModel metal02g;
    public RendererModel metal02c;
    public RendererModel metal02e;
    public RendererModel metal02d;
    public RendererModel metal03b;
    public RendererModel metal03f;
    public RendererModel metal03g;
    public RendererModel metal03c;
    public RendererModel metal03e;
    public RendererModel metal03d;
    public RendererModel metal04b;
    public RendererModel metal04g;
    public RendererModel metal04h;
    public RendererModel metal04i;
    public RendererModel metal04c;
    public RendererModel metal04e;
    public RendererModel metal04d;
    public RendererModel metal04g_1;
    public RendererModel metal04f;
    public RendererModel metal05b;
    public RendererModel metal05g;
    public RendererModel metal05h;
    public RendererModel metal05c;
    public RendererModel metal05e;
    public RendererModel metal05d;
    public RendererModel metal05f;
    public RendererModel metal06b;
    public RendererModel metal06c;
    public RendererModel metal06d;
    public RendererModel metal06e;
    public RendererModel metal07b;
    public RendererModel metal07c;
    public RendererModel metal07d;
    public RendererModel metal07e;
    public RendererModel metal08b;
    public RendererModel metal08c;

    public ModelHandOfFate() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.metal01d = new RendererModel(this, 36, 0);
        this.metal01d.setRotationPoint(0.0F, -3.7F, 0.0F);
        this.metal01d.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(this.metal01d, 0.4553564018453205F, 0.0F, 0.0F);
        this.metal02a = new RendererModel(this, 36, 0);
        this.metal02a.setRotationPoint(1.4F, 19.7F, 1.2F);
        this.metal02a.addBox(-0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F);
        this.setRotateAngle(this.metal02a, 0.045553093477052F, 0.22759093446006054F, 0.0F);
        this.metal01f = new RendererModel(this, 35, 3);
        this.metal01f.setRotationPoint(0.2F, -3.3F, 0.0F);
        this.metal01f.addBox(0.1F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal01f, 0.0F, 0.36425021489121656F, 0.045553093477052F);
        this.metal02d = new RendererModel(this, 36, 0);
        this.metal02d.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.metal02d.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.metal02d, 0.4553564018453205F, 0.0F, 0.0F);
        this.metal03c = new RendererModel(this, 36, 0);
        this.metal03c.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.metal03c.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.metal03c, -0.36425021489121656F, 0.0F, 0.0F);
        this.metal01j = new RendererModel(this, 36, 0);
        this.metal01j.setRotationPoint(-0.7F, -3.8F, -0.2F);
        this.metal01j.addBox(-0.4F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal01j, 0.0F, -0.6829473363053812F, 0.0F);
        this.metal03e = new RendererModel(this, 35, 3);
        this.metal03e.setRotationPoint(0.0F, -3.2F, 0.2F);
        this.metal03e.addBox(-1.2F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal03e, 0.136659280431156F, -0.7285004297824331F, -0.18203784098300857F);
        this.metal03f = new RendererModel(this, 36, 0);
        this.metal03f.setRotationPoint(-0.2F, -6.8F, 0.1F);
        this.metal03f.addBox(-1.0F, -0.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.metal03f, 0.0F, -0.9560913642424937F, 0.0F);
        this.metal08a = new RendererModel(this, 36, 0);
        this.metal08a.setRotationPoint(-0.0F, 19.7F, -2.3F);
        this.metal08a.addBox(-0.5F, -8.0F, -0.5F, 1, 8, 1, 0.0F);
        this.setRotateAngle(this.metal08a, -0.045553093477052F, 0.0F, 0.0F);
        this.bowlStand03b = new RendererModel(this, 0, 14);
        this.bowlStand03b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bowlStand03b.addBox(-1.0F, 3.0F, -3.6F, 2, 1, 3, 0.0F);
        this.setRotateAngle(this.bowlStand03b, 0.27314402793711257F, 0.0F, 0.0F);
        this.metal03a = new RendererModel(this, 36, 0);
        this.metal03a.setRotationPoint(-1.4F, 19.7F, 1.2F);
        this.metal03a.addBox(-0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F);
        this.setRotateAngle(this.metal03a, 0.045553093477052F, -0.22759093446006054F, 0.0F);
        this.metal05g = new RendererModel(this, 36, 0);
        this.metal05g.setRotationPoint(0.0F, -5.6F, -0.1F);
        this.metal05g.addBox(-0.4F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal05g, 0.0F, 0.5918411493512771F, 0.0F);
        this.metal02e = new RendererModel(this, 35, 3);
        this.metal02e.setRotationPoint(0.1F, -3.2F, 0.2F);
        this.metal02e.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(this.metal02e, 0.4553564018453205F, 0.9560913642424937F, 0.4553564018453205F);
        this.metal08b = new RendererModel(this, 36, 0);
        this.metal08b.setRotationPoint(0.0F, -7.8F, 0.0F);
        this.metal08b.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.metal08b, 0.136659280431156F, 0.0F, 0.0F);
        this.metal02g = new RendererModel(this, 36, 0);
        this.metal02g.setRotationPoint(0.5F, -1.8F, -0.1F);
        this.metal02g.addBox(-0.6F, -0.5F, -0.7F, 2, 1, 1, 0.0F);
        this.setRotateAngle(this.metal02g, 0.0F, 0.9560913642424937F, 0.0F);
        this.metal07b = new RendererModel(this, 36, 0);
        this.metal07b.setRotationPoint(0.0F, -8.9F, 0.0F);
        this.metal07b.addBox(-0.5F, -2.6F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.metal07b, 0.136659280431156F, 0.0F, 0.136659280431156F);
        this.bowlStand01b = new RendererModel(this, 0, 14);
        this.bowlStand01b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bowlStand01b.addBox(-1.0F, 3.0F, -3.6F, 2, 1, 3, 0.0F);
        this.setRotateAngle(this.bowlStand01b, 0.27314402793711257F, 0.0F, 0.0F);
        this.metal03d = new RendererModel(this, 36, 0);
        this.metal03d.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.metal03d.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.metal03d, 0.4553564018453205F, 0.0F, 0.0F);
        this.metal03g = new RendererModel(this, 36, 0);
        this.metal03g.setRotationPoint(-0.2F, -2.7F, 0.1F);
        this.metal03g.addBox(-1.0F, -0.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.metal03g, 0.0F, -0.9560913642424937F, 0.0F);
        this.bowlStand03 = new RendererModel(this, 0, 4);
        this.bowlStand03.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.bowlStand03.addBox(-1.0F, 1.1F, -3.3F, 2, 4, 1, 0.0F);
        this.setRotateAngle(this.bowlStand03, -0.27314402793711257F, -2.0943951023931953F, 0.0F);
        this.metal04i = new RendererModel(this, 36, 0);
        this.metal04i.setRotationPoint(-0.1F, -2.5F, -0.2F);
        this.metal04i.addBox(0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal04i, 0.0F, 0.9105382707654417F, 0.0F);
        this.bowlStand01 = new RendererModel(this, 0, 4);
        this.bowlStand01.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.bowlStand01.addBox(-1.0F, 1.1F, -3.3F, 2, 4, 1, 0.0F);
        this.setRotateAngle(this.bowlStand01, -0.27314402793711257F, 0.0F, 0.0F);
        this.metal05a = new RendererModel(this, 36, 0);
        this.metal05a.setRotationPoint(2.2F, 19.7F, -0.3F);
        this.metal05a.addBox(-0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F);
        this.setRotateAngle(this.metal05a, 0.0F, 0.0F, -0.045553093477052F);
        this.metal03b = new RendererModel(this, 36, 0);
        this.metal03b.setRotationPoint(0.0F, -8.8F, 0.0F);
        this.metal03b.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.metal03b, -0.22759093446006054F, -0.136659280431156F, 0.0F);
        this.metal04e = new RendererModel(this, 35, 3);
        this.metal04e.setRotationPoint(0.0F, -3.2F, -0.3F);
        this.metal04e.addBox(-0.5F, -0.5F, -1.2F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.metal04e, 0.31869712141416456F, -0.091106186954104F, 0.0F);
        this.metal07d = new RendererModel(this, 36, 0);
        this.metal07d.setRotationPoint(-0.3F, -4.2F, -0.1F);
        this.metal07d.addBox(-0.4F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal07d, 0.0F, 1.0471975511965976F, 0.0F);
        this.metal04g = new RendererModel(this, 36, 0);
        this.metal04g.setRotationPoint(-0.1F, -6.5F, -0.2F);
        this.metal04g.addBox(0.0F, -1.3F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.metal04g, 0.0F, 0.9105382707654417F, 0.0F);
        this.metal05h = new RendererModel(this, 36, 0);
        this.metal05h.setRotationPoint(0.0F, -2.4F, -0.1F);
        this.metal05h.addBox(-0.4F, -0.5F, -1.1F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.metal05h, 0.0F, 0.5918411493512771F, 0.0F);
        this.metal05f = new RendererModel(this, 35, 3);
        this.metal05f.setRotationPoint(0.1F, 0.0F, -0.8F);
        this.metal05f.addBox(-0.5F, -0.5F, -1.9F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.metal05f, 0.045553093477052F, 0.6373942428283291F, -0.18203784098300857F);
        this.metal01e = new RendererModel(this, 35, 3);
        this.metal01e.setRotationPoint(0.0F, -3.3F, 0.0F);
        this.metal01e.addBox(-1.3F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal01e, 0.0F, -0.36425021489121656F, -0.045553093477052F);
        this.bowlWall02 = new RendererModel(this, 0, 0);
        this.bowlWall02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bowlWall02.addBox(-3.0F, -2.0F, 3.2F, 6, 1, 2, 0.0F);
        this.setRotateAngle(this.bowlWall02, 0.0F, 1.0471975511965976F, 0.0F);
        this.metal01k = new RendererModel(this, 36, 0);
        this.metal01k.setRotationPoint(0.5F, -3.3F, -0.1F);
        this.metal01k.addBox(-0.4F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal01k, 0.0F, 0.6829473363053812F, 0.0F);
        this.metal07c = new RendererModel(this, 36, 0);
        this.metal07c.setRotationPoint(-0.3F, -6.5F, -0.1F);
        this.metal07c.addBox(-0.4F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal07c, 0.0F, 1.0471975511965976F, 0.0F);
        this.metal06a = new RendererModel(this, 36, 0);
        this.metal06a.setRotationPoint(-1.4F, 19.7F, -1.7F);
        this.metal06a.addBox(-0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F);
        this.setRotateAngle(this.metal06a, -0.045553093477052F, 0.0F, 0.0F);
        this.metal05b = new RendererModel(this, 36, 0);
        this.metal05b.setRotationPoint(0.0F, -8.8F, 0.0F);
        this.metal05b.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.metal05b, -0.045553093477052F, 0.0F, 0.22759093446006054F);
        this.bowlWall05 = new RendererModel(this, 0, 0);
        this.bowlWall05.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bowlWall05.addBox(-3.0F, -2.0F, 3.2F, 6, 1, 2, 0.0F);
        this.setRotateAngle(this.bowlWall05, 0.0F, -1.0471975511965976F, 0.0F);
        this.metal04d = new RendererModel(this, 36, 0);
        this.metal04d.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.metal04d.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.metal04d, 0.27314402793711257F, 0.0F, 0.18203784098300857F);
        this.bowlStand02b = new RendererModel(this, 0, 14);
        this.bowlStand02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bowlStand02b.addBox(-1.0F, 3.0F, -3.6F, 2, 1, 3, 0.0F);
        this.setRotateAngle(this.bowlStand02b, 0.27314402793711257F, 0.0F, 0.0F);
        this.metal06b = new RendererModel(this, 36, 0);
        this.metal06b.setRotationPoint(0.0F, -8.9F, 0.0F);
        this.metal06b.addBox(-0.5F, -2.6F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.metal06b, 0.136659280431156F, 0.0F, -0.136659280431156F);
        this.bowlStandRivit = new RendererModel(this, 12, 15);
        this.bowlStandRivit.setRotationPoint(0.0F, 23.0F, 0.0F);
        this.bowlStandRivit.addBox(-0.9F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(this.bowlStandRivit, 0.0F, 0.7853981633974483F, 0.0F);
        this.bowlStand02 = new RendererModel(this, 0, 4);
        this.bowlStand02.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.bowlStand02.addBox(-1.0F, 1.1F, -3.3F, 2, 4, 1, 0.0F);
        this.setRotateAngle(this.bowlStand02, -0.27314402793711257F, 2.0943951023931953F, 0.0F);
        this.metal04f = new RendererModel(this, 35, 3);
        this.metal04f.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.metal04f.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.metal04f, 0.045553093477052F, -0.40980330836826856F, 0.0F);
        this.metal06c = new RendererModel(this, 36, 0);
        this.metal06c.setRotationPoint(0.2F, -7.2F, -0.1F);
        this.metal06c.addBox(-0.4F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal06c, 0.0F, -1.0471975511965976F, 0.0F);
        this.metal04a = new RendererModel(this, 36, 0);
        this.metal04a.setRotationPoint(-2.2F, 19.7F, -0.3F);
        this.metal04a.addBox(-0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F);
        this.setRotateAngle(this.metal04a, 0.0F, 0.0F, 0.045553093477052F);
        this.metal01b = new RendererModel(this, 36, 0);
        this.metal01b.setRotationPoint(0.0F, -8.8F, 0.0F);
        this.metal01b.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.metal01b, -0.27314402793711257F, 0.0F, 0.0F);
        this.metal01c = new RendererModel(this, 36, 0);
        this.metal01c.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.metal01c.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.metal01c, -0.36425021489121656F, 0.0F, 0.0F);
        this.metal01h = new RendererModel(this, 35, 3);
        this.metal01h.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.metal01h.addBox(0.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(this.metal01h, 0.22759093446006054F, 0.36425021489121656F, 0.27314402793711257F);
        this.bowlWall03 = new RendererModel(this, 0, 0);
        this.bowlWall03.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bowlWall03.addBox(-3.0F, -2.0F, 3.2F, 6, 1, 2, 0.0F);
        this.setRotateAngle(this.bowlWall03, 0.0F, 2.0943951023931953F, 0.0F);
        this.metal01g = new RendererModel(this, 35, 3);
        this.metal01g.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.metal01g.addBox(-2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
        this.setRotateAngle(this.metal01g, 0.22759093446006054F, -0.36425021489121656F, -0.27314402793711257F);
        this.metal04b = new RendererModel(this, 36, 0);
        this.metal04b.setRotationPoint(0.0F, -8.8F, 0.0F);
        this.metal04b.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.metal04b, -0.136659280431156F, 0.0F, -0.18203784098300857F);
        this.bowlWall06 = new RendererModel(this, 0, 0);
        this.bowlWall06.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bowlWall06.addBox(-3.0F, -2.0F, 3.2F, 6, 1, 2, 0.0F);
        this.setRotateAngle(this.bowlWall06, 0.0F, -2.0943951023931953F, 0.0F);
        this.metal02b = new RendererModel(this, 36, 0);
        this.metal02b.setRotationPoint(0.0F, -8.8F, 0.0F);
        this.metal02b.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(this.metal02b, -0.22759093446006054F, 0.136659280431156F, 0.0F);
        this.metal07e = new RendererModel(this, 36, 0);
        this.metal07e.setRotationPoint(-0.3F, -1.9F, -0.1F);
        this.metal07e.addBox(-0.4F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal07e, 0.0F, 1.0471975511965976F, 0.0F);
        this.metal01a = new RendererModel(this, 36, 0);
        this.metal01a.setRotationPoint(0.0F, 19.7F, 2.2F);
        this.metal01a.addBox(-0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F);
        this.setRotateAngle(this.metal01a, 0.091106186954104F, 0.0F, 0.0F);
        this.bowlWall01 = new RendererModel(this, 0, 0);
        this.bowlWall01.setRotationPoint(0.0F, 20.9F, 0.0F);
        this.bowlWall01.addBox(-3.0F, -2.0F, 3.2F, 6, 1, 2, 0.0F);
        this.metal01i = new RendererModel(this, 36, 0);
        this.metal01i.setRotationPoint(0.5F, -6.5F, -0.1F);
        this.metal01i.addBox(-0.4F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal01i, 0.0F, 0.6829473363053812F, 0.0F);
        this.metal05c = new RendererModel(this, 36, 0);
        this.metal05c.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.metal05c.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.metal05c, 0.18203784098300857F, 0.0F, 0.091106186954104F);
        this.metal05e = new RendererModel(this, 35, 3);
        this.metal05e.setRotationPoint(0.0F, -3.2F, -0.3F);
        this.metal05e.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal05e, 0.22759093446006054F, 0.091106186954104F, 0.0F);
        this.bowlBase = new RendererModel(this, 0, 4);
        this.bowlBase.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.bowlBase.addBox(-3.5F, -0.5F, -3.5F, 7, 1, 7, 0.0F);
        this.metal08c = new RendererModel(this, 35, 3);
        this.metal08c.setRotationPoint(0.0F, -3.8F, -0.2F);
        this.metal08c.addBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
        this.metal02c = new RendererModel(this, 36, 0);
        this.metal02c.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.metal02c.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.metal02c, -0.36425021489121656F, 0.0F, 0.0F);
        this.metal06d = new RendererModel(this, 36, 0);
        this.metal06d.setRotationPoint(0.2F, -5.8F, -0.1F);
        this.metal06d.addBox(-0.4F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal06d, 0.0F, -1.0471975511965976F, 0.0F);
        this.metal05d = new RendererModel(this, 36, 0);
        this.metal05d.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.metal05d.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.metal05d, 0.0F, 0.0F, -0.18203784098300857F);
        this.bowlWall04 = new RendererModel(this, 0, 0);
        this.bowlWall04.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bowlWall04.addBox(-3.0F, -2.0F, 3.2F, 6, 1, 2, 0.0F);
        this.setRotateAngle(this.bowlWall04, 0.0F, 3.141592653589793F, 0.0F);
        this.metal07a = new RendererModel(this, 36, 0);
        this.metal07a.setRotationPoint(1.4F, 19.7F, -1.7F);
        this.metal07a.addBox(-0.5F, -9.0F, -0.5F, 1, 9, 1, 0.0F);
        this.setRotateAngle(this.metal07a, -0.045553093477052F, 0.0F, 0.0F);
        this.metal04h = new RendererModel(this, 36, 0);
        this.metal04h.setRotationPoint(-0.1F, -4.7F, -0.2F);
        this.metal04h.addBox(0.0F, -0.8F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.metal04h, 0.0F, 0.9105382707654417F, 0.0F);
        this.metal02f = new RendererModel(this, 36, 0);
        this.metal02f.setRotationPoint(0.5F, -5.8F, -0.1F);
        this.metal02f.addBox(-0.3F, -0.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(this.metal02f, 0.0F, 0.9560913642424937F, 0.0F);
        this.metal04c = new RendererModel(this, 36, 0);
        this.metal04c.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.metal04c.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(this.metal04c, -0.136659280431156F, 0.0F, -0.091106186954104F);
        this.metal06e = new RendererModel(this, 36, 0);
        this.metal06e.setRotationPoint(0.2F, -2.9F, -0.1F);
        this.metal06e.addBox(-0.4F, -0.5F, -1.1F, 1, 1, 1, 0.0F);
        this.setRotateAngle(this.metal06e, 0.0F, -1.0471975511965976F, 0.0F);
        this.metal04g_1 = new RendererModel(this, 35, 4);
        this.metal04g_1.setRotationPoint(0.3F, 0.5F, 0.0F);
        this.metal04g_1.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F);
        this.setRotateAngle(this.metal04g_1, 0.18203784098300857F, 0.0F, 0.22759093446006054F);
        this.metal01c.addChild(this.metal01d);
        this.metal01b.addChild(this.metal01f);
        this.metal02c.addChild(this.metal02d);
        this.metal03b.addChild(this.metal03c);
        this.metal01a.addChild(this.metal01j);
        this.metal03b.addChild(this.metal03e);
        this.metal03a.addChild(this.metal03f);
        this.bowlStand03.addChild(this.bowlStand03b);
        this.metal05a.addChild(this.metal05g);
        this.metal02b.addChild(this.metal02e);
        this.metal08a.addChild(this.metal08b);
        this.metal02a.addChild(this.metal02g);
        this.metal07a.addChild(this.metal07b);
        this.bowlStand01.addChild(this.bowlStand01b);
        this.metal03c.addChild(this.metal03d);
        this.metal03a.addChild(this.metal03g);
        this.metal04a.addChild(this.metal04i);
        this.metal03a.addChild(this.metal03b);
        this.metal04b.addChild(this.metal04e);
        this.metal07a.addChild(this.metal07d);
        this.metal04a.addChild(this.metal04g);
        this.metal05a.addChild(this.metal05h);
        this.metal05e.addChild(this.metal05f);
        this.metal01b.addChild(this.metal01e);
        this.bowlWall01.addChild(this.bowlWall02);
        this.metal01a.addChild(this.metal01k);
        this.metal07a.addChild(this.metal07c);
        this.metal05a.addChild(this.metal05b);
        this.bowlWall01.addChild(this.bowlWall05);
        this.metal04c.addChild(this.metal04d);
        this.bowlStand02.addChild(this.bowlStand02b);
        this.metal06a.addChild(this.metal06b);
        this.metal04e.addChild(this.metal04f);
        this.metal06a.addChild(this.metal06c);
        this.metal01a.addChild(this.metal01b);
        this.metal01b.addChild(this.metal01c);
        this.metal01c.addChild(this.metal01h);
        this.bowlWall01.addChild(this.bowlWall03);
        this.metal01c.addChild(this.metal01g);
        this.metal04a.addChild(this.metal04b);
        this.bowlWall01.addChild(this.bowlWall06);
        this.metal02a.addChild(this.metal02b);
        this.metal07a.addChild(this.metal07e);
        this.metal01a.addChild(this.metal01i);
        this.metal05b.addChild(this.metal05c);
        this.metal05b.addChild(this.metal05e);
        this.metal08b.addChild(this.metal08c);
        this.metal02b.addChild(this.metal02c);
        this.metal06a.addChild(this.metal06d);
        this.metal05c.addChild(this.metal05d);
        this.bowlWall01.addChild(this.bowlWall04);
        this.metal04a.addChild(this.metal04h);
        this.metal02a.addChild(this.metal02f);
        this.metal04b.addChild(this.metal04c);
        this.metal06a.addChild(this.metal06e);
        this.metal04c.addChild(this.metal04g_1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.rotatef(f3, 0, 1, 0); // Yaw
        this.metal02a.render(f5);
        this.metal08a.render(f5);
        this.metal03a.render(f5);
        this.bowlStand03.render(f5);
        this.bowlStand01.render(f5);
        this.metal05a.render(f5);
        this.metal06a.render(f5);
        // GlStateManager.pushMatrix();
        GlStateManager.translatef(this.bowlStandRivit.offsetX, this.bowlStandRivit.offsetY,
                this.bowlStandRivit.offsetZ);
        GlStateManager.translatef(this.bowlStandRivit.rotationPointX * f5, this.bowlStandRivit.rotationPointY * f5,
                this.bowlStandRivit.rotationPointZ * f5);
        GlStateManager.scaled(1.1D, 1.0D, 1.1D);
        GlStateManager.translatef(-this.bowlStandRivit.offsetX, -this.bowlStandRivit.offsetY,
                -this.bowlStandRivit.offsetZ);
        GlStateManager.translatef(-this.bowlStandRivit.rotationPointX * f5, -this.bowlStandRivit.rotationPointY * f5,
                -this.bowlStandRivit.rotationPointZ * f5);
        this.bowlStandRivit.render(f5);
        GlStateManager.scaled(1D, 1D, 1D);
        // GlStateManager.popMatrix();
        this.bowlStand02.render(f5);
        this.metal04a.render(f5);
        this.metal01a.render(f5);
        this.bowlWall01.render(f5);
        // GlStateManager.pushMatrix();
        GlStateManager.translatef(this.bowlBase.offsetX, this.bowlBase.offsetY, this.bowlBase.offsetZ);
        GlStateManager.translatef(this.bowlBase.rotationPointX * f5, this.bowlBase.rotationPointY * f5,
                this.bowlBase.rotationPointZ * f5);
        GlStateManager.scaled(1.05D, 1.0D, 1.0D);
        GlStateManager.translatef(-this.bowlBase.offsetX, -this.bowlBase.offsetY, -this.bowlBase.offsetZ);
        GlStateManager.translatef(-this.bowlBase.rotationPointX * f5, -this.bowlBase.rotationPointY * f5,
                -this.bowlBase.rotationPointZ * f5);
        this.bowlBase.render(f5);
        GlStateManager.scaled(1D, 1D, 1D);
        // GlStateManager.popMatrix();
        this.metal07a.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
