package net.morbz.minecraft.blocks;

import net.morbz.minecraft.blocks.states.Facing6State;

public class EndRodBlock extends Facing6Block {

    public EndRodBlock(Facing6State facing) {
        super(facing);
    }

    @Override
    protected Material getMaterial() {
        return Material.END_ROD;
    }

}
