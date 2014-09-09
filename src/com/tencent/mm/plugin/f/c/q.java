package com.tencent.mm.plugin.f.c;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.util.HashMap;

public class q
  implements bd
{
  public static boolean pV(String paramString)
  {
    if ((ch.jb(paramString)) || (!bg.oE()));
    File localFile1;
    do
    {
      return false;
      localFile1 = new File(paramString);
    }
    while (!localFile1.exists());
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = bg.qW().pq();
    arrayOfObject1[1] = Long.valueOf(ch.CM());
    File localFile2 = new File(String.format("%s/temp_%s", arrayOfObject1));
    if (localFile2.exists())
      localFile2.delete();
    Object[] arrayOfObject2 = new Object[4];
    arrayOfObject2[0] = localFile1.getAbsolutePath();
    arrayOfObject2[1] = Long.valueOf(localFile1.length());
    arrayOfObject2[2] = localFile2.getAbsolutePath();
    arrayOfObject2[3] = Long.valueOf(localFile2.length());
    z.i("!32@/B4Tb64lLpIAhUt0Bg2QTgKyt6cgF/I5", "mv %s[%d bytes] to %s[%d bytes]", arrayOfObject2);
    return localFile1.renameTo(localFile2);
  }

  public final void O(boolean paramBoolean)
  {
    n.fTF.init();
    bg.qQ().n(new r(this));
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    n.fTF.afc();
  }

  public final HashMap nw()
  {
    return null;
  }

  public final void r(String paramString1, String paramString2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.q
 * JD-Core Version:    0.6.2
 */