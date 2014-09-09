package com.tencent.mm.pluginsdk.ui;

import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.sdk.platformtools.z;

final class l
  implements Runnable
{
  l(EmojiBarView paramEmojiBarView)
  {
  }

  public final void run()
  {
    int i = this.hxQ.getRight() - this.hxQ.getLeft() - this.hxQ.getPaddingRight() - this.hxQ.getPaddingLeft();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(i);
    z.d("!32@/B4Tb64lLpJAsx67eqtnV40RMMGYRvsp", "end measure width: %d", arrayOfObject1);
    if ((this.hxQ.getLayoutParams() != null) && (i > 0))
    {
      this.hxQ.getLayoutParams().height = (i / 2);
      this.hxQ.setLayoutParams(this.hxQ.getLayoutParams());
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(this.hxQ.getLayoutParams().height);
      z.d("!32@/B4Tb64lLpJAsx67eqtnV40RMMGYRvsp", "set measure : %d", arrayOfObject2);
      EmojiBarView.a(this.hxQ);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.l
 * JD-Core Version:    0.6.2
 */