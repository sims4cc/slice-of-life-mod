package dev.itsmeow.betteranimalsplus.client.model.entity.shark;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.itsmeow.betteranimalsplus.client.model.abstracts.ModelBAP;
import dev.itsmeow.betteranimalsplus.common.entity.EntityShark;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

/**
 * Greenland Shark - Undefined Created using Tabula 7.0.1
 */
public class ModelGreenlandShark extends ModelBAP<EntityShark> {

    public ModelPart body;
    public ModelPart tail00;
    public ModelPart neck;
    public ModelPart dorsalFin00;
    public ModelPart lFin00;
    public ModelPart rFin00;
    public ModelPart tail01;
    public ModelPart tail02;
    public ModelPart upperTailFin;
    public ModelPart tail03;
    public ModelPart tail04;
    public ModelPart upperTailFin2;
    public ModelPart lLowerTailFin;
    public ModelPart rLowerTailFin;
    public ModelPart tail05;
    public ModelPart tailFinUpper00;
    public ModelPart tailFinLower00;
    public ModelPart tailFinUpper01;
    public ModelPart tailFinUpper02;
    public ModelPart tailFinLower01;
    public ModelPart tailFinLower02;
    public ModelPart head;
    public ModelPart lowerJaw;
    public ModelPart snout;
    public ModelPart teethUpper;
    public ModelPart headUpper;
    public ModelPart teethLower;
    public ModelPart dorsalFin01;
    public ModelPart dorsalFin03;
    public ModelPart dorsalFin02;
    public ModelPart dorsalFin04;
    public ModelPart lFin01;
    public ModelPart lFin02;
    public ModelPart rFin01;
    public ModelPart rFin02;

