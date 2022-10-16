package crystalspider.revampedend.blocks;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;

public class EndFire extends AbstractFireBlock {
  public EndFire(Settings settings) {
    super(settings, 0.5F);
  }

  @Override
  protected boolean isFlammable(BlockState state) {
    return true;
  }
}
