package com.tencent.mm.ui.conversation;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.m;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.s;
import java.util.Iterator;
import java.util.List;

final class g
  implements Runnable
{
  g(BizConversationUI paramBizConversationUI, String paramString)
  {
  }

  public final void run()
  {
    SharedPreferences localSharedPreferences = this.jFf.getSharedPreferences(ak.aHi(), 0);
    List localList;
    if (localSharedPreferences.getBoolean("FIRST_TIME_IN_ENTERPRISE_CONV_" + this.jFg, true))
    {
      aa.uY();
      localList = m.fD(this.jFg);
      if (localList == null)
        z.w("!44@/B4Tb64lLpIMw+dFbL21OiX21bsyOnJqkPvIR1gSqXw=", "no child");
    }
    else
    {
      return;
    }
    int i;
    if (localList != null)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(localList.size());
      z.d("!44@/B4Tb64lLpIMw+dFbL21OiX21bsyOnJqkPvIR1gSqXw=", "isFirstTime child %d", arrayOfObject);
      Iterator localIterator = localList.iterator();
      i = 0;
      label108: if (!localIterator.hasNext())
        break label201;
      String str = (String)localIterator.next();
      if (bg.qW().oW().yE(str) != null)
        break label264;
      z.d("!44@/B4Tb64lLpIMw+dFbL21OiX21bsyOnJqkPvIR1gSqXw=", "add empty conversation");
      com.tencent.mm.storage.r localr = new com.tencent.mm.storage.r(str);
      localr.bx(this.jFg);
      localr.aIB();
      bg.qW().oW().d(localr);
    }
    label264: for (int j = 1; ; j = i)
    {
      i = j;
      break label108;
      i = 0;
      label201: localSharedPreferences.edit().putBoolean("FIRST_TIME_IN_ENTERPRISE_CONV_" + this.jFg, false).commit();
      if ((BizConversationUI.c(this.jFf) == null) || (i == 0))
        break;
      BizConversationUI.c(this.jFf).notifyDataSetChanged();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.g
 * JD-Core Version:    0.6.2
 */