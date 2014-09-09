package com.tencent.mm.ui.base;

import com.tencent.mm.sdk.platformtools.ch;
import java.util.List;

final class g
  implements cl
{
  g(String paramString1, List paramList1, List paramList2, String paramString2)
  {
  }

  public final void a(cg paramcg)
  {
    if (!ch.jb(this.val$title))
      paramcg.setHeaderTitle(this.val$title);
    for (int i = 0; i < this.gDc.size(); i++)
      paramcg.a(((Integer)this.gCx.get(i)).intValue(), (CharSequence)this.gDc.get(i));
    if (!ch.jb(this.iXF))
      paramcg.a(-1, this.iXF);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.g
 * JD-Core Version:    0.6.2
 */