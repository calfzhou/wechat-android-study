package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.mm.n;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;
import java.util.Iterator;
import java.util.List;

final class br
  implements com.tencent.mm.sdk.platformtools.br
{
  private Context context;
  private String dqM;
  private boolean iWI;
  private List jnU;

  public br(Context paramContext, List paramList, boolean paramBoolean, String paramString)
  {
    this.context = paramContext;
    this.jnU = paramList;
    this.iWI = paramBoolean;
    this.dqM = paramString;
  }

  public final boolean rD()
  {
    Iterator localIterator = this.jnU.iterator();
    while (localIterator.hasNext())
    {
      ar localar = (ar)localIterator.next();
      bk.a(this.context, localar, this.iWI, this.dqM);
    }
    return true;
  }

  public final boolean rE()
  {
    if (bk.aUH() != null)
      bk.aUH().dismiss();
    e.aw(this.context, this.context.getString(n.bJK));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.br
 * JD-Core Version:    0.6.2
 */