package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.c.a.gi;
import com.tencent.mm.c.a.gj;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.c.g;
import java.util.ArrayList;

public abstract class b extends g
{
  protected ArrayList htZ = new ArrayList(3);

  public b(int paramInt)
  {
    super(0);
  }

  public static void a(String paramString, b paramb)
  {
    if (!paramb.htZ.contains(paramString))
      paramb.htZ.add(paramString);
    a.aGB().a("NetSceneResponse", paramb);
    e.uN(paramString);
  }

  public static void b(String paramString, b paramb)
  {
    e.uO(paramString);
    a.aGB().b("NetSceneResponse", paramb);
    if (paramb.htZ.contains(paramString))
      paramb.htZ.remove(paramString);
  }

  public abstract void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.sdk.c.e parame);

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    if ((parame instanceof gi))
    {
      gi localgi = (gi)parame;
      if ((localgi.cLy.cLz != null) && (this.htZ.contains(localgi.cLy.cLz.getId())))
        a(localgi.cLy.errType, localgi.cLy.errCode, localgi.cLy.cGy, localgi.cLy.cLz);
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.c.b
 * JD-Core Version:    0.6.2
 */