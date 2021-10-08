package dev.itsmeow.betteranimalsplus.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;

/**
 * bearhead - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelBearHead extends EntityModel<Entity> {
    public ModelPart neck;
    public ModelPart head;
    public ModelPart neckFur01;
    public ModelPart neckFur02;
    public ModelPart lEar01;
    public ModelPart lEarSmall;
    public ModelPart rEar01;
    public ModelPart rEarSmall;
    public ModelPart upperJaw;
    public ModelPart lowerJaw;
    public ModelPart snout;
    public ModelPart lEar02;
    public ModelPart rEar02;

    public ModelBearHead() {
        this.texWidth = 128;
        this.texHeight = 128;
        this.snout = new ModelPart(this, 38, 29);
        this.snout.setPos(0.0F, -0.9F, -6.8F);
        this.snout.addBox(-1.5F, -1.3F, -4.4F, 3, 2, 5, 0.0F);
        this.setRotateAngle(snout, 0.18203784098300857F, 0.0F, 0.0F);
        this.rEarSmall = new ModelPart(this, 0, 0);
        this.rEarSmall.mirror = true;
        this.rEarSmall.setPos(-3.0F, -2.3F, -2.2F);
        this.rEarSmall.addBox(-1.2F, -2.6F, -0.7F, 2, 3, 1, 0.0F);
        this.setRotateAngle(rEarSmall, 0.045553093477052F, 0.0F, -0.40980330836826856F);
        this.lowerJaw = new ModelPart(this, 49, 50);
        this.lowerJaw.setPos(0.0F, 2.1F, -6.5F);
        this.lowerJaw.addBox(-2.5F, -0.5F, -4.1F, 5, 1, 4, 0.0F);
        this.setRotateAngle(lowerJaw, 0.4363323129985824F, 0.0F, 0.0F);
        this.neck = new ModelPart(this, 33, 0);
        this.neck.setPos(0.0F, 23.9F, 0.0F);
        this.neck.addBox(-3.4F, -4.0F, -5.0F, 7, 7, 5, 0.0F);
        this.lEar01 = new ModelPart(this, 36, 42);
        this.lEar01.setPos(2.6F, -2.4F, -4.0F);
        this.lEar01.addBox(-1.5F, -3.2F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(lEar01, 0.18203784098300857F, -0.35168384427685734F, 0.36425021489121656F);
        this.rEar01 = new ModelPart(this, 36, 42);
        this.rEar01.mirror = true;
        this.rEar01.setPos(-2.6F, -2.4F, -4.0F);
        this.rEar01.addBox(-1.5F, -3.2F, 0.0F, 3, 3, 1, 0.0F);
        this.setRotateAngle(rEar01, 0.18203784098300857F, 0.35168384427685734F, -0.36425021489121656F);
        this.neckFur01 = new ModelPart(this, 0, 83);
        this.neckFur01.setPos(0.0F, 2.7F, -2.5F);
        this.neckFur01.addBox(-3.5F, 0.0F, -0.8F, 7, 5, 3, 0.0F);
        this.setRotateAngle(neckFur01, 0.03490658503988659F, 0.0F, 0.0F);
        this.rEar02 = new ModelPart(this, 45, 42);
        this.rEar02.mirror = true;
        this.rEar02.setPos(0.0F, -0.3F, 1.2F);
        this.rEar02.addBox(-1.0F, -2.6F, -0.4F, 2, 3, 1, 0.0F);
        this.setRotateAngle(rEar02, 0.27314402793711257F, 0.0F, 0.0F);
        this.head = new ModelPart(this, 36, 14);
        this.head.setPos(0.0F, -0.8F, -2.7F);
        this.head.addBox(-4.0F, -3.5F, -7.0F, 8, 7, 6, 0.0F);
        this.setRotateAngle(head, 0.18203784098300857F, 0.0F, 0.0F);
        this.neckFur02 = new ModelPart(this, 22, 83);
        this.neckFur02.setPos(0.0F, 2.8F, -4.2F);
        this.neckFur02.addBox(-3.0F, 0.0F, -0.8F, 6, 4, 3, 0.0F);
        this.setRotateAngle(neckFur02, 0.03490658503988659F, 0.0F, 0.0F);
        this.lEarSmall = new ModelPart(this, 0, 0);
        this.lEarSmall.setPos(3.0F, -2.3F, -2.2F);
        this.lEarSmall.addBox(-0.8F, -2.6F, -0.7F, 2, 3, 1, 0.0F);
        this.setRotateAngle(lEarSmall, 0.045553093477052F, 0.0F, 0.40980330836826856F);
        this.lEar02 = new ModelPart(this, 45, 42);
        this.lEar02.setPos(0.0F, -0.3F, 1.2F);
        this.lEar02.addBox(-1.0F, -2.6F, -0.4F, 2, 3, 1, 0.0F);
        this.setRotateAngle(lEar02, 0.27314402793711257F, 0.0F, 0.0F);
        this.upperJaw = new ModelPart(this, 49, 43);
        this.upperJaw.setPos(0.0F, 0.6F, -6.8F);
        this.upperJaw.addBox(-2.5F, -1.0F, -4.1F, 5, 2, 4, 0.0F);
        this.head.addChild(this.snout);
        this.head.addChild(this.rEarSmall);
        this.head.addChild(this.lowerJaw);
        this.head.addChild(this.lEar01);
        this.head.addChild(this.rEar01);
        this.neck.addChild(this.neckFur01);
        this.rEar01.addChild(this.rEar02);
        this.neck.addChild(this.head);
        this.neck.addChild(this.neckFur02);
        this.head.addChild(this.lEarSmall);
        this.lEar01.addChild(this.lEar02);
        this.head.addChild(this.upperJaw);
    }

    @Override
    public void setupAnim(Entity entity, float f, float f1, float f2, float f3, float f4) {
        this.neck.yRot = (float) Math.toRadians(f);
        this.neck.xRot = (float) Math.toRadians(f1);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.neck.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelPart ModelRenderer, float x, float y, float z) {
        ModelRenderer.xRot = x;
        ModelRenderer.yRot = y;
        ModelRenderer.zRot = z;
    }
}