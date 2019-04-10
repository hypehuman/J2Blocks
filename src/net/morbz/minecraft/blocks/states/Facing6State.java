package net.morbz.minecraft.blocks.states;

/** 
 * The direction in which the block/object is facing.
 * 
 * @author hypehuman
 */
public enum Facing6State {
    UP((byte)0),
    DOWN((byte)1),
    NORTH((byte)2),
    SOUTH((byte)3),
    WEST((byte)4),
    EAST((byte)5);
    
    private final byte byteValue;
    
    private Facing6State(byte value) {
        byteValue = value;
    }
    
    public byte getDataValue() {
        return byteValue;
    }
}
