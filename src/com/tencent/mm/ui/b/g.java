package com.tencent.mm.ui.b;

import android.content.Context;
import com.tencent.mm.c.a.aj;
import com.tencent.mm.c.a.al;
import com.tencent.mm.model.a.c;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bt;
import com.tencent.mm.sdk.c.f;

public final class g
{
  public static com.tencent.mm.pluginsdk.ui.a.a I(Context paramContext, int paramInt)
  {
    return a(paramContext, paramInt, null);
  }

  public static com.tencent.mm.pluginsdk.ui.a.a a(Context paramContext, int paramInt, Object[] paramArrayOfObject)
  {
    label82: String str1;
    label143: label173: String str2;
    switch (h.iWu[(paramInt - 1)])
    {
    default:
    case 1:
    case 2:
      do
      {
        do
          return null;
        while ((paramArrayOfObject == null) || (paramArrayOfObject.length != 2));
        String str3;
        if (paramArrayOfObject[0] != null)
        {
          str3 = paramArrayOfObject[0].toString();
          if (paramArrayOfObject[1] == null)
            break label143;
        }
        for (String str4 = paramArrayOfObject[1].toString(); (bg.qW().px().eB(str3)) || (bg.qW().px().eB(str4)); str4 = null)
        {
          return new j(paramContext, str3, str4);
          str3 = null;
          break label82;
        }
      }
      while ((paramArrayOfObject == null) || (paramArrayOfObject.length != 3));
      if (paramArrayOfObject[0] != null)
      {
        str1 = paramArrayOfObject[0].toString();
        if (paramArrayOfObject[1] == null)
          break label262;
        str2 = paramArrayOfObject[1].toString();
        label187: if ((paramArrayOfObject[2] == null) || (!(paramArrayOfObject[2] instanceof Boolean)))
          break label379;
      }
      break;
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    label262: label379: for (boolean bool = ((Boolean)paramArrayOfObject[2]).booleanValue(); (bg.qW().py().eB(str1)) || (bg.qW().py().eB(str2)); bool = false)
    {
      return new l(paramContext, str1, str2, bool);
      str1 = null;
      break label173;
      str2 = null;
      break label187;
      return new q(paramContext);
      return new ae(paramContext);
      return new ag(paramContext);
      aj localaj = new aj();
      localaj.cHN.context = paramContext;
      com.tencent.mm.sdk.c.a.aGB().g(localaj);
      return (com.tencent.mm.pluginsdk.ui.a.a)localaj.cHO.cHP;
      return new o(paramContext);
      return new a(paramContext);
      bt.rn();
      bs localbs = bt.ro();
      if (localbs == null)
        break;
      return new s(paramContext, localbs);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.g
 * JD-Core Version:    0.6.2
 */