package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.c.a.fp;
import com.tencent.mm.c.a.fq;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import java.util.ArrayList;

public abstract class a extends g
{
  protected ArrayList htZ = new ArrayList(3);

  public a(int paramInt)
  {
    super(0);
  }

  public static void a(String paramString, a parama)
  {
    if (!parama.htZ.contains(paramString))
      parama.htZ.add(paramString);
    com.tencent.mm.sdk.c.a.aGB().a("MStorageNotify", parama);
    e.uN(paramString);
  }

  public static void b(String paramString, a parama)
  {
    e.uO(paramString);
    com.tencent.mm.sdk.c.a.aGB().b("MStorageNotify", parama);
    if (parama.htZ.contains(paramString))
      parama.htZ.remove(paramString);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    if ((parame instanceof fp))
    {
      fp localfp = (fp)parame;
      if ((localfp.cKN.cKO != null) && (this.htZ.contains(localfp.cKN.cKO.getId())))
        d(localfp.cKN.cKO);
    }
    return false;
  }

  public abstract void d(com.tencent.mm.sdk.c.e parame);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.c.a
 * JD-Core Version:    0.6.2
 */