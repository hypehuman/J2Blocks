package net.morbz.minecraft.blocks;

import net.morbz.minecraft.blocks.states.Facing6State;

/**
 * Base class for any block that can face up, down, north, south, east, or west.
 */
public abstract class Facing6Block implements IBlock {

    private Facing6State facing;

    /**
     * Creates a new instance.
     * 
     * @param facing The direction in which the block is facing
     */
    public Facing6Block(Facing6State facing) {
        this.facing = facing;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public byte getBlockData() {
        return facing.getDataValue();
    }
    
    /**
     * Returns the material from which this block is made
     * @return the Material
     */
    protected abstract Material getMaterial();
    
    /**
     * {@inheritDoc}
     */
    @Override
    public byte getBlockId() {
        return (byte)getMaterial().getValue();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int getTransparency() {
        return getMaterial().getTransparency();
    }
}
