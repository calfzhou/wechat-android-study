package com.tencent.mm.sdk.platformtools;

import java.nio.ByteBuffer;

final class ai
{
  private ByteBuffer AQ = null;

  public final void cR(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    this.AQ = ByteBuffer.allocateDirect(i);
    this.AQ.position(0);
    this.AQ.put(paramArrayOfByte, 0, i);
    this.AQ.position(0);
  }

  public final ByteBuffer getBuffer()
  {
    return this.AQ;
  }

  public final int getOffset()
  {
    return this.AQ.position();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ai
 * JD-Core Version:    0.6.2
 */