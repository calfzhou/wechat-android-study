package com.tencent.mm.ui.tools;

import android.app.Activity;
import com.tencent.kingkong.support.Log;
import com.tencent.mm.n;
import com.tencent.mm.q.a;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;

public final class t
{
  private static cr dWq = null;
  private static boolean ekQ = false;

  public static void a(a parama, Activity paramActivity, i parami, boolean paramBoolean)
  {
    boolean bool1 = true;
    if ((parama == null) || (paramActivity == null) || (parami == null))
    {
      Object[] arrayOfObject1 = new Object[3];
      boolean bool2;
      boolean bool3;
      if (parama == null)
      {
        bool2 = bool1;
        arrayOfObject1[0] = Boolean.valueOf(bool2);
        if (paramActivity != null)
          break label85;
        bool3 = bool1;
        label46: arrayOfObject1[bool1] = Boolean.valueOf(bool3);
        if (parami != null)
          break label91;
      }
      while (true)
      {
        arrayOfObject1[2] = Boolean.valueOf(bool1);
        Log.e("!44@/B4Tb64lLpJcZAIZpKXu2jAJsuCaf+nmCcaYSxN3GfI=", "bizInfo null : %s, context null : %s, ct null : %s", arrayOfObject1);
        return;
        bool2 = false;
        break;
        label85: bool3 = false;
        break label46;
        label91: bool1 = false;
      }
    }
    if (parama.ui());
    int i;
    Object[] arrayOfObject2;
    for (String str = paramActivity.getString(n.bya); ; str = paramActivity.getString(i, arrayOfObject2))
    {
      e.a(paramActivity, str, "", paramActivity.getString(n.bCP), paramActivity.getString(n.bCO), new u(parama, paramActivity, parami, paramBoolean), null);
      return;
      i = n.byc;
      arrayOfObject2 = new Object[bool1];
      arrayOfObject2[0] = parami.od();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.t
 * JD-Core Version:    0.6.2
 */