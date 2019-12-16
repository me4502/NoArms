package com.me4502.noarms.mixin;

import net.minecraft.client.resources.IResourceManagerReloadListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(net.minecraft.client.renderer.EntityRenderer.class)
public abstract class MixinEntityRenderer implements IResourceManagerReloadListener {

    @Overwrite
    private void renderHand(float partialTicks, int xOffset) {
        // Empty it.
    }
}
