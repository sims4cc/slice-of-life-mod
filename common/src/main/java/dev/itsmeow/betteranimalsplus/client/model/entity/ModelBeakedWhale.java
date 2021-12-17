package dev.itsmeow.betteranimalsplus.client.model.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.itsmeow.betteranimalsplus.client.model.abstracts.ModelBAP;
import dev.itsmeow.betteranimalsplus.util.ModMathHelper;
import dev.itsmeow.imdlib.client.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

/**
 * BeakedWhale - Batman
 * Created using Tabula 7.0.1
 */
public class ModelBeakedWhale<T extends LivingEntity> extends ModelBAP<T> {
    public ModelPart body;
    public ModelPart tail00;
    public ModelPart neck;
    public ModelPart lFin00;
    public ModelPart rFin00;
    public ModelPart tail01;
    public ModelPart tail02;
    public ModelPart dorsalFin00;
    public ModelPart tail03;
    public ModelPart tail04;
    public ModelPart flukeMiddle;
    public ModelPart flukeL01;
    public ModelPart flukeR01;
    public ModelPart flukeL02;
    public ModelPart flukeL03;
    public ModelPart flukeR02;
    public ModelPart flukeR03;
    public ModelPart head;
    public ModelPart topJaw;
    public ModelPart lowJaw;
    public ModelPart snout;
    public ModelPart topTeeth;
    public ModelPart topTeeth2;
    public ModelPart lowTeeth;
    public ModelPart lFin01;
    public ModelPart lFin02;
    public ModelPart rFin01;
    public ModelPart rFin02;
    private boolean inWater = true;

