package crystalspider.revampedend.blocks;

import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.state.BlockState;

public class EndFire extends BaseFireBlock {
  public EndFire(Properties properties) {
    super(properties, 0.5F);
  }

  @Override
  protected boolean canBurn(BlockState state) {
    return true;
  }
}
