package com.tencent.mm.sandbox.updater;

import android.os.Looper;
import com.tencent.mm.a.c;
import com.tencent.mm.sdk.platformtools.cm;
import java.io.IOException;
import java.io.OutputStream;

final class af extends OutputStream
{
  private cm gQj = new cm(Looper.getMainLooper());

  af(ae paramae)
  {
  }

  public final void write(int paramInt)
  {
    throw new IOException("unexpected operation");
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = c.a(this.iCb.iBV.aMt(), paramArrayOfByte, paramInt1, paramInt2);
    if (i != 0)
      throw new IOException("appendToFile failed :" + i);
    this.gQj.post(new ag(this, paramInt2));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.af
 * JD-Core Version:    0.6.2
 */