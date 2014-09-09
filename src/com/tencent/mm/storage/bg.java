package com.tencent.mm.storage;

import com.tencent.mm.ao.a;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;

public final class bg extends cg
{
  private int cmdId;
  private a ikm;
  private byte[] value;

  public bg(int paramInt, a parama)
  {
    super(new Object[0]);
    this.cmdId = paramInt;
    this.ikm = parama;
    try
    {
      this.value = parama.toByteArray();
      return;
    }
    catch (IOException localIOException)
    {
      z.printErrStackTrace("!32@/B4Tb64lLpLLB1vaRZurDkqKcAnPawwc", localIOException, "", new Object[0]);
      this.value = new byte[0];
    }
  }

  public bg(int paramInt, byte[] paramArrayOfByte)
  {
    super(new Object[0]);
    this.cmdId = paramInt;
    this.value = paramArrayOfByte;
  }

  public final a aKx()
  {
    return this.ikm;
  }

  public final int getCmdId()
  {
    return this.cmdId;
  }

  public final String toString()
  {
    if (this.value == null)
      return "";
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(10000);
    arrayOfObject[1] = Integer.valueOf(this.cmdId);
    arrayOfObject[2] = this.value;
    return bc.j(arrayOfObject);
  }

  public final int wy()
  {
    return 10000;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bg
 * JD-Core Version:    0.6.2
 */