    public ModelBeakedWhale(ModelPart root) {
        this.body = root.getChild("body");
        this.tail00 = body.getChild("tail00");
        this.tail01 = tail00.getChild("tail01");
        this.tail02 = tail01.getChild("tail02");
        this.tail03 = tail02.getChild("tail03");
        this.tail04 = tail03.getChild("tail04");
        this.flukeMiddle = tail04.getChild("flukeMiddle");
        this.flukeL01 = flukeMiddle.getChild("flukeL01");
        this.flukeL02 = flukeL01.getChild("flukeL02");
        this.flukeL03 = flukeL02.getChild("flukeL03");
        this.flukeR01 = flukeMiddle.getChild("flukeR01");
        this.flukeR02 = flukeR01.getChild("flukeR02");
        this.flukeR03 = flukeR02.getChild("flukeR03");
        this.dorsalFin00 = tail01.getChild("dorsalFin00");
        this.neck = body.getChild("neck");
        this.head = neck.getChild("head");
        this.topJaw = head.getChild("topJaw");
        this.snout = topJaw.getChild("snout");
        this.topTeeth = topJaw.getChild("topTeeth");
        this.topTeeth2 = topJaw.getChild("topTeeth2");
        this.lowJaw = head.getChild("lowJaw");
        this.lowTeeth = lowJaw.getChild("lowTeeth");
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
        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -2.5F, -14.0F, 11.0F, 11.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, 3.0F, 0.0229F, 0.0F, 0.0F));
        PartDefinition tail00 = body.addOrReplaceChild("tail00", CubeListBuilder.create().texOffs(0, 27).addBox(-5.0F, -1.5F, 0.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.7F, -0.0911F, 0.0F, 0.0F));
        PartDefinition tail01 = tail00.addOrReplaceChild("tail01", CubeListBuilder.create().texOffs(0, 48).addBox(-4.0F, -1.0F, 0.0F, 8.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 9.4F, -0.0911F, 0.0F, 0.0F));
        PartDefinition tail02 = tail01.addOrReplaceChild("tail02", CubeListBuilder.create().texOffs(0, 65).addBox(-3.5F, -1.0F, 0.0F, 7.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, 7.3F, -0.0456F, 0.0F, 0.0F));
        PartDefinition tail03 = tail02.addOrReplaceChild("tail03", CubeListBuilder.create().texOffs(0, 80).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.7F, -0.182F, 0.0F, 0.0F));
        PartDefinition tail04 = tail03.addOrReplaceChild("tail04", CubeListBuilder.create().texOffs(0, 93).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 5.9F, -0.2276F, 0.0F, 0.0F));
        PartDefinition flukeMiddle = tail04.addOrReplaceChild("flukeMiddle", CubeListBuilder.create().texOffs(33, 51).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.6F, 4.8F));
        PartDefinition flukeL01 = flukeMiddle.addOrReplaceChild("flukeL01", CubeListBuilder.create().texOffs(41, 59).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.1F, -0.5F, 0.5009F, 0.0F, -1.3203F));
        PartDefinition flukeL02 = flukeL01.addOrReplaceChild("flukeL02", CubeListBuilder.create().texOffs(30, 67).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.2731F, 0.0F, 0.0F));
        PartDefinition flukeL03 = flukeL02.addOrReplaceChild("flukeL03", CubeListBuilder.create().texOffs(34, 59).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.2276F, 0.0F, 0.0F));
        PartDefinition flukeR01 = flukeMiddle.addOrReplaceChild("flukeR01", CubeListBuilder.create().texOffs(41, 59).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.1F, -0.5F, 0.5009F, 0.0F, 1.3203F));
        PartDefinition flukeR02 = flukeR01.addOrReplaceChild("flukeR02", CubeListBuilder.create().texOffs(30, 67).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.2731F, 0.0F, 0.0F));
        PartDefinition flukeR03 = flukeR02.addOrReplaceChild("flukeR03", CubeListBuilder.create().texOffs(34, 59).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.2276F, 0.0F, 0.0F));
        PartDefinition dorsalFin00 = tail01.addOrReplaceChild("dorsalFin00", CubeListBuilder.create().texOffs(29, 124).addBox(-0.5F, -0.4F, 0.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.0F, 1.0F, -0.5463F, 0.0F, 0.0F));
        PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 103).addBox(-4.5F, -1.5F, -8.0F, 9.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -13.4F, 0.0456F, 0.0F, 0.0F));
        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 122).addBox(-4.0F, -1.5F, -6.0F, 8.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -7.9F, 0.0456F, 0.0F, 0.0F));
        PartDefinition topJaw = head.addOrReplaceChild("topJaw", CubeListBuilder.create().texOffs(0, 138).addBox(-3.0F, -1.0F, -7.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.3F, -6.0F));
        PartDefinition snout = topJaw.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(28, 138).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -7.0F, 0.2731F, 0.0F, 0.0F));
        PartDefinition topTeeth = topJaw.addOrReplaceChild("topTeeth", CubeListBuilder.create().texOffs(0, 159).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1F, 0.5F, -6.4F));
        PartDefinition topTeeth2 = topJaw.addOrReplaceChild("topTeeth2", CubeListBuilder.create().texOffs(0, 159).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.1F, 0.5F, -6.4F));
        PartDefinition lowJaw = head.addOrReplaceChild("lowJaw", CubeListBuilder.create().texOffs(0, 148).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5F, -5.5F, -0.0911F, 0.0F, 0.0F));
        PartDefinition lowTeeth = lowJaw.addOrReplaceChild("lowTeeth", CubeListBuilder.create().texOffs(25, 149).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, -6.5F));
        PartDefinition lFin00 = body.addOrReplaceChild("lFin00", CubeListBuilder.create().texOffs(0, 178).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 7.0F, -13.9F, 0.5463F, 0.0F, -0.4098F));
        PartDefinition lFin01 = lFin00.addOrReplaceChild("lFin01", CubeListBuilder.create().texOffs(12, 178).addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(-0.5F, 2.9F, 0.0F, 0.3643F, 0.0F, 0.0F));
        PartDefinition lFin02 = lFin01.addOrReplaceChild("lFin02", CubeListBuilder.create().texOffs(0, 188).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));
        PartDefinition rFin00 = body.addOrReplaceChild("rFin00", CubeListBuilder.create().texOffs(0, 178).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 7.0F, -13.9F, 0.5463F, 0.0F, 0.4098F));
        PartDefinition rFin01 = rFin00.addOrReplaceChild("rFin01", CubeListBuilder.create().texOffs(12, 178).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.05F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 2.9F, 0.0F, 0.3643F, 0.0F, 0.0F));
        PartDefinition rFin02 = rFin01.addOrReplaceChild("rFin02", CubeListBuilder.create().texOffs(0, 188).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 4.0F, 0.0F));
        return LayerDefinition.create(meshdefinition, 65, 200);
    }

    @Override
    public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        if (!inWater) {
            matrixStackIn.translate(0F, 0.25F, 0F);
        }
        this.body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        if (!Minecraft.getInstance().isPaused()) {
            this.inWater = entity.isInWater();
            if (inWater) {
                float pitch = rad(headPitch);
                this.body.xRot = pitch == 0 ? 0 : (float) ((pitch / Math.abs(pitch)) * Math.min(Math.abs(pitch), Math.toRadians(45F)));
                this.body.yRot = rad(netHeadYaw);
            } else {
                this.body.yRot = -rad(ModMathHelper.interpolateRotation(entity.yBodyRot, entity.yBodyRotO, Minecraft.getInstance().getFrameTime()));
                this.body.xRot = 0.022863813201125717F;
            }
            {
                float ticks = ageInTicks / 5F + (float) entity.getDeltaMovement().length() * 0.05F;
                float factor = 1F;
                float offset = 0F;
                float amplitude = (float) Math.min(entity.getDeltaMovement().length() * 1.1F + 0.01F, 0.1F);
                if (!entity.isInWater()) {
                    amplitude = 0F;
                    offset = -0.1F;
                }
                float z01 = (float) RenderUtil.partLocation(this.tail00, this.tail01).z();
                float z02 = (float) RenderUtil.partLocation(this.tail00, this.tail01, this.tail02).z();
                float z03 = (float) RenderUtil.partLocation(this.tail00, this.tail01, this.tail02, this.tail03).z();
                float z04 = (float) RenderUtil.partLocation(this.tail00, this.tail01, this.tail02, this.tail03, this.tail04).z();
                this.tail01.xRot = Mth.sin(z01 * factor + ticks) * amplitude + offset;
                this.tail02.xRot = Mth.sin(z02 * factor + ticks) * amplitude + offset;
                this.tail03.xRot = Mth.sin(z03 * factor + ticks) * amplitude + offset;
                this.tail04.xRot = Mth.sin(z04 * factor + ticks) * amplitude + offset;
            }
            {
                float mul = 0.1F;
                float div = 10F;
                float add = entity.getUUID().hashCode() * 0.001F;
                this.lFin00.xRot = Mth.cos(ageInTicks * (mul + 0.05F) + add) / div + 0.8651597102135892F;
                this.rFin00.xRot = Mth.cos(ageInTicks * (mul) + add) / div + 0.8651597102135892F;
            }
        }

    }

}