    public ModelGreenlandShark(ModelPart root) {
        this.body = root.getChild("body");
        this.tail00 = body.getChild("tail00");
        this.tail01 = tail00.getChild("tail01");
        this.tail02 = tail01.getChild("tail02");
        this.tail03 = tail02.getChild("tail03");
        this.tail04 = tail03.getChild("tail04");
        this.tail05 = tail04.getChild("tail05");
        this.tailFinUpper00 = tail05.getChild("tailFinUpper00");
        this.tailFinUpper01 = tailFinUpper00.getChild("tailFinUpper01");
        this.tailFinUpper02 = tailFinUpper01.getChild("tailFinUpper02");
        this.tailFinLower00 = tail05.getChild("tailFinLower00");
        this.tailFinLower01 = tailFinLower00.getChild("tailFinLower01");
        this.tailFinLower02 = tailFinLower01.getChild("tailFinLower02");
        this.upperTailFin2 = tail03.getChild("upperTailFin2");
        this.lLowerTailFin = tail03.getChild("lLowerTailFin");
        this.rLowerTailFin = tail03.getChild("rLowerTailFin");
        this.upperTailFin = tail01.getChild("upperTailFin");
        this.neck = body.getChild("neck");
        this.head = neck.getChild("head");
        this.snout = head.getChild("snout");
        this.headUpper = snout.getChild("headUpper");
        this.teethUpper = head.getChild("teethUpper");
        this.lowerJaw = neck.getChild("lowerJaw");
        this.teethLower = lowerJaw.getChild("teethLower");
        this.dorsalFin00 = body.getChild("dorsalFin00");
        this.dorsalFin01 = dorsalFin00.getChild("dorsalFin01");
        this.dorsalFin02 = dorsalFin01.getChild("dorsalFin02");
        this.dorsalFin03 = dorsalFin00.getChild("dorsalFin03");
        this.dorsalFin04 = dorsalFin03.getChild("dorsalFin04");
        this.lFin00 = body.getChild("lFin00");
        this.lFin01 = lFin00.getChild("lFin01");
        this.lFin02 = lFin01.getChild("lFin02");
        this.rFin00 = body.getChild("rFin00");
        this.rFin01 = rFin00.getChild("rFin01");
        this.rFin02 = rFin01.getChild("rFin02");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -5.5F, -14.0F, 9.0F, 10.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0F, 3.0F, 0.0229F, 0.0F, 0.0F));
        PartDefinition tail00 = body.addOrReplaceChild("tail00", CubeListBuilder.create().texOffs(0, 27).addBox(-3.5F, -4.5F, 0.0F, 7.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.7F, -0.0597F, 0.0F, 0.0F));
        PartDefinition tail01 = tail00.addOrReplaceChild("tail01", CubeListBuilder.create().texOffs(0, 50).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 10.4F, -0.0436F, 0.0F, 0.0F));
        PartDefinition tail02 = tail01.addOrReplaceChild("tail02", CubeListBuilder.create().texOffs(0, 65).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 5.3F, -0.0002F, 0.0F, 0.0F));
        PartDefinition tail03 = tail02.addOrReplaceChild("tail03", CubeListBuilder.create().texOffs(0, 78).addBox(-1.5F, -2.0F, 0.0F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 5.7F));
        PartDefinition tail04 = tail03.addOrReplaceChild("tail04", CubeListBuilder.create().texOffs(0, 89).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.4F, 4.9F));
        PartDefinition tail05 = tail04.addOrReplaceChild("tail05", CubeListBuilder.create().texOffs(25, 50).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.4F));
        PartDefinition tailFinUpper00 = tail05.addOrReplaceChild("tailFinUpper00", CubeListBuilder.create().texOffs(25, 61).addBox(-0.49F, -6.0F, -1.5F, 1.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 1.5F, -0.8196F, 0.0F, 0.0F));
        PartDefinition tailFinUpper01 = tailFinUpper00.addOrReplaceChild("tailFinUpper01", CubeListBuilder.create().texOffs(25, 73).addBox(-0.5F, -5.0F, -1.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.8F, -0.5F, -0.0911F, 0.0F, 0.0F));
        PartDefinition tailFinUpper02 = tailFinUpper01.addOrReplaceChild("tailFinUpper02", CubeListBuilder.create().texOffs(25, 84).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.8F, -0.5F, -0.1367F, 0.0F, 0.0F));
        PartDefinition tailFinLower00 = tail05.addOrReplaceChild("tailFinLower00", CubeListBuilder.create().texOffs(25, 91).addBox(-0.51F, 0.0F, -1.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9F, 2.0F, 0.2276F, 0.0F, 0.0F));
        PartDefinition tailFinLower01 = tailFinLower00.addOrReplaceChild("tailFinLower01", CubeListBuilder.create().texOffs(15, 88).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -0.5F, 0.3643F, 0.0F, 0.0F));
        PartDefinition tailFinLower02 = tailFinLower01.addOrReplaceChild("tailFinLower02", CubeListBuilder.create().texOffs(15, 97).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -1.0F, 0.182F, 0.0F, 0.0F));
        PartDefinition upperTailFin2 = tail03.addOrReplaceChild("upperTailFin2", CubeListBuilder.create().texOffs(23, 189).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, 1.8F, 1.8213F, 0.0F, 0.0F));
        PartDefinition lLowerTailFin = tail03.addOrReplaceChild("lLowerTailFin", CubeListBuilder.create().texOffs(11, 189).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2F, 2.0F, -0.9F, 0.3643F, 0.0F, -0.5463F));
        PartDefinition rLowerTailFin = tail03.addOrReplaceChild("rLowerTailFin", CubeListBuilder.create().texOffs(11, 189).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 2.0F, -0.9F, 0.3643F, 0.0F, 0.5463F));
        PartDefinition upperTailFin = tail01.addOrReplaceChild("upperTailFin", CubeListBuilder.create().texOffs(23, 189).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7F, 2.8F, 1.9577F, 0.0F, 0.0F));
        PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 104).addBox(-4.0F, -5.5F, -9.0F, 8.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -13.6F, 0.0456F, 0.0F, 0.0F));
        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 124).addBox(-3.5F, -3.0F, -4.2F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -8.6F, -0.1367F, 0.0F, 0.0F));
        PartDefinition snout = head.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(0, 135).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -8.7F, 1.2748F, 0.0F, 0.0F));
        PartDefinition headUpper = snout.addOrReplaceChild("headUpper", CubeListBuilder.create().texOffs(0, 146).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, -0.9437F, 0.0F, 0.0F));
        PartDefinition teethUpper = head.addOrReplaceChild("teethUpper", CubeListBuilder.create().texOffs(0, 164).addBox(-5.0F, 0.0F, 0.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.8F, -2.4F));
        PartDefinition lowerJaw = neck.addOrReplaceChild("lowerJaw", CubeListBuilder.create().texOffs(0, 157).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.2F, -8.4F, -0.1367F, 0.0F, 0.0F));
        PartDefinition teethLower = lowerJaw.addOrReplaceChild("teethLower", CubeListBuilder.create().texOffs(0, 171).addBox(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -1.8F, -2.4F));
        PartDefinition dorsalFin00 = body.addOrReplaceChild("dorsalFin00", CubeListBuilder.create().texOffs(26, 124).addBox(-0.5F, -0.4F, 0.0F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.9F, -6.7F, -0.4098F, 0.0F, 0.0F));
        PartDefinition dorsalFin01 = dorsalFin00.addOrReplaceChild("dorsalFin01", CubeListBuilder.create().texOffs(26, 134).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, -1.1F, 0.25F));
        PartDefinition dorsalFin02 = dorsalFin01.addOrReplaceChild("dorsalFin02", CubeListBuilder.create().texOffs(26, 144).addBox(-1.0F, -2.2F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.0F, 1.2F, -0.1F, -0.0456F, 0.0F, 0.0F));
        PartDefinition dorsalFin03 = dorsalFin00.addOrReplaceChild("dorsalFin03", CubeListBuilder.create().texOffs(26, 159).addBox(-1.0F, -3.1F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5F, 1.55F, 0.0456F, 0.0F, 0.0F));
        PartDefinition dorsalFin04 = dorsalFin03.addOrReplaceChild("dorsalFin04", CubeListBuilder.create().texOffs(29, 150).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -2.9F, 0.8F, 1.1383F, 0.0F, 0.0F));
        PartDefinition lFin00 = body.addOrReplaceChild("lFin00", CubeListBuilder.create().texOffs(0, 175).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.6F, 0.7F, -13.9F, 0.182F, 0.0F, -0.7741F));
        PartDefinition lFin01 = lFin00.addOrReplaceChild("lFin01", CubeListBuilder.create().texOffs(15, 178).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 4.9F, 0.0F, 0.2276F, 0.0F, 0.0F));
        PartDefinition lFin02 = lFin01.addOrReplaceChild("lFin02", CubeListBuilder.create().texOffs(0, 189).mirror().addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 2.7F, 1.0F, 0.1367F, 0.0F, 0.0F));
        PartDefinition rFin00 = body.addOrReplaceChild("rFin00", CubeListBuilder.create().texOffs(0, 175).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6F, 0.7F, -13.9F, 0.182F, 0.0F, 0.7741F));
        PartDefinition rFin01 = rFin00.addOrReplaceChild("rFin01", CubeListBuilder.create().texOffs(15, 178).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.5F, 4.9F, 0.0F, 0.2276F, 0.0F, 0.0F));
        PartDefinition rFin02 = rFin01.addOrReplaceChild("rFin02", CubeListBuilder.create().texOffs(0, 189).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7F, 1.0F, 0.1367F, 0.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 60, 200);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    @Override
    public void setupAnim(EntityShark entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        ModelBullShark.animate(entity, ageInTicks, body, tail00, tail01, tail02, lowerJaw);
    }

}
