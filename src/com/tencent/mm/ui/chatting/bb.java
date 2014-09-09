package com.tencent.mm.ui.chatting;

import android.graphics.Matrix;
import android.view.View;
import android.view.animation.Transformation;
import junit.framework.Assert;

final class bb extends az
{
  private int ejQ;
  private int ejR;
  private float jnD;
  private float jnE;
  private float jnF;
  private float jnG;
  private float jnH = 0.01F;
  private float jnI = 0.02F;
  private float jnJ;
  private float jnK;
  private float jnL;
  private float jnM;

  public bb(ChattingAnimFrame paramChattingAnimFrame, int paramInt1, int paramInt2)
  {
    super(paramChattingAnimFrame);
    this.ejQ = paramInt1;
    this.ejR = paramInt2;
    this.jnD = ChattingAnimFrame.k(0.1F, 0.9F);
    this.jnE = this.jnD;
    this.jnG = ChattingAnimFrame.k(-0.3F, -0.1F);
    restart();
  }

  private void restart()
  {
    if (this.jnG > 0.0F)
      this.jnI += this.jnH;
    this.jnF = this.jnG;
    this.jnG += this.jnI;
    if (this.jnF > 1.1F)
      if (this.targetView == null)
        break label139;
    label139: for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.targetView.post(new ba(this));
      this.jnJ = (this.jnD * this.ejQ);
      this.jnK = (this.jnE * this.ejQ);
      this.jnL = (this.jnF * this.ejR);
      this.jnM = (this.jnG * this.ejR);
      return;
    }
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = this.jnJ;
    float f2 = this.jnL;
    if (this.jnJ != this.jnK)
      f1 = this.jnJ + paramFloat * (this.jnK - this.jnJ);
    if (this.jnL != this.jnM)
      f2 = this.jnL + paramFloat * (this.jnM - this.jnL);
    paramTransformation.getMatrix().setTranslate(f1, f2);
    if (paramFloat == 1.0F)
      restart();
  }

  public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    setRepeatCount(-1);
    setDuration(100L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bb
 * JD-Core Version:    0.6.2
 */