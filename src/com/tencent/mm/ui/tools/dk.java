package com.tencent.mm.ui.tools;

import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.cl;
import java.util.List;

final class dk
  implements cl
{
  dk(ImageGalleryUI paramImageGalleryUI, List paramList1, List paramList2)
  {
  }

  public final void a(cg paramcg)
  {
    paramcg.setHeaderTitle("");
    for (int i = 0; i < this.jSC.size(); i++)
      paramcg.a(((Integer)this.jSC.get(i)).intValue(), (CharSequence)this.jSD.get(i));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.dk
 * JD-Core Version:    0.6.2
 */