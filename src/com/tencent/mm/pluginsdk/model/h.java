package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.model.app.ac;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import java.util.Map;

public final class h
  implements com.tencent.mm.pluginsdk.model.app.x
{
  private static boolean hud = false;
  private static h hue;
  public i huf;

  public static h ayq()
  {
    if (hue == null)
      hue = new h();
    return hue;
  }

  public static j uQ(String paramString)
  {
    if (paramString == null)
      return null;
    Map localMap = com.tencent.mm.sdk.platformtools.x.bB(paramString, "PersonalAppSetting");
    if (localMap == null)
      return null;
    String str = (String)localMap.get(".PersonalAppSetting.OpenID");
    if (ch.jb(str))
      return null;
    j localj = new j();
    localj.hug = str;
    return localj;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, ac paramac)
  {
    if (!bg.oE());
    o localo;
    do
    {
      do
      {
        return;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(paramInt1);
        arrayOfObject1[1] = Integer.valueOf(paramInt2);
        z.d("!44@/B4Tb64lLpJGu9pVCGYwj1kfnqh0kP99yscgaJEQpZg=", "onSceneEnd errType=%s errCode=%s", arrayOfObject1);
        if (paramac == null)
        {
          z.e("!44@/B4Tb64lLpJGu9pVCGYwj1kfnqh0kP99yscgaJEQpZg=", "scene == null");
          return;
        }
      }
      while ((paramInt1 != 0) || (paramInt2 != 0));
      switch (paramac.getType())
      {
      default:
        return;
      case 14:
      }
      if ((ak.getContext() == null) || (g.axW() == null))
      {
        z.e("!44@/B4Tb64lLpJGu9pVCGYwj1kfnqh0kP99yscgaJEQpZg=", "wrong environment");
        return;
      }
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(paramInt1);
      arrayOfObject2[1] = Integer.valueOf(paramInt2);
      z.e("!44@/B4Tb64lLpJGu9pVCGYwj1kfnqh0kP99yscgaJEQpZg=", "NetSceneGetUserInfoInApp come back", arrayOfObject2);
      localo = (o)paramac;
    }
    while (this.huf == null);
    this.huf.a(localo);
  }

  public final void a(Context paramContext, i parami, LinkedList paramLinkedList, String paramString)
  {
    z.d("!44@/B4Tb64lLpJGu9pVCGYwj1kfnqh0kP99yscgaJEQpZg=", "getGetUserInfoInApp");
    if (!hud)
      ayr();
    if (!bg.oE());
    while (paramContext == null)
      return;
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      z.d("!44@/B4Tb64lLpJGu9pVCGYwj1kfnqh0kP99yscgaJEQpZg=", "userNameList empty");
      return;
    }
    this.huf = parami;
    o localo = new o(paramString, paramLinkedList);
    bf.Uq();
    c.a(14, localo);
  }

  public final void ayr()
  {
    if (!bg.oE())
      return;
    bf.Uq().a(14, this);
    hud = true;
  }

  public final void ays()
  {
    if (!bg.oE())
      return;
    hud = false;
    bf.Uq().b(14, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.h
 * JD-Core Version:    0.6.2
 */