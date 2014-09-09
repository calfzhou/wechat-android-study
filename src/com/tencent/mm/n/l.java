package com.tencent.mm.n;

import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Set;

final class l
  implements br
{
  Bitmap bitmap = null;
  byte[] buf;
  x dnd = null;

  public l(e parame, x paramx, byte[] paramArrayOfByte)
  {
    this.dnd = paramx;
    this.buf = paramArrayOfByte;
  }

  public final boolean rD()
  {
    if ((this.dnd == null) || (ch.jb(this.dnd.getUsername())))
    {
      z.e("!32@/B4Tb64lLpJO3ngf+FD8EZfQGyZYk2Ww", "SaveAvatar imgFlag info is null");
      return false;
    }
    m localm = e.sj();
    if (localm != null)
      this.bitmap = localm.b(this.dnd.getUsername(), this.buf);
    y localy = e.si();
    if (localy != null)
    {
      this.dnd.db(-1);
      this.dnd.sv();
      localy.a(this.dnd);
    }
    return true;
  }

  public final boolean rE()
  {
    if (ch.jb(this.dnd.getUsername()));
    do
    {
      return false;
      m localm = e.sj();
      if ((localm != null) && (this.bitmap != null))
        localm.c(this.dnd.getUsername(), this.bitmap);
      e.e(this.dmW).remove(this.dnd.getUsername());
    }
    while (this.buf == null);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.l
 * JD-Core Version:    0.6.2
 */