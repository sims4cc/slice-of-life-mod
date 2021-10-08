package dev.itsmeow.betteranimalsplus.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;

/**
 * wolf_v2_head - cybercat5555
 * Created using Tabula 7.0.1
 */
public class ModelFeralWolfHead extends EntityModel<Entity> {
    public ModelPart head;
    public ModelPart jawUpper01;
    public ModelPart jawLower;
    public ModelPart lEar01;
    public ModelPart rEar01;
    public ModelPart lCheekFur;
    public ModelPart rCheekFur;
    public ModelPart snout;
    public ModelPart jawUpper02;
    public ModelPart upperTeeth01;
    public ModelPart upperTeeth03;
    public ModelPart upperTeeth02;
    public ModelPart lowerTeeth01;
    public ModelPart lowerTeeth02;
    public ModelPart lEar02;
    public ModelPart rEar02;

    public ModelFeralWolfHead() {
        this.texWidth = 128;
        this.texHeight = 64;
        this.upperTeeth03 = new ModelPart(this, 55, 28);
        this.upperTeeth03.setPos(0.0F, -3.2F, -1.0F);
        this.upperTeeth03.addBox(-2.27F, -0.7F, -0.4F, 3, 0, 1, 0.0F);
        this.setRotateAngle(upperTeeth03, 0.0F, 0.0F, 0.136659280431156F);
        this.rCheekFur = new ModelPart(this, 30, -6);
        this.rCheekFur.mirror = true;
        this.rCheekFur.setPos(-3.5F, -2.5F, -0.6F);
        this.rCheekFur.addBox(0.0F, -0.8F, -3.6F, 0, 5, 6, 0.0F);
        this.setRotateAngle(rCheekFur, -0.3490658503988659F, 0.08726646259971647F, 0.6981317007977318F);
        this.jawUpper02 = new ModelPart(this, 51, 12);
        this.jawUpper02.mirror = true;
        this.jawUpper02.setPos(0.0F, 0.35F, 0.0F);
        this.jawUpper02.addBox(-3.5F, -4.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(jawUpper02, 0.0F, 0.0F, 0.2792526803190927F);
        this.rEar02 = new ModelPart(this, 0, 4);
        this.rEar02.mirror = true;
        this.rEar02.setPos(0.0F, 1.2F, 0.2F);
        this.rEar02.addBox(-1.0F, -0.7F, 0.2F, 2, 1, 4, 0.0F);
        this.setRotateAngle(rEar02, 0.3141592653589793F, 0.0F, 0.0F);
        this.lCheekFur = new ModelPart(this, 30, -6);
        this.lCheekFur.mirror = true;
        this.lCheekFur.setPos(3.5F, -2.5F, -0.6F);
        this.lCheekFur.addBox(0.0F, -0.9F, -3.8F, 0, 5, 6, 0.0F);
        this.setRotateAngle(lCheekFur, -0.3490658503988659F, -0.08726646259971647F, -0.6981317007977318F);
        this.upperTeeth01 = new ModelPart(this, 50, 20);
        this.upperTeeth01.setPos(0.0F, -2.8F, -1.0F);
        this.upperTeeth01.addBox(-0.5F, -1.0F, -0.89F, 1, 4, 2, 0.0F);
        this.jawUpper01 = new ModelPart(this, 51, 12);
        this.jawUpper01.setPos(1.2F, -5.2F, -1.1F);
        this.jawUpper01.addBox(-0.9F, -4.0F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(jawUpper01, 0.0F, 0.0F, -0.13962634015954636F);
        this.head = new ModelPart(this, 40, 0);
        this.head.setPos(0.0F, 23.9F, 0.0F);
        this.head.addBox(-3.5F, -5.0F, -3.0F, 7, 5, 6, 0.0F);
        this.setRotateAngle(head, 1.5707963267948966F, 0.0F, 0.0F);
        this.upperTeeth02 = new ModelPart(this, 50, 20);
        this.upperTeeth02.mirror = true;
        this.upperTeeth02.setPos(-2.4F, -2.8F, -1.0F);
        this.upperTeeth02.addBox(-0.5F, -1.0F, -0.89F, 1, 4, 2, 0.0F);
        this.lowerTeeth02 = new ModelPart(this, 57, 22);
        this.lowerTeeth02.mirror = true;
        this.lowerTeeth02.setPos(0.0F, 0.0F, 0.0F);
        this.lowerTeeth02.addBox(-1.6F, -0.7F, 0.3F, 1, 3, 1, 0.0F);
        this.snout = new ModelPart(this, 40, 12);
        this.snout.setPos(0.0F, -4.9F, 0.1F);
        this.snout.addBox(-1.5F, -4.45F, -1.0F, 3, 5, 2, 0.0F);
        this.setRotateAngle(snout, 0.18203784098300857F, 0.0F, 0.0F);
        this.lEar01 = new ModelPart(this, 0, 0);
        this.lEar01.setPos(2.1F, -2.2F, 1.9F);
        this.lEar01.addBox(-1.5F, -0.5F, 0.3F, 3, 1, 3, 0.0F);
        this.setRotateAngle(lEar01, 0.08726646259971647F, 0.22689280275926282F, 0.3665191429188092F);
        this.lEar02 = new ModelPart(this, 0, 4);
        this.lEar02.setPos(0.0F, 1.2F, 0.2F);
        this.lEar02.addBox(-1.0F, -0.7F, 0.2F, 2, 1, 4, 0.0F);
        this.setRotateAngle(lEar02, 0.3141592653589793F, 0.0F, 0.0F);
        this.rEar01 = new ModelPart(this, 0, 0);
        this.rEar01.mirror = true;
        this.rEar01.setPos(-2.1F, -2.2F, 1.9F);
        this.rEar01.addBox(-1.5F, -0.5F, 0.3F, 3, 1, 3, 0.0F);
        this.setRotateAngle(rEar01, 0.08726646259971647F, -0.22689280275926282F, -0.3665191429188092F);
        this.jawLower = new ModelPart(this, 39, 20);
        this.jawLower.setPos(0.0F, -4.6F, -2.51F);
        this.jawLower.addBox(-1.5F, -4.5F, -0.5F, 3, 5, 1, 0.0F);
        this.lowerTeeth01 = new ModelPart(this, 57, 22);
        this.lowerTeeth01.setPos(0.0F, -3.7F, 0.1F);
        this.lowerTeeth01.addBox(0.6F, -0.7F, 0.4F, 1, 3, 1, 0.0F);
        this.jawUpper01.addChild(this.upperTeeth03);
        this.head.addChild(this.rCheekFur);
        this.jawUpper01.addChild(this.jawUpper02);
        this.rEar01.addChild(this.rEar02);
        this.head.addChild(this.lCheekFur);
        this.jawUpper01.addChild(this.upperTeeth01);
        this.head.addChild(this.jawUpper01);
        this.jawUpper02.addChild(this.upperTeeth02);
        this.lowerTeeth01.addChild(this.lowerTeeth02);
        this.head.addChild(this.snout);
        this.head.addChild(this.lEar01);
        this.lEar01.addChild(this.lEar02);
        this.head.addChild(this.rEar01);
        this.head.addChild(this.jawLower);
        this.jawLower.addChild(this.lowerTeeth01);
    }

    @Override
    public void setupAnim(Entity entity, float f, float f1, float f2, float f3, float f4) {
        this.head.yRot = (float) Math.toRadians(f);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.head.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
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